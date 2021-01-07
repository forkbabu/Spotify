package com.spotify.music.libs.mediabrowserservice;

public final class a3 implements fjf<RecentlyUsedComparator> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final a3 a = new a3();
    }

    public static a3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new RecentlyUsedComparator();
    }
}
