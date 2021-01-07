package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.h;

/* access modifiers changed from: package-private */
public final class l extends h.g {
    private final /* synthetic */ int[] q;
    private final /* synthetic */ h r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(h hVar, int[] iArr) {
        super(true);
        this.r = hVar;
        this.q = iArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.media.h.g
    public final void o() {
        this.r.c.s(this.n, this.q);
    }
}
