/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Tracks sports scores
 * @author Pranav Tharoor
 */

interface Sports {
    int getNumberOfGoals();
    void dispTeam();
}

class Hockey implements Sports {
    int goals;
    String team;
    
    // Initializes team name
    public Hockey(String team) {
        goals = 0;
        this.team = team;
    }
    
    // Returns number of goals scored
    @Override
    public int getNumberOfGoals() {
        return goals;
    }

    // Prints team name
    @Override
    public void dispTeam() {
        System.out.println(team);
    }
    
    // Increments goal count
    public void scoreGoal() {
        goals++;
    }
    
}

class Football implements Sports {
    int goals;
    String team;
    
    // Initializes team name
    public Football(String team) {
        goals = 0;
        this.team = team;
    }
    
    // Returns number of goals scored
    @Override
    public int getNumberOfGoals() {
        return goals;
    }

    // Prints team name    
    @Override
    public void dispTeam() {
        System.out.println(team);
    }
    
    // Increments goal count    
    public void scoreGoal() {
        goals++;
    }
    
}

public class Lab8_SportsInterface {
    public static void main(String args[]) {
        Hockey h;
        Football f;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose\n1: Football\n2: Hockey");
        int t = in.nextInt();
        System.out.println("Enter team name: ");
        int o = 0;
        if(t == 1) { // Football
            f = new Football(in.next());
            while(o != 4) {
                System.out.println("Enter \n1 to score goal \n2 to print team name \n3 to display number of goals \n4 to quit");
                o = in.nextInt();
                if(o == 1) f.scoreGoal();
                else if(o == 2) f.dispTeam();
                else if(o == 3) System.out.println(f.getNumberOfGoals());
            }
        } else { // Hockey
            h = new Hockey(in.next());
            while(o != 4) {
                System.out.println("Enter \n1 to score goal \n2 to print team name \n3 to display number of goals \n4 to quit");
                o = in.nextInt();
                if(o == 1) h.scoreGoal();
                else if(o == 2) h.dispTeam();
                else if(o == 3) System.out.println(h.getNumberOfGoals());
            }
        }
    }
}
