package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.podcast.entity.d;
import com.spotify.music.features.podcast.entity.e;

/* renamed from: a57  reason: default package */
public final class a57 implements fjf<z47> {
    private final wlf<n47> a;
    private final wlf<gsc> b;
    private final wlf<d> c;
    private final wlf<e> d;
    private final wlf<RecyclerView.q> e;

    public a57(wlf<n47> wlf, wlf<gsc> wlf2, wlf<d> wlf3, wlf<e> wlf4, wlf<RecyclerView.q> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z47(this.a.get(), this.b.get(), this.c.get(), ejf.a(this.d), this.e.get());
    }
}
