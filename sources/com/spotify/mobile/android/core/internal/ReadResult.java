package com.spotify.mobile.android.core.internal;

public final class ReadResult {
    private int size;
    private int skipFrames;
    private int status;

    public final int getSize() {
        return this.size;
    }

    public final int getSkipFrames() {
        return this.skipFrames;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setSkipFrames(int i) {
        this.skipFrames = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
