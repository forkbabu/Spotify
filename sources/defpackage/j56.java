package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.music.features.playlistentity.configuration.g;
import defpackage.b66;
import kotlin.jvm.internal.h;

/* renamed from: j56  reason: default package */
public final class j56 implements h46<g> {
    private final m56 a;
    private final y56 b;
    private final LicenseLayout c;
    private final boolean d;

    public j56(m56 m56, y56 y56, LicenseLayout licenseLayout, boolean z) {
        h.e(m56, "providerHelper");
        h.e(y56, "externalDependencies");
        h.e(licenseLayout, "licenseLayout");
        this.a = m56;
        this.b = y56;
        this.c = licenseLayout;
        this.d = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public g a() {
        g.b bVar = g.g;
        g.a aVar = new g.a(null, null, null, null, null, null, 63);
        aVar.d(!d.b(this.c));
        aVar.e(this.c != LicenseLayout.SHUFFLE_WHEN_FREE);
        LicenseLayout licenseLayout = this.c;
        boolean z = d.d(licenseLayout) && !(d.c(licenseLayout) && this.d);
        boolean d2 = this.b.d();
        boolean z2 = z && (!d2 || !this.b.c());
        b66 b66 = b66.f;
        b66.a a2 = b66.a();
        a2.d(d2);
        a2.e(!this.a.c() && !d.b(licenseLayout));
        a2.b(z);
        a2.c(z2);
        aVar.c(a2.a());
        aVar.f(!d.b(this.c));
        aVar.g(d.b(this.c));
        aVar.b(false);
        return aVar.a();
    }
}
