package br.com.kleryton.userapimicrosservicos.services.exceptions;

public class IntegridadeDeDadosException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public IntegridadeDeDadosException(String mensagem) {
        super(mensagem);
    }

}
