/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Prints indoor or outdoor game
 * @author student
 */

class Game {
    public void type() {
        System.out.println("indoor & outdoor games");
    }
}

class Cricket extends Game {
    @Override
    public void type() {
        System.out.println("cricket is an outdoor game");
    }
}

class Chess extends Game {
    @Override
    public void type() {
        System.out.println("chess is an indoor game");
    }
}

public class Lab6_GameClass {
    public static void main(String args[]) {
        Game g = new Game();
        Cricket c = new Cricket();
        Chess ch = new Chess();
        g.type();
        ch.type();
        c.type();
        g = c;
        g.type();
    }
}
