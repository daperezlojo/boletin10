package boletin10_2;

import javax.swing.JOptionPane;

public class Xogo {

    private int numero;
    private int intento;
    private int numIntentos;
    private int i;
    private int diferencia;

    public Xogo() {

    }

   
    public void executarXogo() {

        int xogar = JOptionPane.showConfirmDialog(null, "¿Preparado para jugar?", "", JOptionPane.YES_NO_OPTION);

        while (xogar == JOptionPane.YES_OPTION) {

            numero = (int) (Math.random() * (51 - 1) + 1);

            JOptionPane.showMessageDialog(null, "Vamos a jugar!");
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos intentos crees necesitar?"));
            JOptionPane.showMessageDialog(null, "Tienes " + numIntentos + " intentos!");

            for (i = 0; i < numIntentos; i++) {

                intento = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivina un numero entre 1 y 50:"));

                if (numero == intento) {
                    JOptionPane.showMessageDialog(null, "Has acertado!");
                    break;

                } else {
                    diferencia = Math.abs(numero - intento);

                    if (diferencia > 20) {
                        JOptionPane.showMessageDialog(null, "Estás muy lejos!");
                    } else if (diferencia <= 20 && diferencia >= 10) {
                        JOptionPane.showMessageDialog(null, "Estás lejos!");
                    } else if (diferencia < 10 && diferencia > 5) {
                        JOptionPane.showMessageDialog(null, "Estás cerca!");
                    } else if (diferencia <= 5) {
                        JOptionPane.showMessageDialog(null, "Estás muy cerca!");
                    }
                }

            }

            if (intento != numero) {
                JOptionPane.showMessageDialog(null, "Vaya, te has quedado sin intentos");

            }
            xogar = JOptionPane.showConfirmDialog(null, "¿Quieres jugar?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (xogar == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Hasta la próxima!");
            }else{Xogo.this.executarXogo();
            }
            
       
        
    }

}
}