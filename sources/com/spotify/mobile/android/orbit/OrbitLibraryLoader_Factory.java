package com.spotify.mobile.android.orbit;

import java.util.Random;

public final class OrbitLibraryLoader_Factory implements fjf<OrbitLibraryLoader> {
    private final wlf<Random> randomProvider;

    public OrbitLibraryLoader_Factory(wlf<Random> wlf) {
        this.randomProvider = wlf;
    }

    public static OrbitLibraryLoader_Factory create(wlf<Random> wlf) {
        return new OrbitLibraryLoader_Factory(wlf);
    }

    public static OrbitLibraryLoader newInstance(Random random) {
        return new OrbitLibraryLoader(random);
    }

    @Override // defpackage.wlf
    public OrbitLibraryLoader get() {
        return newInstance(this.randomProvider.get());
    }
}
