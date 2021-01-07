package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

final class b0 implements i {
    b0() {
    }

    @Override // com.google.android.exoplayer2.util.i
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.i
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.util.i
    public p c(Looper looper, Handler.Callback callback) {
        return new c0(new Handler(looper, callback));
    }
}
