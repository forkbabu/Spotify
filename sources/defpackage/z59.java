package defpackage;

import android.content.Context;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.features.yourlibrary.musicpages.item.o;
import com.spotify.music.features.yourlibrary.musicpages.view.p0;
import com.spotify.music.features.yourlibrary.musicpages.view.r0;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;

/* renamed from: z59  reason: default package */
public final class z59 implements fjf<y59> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<EncoreConsumerEntryPoint> c;
    private final wlf<p0> d;
    private final wlf<q> e;
    private final wlf<o> f;
    private final wlf<r0> g;

    public z59(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<EncoreConsumerEntryPoint> wlf3, wlf<p0> wlf4, wlf<q> wlf5, wlf<o> wlf6, wlf<r0> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y59(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
