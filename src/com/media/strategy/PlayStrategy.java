package com.media.strategy;

/**
 * Interface defining the contract for media playback strategies.
 * Implements the Strategy Design Pattern.
 */
public interface PlayStrategy {
    /**
     * Executes the play action for specific media type.
     * @param fileName The name of the file to play.
     */
    void play(String fileName);
    
    /**
     * Executes the stop action.
     */
    void stop();
}