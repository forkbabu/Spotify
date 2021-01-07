package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.util.g;

public final class n0 {
    private final b a;
    private final a b;
    private final v0 c;
    private int d;
    private Object e;
    private Handler f;
    private int g;
    private long h = -9223372036854775807L;
    private boolean i = true;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public interface a {
    }

    public interface b {
        void l(int i, Object obj);
    }

    public n0(a aVar, b bVar, v0 v0Var, int i2, Handler handler) {
        this.b = aVar;
        this.a = bVar;
        this.c = v0Var;
        this.f = handler;
        this.g = i2;
    }

    public synchronized boolean a() {
        g.m(this.j);
        g.m(this.f.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public synchronized n0 b() {
        g.m(this.j);
        this.m = true;
        l(false);
        return this;
    }

    public boolean c() {
        return this.i;
    }

    public Handler d() {
        return this.f;
    }

    public Object e() {
        return this.e;
    }

    public long f() {
        return this.h;
    }

    public b g() {
        return this.a;
    }

    public v0 h() {
        return this.c;
    }

    public int i() {
        return this.d;
    }

    public int j() {
        return this.g;
    }

    public synchronized boolean k() {
        return this.m;
    }

    public synchronized void l(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    public n0 m() {
        g.m(!this.j);
        if (this.h == -9223372036854775807L) {
            g.a(this.i);
        }
        this.j = true;
        ((b0) this.b).R(this);
        return this;
    }

    public n0 n(boolean z) {
        g.m(!this.j);
        this.i = z;
        return this;
    }

    public n0 o(Object obj) {
        g.m(!this.j);
        this.e = obj;
        return this;
    }

    public n0 p(long j2) {
        g.m(!this.j);
        this.h = j2;
        return this;
    }

    public n0 q(int i2) {
        g.m(!this.j);
        this.d = i2;
        return this;
    }
}
