import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * un "juego" para resolver el problema de las torres de hanoi graficamente y usando recursividad
 *
 * @author EOGJ
 * @version Date october/26/2023
 */

public class InteractiveTowerOfHanoi extends JFrame {
    private int numDisks;
    private Tower[] towers;
    private JLabel movesLabel;
    private int moves = 0;
    private Disk selectedDisk = null;

    public InteractiveTowerOfHanoi(int numDisks) {
        this.numDisks = numDisks;
        towers = new Tower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower();
        }
        
        setupGUI();
        initializeInitialTower();
    }

    private void setupGUI() {
        setTitle("Interactive Tower of Hanoi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel towerPanel = new JPanel();
        towerPanel.setLayout(new GridLayout(1, 3));

        for (Tower tower : towers) {
            towerPanel.add(tower);
        }

        movesLabel = new JLabel("Moves: 0");

        add(towerPanel, BorderLayout.CENTER);
        add(movesLabel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeInitialTower() {
        for (int i = numDisks; i > 0; i--) {
            towers[0].addDisk(new Disk(i));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            int numDisks = 4; // Cambia el número de discos según desees
            new InteractiveTowerOfHanoi(numDisks);
        });
    }
}
