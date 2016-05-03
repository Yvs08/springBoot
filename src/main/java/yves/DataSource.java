/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yves;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="datasource")
public class DataSource {

    @Id
    private String id;

    private String Description;
    private String Code;	
    private String Url;
    private String Utilisateur;	
    private String MotDePasse;
    private String DriverJdbc;

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUtilisateur(String Utilisateur) {
        this.Utilisateur = Utilisateur;
    }

    public String getUtilisateur() {
        return Utilisateur;
    }

    public void setMotDePasse(String MotDePasse) {
        this.MotDePasse = MotDePasse;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setDriverJdbc(String DriverJdbc) {
        this.DriverJdbc = DriverJdbc;
    }

    public String getDriverJdbc() {
        return DriverJdbc;
    }
    
   
    public DataSource() 
    {
    
    }

    public DataSource(String Description, String Code, String Url, String Utilisateur, String MotDePasse, String DriverJdbc) 
    {
        this.Description = Description;
        this.Code = Code;
        this.Url = Url;
	this.Utilisateur = Utilisateur;
        this.MotDePasse = MotDePasse;
	this.DriverJdbc = DriverJdbc;
    }

   

    @Override
    public String toString() 
	{
        return String.format(
                "Datasource[id=%s, Description='%s', Code='%s', Url='%s', Utilisateur='%s', MotDePasse='%s', DriverJdbc='%s']",
                id, Description, Code, Url, Utilisateur, MotDePasse, DriverJdbc);
    }

}