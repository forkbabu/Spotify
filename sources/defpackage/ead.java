package defpackage;

import com.spotify.ubi.specification.factories.v3;
import kotlin.jvm.internal.h;

/* renamed from: ead  reason: default package */
public final class ead {
    private final v3 a = new v3();
    private final ere b;

    public ead(ere ere) {
        h.e(ere, "ubiLogger");
        this.b = ere;
    }

    public void a(String str) {
        h.e(str, "uri");
        this.b.a(this.a.e(str).a());
    }

    public void b(String str) {
        h.e(str, "uri");
        this.b.a(this.a.l(str).a());
    }
}
