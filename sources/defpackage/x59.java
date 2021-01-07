package defpackage;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.view.p0;
import com.spotify.music.features.yourlibrary.musicpages.view.r0;
import com.squareup.picasso.Picasso;

/* renamed from: x59  reason: default package */
public final class x59 implements fjf<w59> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<p0> c;
    private final wlf<r0> d;
    private final wlf<ag9> e;

    public x59(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<p0> wlf3, wlf<r0> wlf4, wlf<ag9> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w59(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
