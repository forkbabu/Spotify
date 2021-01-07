package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;
import io.reactivex.s;

/* renamed from: nla  reason: default package */
public final class nla implements fjf<mla> {
    private final wlf<s<String>> a;
    private final wlf<Context> b;
    private final wlf<i> c;

    public nla(wlf<s<String>> wlf, wlf<Context> wlf2, wlf<i> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mla(this.a.get(), this.b.get(), this.c.get());
    }
}
