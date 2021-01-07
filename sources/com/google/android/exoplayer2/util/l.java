package com.google.android.exoplayer2.util;

public final class l {
    private boolean a;

    public synchronized void a() {
        while (!this.a) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public synchronized boolean c() {
        return this.a;
    }

    public synchronized boolean d() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
