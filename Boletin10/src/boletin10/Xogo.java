package boletin10;


import javax.swing.JOptionPane;


public class Xogo {


    private int numero;
    private int intento;
    private int i;
    private int numI;

    public Xogo() {

    }

    
    public void executarXogo() {

        int xogar = JOptionPane.showConfirmDialog(null, "¿Preparado para jugar?", "", JOptionPane.YES_NO_OPTION);

        if (xogar == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "Jugador 1");

            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige un numero entre 1 y 50:"));
            } while (numero > 50 && numero < 0);

            numI = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos intentos tendrá tu rival?"));

            JOptionPane.showMessageDialog(null, "Jugador 2");
            JOptionPane.showMessageDialog(null, "Tienes " + numI + " intentos.");
            

            for (i = 0; i < numI; i++) {

                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivina un numero entre 1 y 50:"));

                if (intento < numero) {
                    JOptionPane.showMessageDialog(null, "Prueba con un número mayor!");

                } else if (intento > numero) {
                    JOptionPane.showMessageDialog(null, "Prueba con un número menor!");

                } else {
                    JOptionPane.showMessageDialog(null, "WOW!Has acertado!");
                    break;
                }

            }
            
            if (intento != numero){
                JOptionPane.showMessageDialog(null, "Vaya, te has quedado sin intentos");
            }
            
            xogar = JOptionPane.showConfirmDialog(null, "¿Quieres volver a jugar?", "", JOptionPane.YES_NO_OPTION);
            if (xogar == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Hasta la próxima!");
            }else{Xogo.this.executarXogo();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Hasta la próxima!");
        
        
    
    }
}
    }

