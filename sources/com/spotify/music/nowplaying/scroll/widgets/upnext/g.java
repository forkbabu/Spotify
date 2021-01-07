package com.spotify.music.nowplaying.scroll.widgets.upnext;

import com.spotify.player.model.PlayerQueue;
import io.reactivex.functions.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class g<T, R> implements l<PlayerQueue, List<? extends a>> {
    final /* synthetic */ i a;

    g(i iVar) {
        this.a = iVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    @Override // io.reactivex.functions.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<? extends com.spotify.music.nowplaying.scroll.widgets.upnext.a> apply(com.spotify.player.model.PlayerQueue r15) {
        /*
            r14 = this;
            com.spotify.player.model.PlayerQueue r15 = (com.spotify.player.model.PlayerQueue) r15
            java.lang.String r0 = "playerQueue"
            kotlin.jvm.internal.h.e(r15, r0)
            com.google.common.collect.ImmutableList r15 = r15.nextTracks()
            java.lang.String r0 = "playerQueue.nextTracks()"
            kotlin.jvm.internal.h.d(r15, r0)
            java.util.List r15 = defpackage.m3c.a(r15)
            r0 = 3
            java.util.List r15 = kotlin.collections.d.K(r15, r0)
            com.spotify.music.nowplaying.scroll.widgets.upnext.i r0 = r14.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.d.e(r15, r2)
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
        L_0x002a:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r15.next()
            r4 = r2
            com.spotify.player.model.ContextTrack r4 = (com.spotify.player.model.ContextTrack) r4
            r0.getClass()
            com.spotify.music.nowplaying.scroll.widgets.upnext.a r2 = new com.spotify.music.nowplaying.scroll.widgets.upnext.a
            java.lang.String r5 = r4.uri()
            java.lang.String r3 = "track.uri()"
            kotlin.jvm.internal.h.d(r5, r3)
            java.lang.String r6 = defpackage.kxd.b(r4)
            java.lang.String r3 = defpackage.kxd.q(r4)
            java.lang.String r7 = ""
            if (r3 == 0) goto L_0x0053
            r8 = r3
            goto L_0x0054
        L_0x0053:
            r8 = r7
        L_0x0054:
            java.lang.String r3 = defpackage.kxd.p(r4)
            if (r3 == 0) goto L_0x0063
            boolean r3 = kotlin.text.e.n(r3)
            if (r3 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r3 = 0
            goto L_0x0064
        L_0x0063:
            r3 = 1
        L_0x0064:
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = defpackage.kxd.a(r4)
            goto L_0x0071
        L_0x006b:
            java.lang.String r3 = defpackage.kxd.p(r4)
            if (r3 == 0) goto L_0x0073
        L_0x0071:
            r9 = r3
            goto L_0x0074
        L_0x0073:
            r9 = r7
        L_0x0074:
            java.lang.String r10 = defpackage.kxd.e(r4)
            java.lang.String r3 = "$this$is19Plus"
            java.lang.String r7 = "is_19_plus"
            java.lang.Object r3 = defpackage.je.e0(r4, r3, r7)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x008a
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            r11 = r3
            goto L_0x008c
        L_0x008a:
            r3 = 0
            r11 = 0
        L_0x008c:
            boolean r12 = defpackage.kxd.g(r4)
            boolean r13 = defpackage.kxd.i(r4)
            r3 = r2
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.add(r2)
            goto L_0x002a
        L_0x00a2:
            java.util.List r15 = kotlin.collections.d.Q(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.scroll.widgets.upnext.g.apply(java.lang.Object):java.lang.Object");
    }
}
