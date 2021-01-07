package com.spotify.music.features.nowplayingbar.eventsources;

public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.spotify.music.features.nowplayingbar.eventsources.e] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.spotify.music.features.nowplayingbar.eventsources.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.spotify.music.features.nowplayingbar.eventsources.e] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.spotify.music.features.nowplayingbar.eventsources.e] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x004c: APUT  (r3v1 io.reactivex.v[]), (0 ??[int, short, byte, char]), (r10v3 io.reactivex.s) */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.spotify.mobius.q<com.spotify.music.features.nowplayingbar.domain.d> a(io.reactivex.g<com.spotify.player.model.PlayerState> r7, io.reactivex.s<com.spotify.music.features.nowplayingbar.domain.a> r8, io.reactivex.s<com.spotify.music.sociallistening.models.b> r9, defpackage.cmf<java.lang.Long> r10) {
        /*
            java.lang.String r0 = "playerStateFlowable"
            kotlin.jvm.internal.h.e(r7, r0)
            java.lang.String r0 = "connectStateObservable"
            kotlin.jvm.internal.h.e(r8, r0)
            java.lang.String r1 = "socialListeningStateObservable"
            kotlin.jvm.internal.h.e(r9, r1)
            java.lang.String r2 = "currentTimeMs"
            kotlin.jvm.internal.h.e(r10, r2)
            r3 = 4
            io.reactivex.v[] r3 = new io.reactivex.v[r3]
            io.reactivex.internal.operators.observable.v r4 = new io.reactivex.internal.operators.observable.v
            r4.<init>(r7)
            java.lang.String r5 = "playerStateFlowable.toObservable()"
            kotlin.jvm.internal.h.d(r4, r5)
            java.lang.String r6 = "playerStateObservable"
            kotlin.jvm.internal.h.e(r4, r6)
            kotlin.jvm.internal.h.e(r10, r2)
            com.spotify.music.features.nowplayingbar.eventsources.d r2 = new com.spotify.music.features.nowplayingbar.eventsources.d
            r2.<init>(r10)
            io.reactivex.s r10 = r4.j0(r2)
            io.reactivex.s r10 = r10.E()
            com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$playerInfoEventSource$2 r2 = com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$playerInfoEventSource$2.a
            if (r2 == 0) goto L_0x0040
            com.spotify.music.features.nowplayingbar.eventsources.e r4 = new com.spotify.music.features.nowplayingbar.eventsources.e
            r4.<init>(r2)
            r2 = r4
        L_0x0040:
            io.reactivex.functions.l r2 = (io.reactivex.functions.l) r2
            io.reactivex.s r10 = r10.j0(r2)
            java.lang.String r2 = "playerStateObservable\n  ….map(::PlayerInfoChanged)"
            kotlin.jvm.internal.h.d(r10, r2)
            r2 = 0
            r3[r2] = r10
            r10 = 1
            io.reactivex.internal.operators.observable.v r2 = new io.reactivex.internal.operators.observable.v
            r2.<init>(r7)
            kotlin.jvm.internal.h.d(r2, r5)
            kotlin.jvm.internal.h.e(r2, r6)
            com.spotify.music.features.nowplayingbar.eventsources.a r7 = com.spotify.music.features.nowplayingbar.eventsources.a.a
            io.reactivex.s r7 = r2.Q(r7)
            com.spotify.music.features.nowplayingbar.eventsources.b r2 = com.spotify.music.features.nowplayingbar.eventsources.b.a
            io.reactivex.s r7 = r7.j0(r2)
            com.spotify.music.features.nowplayingbar.eventsources.c r2 = com.spotify.music.features.nowplayingbar.eventsources.c.a
            io.reactivex.s r7 = r7.j0(r2)
            io.reactivex.s r7 = r7.E()
            com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$contentTypeEventSource$4 r2 = com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$contentTypeEventSource$4.a
            if (r2 == 0) goto L_0x007a
            com.spotify.music.features.nowplayingbar.eventsources.e r4 = new com.spotify.music.features.nowplayingbar.eventsources.e
            r4.<init>(r2)
            r2 = r4
        L_0x007a:
            io.reactivex.functions.l r2 = (io.reactivex.functions.l) r2
            io.reactivex.s r7 = r7.j0(r2)
            java.lang.String r2 = "playerStateObservable\n  …map(::ContentTypeChanged)"
            kotlin.jvm.internal.h.d(r7, r2)
            r3[r10] = r7
            r7 = 2
            kotlin.jvm.internal.h.e(r8, r0)
            io.reactivex.s r8 = r8.E()
            com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$connectStateEventSource$1 r10 = com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$connectStateEventSource$1.a
            if (r10 == 0) goto L_0x0099
            com.spotify.music.features.nowplayingbar.eventsources.e r0 = new com.spotify.music.features.nowplayingbar.eventsources.e
            r0.<init>(r10)
            r10 = r0
        L_0x0099:
            io.reactivex.functions.l r10 = (io.reactivex.functions.l) r10
            io.reactivex.s r8 = r8.j0(r10)
            java.lang.String r10 = "connectStateObservable\n …ap(::ConnectStateChanged)"
            kotlin.jvm.internal.h.d(r8, r10)
            r3[r7] = r8
            r7 = 3
            kotlin.jvm.internal.h.e(r9, r1)
            io.reactivex.s r8 = r9.E()
            com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$socialListeningEventSource$1 r9 = com.spotify.music.features.nowplayingbar.eventsources.NowPlayingBarEventSourceKt$socialListeningEventSource$1.a
            if (r9 == 0) goto L_0x00b8
            com.spotify.music.features.nowplayingbar.eventsources.e r10 = new com.spotify.music.features.nowplayingbar.eventsources.e
            r10.<init>(r9)
            r9 = r10
        L_0x00b8:
            io.reactivex.functions.l r9 = (io.reactivex.functions.l) r9
            io.reactivex.s r8 = r8.j0(r9)
            java.lang.String r9 = "socialListeningStateObse…ialListeningStateChanged)"
            kotlin.jvm.internal.h.d(r8, r9)
            r3[r7] = r8
            com.spotify.mobius.q r7 = com.spotify.mobius.rx2.i.a(r3)
            java.lang.String r8 = "RxEventSources.fromObser…ingStateObservable)\n    )"
            kotlin.jvm.internal.h.d(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.nowplayingbar.eventsources.f.a(io.reactivex.g, io.reactivex.s, io.reactivex.s, cmf):com.spotify.mobius.q");
    }
}
