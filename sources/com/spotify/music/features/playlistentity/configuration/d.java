package com.spotify.music.features.playlistentity.configuration;

import kotlin.jvm.internal.h;

public final class d {
    public static final boolean a(LicenseLayout licenseLayout) {
        h.e(licenseLayout, "licenseLayout");
        return licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE;
    }

    public static final boolean b(LicenseLayout licenseLayout) {
        h.e(licenseLayout, "licenseLayout");
        return a(licenseLayout) && licenseLayout != LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }

    public static final boolean c(LicenseLayout licenseLayout) {
        h.e(licenseLayout, "licenseLayout");
        return licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM;
    }

    public static final boolean d(LicenseLayout licenseLayout) {
        h.e(licenseLayout, "licenseLayout");
        return licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE || licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_PREMIUM || licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
    }
}
