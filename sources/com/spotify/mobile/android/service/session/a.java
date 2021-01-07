package com.spotify.mobile.android.service.session;

import com.google.common.base.Optional;

public final /* synthetic */ class a implements e {
    public final /* synthetic */ f a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ a(f fVar, long j, long j2) {
        this.a = fVar;
        this.b = j;
        this.c = j2;
    }

    @Override // com.spotify.mobile.android.service.session.e
    public final Optional call() {
        return this.a.a(this.b, this.c);
    }
}
