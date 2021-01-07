package com.spotify.music.features.carepackage;

import androidx.fragment.app.o;

public final class h implements fjf<o> {
    private final CarePackageFragmentModule$SharePreviewModule a;
    private final wlf<CarePackageFragment> b;

    public h(CarePackageFragmentModule$SharePreviewModule carePackageFragmentModule$SharePreviewModule, wlf<CarePackageFragment> wlf) {
        this.a = carePackageFragmentModule$SharePreviewModule;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        CarePackageFragmentModule$SharePreviewModule carePackageFragmentModule$SharePreviewModule = this.a;
        CarePackageFragment carePackageFragment = this.b.get();
        carePackageFragmentModule$SharePreviewModule.getClass();
        kotlin.jvm.internal.h.e(carePackageFragment, "carePackageFragment");
        o E2 = carePackageFragment.E2();
        kotlin.jvm.internal.h.d(E2, "carePackageFragment.childFragmentManager");
        return E2;
    }
}
