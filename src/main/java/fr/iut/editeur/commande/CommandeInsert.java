package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInsert extends CommandeDocument{
    public CommandeInsert(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;start;insertion");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        String insertion = parameters[2];
        this.document.inserer(start+1, insertion);
        super.executer();
    }
}
