package com.spotify.mobile.android.video;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.m;

public abstract class a0 {

    public static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract a0 a();

        public a0 b() {
            if (c().isPresent()) {
                MoreObjects.checkArgument(c().get().longValue() >= 0, "Initial position must not be negative");
            }
            return a();
        }

        /* access modifiers changed from: package-private */
        public abstract Optional<Long> c();

        public abstract a d(Long l);

        public abstract a e(boolean z);
    }

    public static a a() {
        m.b bVar = new m.b();
        bVar.e(true);
        return bVar;
    }

    public abstract Optional<Long> b();

    public abstract boolean c();
}
