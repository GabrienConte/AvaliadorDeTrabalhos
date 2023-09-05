package br.csi.avaliadordeprojetos.controller.configs;

import jakarta.transaction.NotSupportedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(NotSupportedException.class)
    public ResponseEntity tratarError404(){
        return  ResponseEntity.notFound().build();
    }
}
