package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {

    private static final String DescriptionCommande = "majuscules;start;end\n" +
            "    Met en majuscules le texte entre les positions start et end\n";

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters, DescriptionCommande);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;start;end");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        this.document.majuscules(start, end);
        super.executer();
    }

    public String getDescriptionCommande() {
    	return DescriptionCommande;
    }
}
