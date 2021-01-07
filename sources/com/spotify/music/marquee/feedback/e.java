package com.spotify.music.marquee.feedback;

import androidx.fragment.app.c;
import com.spotify.mobile.android.util.o0;

public final class e {
    private final wlf<jjb> a;
    private final wlf<o0> b;

    public e(wlf<jjb> wlf, wlf<o0> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public d b(String str, String str2, c cVar) {
        jjb jjb = this.a.get();
        a(jjb, 1);
        jjb jjb2 = jjb;
        o0 o0Var = this.b.get();
        a(o0Var, 2);
        a(str, 3);
        a(str2, 4);
        a(cVar, 5);
        return new d(jjb2, o0Var, str, str2, cVar);
    }
}
