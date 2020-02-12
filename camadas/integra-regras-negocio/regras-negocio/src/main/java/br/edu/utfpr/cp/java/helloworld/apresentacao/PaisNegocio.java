package br.edu.utfpr.cp.java.helloworld.apresentacao;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PaisNegocio {

    private final PaisRepository paisRepository;

    public void criar(PaisModel pais) throws PaisJaExisteException {

        if (paisRepository.findByNome(pais.getNome()).isPresent())
            throw new PaisJaExisteException(); 

        else
            paisRepository.save(pais); 
    }
    
}