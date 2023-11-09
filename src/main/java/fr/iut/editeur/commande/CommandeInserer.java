package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import javax.print.Doc;

public class CommandeInserer extends CommandeDocument{

    private static final String DescriptionCommande = "inserer;start;insertion\n   Insère le texte insertion à la position start\n";

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters, DescriptionCommande);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;start;insertion");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        String insertion = parameters[2];
        this.document.inserer(start, insertion);
        super.executer();
    }

    public String getDescriptionCommande() {
    	return DescriptionCommande;
    }
}
