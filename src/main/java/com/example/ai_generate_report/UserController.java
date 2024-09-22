package com.example.ai_generate_report;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class UserController {

    private final PersonService personService;
    private final ChatGPTService chatGPTService;

    public UserController(PersonService personService, ChatGPTService chatGPTService) {
        this.personService = personService;
        this.chatGPTService = chatGPTService;
    }

    @GetMapping("/{id}")
    public String getPersonInfo(@PathVariable String id) {
        String prompt = personService.getPersonPromptById(id);  // Generate the patient prompt
        return chatGPTService.getChatGPTResponse(prompt);  // Get the ChatGPT response
    }
}
