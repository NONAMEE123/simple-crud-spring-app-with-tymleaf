package com.devtools.metier;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devtools.entites.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	//public List<Etudiant> findbyname(String n);
	
	

}
