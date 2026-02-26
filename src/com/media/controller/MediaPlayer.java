package com.media.controller;

import com.media.model.MediaFile;
import com.media.strategy.PlayStrategy;

/**
 * MediaPlayer Class acts as the Context in the Strategy Design Pattern.
 * It delegates the playback behavior to the concrete strategy implementation.
 * 
 * @author Student Name
 * @version 1.0
 * @see MediaStrategy
 */
public class MediaPlayer {
    
    // Reference to the strategy interface
    private PlayStrategy strategy;
    
    // Current media file being processed
    private MediaFile currentFile;

    /**
     * Default constructor initializes the player.
     */
    public MediaPlayer() {
        this.currentFile = null;
    }

    /**
     * Sets the playback strategy dynamically at runtime.
     * This method is crucial for implementing the Strategy Pattern.
     * 
     * @param strategy The concrete strategy (AudioStrategy or VideoStrategy).
     */
    public void setStrategy(PlayStrategy strategy) {
        this.strategy = strategy;
        System.out.println("⚙️ Strategy updated: " + strategy.getClass().getSimpleName());
    }

    /**
     * Loads a media file into the player.
     * 
     * @param file The MediaFile object to be loaded.
     */
    public void loadFile(MediaFile file) {
        this.currentFile = file;
        System.out.println("📂 File loaded: " + file.getFileName());
    }

    /**
     * Executes the play action using the current strategy.
     * Validates if strategy and file are set before execution.
     */
    public void play() {
        if (strategy != null && currentFile != null) {
            System.out.println("▶️ Initializing playback...");
            strategy.play(currentFile.getFileName());
        } else {
            System.out.println("⚠️ Error: Please load a file and set a strategy first.");
        }
    }

    /**
     * Executes the stop action using the current strategy.
     */
    public void stop() {
        if (strategy != null) {
            System.out.println("Stopping playback...");
            strategy.stop();
        } else {
            System.out.println("Error: No active strategy to stop.");
        }
    }
    
    /**
     * Helper method to get current file info.
     * @return The current MediaFile object.
     */
    public MediaFile getCurrentFile() {
        return currentFile;
    }
}