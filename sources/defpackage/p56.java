package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.music.features.playlistentity.configuration.h;
import defpackage.b66;

/* renamed from: p56  reason: default package */
public final class p56 implements h46<h> {
    private final m56 a;
    private final y56 b;
    private final LicenseLayout c;

    public p56(m56 m56, y56 y56, LicenseLayout licenseLayout) {
        kotlin.jvm.internal.h.e(m56, "providerHelper");
        kotlin.jvm.internal.h.e(y56, "externalDependencies");
        kotlin.jvm.internal.h.e(licenseLayout, "licenseLayout");
        this.a = m56;
        this.b = y56;
        this.c = licenseLayout;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public h a() {
        h.b bVar = h.f;
        h.a aVar = new h.a(null, null, null, null, null, 31);
        boolean z = true;
        aVar.d(!d.b(this.c));
        aVar.e(this.c != LicenseLayout.SHUFFLE_WHEN_FREE);
        boolean d = d.d(this.c);
        boolean d2 = this.b.d();
        boolean z2 = d && (!d2 || !this.b.c());
        b66 b66 = b66.f;
        b66.a a2 = b66.a();
        a2.d(d2);
        if (this.a.c() || d.b(this.c)) {
            z = false;
        }
        a2.e(z);
        a2.b(d);
        a2.c(z2);
        aVar.c(a2.a());
        aVar.f(d.b(this.c));
        aVar.b(false);
        return aVar.a();
    }
}
