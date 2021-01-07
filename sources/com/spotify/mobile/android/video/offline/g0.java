package com.spotify.mobile.android.video.offline;

import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.video.offline.p;
import java.util.Collections;
import java.util.Map;

public abstract class g0 {

    public static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract g0 a();

        public g0 b() {
            g0 a = a();
            MoreObjects.checkState(!TextUtils.isEmpty(a.b()), "Media url must be set");
            e(ImmutableMap.copyOf(c()));
            return a;
        }

        /* access modifiers changed from: package-private */
        public abstract Map<String, String> c();

        public abstract a d(String str);

        public abstract a e(Map<String, String> map);
    }

    public static a a() {
        p.b bVar = new p.b();
        bVar.e(Collections.emptyMap());
        return bVar;
    }

    public abstract String b();

    public abstract Map<String, String> c();
}
