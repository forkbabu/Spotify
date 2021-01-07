package com.spotify.music.features.entityselector.pages.tracks;

import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTracksResponse;
import com.spotify.music.preview.v;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class TracksInjector {
    private final nmf<uy4, f> a;
    private final z<EntitySelector$CarePackageTracksResponse> b;
    private final v c;
    private final sz4 d;
    private final s<List<ty4>> e;
    private final dz4 f;

    public TracksInjector(nmf<uy4, f> nmf, z<EntitySelector$CarePackageTracksResponse> zVar, v vVar, sz4 sz4, s<List<ty4>> sVar, dz4 dz4) {
        h.e(nmf, "addTrackAction");
        h.e(zVar, "tracksResponse");
        h.e(vVar, "previewPlayer");
        h.e(sz4, "search");
        h.e(sVar, "userSelectionListObservable");
        h.e(dz4, "entitySelectorLogger");
        this.a = nmf;
        this.b = zVar;
        this.c = vVar;
        this.d = sz4;
        this.e = sVar;
        this.f = dz4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.spotify.music.features.entityselector.pages.tracks.b] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.spotify.music.features.entityselector.pages.tracks.c] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.MobiusLoop.g<defpackage.f05, defpackage.d05> a(defpackage.f05 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "defaultModel"
            kotlin.jvm.internal.h.e(r7, r0)
            com.spotify.music.features.entityselector.pages.tracks.TracksInjector$createLoopFactory$1 r0 = com.spotify.music.features.entityselector.pages.tracks.TracksInjector$createLoopFactory$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.music.features.entityselector.pages.tracks.c r1 = new com.spotify.music.features.entityselector.pages.tracks.c
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            nmf<uy4, kotlin.f> r1 = r6.a
            io.reactivex.z<com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTracksResponse> r2 = r6.b
            com.spotify.music.preview.v r3 = r6.c
            sz4 r4 = r6.d
            dz4 r5 = r6.f
            io.reactivex.w r1 = com.spotify.music.features.entityselector.pages.tracks.effecthandlers.i.a(r1, r2, r3, r4, r5)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.spotify.music.preview.v r1 = r6.c
            io.reactivex.s r1 = r1.g()
            java.lang.String r2 = "previewPlayer.observePreviewPlayerState()"
            kotlin.jvm.internal.h.d(r1, r2)
            io.reactivex.s<java.util.List<ty4>> r2 = r6.e
            com.spotify.mobius.q r1 = defpackage.l05.a(r1, r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "Tracks"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            java.lang.String r1 = "RxMobius.loop<TracksMode…roidLogger.tag(\"Tracks\"))"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.features.entityselector.pages.tracks.TracksInjector$createController$1 r1 = com.spotify.music.features.entityselector.pages.tracks.TracksInjector$createController$1.a
            if (r1 == 0) goto L_0x0052
            com.spotify.music.features.entityselector.pages.tracks.b r2 = new com.spotify.music.features.entityselector.pages.tracks.b
            r2.<init>(r1)
            r1 = r2
        L_0x0052:
            com.spotify.mobius.t r1 = (com.spotify.mobius.t) r1
            u92 r2 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r7 = com.spotify.mobius.z.a(r0, r7, r1, r2)
            java.lang.String r0 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.entityselector.pages.tracks.TracksInjector.a(f05):com.spotify.mobius.MobiusLoop$g");
    }
}
