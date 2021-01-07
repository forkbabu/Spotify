package defpackage;

import com.spotify.music.features.languagepicker.logger.b;
import com.squareup.picasso.Picasso;

/* renamed from: nm5  reason: default package */
public final class nm5 implements fjf<gm5> {
    private final wlf<Picasso> a;
    private final wlf<Integer> b;
    private final wlf<b> c;

    public nm5(wlf<Picasso> wlf, wlf<Integer> wlf2, wlf<b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gm5(this.a.get(), this.c.get(), this.b.get().intValue());
    }
}
