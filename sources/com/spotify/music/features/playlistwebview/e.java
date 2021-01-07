package com.spotify.music.features.playlistwebview;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Arrays;
import java.util.List;

public class e {
    public static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.c("playlist_web_view_url");
    public static final SpSharedPreferences.b<Object, String> d = SpSharedPreferences.b.c("playlist_web_view_uri_filter");
    private static final List<String> e = Arrays.asList("https://sites.spotify.net", "https://inject-test.litenjacob.now.sh");
    private final c a;
    private final SpSharedPreferences<Object> b;

    public e(c cVar, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = cVar;
        this.b = spSharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.b.n(c, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(com.spotify.mobile.android.util.l0 r7) {
        /*
            r6 = this;
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r0 = r6.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r1 = com.spotify.music.features.playlistwebview.e.c
            java.lang.String r2 = ""
            java.lang.String r0 = r0.n(r1, r2)
            boolean r1 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0014
        L_0x0012:
            r0 = 0
            goto L_0x002d
        L_0x0014:
            java.util.List<java.lang.String> r1 = com.spotify.music.features.playlistwebview.e.e
            java.util.Iterator r1 = r1.iterator()
        L_0x001a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0012
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x001a
            r0 = 1
        L_0x002d:
            if (r0 != 0) goto L_0x0030
            return r4
        L_0x0030:
            com.spotify.music.features.playlistwebview.c r0 = r6.a
            r0.getClass()
            com.spotify.music.libs.debugtools.flags.DebugFlag r0 = com.spotify.music.libs.debugtools.flags.DebugFlag.PLAYLIST_WEB_VIEW_ENABLED
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r0 = r6.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r1 = com.spotify.music.features.playlistwebview.e.d
            java.lang.String r0 = r0.n(r1, r2)
            java.lang.String r1 = ","
            com.google.common.base.Splitter r1 = com.google.common.base.Splitter.on(r1)
            com.google.common.base.Splitter r1 = r1.trimResults()
            com.google.common.base.Splitter r1 = r1.omitEmptyStrings()
            java.lang.Iterable r0 = r1.split(r0)
            java.util.ArrayList r0 = com.google.common.collect.Collections2.newArrayList(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0059:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r7.k()
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x0070
            return r3
        L_0x0070:
            java.lang.String r2 = r7.k()
            byte[] r2 = com.spotify.mobile.android.util.q.a(r2)
            java.lang.String r2 = defpackage.lg0.a(r2)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0059
            return r3
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.playlistwebview.e.b(com.spotify.mobile.android.util.l0):boolean");
    }
}
