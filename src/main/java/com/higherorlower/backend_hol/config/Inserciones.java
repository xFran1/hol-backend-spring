package com.higherorlower.backend_hol.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.higherorlower.backend_hol.model.Foto;
import com.higherorlower.backend_hol.repository.FotoRepository;

@Configuration
public class Inserciones {

    @Autowired
    private FotoRepository fotoRepository;

    @Bean
    public ApplicationRunner datosInserciones() {
        return args -> {
            if (fotoRepository.count() == 0) {
                fotoRepository.save(new Foto("Republica Dominicana", "/fotos_juego/dominic.webp", 673000, "673,000"));
                fotoRepository.save(new Foto("Gmail", "/fotos_juego/gmail.webp", 14880000, "14,880,000"));
                fotoRepository.save(new Foto("Google Maps", "/fotos_juego/googlemaps.webp", 5040000, "5,040,000"));
                fotoRepository.save(new Foto("Pizza", "/fotos_juego/pizza.webp", 8400000, "8,400,000"));
                fotoRepository.save(new Foto("Reggaeton", "/fotos_juego/reggae.webp", 550000, "550,000"));
                fotoRepository.save(new Foto("Shein", "/fotos_juego/shein.webp", 3080000, "3,080,000"));
                fotoRepository.save(new Foto("Telecinco", "/fotos_juego/telecinco.webp", 6590000, "6,590,000"));
                fotoRepository.save(new Foto("Raptors", "/fotos_juego/tor.webp", 673000, "673,000"));
                fotoRepository.save(new Foto("WhatsApp", "/fotos_juego/whatsApp.webp", 11690000, "11,690,000"));
            }
        };
    }

}
