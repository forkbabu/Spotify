package defpackage;

import io.reactivex.a;
import kotlin.jvm.internal.h;

/* renamed from: oe2  reason: default package */
public final class oe2 {
    private final pe2 a;

    public oe2(pe2 pe2) {
        h.e(pe2, "retrofitWrapper");
        this.a = pe2;
    }

    public a a(String str, String str2) {
        h.e(str, "alexaAuthCode");
        h.e(str2, "spotifyAuthCode");
        return this.a.a(str, str2);
    }
}
