package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
public class FaqController {

        @GetMapping("/faq")
        public String greeting(Model model) {
                List<Question> questions1 = Arrays.asList(
                                new Question("L'accord de consortium doit-il être signé en même temps que le contrat ?",
                                                "Réponse"),
                                new Question("Quels sont les types de contrat à justitifier ?", "Réponse"));
                List<Question> questions2 = Arrays.asList(
                                new Question("Que devient l'argent qui reste à la fin du projet ?", "Réponse"),
                                new Question("Qu'arrive-t-il en cas de déficit budgétaire sur une convention ?",
                                                "Réponse"));
                List<QuestionsTheme> questionsThemes = Arrays.asList(
                                new QuestionsTheme(questions1, "Conventions de recherche"),
                                new QuestionsTheme(questions2, "Gestion financière"));
                model.addAttribute("questionsThemes", questionsThemes);
                return "faq";
        }

        @GetMapping("/contact")
        public String contact(Model model) {

                class Contact {
                        String type, link, mail, phone, fullName;

                        public Contact(String type, String link, String mail, String phone, String fullName) {
                                this.type = type;
                                this.link = link;
                                this.mail = mail;
                                this.phone = phone;
                                this.fullName = fullName;
                        }

                        public String getType() {
                                return this.type;
                        }

                        public String getLink() {
                                return this.link;
                        }

                        public String getMail() {
                                return this.mail;
                        }

                        public String getPhone() {
                                return this.phone;
                        }

                        public String getFullName() {
                                return this.fullName;
                        }
                }

                model.addAttribute("laboratoire", "INSTITUT DE LA VISION");
                model.addAttribute("contacts", Arrays.asList(new Contact("Contact Entreprises", "#",
                                "dupont.eric@monmail.com", "01 48 99 88 77", "Dupont Eric")));
                return "contact";
        }
}