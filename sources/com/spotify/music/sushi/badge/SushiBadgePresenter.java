package com.spotify.music.sushi.badge;

import com.google.common.base.Optional;
import com.spotify.music.sushi.badge.a;
import com.spotify.music.sushi.d;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.remoteconfig.fb;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.b;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class SushiBadgePresenter {
    private final g<Optional<PlaybackQuality>> a;
    private final g<String> b;
    private final q c;
    private PlaybackQuality d;
    private a e;
    private final d f;
    private final fb g;
    private final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.spotify.music.sushi.badge.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SushiBadgePresenter(io.reactivex.g<com.spotify.player.model.PlayerState> r2, defpackage.txc r3, com.spotify.music.sushi.d r4, com.spotify.remoteconfig.fb r5, boolean r6) {
        /*
            r1 = this;
            java.lang.String r0 = "playerStateFlowable"
            kotlin.jvm.internal.h.e(r2, r0)
            java.lang.String r0 = "productState"
            kotlin.jvm.internal.h.e(r3, r0)
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.h.e(r5, r0)
            r1.<init>()
            r1.f = r4
            r1.g = r5
            r1.h = r6
            com.spotify.music.sushi.badge.SushiBadgePresenter$playbackQualityFlowable$1 r4 = com.spotify.music.sushi.badge.SushiBadgePresenter$playbackQualityFlowable$1.a
            if (r4 == 0) goto L_0x0027
            com.spotify.music.sushi.badge.d r5 = new com.spotify.music.sushi.badge.d
            r5.<init>(r4)
            r4 = r5
        L_0x0027:
            io.reactivex.functions.l r4 = (io.reactivex.functions.l) r4
            io.reactivex.g r2 = r2.O(r4)
            io.reactivex.g r2 = r2.s()
            r1.a = r2
            java.lang.String r2 = "employee"
            io.reactivex.s r2 = r3.a(r2)
            io.reactivex.s r2 = r2.E()
            io.reactivex.BackpressureStrategy r3 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.g r2 = r2.Y0(r3)
            r1.b = r2
            com.spotify.rxjava2.q r2 = new com.spotify.rxjava2.q
            r2.<init>()
            r1.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.sushi.badge.SushiBadgePresenter.<init>(io.reactivex.g, txc, com.spotify.music.sushi.d, com.spotify.remoteconfig.fb, boolean):void");
    }

    public static final a.C0351a a(SushiBadgePresenter sushiBadgePresenter, Optional optional, String str) {
        boolean z = true;
        boolean z2 = sushiBadgePresenter.h && sushiBadgePresenter.g.a() && h.a(str, "1");
        PlaybackQuality playbackQuality = (PlaybackQuality) optional.orNull();
        if ((playbackQuality != null ? playbackQuality.bitrateLevel() : null) != BitrateLevel.NORMALIZED) {
            z = false;
        }
        return new a.C0351a(z2, z);
    }

    public static final void c(SushiBadgePresenter sushiBadgePresenter) {
        PlaybackQuality playbackQuality = sushiBadgePresenter.d;
        if (playbackQuality != null) {
            d dVar = sushiBadgePresenter.f;
            BitrateLevel bitrateLevel = playbackQuality.bitrateLevel();
            h.d(bitrateLevel, "bitrateLevel()");
            dVar.a(bitrateLevel);
        }
    }

    public final void e(a aVar) {
        h.e(aVar, "badge");
        this.e = aVar;
        if (aVar != null) {
            aVar.onEvent(new SushiBadgePresenter$onViewAvailable$1(this));
        }
        q qVar = this.c;
        b subscribe = g.i(this.a, this.b, b.a).subscribe(new c(this));
        h.d(subscribe, "Flowable\n            .co…loyeeFlag))\n            }");
        qVar.a(subscribe);
    }

    public final void f() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.onEvent(SushiBadgePresenter$onViewUnavailable$1.a);
        }
        this.c.c();
    }
}
