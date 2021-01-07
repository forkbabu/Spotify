package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final v0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(v0 v0Var, int i, long j) {
        this.timeline = v0Var;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
