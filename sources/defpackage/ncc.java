package defpackage;

import android.app.Application;
import com.spotify.music.libs.partnerapps.api.c;

/* renamed from: ncc  reason: default package */
public final class ncc implements fjf<mcc> {
    private final wlf<Application> a;
    private final wlf<c> b;
    private final wlf<lcc> c;

    public ncc(wlf<Application> wlf, wlf<c> wlf2, wlf<lcc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mcc(this.a.get(), this.b.get(), this.c.get());
    }
}
