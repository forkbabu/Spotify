package defpackage;

import com.spotify.ubi.specification.factories.w3;
import kotlin.jvm.internal.h;

/* renamed from: jad  reason: default package */
public final class jad {
    private final w3 a = new w3();
    private final ere b;

    public jad(ere ere) {
        h.e(ere, "ubiLogger");
        this.b = ere;
    }

    public final void a(int i, String str) {
        h.e(str, "sessionUri");
        this.b.a(this.a.c().b(Integer.valueOf(i), str).b().a());
    }
}
