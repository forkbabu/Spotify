package defpackage;

import android.content.Context;
import com.spotify.music.features.browse.component.findcard.a;
import com.spotify.music.features.browse.component.findcard.b;

/* renamed from: za4  reason: default package */
public final class za4 implements fjf<a> {
    private final wlf<Context> a;
    private final wlf<b> b;

    public za4(wlf<Context> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.b.get().b(nud.m(this.a.get()));
    }
}
