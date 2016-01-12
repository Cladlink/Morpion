import javax.swing.*;

/**
 * Created by cladlink on 11/01/16.
 */
public class Model
{

    boolean joueurA = true;

    public void placeItem(JButton[][] plateau,ImageIcon[] cartes, int i, int j)
    {
        if (joueurA)
        {
            plateau[i][j]=new JButton(cartes[1]);
        }
        else
        {
            plateau[i][j]=new JButton(cartes[2]);
        }
        joueurA=!joueurA;
    }
    public boolean checkVictory(JButton[][] plateau, int i, int j)
    {
        boolean victoire = false;
        if (plateau[i][j].getIcon() == plateau[i][(j+1)%plateau[i].length].getIcon() && plateau[i][j].getIcon() == plateau[i][Math.abs((j-1)%plateau[i].length)].getIcon()
         || plateau[i][j].getIcon() == plateau[(i+1)%plateau.length][j].getIcon() && plateau[i][j].getIcon() == plateau[Math.abs((i-1)%plateau[i].length)][j].getIcon())
        {
            System.out.println(Math.abs((j-1)%plateau[i].length));
            victoire = true;
        }

        return victoire;
    }
}
