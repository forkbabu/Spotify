package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import java.util.Random;

/* renamed from: ty5  reason: default package */
public final class ty5 implements fjf<sy5> {
    private final wlf<o> a;
    private final wlf<Random> b;
    private final wlf<Context> c;

    public ty5(wlf<o> wlf, wlf<Random> wlf2, wlf<Context> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sy5(this.a, this.b, this.c);
    }
}
