package com.backbase.assignment.ingatms;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;

import com.backbase.assignment.ingatms.model.Atm;
import com.backbase.assignment.ingatms.model.AtmForm;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller 
@SessionAttributes({"ingATMsareas", "listAtms"} )
public class HelloController {

	@GetMapping("/home")
	public String index(Model model) throws JsonParseException, JsonMappingException, IOException {

		// Get full list of ATMS 
		final RestTemplate restTemplate = new RestTemplate();
		final String jsonInString = restTemplate.getForObject("https://www.ing.nl/api/locator/atms/", String.class);
		ObjectMapper mapper = new ObjectMapper();
		List<Atm> listAtms = mapper.readValue(jsonInString.substring(5), new TypeReference<List<Atm>>() {
		});

		// Construct dropdown list of distinct cities
		// Used TreeSet to order Cities get cities in alphabetical order
		TreeSet<String> ingATMsareas = new TreeSet<>();
		for (Atm atm : listAtms) {  
			if (atm != null && atm.getAddress() != null) {
				// Java sets will contain unique values so just add everything for performance
				ingATMsareas.add(atm.getAddress().getCity());
			}
		} 
		
		model.addAttribute("selectForm", new AtmForm());

		model.addAttribute("ingATMsareas", ingATMsareas);

		model.addAttribute("listAtms", jsonInString.substring(5));

		return "home";
	}

	@PostMapping("/home")
	public String cityPost(
	    @ModelAttribute("selectForm") AtmForm form,
	    Model model ) {  
		
		model.addAttribute("selectedCity", form.getSelectedCity());
		
		return "home";
	}
}
