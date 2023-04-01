package poratil_web_client.poratil.web.Model.Securite;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;
import poratil_web_client.poratil.web.Model.framework.ObjetPersistant;
import poratil_web_client.poratil.web.projection.MonCompteUtilisateur;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "mail", "organisation_id" }))
@Data
@NoArgsConstructor

public class Utilisateur extends ObjetPersistant {
    public Utilisateur(MonCompteUtilisateur monCompte) {
        this.nom = monCompte.getNom();
        this.prenom = monCompte.getPrenom();
        this.login = monCompte.getLogin();
        this.mail = monCompte.getMail();
        this.tel = monCompte.getTel();
        this.dateN = monCompte.getDateN();
        this.pays = monCompte.getPays();
        
        this.adresse = monCompte.getAdresse();
       
        this.profil = new Profil(monCompte.getProfil());
    
}

 public Utilisateur(String nom, String prenom, String mail, String login, String mdp, String tel, String dateN,String pays,
            String adreese, Profil profil) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.login = login;
        this.mdp = mdp;
        this.tel = tel;
        this.dateN = dateN;
        this.pays = pays;
         this.adresse =  adresse;

        this.profil = profil;
    }

    @Column(length = 100, nullable = false)
    private String nom;

    @Column(length = 100, nullable = false)
    private String prenom;

    @Column(length = 200, nullable = false)
    private String mail;

    @Column(length = 30, nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String mdp;

    private String tel;
    private String dateN;
    private String pays;
    
    private String adresse;

    

    @ManyToOne
    @JoinColumn(nullable = false)
    private Profil profil;

    

}