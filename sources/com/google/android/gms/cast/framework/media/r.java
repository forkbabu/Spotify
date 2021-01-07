package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

final class r implements j<Status> {
    private final long a;
    private final /* synthetic */ h.e b;

    r(h.e eVar, long j) {
        this.b = eVar;
        this.a = j;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.i] */
    @Override // com.google.android.gms.common.api.j
    public final /* synthetic */ void a(Status status) {
        Status status2 = status;
        if (!status2.r2()) {
            h.this.c.y(this.a, status2.Q1());
        }
    }
}
