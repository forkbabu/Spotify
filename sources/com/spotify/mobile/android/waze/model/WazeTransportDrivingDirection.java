package com.spotify.mobile.android.waze.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum WazeTransportDrivingDirection {
    NONE,
    TURN_LEFT,
    TURN_RIGHT,
    KEEP_LEFT,
    KEEP_RIGHT,
    CONTINUE_STRAIGHT,
    ROUNDABOUT_ENTER,
    ROUNDABOUT_EXIT,
    ROUNDABOUT_LEFT,
    ROUNDABOUT_EXIT_LEFT,
    ROUNDABOUT_STRAIGHT,
    ROUNDABOUT_EXIT_STRAIGHT,
    ROUNDABOUT_RIGHT,
    ROUNDABOUT_EXIT_RIGHT,
    ROUNDABOUT_U,
    ROUNDABOUT_EXIT_U,
    APPROACHING_DESTINATION,
    EXIT_LEFT,
    EXIT_RIGHT,
    WAYPOINT_DELAY,
    U_TURN,
    NAV_INSTR_COUNT;
    
    public static final List<WazeTransportDrivingDirection> F = Collections.unmodifiableList(Arrays.asList(values()));
}
