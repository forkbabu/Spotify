package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.h;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class j extends h.g {
    private final /* synthetic */ JSONObject q;
    private final /* synthetic */ h r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(h hVar, JSONObject jSONObject) {
        super(false);
        this.r = hVar;
        this.q = jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.cast.framework.media.h.g
    public final void o() {
        this.r.c.p(this.n, 0, -1, null, 1, null, this.q);
    }
}
