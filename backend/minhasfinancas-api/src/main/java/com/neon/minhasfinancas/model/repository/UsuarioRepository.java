package com.neon.minhasfinancas.model.repository;

import java.util.Optional;

import com.neon.minhasfinancas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	boolean existsByEmail(String email);
	
	Optional<Usuario> findByEmail(String email);
	
}
