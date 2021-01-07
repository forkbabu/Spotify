package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.q;

/* renamed from: oxc  reason: default package */
public final class oxc implements fjf<k.a> {
    private final wlf<Context> a;

    public oxc(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(this.a.get(), "previewplayer");
    }
}
