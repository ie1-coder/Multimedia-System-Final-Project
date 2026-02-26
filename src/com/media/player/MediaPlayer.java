package com.media.player;

import com.media.strategy.PlayStrategy;
import com.media.model.MediaFile;

/**
 * Main context class that uses the strategy pattern.
 */
public class MediaPlayer {
    private PlayStrategy playStrategy;

    /**
     * Sets the playback strategy based on file type.
     * @param strategy The concrete strategy to use.
     */
    public void setStrategy(PlayStrategy strategy) {
        this.playStrategy = strategy;
    }

    /**
     * Initiates the playback process.
     * @param file The media file to play.
     */
    public void executePlay(MediaFile file) {
        if (playStrategy != null) {
            System.out.println("📂 Loading: " + file.getFileName());
            playStrategy.play(file.getFileName());
        } else {
            System.out.println("⚠️ No strategy selected.");
        }
    }

    public void executeStop() {
        if (playStrategy != null) {
            playStrategy.stop();
        }
    }
}