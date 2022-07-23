package dev9.java.springjava;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringController {


    @Autowired
    private LinguagemRepository linguagemRepository;

    @GetMapping(value = "/linguagens")
    public List<Linguagem> selecionarLinguagens(){
        List<Linguagem> linguagens = linguagemRepository.findAll();
        return linguagens;
    }

    @PostMapping(value = "/linguagens")
    public Linguagem Add(@RequestBody Linguagem linguagem){
        Linguagem novaL = linguagemRepository.save(linguagem);
        return novaL;
    }


}
