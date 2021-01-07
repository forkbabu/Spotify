package com.spotify.music.features.yourlibrary.musicpages.view;

import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.d39;

/* access modifiers changed from: package-private */
public class u0 implements d39.c<MusicItem.Type, MusicItem> {
    final /* synthetic */ y3 a;
    final /* synthetic */ t0 b;

    u0(t0 t0Var, y3 y3Var) {
        this.b = t0Var;
        this.a = y3Var;
    }

    /* Return type fixed from 'd39$b' to match base method */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    @Override // defpackage.d39.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.features.yourlibrary.musicpages.item.MusicItem a(int r5, boolean r6) {
        /*
            r4 = this;
            com.spotify.music.features.yourlibrary.musicpages.datasource.y3 r0 = r4.a
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r0 = r0.getItem(r5)
            if (r6 == 0) goto L_0x005e
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r6 = r4.b
            int r6 = com.spotify.music.features.yourlibrary.musicpages.view.t0.b(r6)
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r1 = r4.b
            int r1 = com.spotify.music.features.yourlibrary.musicpages.view.t0.d(r1)
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r2 = r4.b
            int r2 = com.spotify.music.features.yourlibrary.musicpages.view.t0.e(r2)
            int r3 = r6 + r1
            if (r5 < r3) goto L_0x0023
            int r1 = r1 - r2
            int r6 = r5 - r2
            int r6 = r6 / r1
            goto L_0x002a
        L_0x0023:
            if (r6 <= 0) goto L_0x002c
            if (r5 >= r6) goto L_0x002c
            int r1 = r1 - r2
            int r6 = r5 / r1
        L_0x002a:
            int r6 = r6 * r1
        L_0x002c:
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r1 = r4.b
            int r1 = com.spotify.music.features.yourlibrary.musicpages.view.t0.b(r1)
            if (r6 == r1) goto L_0x005e
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r1 = r4.b
            com.spotify.music.features.yourlibrary.musicpages.view.t0.c(r1, r6)
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r6 = r4.b
            com.spotify.music.features.yourlibrary.musicpages.view.t0$b r6 = com.spotify.music.features.yourlibrary.musicpages.view.t0.f(r6)
            if (r6 == 0) goto L_0x005e
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r6 = r4.b
            com.spotify.music.features.yourlibrary.musicpages.view.t0$b r6 = com.spotify.music.features.yourlibrary.musicpages.view.t0.f(r6)
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r1 = r4.b
            int r1 = com.spotify.music.features.yourlibrary.musicpages.view.t0.b(r1)
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r2 = r4.b
            int r2 = com.spotify.music.features.yourlibrary.musicpages.view.t0.d(r2)
            com.spotify.music.features.yourlibrary.musicpages.view.q r6 = (com.spotify.music.features.yourlibrary.musicpages.view.q) r6
            da2 r6 = r6.a
            com.spotify.music.features.yourlibrary.musicpages.domain.s0 r1 = com.spotify.music.features.yourlibrary.musicpages.domain.s0.O(r1, r2)
            r6.accept(r1)
        L_0x005e:
            com.spotify.music.features.yourlibrary.musicpages.view.t0 r6 = r4.b
            java.util.ArrayList r6 = com.spotify.music.features.yourlibrary.musicpages.view.t0.g(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r6.next()
            com.spotify.music.features.yourlibrary.musicpages.datasource.q4 r1 = (com.spotify.music.features.yourlibrary.musicpages.datasource.q4) r1
            com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r0 = r1.a(r0, r5)
            goto L_0x0068
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibrary.musicpages.view.u0.a(int, boolean):d39$b");
    }

    @Override // defpackage.d39.c
    public int c() {
        return this.a.getCount();
    }
}
