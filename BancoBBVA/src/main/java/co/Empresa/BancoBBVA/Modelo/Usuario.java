package co.Empresa.BancoBBVA.Modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {
	
	private Integer id;
	private String username;
	private String pass;
	private String email;
	
	public Usuario(String username, String pass) {
		this.username = username;
		this.pass = pass;
	}
}
