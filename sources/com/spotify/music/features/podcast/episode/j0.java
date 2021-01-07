package com.spotify.music.features.podcast.episode;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.quotesharing.b;
import com.spotify.music.podcast.episode.util.e;
import com.spotify.music.podcast.episode.util.j;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.offline.a;
import defpackage.ojc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class j0 {
    private final j a;
    private final e b;

    public j0(j jVar, e eVar) {
        this.a = jVar;
        this.b = eVar;
    }

    private static int a(a aVar) {
        return ((Integer) aVar.a(f.a, g.a, j.a, e.a, l.a, h.a, i.a, k.a)).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (com.google.common.base.MoreObjects.isNullOrEmpty(r3) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(com.spotify.playlist.models.Covers r2, com.spotify.playlist.models.Covers r3) {
        /*
            java.lang.String r0 = ""
            if (r3 == 0) goto L_0x000e
            java.lang.String r3 = r3.b()
            boolean r1 = com.google.common.base.MoreObjects.isNullOrEmpty(r3)
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r3 = r0
        L_0x000f:
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.b()
            boolean r1 = com.google.common.base.MoreObjects.isNullOrEmpty(r2)
            if (r1 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            boolean r2 = com.google.common.base.MoreObjects.isNullOrEmpty(r0)
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r3 = r0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.podcast.episode.j0.b(com.spotify.playlist.models.Covers, com.spotify.playlist.models.Covers):java.lang.String");
    }

    public g77 c(Episode episode, b91 b91, k87 k87, b91 b912, b91 b913) {
        String str;
        String str2;
        String str3;
        List<b> list;
        Show w = episode.w();
        Covers c = episode.c();
        if (w != null) {
            String b2 = b(c, w.c());
            String uri = w.getUri();
            str2 = w.h().trim();
            str = b2;
            str3 = uri;
        } else {
            str = b(c, null);
            str3 = "";
            str2 = str3;
        }
        String b3 = this.b.b(episode);
        j.b g = this.a.g(str2, episode.u(), episode.j(), null, false);
        g.c(true);
        g.f(true);
        String build = g.build();
        String trim = episode.d().trim();
        String f = episode.f();
        String trim2 = episode.n().trim();
        int a2 = a(episode.o());
        long millis = TimeUnit.SECONDS.toMillis((long) episode.j());
        ArrayList arrayList = new ArrayList(0);
        if (b912 != null && !b912.body().isEmpty()) {
            arrayList.addAll(b912.body());
        }
        if (episode.v() != null) {
            list = tpa.a(episode.v());
        } else {
            list = Collections.emptyList();
        }
        return g77.c(trim, f, episode.getUri(), trim2, build, b3, a2, episode.o(), str3, str2, str, episode.C(), millis, b91, k87, arrayList, b913, list, episode.F(), episode.r());
    }

    public rc7 d(Episode episode, ojc ojc, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        Show w = episode.w();
        String str5 = null;
        if (w != null) {
            String trim = w.h().trim();
            String b2 = w.c().b();
            if (!MoreObjects.isNullOrEmpty(b2)) {
                str5 = b2;
            }
            String uri = w.getUri();
            str = b(episode.c(), w.c());
            str4 = trim;
            str3 = str5;
            str2 = uri;
        } else {
            str = b(episode.c(), null);
            str4 = "";
            str2 = str4;
            str3 = null;
        }
        int j = episode.j();
        ojc.getClass();
        if ((ojc instanceof ojc.b) || (ojc instanceof ojc.a)) {
            int j2 = episode.j();
            Integer x = episode.x();
            i = x != null ? x.intValue() : 0;
            i2 = j2 - i;
        } else {
            ojc.c cVar = (ojc.c) ojc;
            long f = cVar.f() - cVar.g();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            i2 = (int) timeUnit.toSeconds(cVar.g());
            i = (int) timeUnit.toSeconds(f);
        }
        int[] iArr = {i, i2};
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z3 = (ojc instanceof ojc.c) && ((ojc.c) ojc).e();
        j.b g = this.a.g(str4, episode.u(), j, Integer.valueOf(i3), episode.E());
        g.c(true);
        g.b(z3);
        String build = g.build();
        int a2 = ric.a(episode.E(), z3, j, i3);
        String trim2 = episode.n().trim();
        return rc7.b(a2, trim2, build, i4, j, str4, str3, str2, trim2, episode.getUri(), z2, str, episode.m(), a(episode.o()), episode.C(), z, episode.g());
    }
}
