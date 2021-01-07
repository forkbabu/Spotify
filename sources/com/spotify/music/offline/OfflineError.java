package com.spotify.music.offline;

public enum OfflineError {
    SUCCESS(0),
    OUT_OF_DISK_SPACE(8),
    OFFLINE_EXPIRED(14),
    TOO_MANY_TRACKS(19),
    OFFLINE_LICENSE_SERVER_ERROR(21),
    OFFLINE_LICENSE_LOST(22),
    OFFLINE_NOT_ALLOWED(23),
    OFFLINE_SYNC_CONNECTION_DISABLED(36),
    UNKNOWN(-1);
    
    private final int mCode;

    private OfflineError(int i) {
        this.mCode = i;
    }

    public static OfflineError d(int i) {
        OfflineError[] values = values();
        for (int i2 = 0; i2 < 9; i2++) {
            OfflineError offlineError = values[i2];
            if (offlineError.mCode == i) {
                return offlineError;
            }
        }
        return UNKNOWN;
    }
}
