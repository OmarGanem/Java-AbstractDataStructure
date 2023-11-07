import javax.swing.*;
import java.awt.*;
import java.util.Stack;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Write a description of class Tower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tower extends JPanel {
    private Stack<Disk> disks;
    private Disk selectedDisk;  // Declarar selectedDisk aquí
    private Tower[] towers;  // Campo para almacenar la lista de torres

    public Tower() {
        disks = new Stack<>();
        selectedDisk = null;
            
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                handleMousePress(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                handleMouseRelease(e);
            }
        });
    }
    
    public void setTowers(Tower[] towers) {
        this.towers = towers;
    }
    
    public boolean addDisk(Disk disk) {
        if (disks.isEmpty() || disk.getSize() < disks.peek().getSize()) {
            disks.push(disk);
            return true;
        }
        return false;
    }

    public Disk removeDisk() {
        if (!disks.isEmpty()) {
            return disks.pop();
        }
        return null;
    }

    public boolean canAddDisk(Disk disk) {
        return disks.isEmpty() || disk.getSize() < disks.peek().getSize();
    }

    private void handleMousePress(MouseEvent e) {
        if (!disks.isEmpty()) {
            Disk topDisk = disks.peek();
            if (topDisk.contains(e.getX(), e.getY())) {
                selectedDisk = removeDisk();
            }
        }
    }

    private void handleMouseRelease(MouseEvent e) {
        if (selectedDisk != null) {
            for (Tower tower : InteractiveTowerOfHanoi.this.towers) {
                if (tower != this && tower.canAddDisk(selectedDisk)) {
                    tower.addDisk(selectedDisk);
                    selectedDisk = null;
                    return;
                }
            }
            addDisk(selectedDisk);
            selectedDisk = null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth() / 2;
        int y = getHeight() - 10;

        for (Disk disk : disks) {
            disk.draw(g, x, y);
            y -= Disk.HEIGHT + 2;
        }
    }
}

