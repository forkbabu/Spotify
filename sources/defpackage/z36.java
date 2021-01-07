package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistallsongs.d;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: z36  reason: default package */
public final class z36 implements h46<c> {
    private final m56 a;
    private final LicenseLayout b;
    private final Map<String, String> c;

    public z36(m56 m56, LicenseLayout licenseLayout, Map<String, String> map) {
        h.e(m56, "providerHelper");
        h.e(licenseLayout, "licenseLayout");
        h.e(map, "productStateMap");
        this.a = m56;
        this.b = licenseLayout;
        this.c = map;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public c a() {
        Optional optional;
        d dVar = (d) c.a();
        dVar.d(this.a.b(this.c));
        dVar.a(null);
        dVar.f(false);
        dVar.c(false);
        if (this.b == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
            optional = Optional.of(50);
            h.d(optional, "Optional.of(MAXIMUM_NUMB…ND_PLAYLIST_IN_FREE_TIER)");
        } else {
            optional = Optional.absent();
            h.d(optional, "Optional.absent()");
        }
        dVar.e((Integer) optional.orNull());
        return dVar.b();
    }
}
