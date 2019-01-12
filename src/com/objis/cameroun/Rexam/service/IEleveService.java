package com.objis.cameroun.Rexam.service;

import java.util.List;

import com.objis.cameroun.Rexam.domaine.Abonnes;
import com.objis.cameroun.Rexam.domaine.Eleve;

/**
 * @author youssouf
 *
 *Interface qui liste toutes les m�thodes � impl�ment�es dans la class
 */
public interface IEleveService  {
	
	public int addElevesService(Eleve eleve);
	public List<Eleve> getEleveParMtService(String matricule);
	public void addAbonnesService(Abonnes abonnes);
	public void addExcelFileService(String nomfichier);
	public List<Eleve> listElevesService();
}