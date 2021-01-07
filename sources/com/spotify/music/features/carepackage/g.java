package com.spotify.music.features.carepackage;

import android.content.Context;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class g implements fjf<String> {
    private final wlf<CarePackageFragment> a;

    public g(wlf<CarePackageFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        CarePackageFragment carePackageFragment = this.a.get();
        h.e(carePackageFragment, "carePackageFragment");
        Context F2 = carePackageFragment.F2();
        if (F2 != null) {
            return F2.getString(C0707R.string.nav_bar_title);
        }
        return null;
    }
}
