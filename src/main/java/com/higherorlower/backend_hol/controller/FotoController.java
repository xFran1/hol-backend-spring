package com.higherorlower.backend_hol.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higherorlower.backend_hol.model.Foto;
import com.higherorlower.backend_hol.repository.FotoRepository;

@RestController
@RequestMapping("/api/fotos")
public class FotoController {

    @Autowired
    private FotoRepository fotoRepository;

    @GetMapping("/")
    public List<Foto> getFotos() {
        return fotoRepository.findAll();
    }

    @GetMapping("/aleatoria") // GET /api/fotos/aleatoria
    public Foto getFotoAleatoria() {
        List<Foto> fotos = fotoRepository.findAll();
        return fotos.get(new Random().nextInt(fotos.size()));
    }
}
