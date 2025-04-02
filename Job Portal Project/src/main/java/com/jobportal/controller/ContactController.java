package com.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jobportal.model.Contact;
import com.jobportal.service.ContactService;

import jakarta.validation.Valid;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContactForm(@Valid @ModelAttribute("contact") Contact contact,
                                  BindingResult result,
                                  RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "contact";
        }

        try {
            contactService.saveContact(contact);
            redirectAttributes.addFlashAttribute("success", "Thank you for your message. We'll get back to you soon!");
            return "redirect:/contact";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Sorry, there was an error sending your message. Please try again.");
            return "redirect:/contact";
        }
    }
} 