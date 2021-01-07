package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.d;
import com.google.android.gms.cast.e;
import com.google.android.gms.common.api.Status;

public final class f0 implements e.a {
    private final Status a;
    private final d b;
    private final String c;
    private final String f;
    private final boolean n;

    public f0(Status status, d dVar, String str, String str2, boolean z) {
        this.a = status;
        this.b = dVar;
        this.c = str;
        this.f = str2;
        this.n = z;
    }

    @Override // com.google.android.gms.cast.e.a
    public final d U0() {
        return this.b;
    }

    @Override // com.google.android.gms.cast.e.a
    public final String f() {
        return this.f;
    }

    @Override // com.google.android.gms.common.api.i
    public final Status h() {
        return this.a;
    }

    @Override // com.google.android.gms.cast.e.a
    public final boolean i() {
        return this.n;
    }

    @Override // com.google.android.gms.cast.e.a
    public final String l() {
        return this.c;
    }
}
