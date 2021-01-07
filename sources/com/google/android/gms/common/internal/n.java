package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.g;

public class n {
    private static final b a = new g0();

    public interface a<R extends i, T> {
        @RecentlyNonNull
        T a(@RecentlyNonNull R r);
    }

    public interface b {
    }

    @RecentlyNonNull
    public static <R extends i, T extends h<R>> g<T> a(@RecentlyNonNull e<R> eVar, @RecentlyNonNull T t) {
        h0 h0Var = new h0(t);
        b bVar = a;
        com.google.android.gms.tasks.h hVar = new com.google.android.gms.tasks.h();
        eVar.b(new i0(eVar, hVar, h0Var, bVar));
        return hVar.a();
    }

    @RecentlyNonNull
    public static <R extends i> g<Void> b(@RecentlyNonNull e<R> eVar) {
        j0 j0Var = new j0();
        b bVar = a;
        com.google.android.gms.tasks.h hVar = new com.google.android.gms.tasks.h();
        eVar.b(new i0(eVar, hVar, j0Var, bVar));
        return hVar.a();
    }
}
