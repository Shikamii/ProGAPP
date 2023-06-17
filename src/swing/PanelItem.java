package swing;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelItem extends JPanel{
    public PanelItem(){
        setBackground(new Color(204, 203, 204));
        setLayout(new WrapLayout(WrapLayout.LEFT, 10, 10));
        
        
    }
}
