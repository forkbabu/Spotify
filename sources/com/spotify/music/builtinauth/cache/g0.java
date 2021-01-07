package com.spotify.music.builtinauth.cache;

import java.util.concurrent.Callable;

class g0 implements Callable<Integer> {
    final /* synthetic */ d0 a;

    g0(d0 d0Var) {
        this.a = d0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Integer call() {
        t7 a2 = this.a.d.a();
        this.a.a.c();
        try {
            Integer valueOf = Integer.valueOf(a2.E());
            this.a.a.s();
            return valueOf;
        } finally {
            this.a.a.h();
            this.a.d.c(a2);
        }
    }
}
