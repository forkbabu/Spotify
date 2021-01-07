package defpackage;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import com.squareup.picasso.Picasso;

/* renamed from: ub6  reason: default package */
public final class ub6 implements fjf<tb6> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<ob6> c;
    private final wlf<c.a> d;

    public ub6(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<ob6> wlf3, wlf<c.a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tb6(this.a, this.b, this.c, this.d);
    }
}
