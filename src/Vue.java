/**
 * Created by cladlink on 11/01/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Vue extends JFrame
{
    //JButton qui sert de plateau + getter and setter
    private JButton[][] plateau;
    public JButton[][] getPlateau() { return plateau; }
    public void setPlateau(JButton[][] plateau) { this.plateau = plateau; }

    // tableau de cartes + getter
    private ImageIcon[] cartes =
            {
                new ImageIcon(getClass().getResource("Img/Vide.png")),
                new ImageIcon(getClass().getResource("Img/Croix.png")),
                new ImageIcon(getClass().getResource("Img/Rond.png")),
            };
    public ImageIcon[] getCartes() { return cartes; }

    private JPanel pano;
    public Vue(Model model)
    {
        InitAttribut();
        CreerWidget();

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    private void InitAttribut()
    {
        plateau = new JButton[3][3];
    }
    private void CreerWidget()
    {
        pano = new JPanel(new GridLayout(3, 3));
        for (int i=0; i<plateau.length;i++)
        {
            for (int j=0; j<plateau[i].length;j++)
            {
                plateau[i][j]= new JButton(cartes[0]);
                pano.add(plateau[i][j]);
            }
        }
        setContentPane(pano);
    }
    public void getCreerWidget(){ CreerWidget(); }

    public void setButControler(ActionListener listener)
    {
        for(int i=0;i<plateau.length;i++)
        {
            for(int j=0;j<plateau[i].length;j++)
            {

                plateau[i][j].addActionListener(listener);
            }
        }
    }
}
