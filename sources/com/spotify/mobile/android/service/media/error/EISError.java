package com.spotify.mobile.android.service.media.error;

import com.spotify.music.C0707R;

public enum EISError {
    UNAVAILABLE_OFFLINE(C0707R.string.external_integration_offline_playback_failed),
    SEARCH_FAILED(C0707R.string.external_integration_search_failed),
    ERROR_EXPLICIT_CONTENT(C0707R.string.external_integration_error_explicit_content),
    UNKNOWN(C0707R.string.external_integration_search_failed);
    
    private final int mErrorMessage;

    private EISError(int i) {
        this.mErrorMessage = i;
    }

    public int d() {
        return this.mErrorMessage;
    }
}
