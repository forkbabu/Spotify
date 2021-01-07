package com.spotify.remoteconfig;

import com.spotify.remoteconfig.PremiumDestinationProperties;
import com.spotify.remoteconfig.vi;

public final /* synthetic */ class g3 implements o0e {
    public static final /* synthetic */ g3 a = new g3();

    private /* synthetic */ g3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("premium-destination", "premium_tab_shows_on_tablets", false);
        PremiumDestinationProperties.PremiumTabTitle premiumTabTitle = PremiumDestinationProperties.PremiumTabTitle.CONTROL;
        boolean a3 = p0e.a("premium-destination", "v2_page_enabled", true);
        vi.b bVar = new vi.b();
        bVar.b(false);
        bVar.c(premiumTabTitle);
        bVar.d(true);
        bVar.b(a2);
        bVar.c((PremiumDestinationProperties.PremiumTabTitle) p0e.b("premium-destination", "premium_tab_title", premiumTabTitle));
        bVar.d(a3);
        return bVar.a();
    }
}
