package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ErrorType {
    SUCCESS,
    PLAY_TOKEN_LOST,
    PLAYBACK_STUCK,
    PLAYBACK_ERROR,
    LICENSE_CHANGE,
    PLAYBACK_REPORTING_ERROR,
    TRACK_UNAVAILABLE_OFFLINE,
    CONTEXT_PAGE_MALFORMED_DATA,
    CONTEXT_PAGE_MISC_ERROR,
    CONTEXT_PAGE_NOT_FOUND,
    PLAY_RESTRICTED,
    STOP_RESTRICTED,
    UPDATE_RESTRICTED,
    PAUSE_RESTRICTED,
    RESUME_RESTRICTED,
    SKIP_TO_PREV_RESTRICTED,
    SKIP_TO_NEXT_RESTRICTED,
    SKIP_TO_NON_EXISTENT_TRACK,
    SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED,
    TOGGLE_REPEAT_CONTEXT_RESTRICTED,
    TOGGLE_REPEAT_TRACK_RESTRICTED,
    TOGGLE_SHUFFLE_RESTRICTED,
    SET_OPTIONS_RESTRICTED,
    SET_QUEUE_RESTRICTED,
    INTERRUPT_PLAYBACK_RESTRICTED,
    SEEK_TO_RESTRICTED,
    ONE_TRACK_UNPLAYABLE,
    ONE_TRACK_UNPLAYABLE_AUTO_STOPPED,
    ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED,
    QUEUE_REVISION_MISMATCH,
    VIDEO_PLAYBACK_ERROR,
    VIDEO_GEORESTRICTED,
    VIDEO_UNSUPPORTED_PLATFORM_VERSION,
    VIDEO_UNSUPPORTED_CLIENT_VERSION,
    VIDEO_UNSUPPORTED_KEY_VERSION,
    VIDEO_COUNTRY_RESTRICTED,
    VIDEO_UNAVAILABLE,
    VIDEO_CATALOGUE_RESTRICTED,
    VIDEO_MANIFEST_DELETED,
    TIMEOUT,
    INVALID,
    UNKNOWN
}
