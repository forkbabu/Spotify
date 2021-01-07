package defpackage;

import android.content.Context;
import com.spotify.music.libs.mediabrowserservice.b2;

/* renamed from: rka  reason: default package */
public final class rka implements fjf<qka> {
    private final wlf<Context> a;
    private final wlf<oka> b;
    private final wlf<b2> c;

    public rka(wlf<Context> wlf, wlf<oka> wlf2, wlf<b2> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qka(this.a.get(), this.b.get(), this.c.get());
    }
}
