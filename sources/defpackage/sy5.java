package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import defpackage.qy5;
import java.util.Random;

/* renamed from: sy5  reason: default package */
public final class sy5 implements qy5.a {
    private final wlf<o> a;
    private final wlf<Random> b;
    private final wlf<Context> c;

    public sy5(wlf<o> wlf, wlf<Random> wlf2, wlf<Context> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.qy5.a
    public qy5 a(String str) {
        b(str, 1);
        o oVar = this.a.get();
        b(oVar, 2);
        Random random = this.b.get();
        b(random, 3);
        Context context = this.c.get();
        b(context, 4);
        return new ry5(str, oVar, random, context);
    }
}
