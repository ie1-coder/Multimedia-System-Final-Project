package com.media.ui;

import com.media.player.MediaPlayer;
import com.media.model.MediaFile;
import com.media.strategy.AudioStrategy;
import com.media.strategy.VideoStrategy;
import java.util.Scanner;

/**
 * Command Line Interface for user interaction.
 */
public class UserInterface {
    private final MediaPlayer player;
    private final Scanner scanner;

    public UserInterface() {
        this.player = new MediaPlayer();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the application loop.
     */
    public void start() {
        System.out.println("🌟 Welcome to Smart Media Stream System 🌟");
        
        OUTER:
        while (true) {
            System.out.println("\n1. Play Audio\n2. Play Video\n3. Stop\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    handleMedia("audio");
                    break;
                case 2:
                    handleMedia("video");
                    break;
                case 3:
                    player.executeStop();
                    break;
                case 4:
                    System.out.println("👋 Exiting system...");
                    break OUTER;
                default:
                    System.out.println("❌ Invalid option.");
                    break;
            }
        }
    }

    private void handleMedia(String type) {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        
        // Applying Strategy Pattern based on input
        if (type.equals("audio")) {
            player.setStrategy(new AudioStrategy());
        } else {
            player.setStrategy(new VideoStrategy());
        }
        
        MediaFile file = new MediaFile(fileName, type);
        player.executePlay(file);
    }
}