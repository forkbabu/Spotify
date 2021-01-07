package defpackage;

import android.content.Context;
import com.spotify.music.playlist.synchronizer.d;
import com.squareup.picasso.Picasso;

/* renamed from: bi3  reason: default package */
public final class bi3 implements fjf<ai3> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<d> c;

    public bi3(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ai3(this.a, this.b, this.c);
    }
}
