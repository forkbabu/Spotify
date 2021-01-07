package com.spotify.mobile.android.coreintegration;

public final class v implements fjf<io.reactivex.subjects.a<BackgroundFeaturesStatus>> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final v a = new v();
    }

    public static v a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return io.reactivex.subjects.a.i1(BackgroundFeaturesStatus.NOT_RUNNING);
    }
}
