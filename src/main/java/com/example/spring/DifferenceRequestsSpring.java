package com.example.spring;

public class DifferenceRequestsSpring {

    /*
     * @RequestParam: extrai parâmetros de queries.
     * @PathVariable: extrai variáveis no path da URL.
     * @RequestBody: extrai objetos do corpo da requisição.
     *
     *
     * @REQUESTPARAM
     * Usada para extrair parâmetros de queries na URL da requisição GET. É comumente
     * usada para lidar com parâmetros em consultas.
     *
     * @GetMapping("/exemplo")
     * public String metodoExemplo(@RequestParam String nomeParametro) {
     *      // Código aqui
     * }
     *
     * /exemplo?nomeParametro=valor
     *
     *
     * @PATHVARIABLE
     * Usada para extrair valores de modelos URI (variáveis na URL) em requisições
     * GET. É adequada para extrair valores de modelo URI, como IDs em paths RESTFul.
     *
     * @GetMapping("/exemplo/{id}")
     * public String metodoExemplo(@PathVariable Long id) {
     *      // Código aqui
     * }
     *
     * /exemplo/123
     *
     *
     * @REQUESTBODY
     * Usada para vincular o corpo da requisição POST ou PUT a um method parameter,
     * geralmente usado para extrair dados da requisição no formato JSON ou XML.
     *
     * @PostMapping("/criar")
     * public ResponseEntity<String> criar(@RequestBody Usuario usuario) {
     *      // Código aqui
     * }
     *
     * Corpo da Requisição: {"id": 123, "nome": "João"}
     *
     *
     *
     */
}
