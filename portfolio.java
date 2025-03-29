import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PortfolioApp extends JFrame {
    // Constructor to set up the GUI
    public PortfolioApp() {
        // Set up JFrame
        setTitle("My Portfolio");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create tabs for each section
        JTabbedPane tabbedPane = new JTabbedPane();

        // About Me Section
        JTextArea aboutText = new JTextArea("I am cherukupalli naga lakshmi.");
        aboutText.setEditable(false);
        JScrollPane aboutScrollPane = new JScrollPane(aboutText);
        tabbedPane.addTab("About Me", aboutScrollPane);

        // Skills Section
        JTextArea skillsText = new JTextArea("Java,python, MySQL, HTML, CSS...");
        skillsText.setEditable(false);
        JScrollPane skillsScrollPane = new JScrollPane(skillsText);
        tabbedPane.addTab("Skills", skillsScrollPane);

        // Projects Section
        JTextArea projectsText = new JTextArea("Project 1: virtual shopping through webcam.\nProject 2: fake profiles detection using ann method...");
        projectsText.setEditable(false);
        JScrollPane projectsScrollPane = new JScrollPane(projectsText);
        tabbedPane.addTab("Projects", projects
