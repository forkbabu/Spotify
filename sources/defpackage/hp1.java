package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.u0;
import kotlin.jvm.internal.h;

/* renamed from: hp1  reason: default package */
public final class hp1 {
    private final u0 a = new u0(PageIdentifiers.SKIP_LIMIT_PIVOT.name(), ViewUris.l2.toString());
    private final ere b;

    public hp1(ere ere) {
        h.e(ere, "ubiLogger");
        this.b = ere;
    }

    public final void a() {
        this.b.a(this.a.b().b().b().a());
    }
}
