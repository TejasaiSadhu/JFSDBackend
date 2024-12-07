package com.cg.freelanceapp.dto;

public class LoginResponseDTO {
	  private boolean valid;
	    private Long id;

	    public LoginResponseDTO(boolean valid, Long id) {
	        this.valid = valid;
	        this.id = id;
	    }

	    // Getters and Setters
	    public boolean isValid() {
	        return valid;
	    }

	    public void setValid(boolean valid) {
	        this.valid = valid;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
}
