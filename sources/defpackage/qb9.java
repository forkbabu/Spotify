package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.features.yourlibrary.musicpages.e1;

/* renamed from: qb9  reason: default package */
public final class qb9 implements fjf<pb9> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<e1> c;

    public qb9(wlf<Context> wlf, wlf<i> wlf2, wlf<e1> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pb9(this.a.get(), this.b.get(), this.c.get());
    }
}
