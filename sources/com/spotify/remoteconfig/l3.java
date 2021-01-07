package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsNewplayingScrollWidgetsBtlProperties;
import com.spotify.remoteconfig.pf;

public final /* synthetic */ class l3 implements o0e {
    public static final /* synthetic */ l3 a = new l3();

    private /* synthetic */ l3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment btlSnpvTreatment = AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment.ENABLE_WHEN_LYRICS_ABSENT;
        pf.b bVar = new pf.b();
        bVar.a(btlSnpvTreatment);
        bVar.a((AndroidLibsNewplayingScrollWidgetsBtlProperties.BtlSnpvTreatment) p0e.b("android-libs-newplaying-scroll-widgets-btl", "btl_snpv_treatment", btlSnpvTreatment));
        return bVar.b();
    }
}
