package rota.projeto;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class AppController {

/*
    @Controller
    public class HtmlController {
        @GetMapping(value = "/index", produces = MediaType.TEXT_HTML_VALUE)
        @ResponseBody
        @Bean(name="welcomeAsHTML")
        public String welcomeAsHTML() {
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "  <head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Index</title>\n" +
                    "    <style>\n" +
                    "      body {\n" +
                    "        font-family: Arial, sans-serif;\n" +
                    "        background-color: #f8f8f8;\n" +
                    "      }\n" +
                    "      .container {\n" +
                    "        max-width: 800px;\n" +
                    "        margin: 0 auto;\n" +
                    "        text-align: center;\n" +
                    "        padding-top: 100px;\n" +
                    "      }\n" +
                    "      h1 {\n" +
                    "        font-size: 48px;\n" +
                    "        font-weight: bold;\n" +
                    "        color: #d9534f;\n" +
                    "        margin-bottom: 20px;\n" +
                    "      }\n" +
                    "      h2 {\n" +
                    "        font-size: 36px;\n" +
                    "        color: #333;\n" +
                    "        margin-bottom: 50px;\n" +
                    "      }\n" +
                    "      button {\n" +
                    "        padding: 12px 24px;\n" +
                    "        background-color: #d9534f;\n" +
                    "        color: #fff;\n" +
                    "        border: none;\n" +
                    "        border-radius: 4px;\n" +
                    "        font-size: 18px;\n" +
                    "        cursor: pointer;\n" +
                    "        transition: background-color 0.3s ease;\n" +
                    "      }\n" +
                    "      button:hover {\n" +
                    "        background-color: #c9302c;\n" +
                    "      }\n" +
                    "    </style>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <div class=\"container\">\n" +
                    "      <h1>Seja Bem-Vindo, Se está lendo essa mensagem quer dizer que o Servidor está em Funcionamento!</h1>\n" +
                    "      <h2>É um prazer estar servindo como testes e estudos para o grupo de estudos da Fatec Zona Sul</h2>\n" +
                    "      <h2>Este é o arquivo Index do Servidor Web</h2>\n" +
                    "    </div>\n" +
                    "  </body>\n" +
                    "</html>";
        }
    }*/

}
