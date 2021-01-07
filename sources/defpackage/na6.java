package defpackage;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import com.squareup.picasso.Picasso;

/* renamed from: na6  reason: default package */
public final class na6 implements fjf<ma6> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<ha6> c;
    private final wlf<c.a> d;

    public na6(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<ha6> wlf3, wlf<c.a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ma6(this.a, this.b, this.c, this.d);
    }
}
