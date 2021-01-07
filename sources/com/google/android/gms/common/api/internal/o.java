package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.c;
import com.google.android.gms.tasks.h;

public abstract class o<A extends a.b, L> {
    private final k<L> a;
    private final c[] b;
    private final boolean c;
    private final int d;

    protected o(@RecentlyNonNull k<L> kVar, c[] cVarArr, boolean z, int i) {
        this.a = kVar;
        this.b = cVarArr;
        this.c = z;
        this.d = i;
    }

    public void a() {
        this.a.a();
    }

    @RecentlyNullable
    public k.a<L> b() {
        return this.a.b();
    }

    @RecentlyNullable
    public c[] c() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract void d(@RecentlyNonNull A a2, @RecentlyNonNull h<Void> hVar);

    public final boolean e() {
        return this.c;
    }

    public final int f() {
        return this.d;
    }
}
