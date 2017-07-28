package com.dragonballzrpg.enums;

/**
 * Created by Carl on 09/04/2017.
 */
public enum StateName
{
    STANDING,
    WALKING_UP, WALKING_DOWN, WALKING_LEFT, WALKING_RIGHT, WALKING_UP_LEFT, WALKING_UP_RIGHT, WALKING_DOWN_LEFT, WALKING_DOWN_RIGHT,
    RUNNING_UP, RUNNING_DOWN, RUNNING_LEFT, RUNNING_RIGHT, RUNNING_UP_LEFT, RUNNING_UP_RIGHT, RUNNING_DOWN_LEFT, RUNNING_DOWN_RIGHT,
    MELEEING_UP, MELEEING_DOWN, MELEEING_LEFT, MELEEING_RIGHT,
    FIRING_ENERGY_BLAST_UP, FIRING_ENERGY_BLAST_DOWN, FIRING_ENERGY_BLAST_LEFT, FIRING_ENERGY_BLAST_RIGHT,
    TRANSFORMING_TO_SUPER, TRANSFORMING_TO_BASE,
    KNOCKED_BACK_UP, KNOCKED_BACK_DOWN, KNOCKED_BACK_LEFT, KNOCKED_BACK_RIGHT,

    IDLE, MOVE_PLAYER_UP, MOVE_PLAYER_DOWN, MOVE_PLAYER_LEFT, MOVE_PLAYER_RIGHT,

    NOT_HANDLING_INPUT, HANDLING_UP_KEY_PRESSED, HANDLING_DOWN_KEY_PRESSED, HANDLING_LEFT_KEY_PRESSED, HANDLING_RIGHT_KEY_PRESSED
}
