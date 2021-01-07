package com.spotify.mobile.android.video.offline;

import com.spotify.mobile.android.video.offline.o;

public abstract class f0 {

    public static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract f0 a();

        public f0 b() {
            if (c() < 0) {
                d(Integer.MAX_VALUE);
            }
            return a();
        }

        /* access modifiers changed from: package-private */
        public abstract int c();

        public abstract a d(int i);
    }

    public static a a() {
        o.b bVar = new o.b();
        bVar.d(Integer.MAX_VALUE);
        return bVar;
    }

    public abstract int b();
}
