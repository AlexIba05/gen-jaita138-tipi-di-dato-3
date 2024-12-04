import java.util.Scanner;

public class AppFornitori {
    public static void main(String[] args) {
        boolean cont= true;
        Scanner sc= new Scanner (System.in);

        System.out.println("Scrivi tutti i dati del fornitore");

        while (cont) {

        System.out.println("Nome del fornitore: ");
        String nome= sc.nextLine();

        System.out.println("Categoria del rifornimento: ");
        System.out.println("");
        System.out.println("[0 - Piante]");
        System.out.println("[1 - Vasellame]");
        System.out.println("[2 - Concime]");
        System.out.println("[3 - Giardinaggio]");
        System.out.println("");
        byte categoriaNum= sc.nextByte();
        CategoriaFornitore categoriaFornitore= CategoriaFornitore.values()[categoriaNum];
        sc.nextLine();

        System.out.println("Partita IVA del fornitore:");
        String pIva= sc.nextLine();
        

        System.out.println("Luogo del rifornimento:");
        String luogo= sc.nextLine();
        
        System.out.println("Telefono del rifornitore:");
        String numerTelefono= sc.nextLine();

        System.out.println("E-mail del rifornitore");
        String email= sc.nextLine();

        System.out.println("Qual è la lingua preferita?");
        String lingua= sc.nextLine();
        

        System.out.println("Iban del rifornitore:");
        String iban= sc.nextLine();

        System.out.println("Nome del referente:");
        String nomeRef= sc.nextLine();

        System.out.println("Qui puoi aggiungere delle note aggiuntive:");
        String note= sc.nextLine();




        // ------------------------------------------------------------

        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("Ecco tutti i dati del rifornitore: ");
        System.out.println("");
        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("");
        System.out.println("Categoria: " + categoriaFornitore);
        System.out.println("");
        System.out.println("Partita IVA: " + pIva);
        System.out.println("");
        System.out.println("Luogo: " + luogo);
        System.out.println("");
        System.out.println("Numero di telefono: " + numerTelefono);
        System.out.println("");
        System.out.println("E-mail: " + email);
        System.out.println("");
        System.out.println("Lingua principale: " + lingua);
        System.out.println("");
        System.out.println("Iban: " + iban);
        System.out.println("");
        System.out.println("Referente: " + nomeRef);
        System.out.println("");
        System.out.println("Note aggiuntive: " + note);
        System.out.println("");


        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("");

        System.out.println("Vuoi continuare a inserire altri dati per un altro rifornitore? (true o false)");
        cont= sc.nextBoolean();
        sc.nextLine();
        }

        System.out.println("");
        System.out.println("Grazie per aver usato il software!!");
        System.out.println("");

        sc.close();


    }
}
