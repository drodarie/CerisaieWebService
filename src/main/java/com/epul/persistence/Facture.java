package com.epul.persistence;

import com.epul.utils.TimeUtils;

import java.util.List;

/**
 * Created by Laura on 10/01/2016.
 */
public class Facture {
    private float prix;
    private SejourClient sejourClient;
    private Emplacement emplacement;
    private TypeEmplacement typeEmplacement;
    private List<ActiviteSport> activiteSport;


    public Facture(SejourClient sejourClient, Emplacement emplacement, TypeEmplacement typeEmplacement, List<ActiviteSport> activiteSport) {
        this.sejourClient = sejourClient;
        this.emplacement = emplacement;
        this.typeEmplacement = typeEmplacement;
        this.activiteSport = activiteSport;
        calculateCost();

    }

    public void calculateCost(){
        int totAct = 0;
        for(int i = 0; i < activiteSport.size(); i++){
            totAct += activiteSport.get(i).getSport().getTarifUnite() * activiteSport.get(i).getNbloc();
        }
        float duree =  TimeUtils.getDayFromTime(sejourClient.getDateFinSej()) - TimeUtils.getDayFromTime(sejourClient.getDatedebSej());
        float prixSej = duree * typeEmplacement.getTariftypepl();
        prix = prixSej + totAct;
    }

    public SejourClient getSejourClient() {
        return sejourClient;
    }

    public void setSejourClient(SejourClient sejourClient) {
        this.sejourClient = sejourClient;
    }

    public Emplacement getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(Emplacement emplacement) {
        this.emplacement = emplacement;
    }

    public TypeEmplacement getTypeEmplacement() {
        return typeEmplacement;
    }

    public void setTypeEmplacement(TypeEmplacement typeEmplacement) {
        this.typeEmplacement = typeEmplacement;
    }

    public List<ActiviteSport> getActiviteSport() {
        return activiteSport;
    }

    public void setActiviteSport(List<ActiviteSport> activiteSport) {
        this.activiteSport = activiteSport;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
