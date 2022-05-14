package fr.eql.ai111.java.algo;

import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

public class Launcher {
    public static void main(String[] args) {

         int nb_Allu = 20 ;
         int prise_joueur = 0 ;
         int prise_ordi = 0 ;
         String qui_commence;
         String qui_joue  ;

        qui_commence = JOptionPane.showInputDialog("Qui commence :  joueur / ordi");
        qui_joue = qui_commence;

        while (nb_Allu > 0) {

            if (qui_joue.equals("joueur")) {

                  prise_joueur = Integer.parseInt(JOptionPane.showInputDialog("combien preunez vous 1  2 ou 3 "));
                  nb_Allu = nb_Allu - prise_joueur;

                System.out.println("Nombre d'allumette restant : "+ nb_Allu);
                System.out.println("le tour a l'ordinateur : ");
                if (nb_Allu == 0) {
                    JOptionPane.showMessageDialog(null, "le gagnant est : " + qui_joue);
                    System.out.println("le gagnant est: " + qui_joue);
                }
                qui_joue ="ordi";

             }

            else if (qui_joue.equals("ordi")) {

                if ((nb_Allu > 4) && (qui_commence.equals("ordi")))  {
                    prise_ordi = ThreadLocalRandom.current().nextInt(1, 3);

            } else {
                    prise_ordi = nb_Allu % 4;

            }
                nb_Allu = nb_Allu - prise_ordi ;
                System.out.println("Nombre d'allumette restant : "+ nb_Allu);
                System.out.println("Le tour au joueur");
                    if (nb_Allu == 0){
                         JOptionPane.showMessageDialog(null, "le gagnant est : " + qui_joue );
                         System.out.println("le gagnant est: " + qui_joue);
                      }
                    qui_joue = "joueur";
            }

         }

    }

    }

