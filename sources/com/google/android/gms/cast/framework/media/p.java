package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.h;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class p extends h.g {
    private final /* synthetic */ JSONObject q;
    private final /* synthetic */ h r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(h hVar, JSONObject jSONObject) {
        super(false);
        this.r = hVar;
        this.q = jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.media.h.g
    public final void o() {
        this.r.c.x(this.n, this.q);
    }
}
