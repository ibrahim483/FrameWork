import javax.swing.JLabel;

public class MyFrame {

    public static void main(String[] args) {
        // Create a new JFrame
        javax.swing.JFrame frame = new javax.swing.JFrame("My Frame");
        
        // Set the default close operation
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        // Set the size of the frame
        frame.setSize(400, 300);
        
        // Make the frame visible
        frame.setVisible(true);

        JLabel label = new JLabel("dance with me", JLabel.CENTER);
        label.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 24)); // Set font and size
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setSize(200, 100);
        label.setLocation(100, 100);    
        label.setVisible(true);
        frame.add(label);
        frame.setLayout(null); // Set layout to null for absolute positioning

    }
} 