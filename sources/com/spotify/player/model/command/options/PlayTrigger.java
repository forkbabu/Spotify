package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum PlayTrigger {
    IMMEDIATELY,
    ADVANCED_PAST_TRACK,
    ADVANCED_PAST_CONTEXT
}
