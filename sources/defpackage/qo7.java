package defpackage;

import android.content.Context;
import com.spotify.music.features.profile.editprofile.p;

/* renamed from: qo7  reason: default package */
public final class qo7 implements fjf<po7> {
    private final wlf<Context> a;
    private final wlf<hn7> b;
    private final wlf<p> c;

    public qo7(wlf<Context> wlf, wlf<hn7> wlf2, wlf<p> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new po7(this.a.get(), this.b.get(), this.c.get());
    }
}
