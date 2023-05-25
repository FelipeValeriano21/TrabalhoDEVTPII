package rota.projeto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
public class AppConfig {



    @RequestMapping
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName")
    public String appName(){
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
                    "        position: relative;\n" +
                    "        top: -95px;\n" +
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
                    "\n" +
                    "      .app{\n" +
                    "\n" +
                    "        position: relative;\n" +
                    "        top: -20px;\n" +
                    "\n" +
                    "      }\n" +
                    "    </style>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <div class=\"container\">\n" +
                    "        <div class=\"app\">\n" +
                    "      <h1>O servidor esta no ar!</h1>\n" +
                    "      <h2>Integrantes:</h2>\n" +
                    "      <h3 >Felipe Valeriano dos Reis</h3>\n" +
                    "      <h3>Matheus Lopes</h3>\n" +
                    "      <h3>Matheus Martins</h3>\n" +
                    "      <h2>Estrutura</h2>\n" +
                    "      <h3 >Localhost:4000 - Index</h3>\n" +
                    "      <h3>Localhost:4000/notas - Calcula a media</h3>\n" +
                    "      <h3>Localhost:4000/cep - Via Cep</h3>\n" +
                    "      <h2>Designer Pattern: Build</h2>\n" +
                    "      <h5>Foi utilizado o padrão de design Builder para encapsular a lógica de cálculo da média em uma classe separada chamada CalculadoraMedia. Essa classe possui métodos para configurar as notas (setNota1 e setNota2) e calcular a média (calcularMedia).</h5>\n" +
                    "    </div>\n" +
                    "    </div>\n" +
                    "  </body>\n" +
                    "</html>";
        }


    @RequestMapping
    @GetMapping(value = "/notas", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName2")
    public String appName2(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <title>Calculo da media</title>\n" +
                "  <script type=\"text/javascript\">\n" +
                "\n" +
                "    function CalculadoraMedia() {\n" +
                "      this.nota1 = 0;\n" +
                "      this.nota2 = 0;\n" +
                "\n" +
                "      this.setNota1 = function(nota) {\n" +
                "        this.nota1 = parseFloat(nota);\n" +
                "      };\n" +
                "\n" +
                "      this.setNota2 = function(nota) {\n" +
                "        this.nota2 = parseFloat(nota);\n" +
                "      };\n" +
                "\n" +
                "      this.calcularMedia = function() {\n" +
                "        var media = (this.nota1 + this.nota2) / 2;\n" +
                "\n" +
                "        if (media >= 6) {\n" +
                "          if (media == 10) {\n" +
                "            resultado.textContent = \"Sua Média é \" + media + \" e tirou a nota maxima\"\n" +
                "          } else {\n" +
                "            resultado.textContent = \"Parabéns, aprovado! Média: \" + media;\n" +
                "          }\n" +
                "        } else {\n" +
                "          resultado.textContent = \"Reprovado! com Média: \" + media\n" +
                "        }\n" +
                "      };\n" +
                "    }\n" +
                "\n" +
                "    function calcularMedia() {\n" +
                "      var calculadora = new CalculadoraMedia();\n" +
                "      calculadora.setNota1(document.getElementById(\"nota1\").value);\n" +
                "      calculadora.setNota2(document.getElementById(\"nota2\").value);\n" +
                "      calculadora.calcularMedia();\n" +
                "      \n" +
                "    }\n" +
                "  </script>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <h1>Calcula a media do aluno</h1>\n" +
                "  <label for=\"nota1\">Primeira nota</label>\n" +
                "  <input id=\"nota1\" type=\"number\"> <br />\n" +
                "  <label for=\"nota2\">Segunda nota</label>\n" +
                "  <input id=\"nota2\" type=\"number\"> <br />\n" +
                "  <br>\n" +
                "  <button onclick=\"calcularMedia()\">Calcular Média</button>\n" +
                "\n" +
                "  <br>\n" +
                "  <br>  \n" +
                "  <b><label id=\"resultado\" for=\"\"></label></b>\n" +
                "</body>\n" +
                "</html>";
    }

    @RequestMapping
    @GetMapping(value = "/cep", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    @Bean(name="appName3")
    public String appName3(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <title>Página HTML</title>\n" +
                "  <script type=\"text/javascript\">\n" +
                "\n" +
                "function buscarEndereco(cep) {\n" +
                "    // Limpar formatação do CEP\n" +
                "    cep = cep.replace(/\\D/g, '');\n" +
                "  \n" +
                "    // Fazer requisição para a API do Via CEP\n" +
                "    fetch(`https://viacep.com.br/ws/${cep}/json/`)\n" +
                "      .then(response => response.json())\n" +
                "      .then(data => {\n" +
                "        if (data.erro) {\n" +
                "          // CEP não encontrado\n" +
                "          console.log('CEP não encontrado.');\n" +
                "        } else {\n" +
                "          // Exibir informações do endereço\n" +
                "          console.log('Endereço:');\n" +
                "          label1.textContent =  `CEP: ${data.cep}`;\n" +
                "          label2.textContent =   `Logradouro: ${data.logradouro}`;\n" +
                "          label3.textContent = `Bairro: ${data.bairro}`;\n" +
                "          label4.textContent = `Cidade: ${data.localidade}`;\n" +
                "          label5.textContent = `Estado: ${data.uf}`;\n" +
                "        }\n" +
                "      })\n" +
                "      .catch(error => {\n" +
                "        alert(\"Ococrreu um erro, tente novamente\")\n" +
                "      });\n" +
                "  }\n" +
                "  \n" +
                "  </script>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <h1>Consulte seu CEP</h1>\n" +
                "  <label for=\"texto\">Digite o CEP:</label>\n" +
                "  <input id=\"cep\" type=\"text\">\n" +
                "  <button onclick=\"buscarEndereco(document.getElementById('cep').value)\">Exibir Dados</button>\n" +
                "  <br>\n" +
                "  <br>\n" +
                "  <b><label id=\"label1\"></label><br></b>\n" +
                "  <b><label id=\"label2\"></label><br>\n" +
                "  <label id=\"label3\"></label><br>\n" +
                "  <label id=\"label4\"></label><br>\n" +
                "  <label id=\"label5\"></label><br></b>\n" +
                "</body>\n" +
                "</html>";

    }

}

