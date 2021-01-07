package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.music.features.playlistentity.configuration.e;
import defpackage.b66;
import kotlin.jvm.internal.h;

/* renamed from: y46  reason: default package */
public final class y46 implements h46<e> {
    private final y56 a;
    private final LicenseLayout b;

    public y46(y56 y56, LicenseLayout licenseLayout) {
        h.e(y56, "externalDependencies");
        h.e(licenseLayout, "licenseLayout");
        this.a = y56;
        this.b = licenseLayout;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public e a() {
        e.b bVar = e.e;
        e.a aVar = new e.a(null, null, null, null, 15);
        LicenseLayout licenseLayout = this.b;
        LicenseLayout licenseLayout2 = LicenseLayout.SHUFFLE_WHEN_FREE;
        aVar.e(licenseLayout != licenseLayout2);
        LicenseLayout licenseLayout3 = this.b;
        boolean z = licenseLayout3 == licenseLayout2 || licenseLayout3 == LicenseLayout.PREVIEWS_WHEN_FREE;
        boolean d = this.a.d();
        boolean z2 = z && (!d || !this.a.c());
        b66 b66 = b66.f;
        b66.a a2 = b66.a();
        a2.d(d);
        a2.e(false);
        a2.b(z);
        a2.c(z2);
        aVar.b(a2.a());
        aVar.c(!d.b(this.b));
        aVar.d(d.b(this.b));
        return aVar.a();
    }
}
