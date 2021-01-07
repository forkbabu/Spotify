package com.spotify.mobile.android.video;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.video.o;
import java.util.Collections;
import java.util.Map;

public abstract class e0 {

    public static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract e0 a();

        public e0 b() {
            g(ImmutableMap.copyOf(c()));
            e0 a = a();
            String d = a.d();
            MoreObjects.checkState(!(d == null || d.length() == 0), "Media url must be set");
            return a;
        }

        /* access modifiers changed from: package-private */
        public abstract Map<String, String> c();

        public abstract a d(boolean z);

        public abstract a e(boolean z);

        public abstract a f(String str);

        public abstract a g(Map<String, String> map);
    }

    public static a a() {
        o.b bVar = new o.b();
        bVar.g(Collections.emptyMap());
        return bVar;
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract String d();

    public abstract Map<String, String> e();
}
