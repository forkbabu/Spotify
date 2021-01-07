package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mediasession.playbackactions.b;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.service.media.RestrictedMediaAction;
import com.spotify.mobile.android.service.media.error.EISError;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.mediabrowserservice.p1;
import io.reactivex.functions.c;
import io.reactivex.functions.g;
import io.reactivex.internal.operators.observable.v;
import java.util.Collections;
import java.util.List;

public class x2 {
    private final MediaSessionCompat a;
    private final n1 b;
    private final Resources c;
    private com.spotify.mediasession.playbackactions.a d;
    private boolean e;
    private final io.reactivex.disposables.a f = new io.reactivex.disposables.a();
    private final g<p1> g = new y0(this);

    /* access modifiers changed from: private */
    public static class a implements c<RestrictedMediaAction, p1, Optional<PlaybackStateCompat>> {
        private final com.spotify.mediasession.playbackactions.a a;

        a(com.spotify.mediasession.playbackactions.a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Optional<PlaybackStateCompat> a(RestrictedMediaAction restrictedMediaAction, p1 p1Var) {
            Optional optional;
            RestrictedMediaAction restrictedMediaAction2 = restrictedMediaAction;
            p1 p1Var2 = p1Var;
            if (restrictedMediaAction2.b.contains(DisallowReasons.MFT)) {
                int ordinal = restrictedMediaAction2.a.ordinal();
                if (ordinal == 0) {
                    optional = Optional.of(9);
                } else if (ordinal == 1 || ordinal == 2) {
                    optional = Optional.of(4);
                } else {
                    Logger.d("Unhandled MFT  action: %s", restrictedMediaAction2.a);
                    optional = Optional.absent();
                }
            } else {
                Logger.d("Unhandled restricted action: %s", restrictedMediaAction2.a);
                optional = Optional.absent();
            }
            if (!optional.isPresent()) {
                return Optional.absent();
            }
            PlaybackStateCompat.b bVar = new PlaybackStateCompat.b(p1Var2.a(this.a));
            bVar.e(((Integer) optional.get()).intValue(), restrictedMediaAction2.a.toString());
            return Optional.of(bVar.b());
        }
    }

    public x2(MediaSessionCompat mediaSessionCompat, Context context, n1 n1Var) {
        Assertion.e(mediaSessionCompat);
        this.c = context.getResources();
        this.a = mediaSessionCompat;
        mediaSessionCompat.t(context.getString(C0707R.string.playqueue_title));
        this.b = n1Var;
    }

    public boolean a() {
        return this.b.a();
    }

    public void b(p1 p1Var) {
        List<MediaSessionCompat.QueueItem> b2 = p1Var.b().b(50);
        boolean z = !b2.isEmpty();
        if (z) {
            this.a.s(b2);
        } else if (z != this.e) {
            this.a.s(Collections.emptyList());
        }
        this.e = z;
        PlaybackStateCompat a2 = p1Var.a(this.d);
        Logger.b("Setting state %s and metadata %s", a2.toString(), p1Var.toString());
        this.a.x(p1Var.d());
        this.a.u(2);
        this.a.v(p1Var.c());
        this.a.p(a2);
    }

    public /* synthetic */ void c(Optional optional) {
        if (optional.isPresent()) {
            this.a.o(((mja) optional.get()).a());
        }
    }

    public /* synthetic */ void d(Optional optional) {
        if (optional.isPresent()) {
            Logger.b("Setting PlaybackState from restricted action %s", ((PlaybackStateCompat) optional.get()).toString());
            this.a.p((PlaybackStateCompat) optional.get());
        }
    }

    public p1 e(EISError eISError, p1 p1Var) {
        if (eISError == EISError.ERROR_EXPLICIT_CONTENT) {
            return new p1.b(6, this.c.getString(eISError.d()));
        }
        return new p1.b(0, this.c.getString(eISError.d()));
    }

    public void f(v1 v1Var) {
        this.d = new b();
        io.reactivex.g<p1> Z = this.b.h(v1Var).Z();
        this.f.b(this.b.g().subscribe(new s0(this), x0.a));
        this.f.b(Z.subscribe(this.g, z0.a));
        this.f.b(v1Var.Z2().g().o0(Z, new a(this.d)).subscribe(new w0(this), u0.a));
        this.f.b(v1Var.I2().a().a1(new v(Z), new t0(this)).subscribe(this.g, v0.a));
    }

    public void g() {
        this.f.f();
    }
}
