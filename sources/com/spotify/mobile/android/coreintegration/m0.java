package com.spotify.mobile.android.coreintegration;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Random;

public final class m0 implements fjf<StateRestoreFileDeleter> {
    private final wlf<SpSharedPreferences<Object>> a;
    private final wlf<Random> b;

    public m0(wlf<SpSharedPreferences<Object>> wlf, wlf<Random> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static StateRestoreFileDeleter a(SpSharedPreferences<Object> spSharedPreferences, Random random) {
        return new StateRestoreFileDeleter(spSharedPreferences, random);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new StateRestoreFileDeleter(this.a.get(), this.b.get());
    }
}
