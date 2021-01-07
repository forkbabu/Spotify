package defpackage;

import com.spotify.http.u;
import io.reactivex.a;
import kotlin.jvm.internal.h;

/* renamed from: pe2  reason: default package */
public final class pe2 {
    private final qe2 a;

    public pe2(u uVar) {
        h.e(uVar, "retrofitMaker");
        Object c = uVar.c(qe2.class);
        h.d(c, "retrofitMaker.createWebg…int::class.java\n        )");
        this.a = (qe2) c;
    }

    public final a a(String str, String str2) {
        h.e(str, "alexaAuthCode");
        h.e(str2, "spotifyAuthCode");
        return this.a.a(new re2(str2, str));
    }
}
