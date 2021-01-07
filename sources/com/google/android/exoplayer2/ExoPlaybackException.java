package com.google.android.exoplayer2;

import android.os.SystemClock;
import java.io.IOException;

public final class ExoPlaybackException extends Exception {
    private final Throwable cause;
    public final d0 rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final long timestampMs;
    public final int type;

    private ExoPlaybackException(int i, Throwable th) {
        super(th);
        this.type = i;
        this.cause = th;
        this.rendererIndex = -1;
        this.rendererFormat = null;
        this.rendererFormatSupport = 4;
        this.timestampMs = SystemClock.elapsedRealtime();
    }

    public static ExoPlaybackException a(OutOfMemoryError outOfMemoryError) {
        return new ExoPlaybackException(4, outOfMemoryError);
    }

    public static ExoPlaybackException b(Exception exc, int i, d0 d0Var, int i2) {
        return new ExoPlaybackException(1, exc, i, d0Var, d0Var == null ? 4 : i2);
    }

    public static ExoPlaybackException c(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    public static ExoPlaybackException d(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    private ExoPlaybackException(int i, Throwable th, int i2, d0 d0Var, int i3) {
        super(th);
        this.type = i;
        this.cause = th;
        this.rendererIndex = i2;
        this.rendererFormat = d0Var;
        this.rendererFormatSupport = i3;
        this.timestampMs = SystemClock.elapsedRealtime();
    }
}
