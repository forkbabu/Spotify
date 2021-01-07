package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum AudioStream {
    DEFAULT,
    ALARM
}
