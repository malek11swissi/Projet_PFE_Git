package poratil_web_client.poratil.web.Model.Securite;

import jakarta.persistence.Column;

public class Profil {

    public Profil(String libelle) {
        this.libelle = libelle;
    }

    

    public Profil(String code, String libelle, boolean actif) {
        this.code = code;
        this.libelle = libelle;
        this.actif = actif;
    }

    @Column(length = 30, nullable = false, unique = true)
    private String code;

    @Column(length = 100, nullable = false)
    private String libelle;

    @Column(nullable = false)
    private boolean actif;
}
    

