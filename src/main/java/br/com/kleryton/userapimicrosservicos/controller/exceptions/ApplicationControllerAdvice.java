package br.com.kleryton.userapimicrosservicos.controller.exceptions;

import br.com.kleryton.api.services.exceptions.IntegridadeDeDadosException;
import br.com.kleryton.api.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

/**
 * @author: Kleryton de souza
 */
//Anotação que permite tratar exceções em toda a aplicação de forma global
@ControllerAdvice
public class ApplicationControllerAdvice {
    /*
     *  Handler para tratar Status 404, caso o servidor não encontre uma representação atual do recurso solicitado
     */
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        StandarError err = new StandarError();
        HttpStatus status = HttpStatus.NOT_FOUND;
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setError("Não foi possível encontrar o recurso solicitado!");
        err.setMessage(e.getMessage());
        err.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(IntegridadeDeDadosException.class)
    public ResponseEntity<StandarError> dataIntegrity(IntegridadeDeDadosException e, HttpServletRequest request) {
        StandarError err = new StandarError();
        HttpStatus status = HttpStatus.BAD_REQUEST;
        err.setTimestamp(Instant.now());
        err.setStatus(status.value());
        err.setError("Integridade de dados!");
        err.setMessage(e.getMessage());
        err.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
