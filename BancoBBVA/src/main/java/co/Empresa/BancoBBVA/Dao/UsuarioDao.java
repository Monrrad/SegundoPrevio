package co.Empresa.BancoBBVA.Dao;

import java.sql.SQLException;
import java.util.List;
import co.Empresa.BancoBBVA.Modelo.Usuario;

public interface UsuarioDao {

		public Usuario login(String username, String pass) throws SQLException;

		public List<Usuario> selectAll();
	}


