package com.mercadoilbre.joescaos.morse.controllers;

import com.mercadoilbre.joescaos.morse.models.Morse;
import com.mercadoilbre.joescaos.morse.response.ResponseConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("converter")
public class MorseController {

    @GetMapping("to-morse")
    public ResponseConverter messageToMorse(@RequestParam String message){
        return new ResponseConverter( new Morse().codeToMorse(message));
    }
}
