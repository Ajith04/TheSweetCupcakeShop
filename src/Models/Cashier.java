package Models;

import UI.Home;
import javax.swing.JOptionPane;

public class Cashier extends User {
    
       @Override
       public void giveAccessRight(Home home){
            JOptionPane.showMessageDialog(home, "You haven't access!");
       }
}
