package com.media.strategy;

/**
 * Concrete strategy for handling Video files.
 */
public class VideoStrategy implements PlayStrategy {
    @Override
    public void play(String fileName) {
        // Simulating video playback logic
        System.out.println("🎬 Playing Video Stream: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("⏹️ Stopping Video Stream.");
    }
}