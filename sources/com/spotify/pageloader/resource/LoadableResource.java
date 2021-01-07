package com.spotify.pageloader.resource;

import com.spotify.pageloader.l0;
import com.spotify.pageloader.m0;
import kotlin.jvm.internal.h;

public abstract class LoadableResource {
    private qg0<l0<LoadableResource>> a;
    private State b = State.STOPPED;

    /* access modifiers changed from: private */
    public enum State {
        STOPPED,
        LOADING,
        LOADED,
        FAILED
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public final void d(Throwable th) {
        h.e(th, "exception");
        if (this.b == State.LOADING) {
            this.b = State.FAILED;
            qg0<l0<LoadableResource>> qg0 = this.a;
            if (qg0 != null) {
                qg0.accept(m0.b(th));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (this.b == State.LOADING) {
            this.b = State.LOADED;
            qg0<l0<LoadableResource>> qg0 = this.a;
            if (qg0 != null) {
                qg0.accept(l0.b(this));
            }
        }
    }

    public final void f(qg0<l0<LoadableResource>> qg0) {
        h.e(qg0, "emitter");
        if (this.b == State.STOPPED) {
            this.b = State.LOADING;
            this.a = qg0;
            a();
            return;
        }
        throw new IllegalStateException("already started".toString());
    }

    public final void g() {
        b();
        this.b = State.STOPPED;
        this.a = null;
    }
}
