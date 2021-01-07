package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class c0 implements p {
    private final Handler a;

    public c0(Handler handler) {
        this.a = handler;
    }

    @Override // com.google.android.exoplayer2.util.p
    public Message a(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.google.android.exoplayer2.util.p
    public Message b(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    @Override // com.google.android.exoplayer2.util.p
    public Looper c() {
        return this.a.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.p
    public Message d(int i, int i2, int i3) {
        return this.a.obtainMessage(i, i2, i3);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean e(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.google.android.exoplayer2.util.p
    public boolean f(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.google.android.exoplayer2.util.p
    public void g(int i) {
        this.a.removeMessages(i);
    }
}
