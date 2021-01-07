package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum PlayOperation {
    REPLACE,
    ENQUEUE,
    PUSH
}
