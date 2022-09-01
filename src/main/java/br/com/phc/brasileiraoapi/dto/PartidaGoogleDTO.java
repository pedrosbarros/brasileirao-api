package br.com.phc.brasileiraoapi.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class PartidaGoogleDTO implements Serializable {

     private static final long serialVersionUID = 1L;
     private String statusPartida;
     private String tempoPartida;
     
     //Informações da equipe da casa
     private String nomeEquipeCasa;
     private String urlLogoEquipeCasa;
     private String urlPlacarEquipeCasa;
     private String golsEquipeCasa;
     private String placarEstendidoEquipeCasa;
     
   //Informações da equipe Visitante
     private String nomeEquipeVisitante;
     private String urlLogoEquipeVisitante;
     private String urlPlacarEquipeVisitante;
     private String golsEquipeVisitante;
     private String placarEstendidoEquipeVisitante;
	  
    
}
