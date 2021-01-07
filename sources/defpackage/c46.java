package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.b;
import com.spotify.music.features.playlistentity.configuration.d;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: c46  reason: default package */
public final class c46 implements h46<b> {
    private final m56 a;
    private final LicenseLayout b;
    private final Map<String, String> c;

    public c46(m56 m56, LicenseLayout licenseLayout, Map<String, String> map) {
        h.e(m56, "providerHelper");
        h.e(licenseLayout, "licenseLayout");
        h.e(map, "productStateMap");
        this.a = m56;
        this.b = licenseLayout;
        this.c = map;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public b a() {
        LicenseLayout licenseLayout;
        b.C0242b bVar = b.f;
        b.a aVar = new b.a(null, null, null, null, null, 31);
        b.c.a aVar2 = new b.c.a(null, null, null, 7);
        boolean z = true;
        aVar2.c(true);
        aVar2.d(d.c(this.b));
        aVar2.b(this.a.a(this.b, this.c));
        aVar.c(aVar2.a());
        LicenseLayout licenseLayout2 = this.b;
        LicenseLayout licenseLayout3 = LicenseLayout.SHUFFLE_WHEN_FREE;
        aVar.d(licenseLayout2 == licenseLayout3);
        aVar.b(!this.a.a(this.b, this.c) && ((licenseLayout = this.b) == LicenseLayout.PREVIEWS_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM));
        aVar.e(this.b == licenseLayout3);
        if (this.b == licenseLayout3) {
            z = false;
        }
        aVar.f(z);
        return aVar.a();
    }
}
