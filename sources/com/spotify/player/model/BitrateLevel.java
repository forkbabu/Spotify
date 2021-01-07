package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum BitrateLevel {
    UNKNOWN,
    LOW,
    NORMAL,
    HIGH,
    VERYHIGH,
    NORMALIZED
}
