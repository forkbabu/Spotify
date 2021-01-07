package com.spotify.music.features.carepackage;

import androidx.fragment.app.o;
import kotlin.jvm.internal.h;

public final class i implements fjf<o> {
    private final CarePackageFragmentModule$SharePreviewModule a;
    private final wlf<CarePackageFragment> b;

    public i(CarePackageFragmentModule$SharePreviewModule carePackageFragmentModule$SharePreviewModule, wlf<CarePackageFragment> wlf) {
        this.a = carePackageFragmentModule$SharePreviewModule;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        CarePackageFragmentModule$SharePreviewModule carePackageFragmentModule$SharePreviewModule = this.a;
        CarePackageFragment carePackageFragment = this.b.get();
        carePackageFragmentModule$SharePreviewModule.getClass();
        h.e(carePackageFragment, "carePackageFragment");
        o E2 = carePackageFragment.E2();
        h.d(E2, "carePackageFragment.childFragmentManager");
        return E2;
    }
}
