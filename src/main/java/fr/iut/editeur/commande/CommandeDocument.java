package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    protected String DescriptionCommande;

    public CommandeDocument(Document document, String[] parameters, String DescriptionCommande) {
        this.document = document;
        this.parameters = parameters;
        this.DescriptionCommande = DescriptionCommande;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }

    //créer une description de la commande
    public String toString() {
    	return DescriptionCommande;
    }
}
