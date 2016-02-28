/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statki;

/**
 *
 * @author Tomasz
 */
public class Statki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Variables.y.put(1, 392);
        Variables.y.put(2, 417);
        Variables.y.put(3, 442);
        Variables.y.put(4, 467);
        Variables.y.put(5, 492);
        Variables.y.put(6, 517);
        Variables.y.put(7, 542);
        Variables.y.put(8, 567);
        Variables.y.put(9, 592);
        Variables.y.put(10, 617);
        Variables.y.put(11, 642);
        Variables.y.put(12, 667);
        Variables.y.put(13, 692);
        Variables.y.put(14, 717);

        Variables.x.put("A", 50);
        Variables.x.put("B", 75);
        Variables.x.put("C", 100);
        Variables.x.put("D", 125);
        Variables.x.put("E", 150);
        Variables.x.put("F", 175);
        Variables.x.put("G", 200);
        Variables.x.put("H", 225);
        Variables.x.put("I", 250);
        Variables.x.put("J", 275);
        Variables.x.put("K", 300);
        Variables.x.put("L", 325);
        Variables.x.put("M", 350);
        Variables.x.put("N", 375);
        Variables.x.put("O", 400);
        Variables.x.put("P", 425);
        Variables.x.put("R", 450);
        Variables.x.put("S", 475);
        Variables.x.put("T", 500);
        Variables.x.put("U", 525);
        Variables.x.put("W", 550);
        Variables.x.put("Y", 575);

        Game game = new Game();
        game.setVisible(true);
    }

}
