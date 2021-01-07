package defpackage;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;

/* renamed from: ul6  reason: default package */
public final class ul6 implements fjf<tl6> {
    private final wlf<Context> a;
    private final wlf<pl6> b;
    private final wlf<c.a> c;

    public ul6(wlf<Context> wlf, wlf<pl6> wlf2, wlf<c.a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tl6(this.a, this.b, this.c);
    }
}
