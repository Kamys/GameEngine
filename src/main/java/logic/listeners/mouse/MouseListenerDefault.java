package logic.listeners.mouse;




import logic.gameComponents.gPanel.cell.GPanelCell;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Обрабатывает нажатия мыши.
 * Оповещает всех ListenerClickCell о том на какой объект нажали.
 */
public class MouseListenerDefault implements MouseListener {

    private GPanelCell thisPanel;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        GPanelCell newPanel  =(GPanelCell) e.getComponent();
        if(thisPanel ==null){
            thisPanel = newPanel;
        }else {
            thisPanel.setColor(Color.RED);
            thisPanel.repaint();
        }
        thisPanel = newPanel;
        thisPanel.setColor(Color.BLUE);
        thisPanel.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
