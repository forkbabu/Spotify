package com.spotify.mobile.android.video.drm;

import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exception.ErrorType;

public final class DrmException extends BetamaxException {
    private static final long serialVersionUID = 98547385922L;

    public DrmException(String str, ErrorType errorType) {
        super(str, errorType);
    }
}
