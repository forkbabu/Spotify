package com.spotify.mobile.android.video.exception;

public enum ErrorType {
    ERROR_UNKNOWN(0),
    ERROR_GEORESTRICTED(1),
    ERROR_UNSUPPORTED_PLATFORM_VERSION(2),
    ERROR_UNSUPPORTED_CLIENT_VERSION(3),
    ERROR_IN_OFFLINE_MODE(4),
    ERROR_MANIFEST_DELETED(5),
    ERROR_COUNTRY_RESTRICTED(6),
    ERROR_UNAVAILABLE(7),
    ERROR_CATALOGUE_RESTRICTED(8),
    ERROR_PLAYBACK_STUCK(11),
    ERROR_ROYALTY_MEDIA_UNSUPPORTED(12),
    ERROR_AUDIO_ONLY_NOT_ALLOWED(13),
    ERROR_DRM_UNSUPPORTED_OS_VERSION(14),
    ERROR_DRM_UNSUPPORTED_SCHEME(15),
    ERROR_DRM_NO_LICENSE_SERVER(16);
    
    private final int mErrorCode;

    private ErrorType(int i) {
        this.mErrorCode = i;
    }

    public int d() {
        return this.mErrorCode;
    }
}
