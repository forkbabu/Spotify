package com.spotify.mobile.android.skiplimitpivot;

import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.player.model.PlayerState;
import com.spotify.player.sub.l;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class SkipLimitPlayerListener {
    private final p a = new p();
    private final l b;
    private final lp1 c;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements g<PlayerState> {
        final /* synthetic */ SkipLimitPlayerListener a;

        a(SkipLimitPlayerListener skipLimitPlayerListener) {
            this.a = skipLimitPlayerListener;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            SkipLimitPlayerListener skipLimitPlayerListener = this.a;
            h.d(playerState2, "it");
            SkipLimitPlayerListener.a(skipLimitPlayerListener, playerState2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements g<Throwable> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
        }
    }

    public SkipLimitPlayerListener(l lVar, lp1 lp1) {
        h.e(lVar, "playerSubscriptions");
        h.e(lp1, "logger");
        this.b = lVar;
        this.c = lp1;
    }

    public static final void a(SkipLimitPlayerListener skipLimitPlayerListener, PlayerState playerState) {
        skipLimitPlayerListener.getClass();
        if (playerState.restrictions().disallowSkippingNextReasons().contains(DisallowReasons.MFT)) {
            skipLimitPlayerListener.c.a();
        }
    }

    public final void b() {
        this.a.b(this.b.d().t(new d(new SkipLimitPlayerListener$start$1(this))).subscribe(new a(this), b.a));
    }

    public final void c() {
        this.a.a();
    }
}
