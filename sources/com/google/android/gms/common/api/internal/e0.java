package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class e0<O extends a.d> extends u {
    @NotOnlyInitialized
    private final b<O> b;

    public e0(b<O> bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = bVar;
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, R extends i, T extends d<R, A>> T a(T t) {
        this.b.f(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, T extends d<? extends i, A>> T b(T t) {
        this.b.j(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.c
    public final Looper d() {
        return this.b.n();
    }
}
