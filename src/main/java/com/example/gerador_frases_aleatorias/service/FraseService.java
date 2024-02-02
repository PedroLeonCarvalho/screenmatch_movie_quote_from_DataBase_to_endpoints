package com.example.gerador_frases_aleatorias.service;

import com.example.gerador_frases_aleatorias.dto.FraseDTO;
import com.example.gerador_frases_aleatorias.model.Frase;
import com.example.gerador_frases_aleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;


    public FraseDTO obterFraseAleatoria() {
         Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());

    }
}
