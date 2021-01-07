package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.spotify.base.java.logging.Logger;

public enum ClientAction {
    UNKNOWN,
    PLAY,
    RESUME,
    STOP,
    SHOW,
    SPEAK_TTS,
    NO_OP,
    SKIP_FORWARD,
    SKIP_BACKWARD,
    SEEK_FORWARD,
    SEEK_BACKWARD,
    REPEAT_ONE,
    REPEAT_CONTEXT,
    REPEAT_OFF,
    SHUFFLE_ON,
    SHUFFLE_OFF,
    CHANGE_PLAYBACK_SPEED,
    VOLUME_UP,
    VOLUME_DOWN,
    VOLUME_ABSOLUTE,
    MUTE,
    UNMUTE,
    SLEEP_TIMER,
    RESTART_ONE,
    RESTART_CONTEXT,
    MUTE_MIC,
    LISTEN_FOR_RESPONSE,
    END_INTERACTION,
    ERROR,
    EARCON,
    PLAY_PREVIEW,
    WAIT,
    NAVIGATE,
    DISPLAY_UI,
    DISMISS_UI,
    LIKE,
    DISPLAY_SUGGESTIONS,
    GENERIC;

    @JsonCreator
    public static ClientAction forValue(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            Logger.o(e, "Unknown Client Action %s", str);
            return UNKNOWN;
        }
    }
}
