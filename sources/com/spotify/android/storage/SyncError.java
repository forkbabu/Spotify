package com.spotify.android.storage;

public class SyncError extends AssertionError {
    private static final long serialVersionUID = 1;

    public SyncError(String str) {
        super(str);
    }
}
