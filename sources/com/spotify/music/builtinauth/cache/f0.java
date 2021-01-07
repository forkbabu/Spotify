package com.spotify.music.builtinauth.cache;

import java.util.concurrent.Callable;

class f0 implements Callable<Void> {
    final /* synthetic */ b0 a;
    final /* synthetic */ d0 b;

    f0(d0 d0Var, b0 b0Var) {
        this.b = d0Var;
        this.a = b0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX INFO: finally extract failed */
    @Override // java.util.concurrent.Callable
    public Void call() {
        this.b.a.c();
        try {
            this.b.c.e(this.a);
            this.b.a.s();
            this.b.a.h();
            return null;
        } catch (Throwable th) {
            this.b.a.h();
            throw th;
        }
    }
}
