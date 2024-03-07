package com.unir.gateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TrazerDados {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/consultar")
    public List<Map<String, Object>> consultarBancoDeDados() {
        List<Map<String, Object>> resultado = jdbcTemplate.queryForList("SELECT * FROM ocorrencias");
        return resultado;
    }

}
