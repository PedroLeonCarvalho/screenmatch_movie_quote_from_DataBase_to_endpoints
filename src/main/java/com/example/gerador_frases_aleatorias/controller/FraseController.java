package com.example.gerador_frases_aleatorias.controller;


import com.example.gerador_frases_aleatorias.dto.FraseDTO;
import com.example.gerador_frases_aleatorias.model.Frase;
import com.example.gerador_frases_aleatorias.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

   @Autowired
   private FraseService servico;

@GetMapping("/series/frases")
   public FraseDTO obtemFraseAleatoria() {
   return servico.obterFraseAleatoria ();
}



}
