package defpackage;

import com.spotify.mobile.android.video.q;
import defpackage.dod;

/* renamed from: eod  reason: default package */
public final class eod implements fjf<dod.a> {
    private final wlf<q> a;

    public eod(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dod.a(this.a.get());
    }
}
