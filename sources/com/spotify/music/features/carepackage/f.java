package com.spotify.music.features.carepackage;

import io.reactivex.a;
import kotlin.jvm.internal.h;

public final class f implements fjf<nmf<String, a>> {
    private final wlf<hi4> a;

    public f(wlf<hi4> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        hi4 hi4 = this.a.get();
        h.e(hi4, "carePackageEndpoint");
        return new CarePackageFragmentModule$CarePackageResponseModule$addPlaylistToLibraryResponse$1(hi4);
    }
}
