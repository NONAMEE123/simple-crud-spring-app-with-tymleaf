package com.devtools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devtools.entites.Etudiant;
import com.devtools.metier.EtudiantRepository;
import com.sun.el.parser.ParseException;

@SpringBootApplication
public class ProjetSpring2Application {

	public static void main(String[] args) throws ParseException, java.text.ParseException {
     org.springframework.context.ApplicationContext ctx = SpringApplication.run(ProjetSpring2Application.class, args);
	  EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);
	  DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
	  etudiantRepository.save(new Etudiant("Khalid", df.parse("1996-11-29"), "rami-khalid@live.fr", "0640135414"));
	  etudiantRepository.save(new Etudiant("Reda", df.parse("1993-11-29"), "rami-reda@live.fr", "0640135414"));
	  etudiantRepository.save(new Etudiant("Riham", df.parse("1995-11-29"), "rami-riham@live.fr", "0640135414"));

	}

}
