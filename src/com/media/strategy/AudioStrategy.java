package com.media.strategy;

/**
 * Concrete strategy for handling Audio files.
 */
public class AudioStrategy implements PlayStrategy {
    @Override
    public void play(String fileName) {
        // Simulating audio playback logic
        System.out.println("🎵 Playing Audio Stream: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("⏹️ Stopping Audio Stream.");
    }
}