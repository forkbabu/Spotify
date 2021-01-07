package defpackage;

import android.app.Activity;
import com.spotify.music.sociallistening.participantlist.impl.g;
import com.squareup.picasso.Picasso;

/* renamed from: ydd  reason: default package */
public final class ydd implements fjf<xdd> {
    private final wlf<g> a;
    private final wlf<x9d> b;
    private final wlf<Picasso> c;
    private final wlf<Activity> d;

    public ydd(wlf<g> wlf, wlf<x9d> wlf2, wlf<Picasso> wlf3, wlf<Activity> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xdd(this.a, this.b, this.c, this.d);
    }
}
