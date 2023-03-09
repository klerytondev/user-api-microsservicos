package br.com.kleryton.userapimicrosservicos.controller.exceptions;

import java.io.Serializable;
import java.time.Instant;

/**
 * @author: Kleryton de souza
 */
//Classe para criar um objeto com o estado e comportamento da exceção gerada na @ControllerAdvice 
public class StandarError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandarError() {
	}


	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public void setPath(String path) {
		this.path = path;
	}

}
