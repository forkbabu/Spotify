package com.spotify.music.preview;

import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.y;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.preview.n;
import com.spotify.music.preview.o;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

public class PreviewPlayerImpl implements v {
    private final d a;
    private final g<PlayerState> b;
    private final y c;
    private final k.a d;
    private final w e;
    private final io.reactivex.y f;
    private final AudioManager g;
    private final cqe h;
    private final qxc i;
    private final PublishSubject<b> j = PublishSubject.h1();
    private final io.reactivex.subjects.a<z> k = io.reactivex.subjects.a.i1(z.a);
    private final io.reactivex.disposables.a l = new io.reactivex.disposables.a();
    private boolean m;
    private boolean n;
    private b o;
    private io.reactivex.disposables.b p = EmptyDisposable.INSTANCE;
    private final m q;
    final m0.a r;

    /* access modifiers changed from: package-private */
    public class a implements m0.a {
        a() {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void F(int i) {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void G(f0 f0Var, hq hqVar) {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void I(k0 k0Var) {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void M(int i) {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void O(ExoPlaybackException exoPlaybackException) {
            Logger.e(exoPlaybackException, "Error playing preview", new Object[0]);
            PreviewPlayerImpl.this.k.onNext(z.b);
            PreviewPlayerImpl.this.F(true, true);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void R(boolean z, int i) {
            if (PreviewPlayerImpl.this.o != null) {
                boolean z2 = i == 3;
                boolean z3 = i == 2;
                boolean z4 = i == 4;
                b bVar = PreviewPlayerImpl.this.o;
                Optional<Long> b = bVar.b();
                y yVar = PreviewPlayerImpl.this.c;
                yVar.getClass();
                long longValue = b.or((Optional<Long>) Long.valueOf(yVar.e())).longValue();
                y yVar2 = PreviewPlayerImpl.this.c;
                yVar2.getClass();
                long min = Math.min(yVar2.f(), longValue);
                if (z2) {
                    PreviewPlayerImpl.this.l.b(PreviewPlayerImpl.n(PreviewPlayerImpl.this).subscribe(new f(this, bVar, longValue)));
                }
                io.reactivex.subjects.a aVar = PreviewPlayerImpl.this.k;
                z zVar = z.a;
                o.b bVar2 = new o.b();
                bVar2.f(bVar.c());
                o.b bVar3 = bVar2;
                bVar3.g(bVar.d().or((Optional<String>) ""));
                o.b bVar4 = bVar3;
                bVar4.d(z3);
                o.b bVar5 = bVar4;
                bVar5.c(false);
                if (z4) {
                    min = longValue;
                }
                o.b bVar6 = bVar5;
                bVar6.e(Long.valueOf(min));
                o.b bVar7 = bVar6;
                bVar7.b(Long.valueOf(longValue));
                o.b bVar8 = bVar7;
                bVar8.h(Long.valueOf(PreviewPlayerImpl.this.h.a()));
                aVar.onNext(bVar8.a());
                if (z4) {
                    PreviewPlayerImpl.this.i.a(bVar.c(), bVar.e().orNull(), longValue);
                    PreviewPlayerImpl.this.F(true, true);
                }
            }
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void T(v0 v0Var, Object obj, int i) {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void b0(boolean z) {
            l0.a(this, z);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void f() {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void j(int i) {
            l0.d(this, i);
        }

        @Override // com.google.android.exoplayer2.m0.a
        public void k(boolean z) {
        }

        @Override // com.google.android.exoplayer2.m0.a
        public /* synthetic */ void n(v0 v0Var, int i) {
            l0.i(this, v0Var, i);
        }
    }

    public static abstract class b {
        public static final b a;

        public interface a {
        }

        static {
            n.b bVar = (n.b) a();
            bVar.c("");
            a = bVar.a();
        }

        public static a a() {
            n.b bVar = new n.b();
            bVar.d(Optional.absent());
            n.b bVar2 = bVar;
            bVar2.e(Optional.absent());
            n.b bVar3 = bVar2;
            bVar3.b(Optional.absent());
            return bVar3;
        }

        public abstract Optional<Long> b();

        public abstract String c();

        public abstract Optional<String> d();

        public abstract Optional<String> e();

        public abstract a f();
    }

    public PreviewPlayerImpl(androidx.lifecycle.n nVar, d dVar, y yVar, k.a aVar, g<PlayerState> gVar, w wVar, io.reactivex.y yVar2, AudioManager audioManager, cqe cqe, qxc qxc) {
        AnonymousClass1 r0 = new m() {
            /* class com.spotify.music.preview.PreviewPlayerImpl.AnonymousClass1 */

            @androidx.lifecycle.w(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                PreviewPlayerImpl.w(PreviewPlayerImpl.this);
            }

            @androidx.lifecycle.w(Lifecycle.Event.ON_START)
            public void onStart() {
                PreviewPlayerImpl.this.l.e(PreviewPlayerImpl.l(PreviewPlayerImpl.this).subscribe(new d(this)), PreviewPlayerImpl.this.b.subscribe(new c(this)));
            }

            @androidx.lifecycle.w(Lifecycle.Event.ON_STOP)
            public void onStop() {
                PreviewPlayerImpl.this.l.f();
                PreviewPlayerImpl.this.F(false, true);
                PreviewPlayerImpl.v(PreviewPlayerImpl.this);
            }
        };
        this.q = r0;
        a aVar2 = new a();
        this.r = aVar2;
        this.a = dVar;
        this.c = yVar;
        this.d = aVar;
        this.b = gVar;
        this.e = wVar;
        this.f = yVar2;
        this.g = audioManager;
        this.h = cqe;
        this.i = qxc;
        nVar.A().a(r0);
        if (yVar != null) {
            yVar.o(aVar2);
        }
    }

    public static io.reactivex.a B(PreviewPlayerImpl previewPlayerImpl, Boolean bool) {
        previewPlayerImpl.getClass();
        if (!bool.booleanValue()) {
            return io.reactivex.internal.operators.completable.b.a;
        }
        z<zwd> a2 = previewPlayerImpl.a.a(c.c());
        a2.getClass();
        return new i(a2).d(io.reactivex.a.v(new h(previewPlayerImpl)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void F(boolean z, boolean z2) {
        if (c()) {
            b bVar = this.o;
            if (bVar != null) {
                y yVar = this.c;
                yVar.getClass();
                this.i.b(bVar.c(), this.o.e().orNull(), yVar.f());
                this.o = null;
                this.c.stop();
            }
            if (z2 && this.n) {
                this.n = false;
                this.g.abandonAudioFocus(null);
            }
            if (z && this.m) {
                this.m = false;
                this.l.b(new i(this.a.a(c.e()).B(this.f)).subscribe());
            }
            this.k.onNext(z.a);
        }
    }

    static s l(PreviewPlayerImpl previewPlayerImpl) {
        return s.n(previewPlayerImpl.j, previewPlayerImpl.e.a("audio-preview-url-template").N0(1), new j(previewPlayerImpl));
    }

    static io.reactivex.a n(PreviewPlayerImpl previewPlayerImpl) {
        return previewPlayerImpl.b.O(l.a).h0(1).a0().t(new e(previewPlayerImpl));
    }

    static void r(PreviewPlayerImpl previewPlayerImpl) {
        if (!previewPlayerImpl.n) {
            previewPlayerImpl.n = true;
            previewPlayerImpl.g.requestAudioFocus(null, 3, 2);
        }
    }

    static void s(PreviewPlayerImpl previewPlayerImpl, b bVar, long j2) {
        previewPlayerImpl.getClass();
        if (bVar.b().isPresent() && previewPlayerImpl.p.d()) {
            previewPlayerImpl.p = previewPlayerImpl.f.a().c(new g(previewPlayerImpl, bVar, j2), bVar.b().get().longValue(), TimeUnit.MILLISECONDS);
        }
    }

    static void v(PreviewPlayerImpl previewPlayerImpl) {
        if (previewPlayerImpl.m) {
            previewPlayerImpl.m = false;
            new i(previewPlayerImpl.a.a(c.e()).B(previewPlayerImpl.f)).subscribe(i.a, k.a);
        }
    }

    static void w(PreviewPlayerImpl previewPlayerImpl) {
        y yVar = previewPlayerImpl.c;
        if (yVar != null) {
            yVar.h(previewPlayerImpl.r);
            previewPlayerImpl.c.d();
        }
    }

    static void x(PreviewPlayerImpl previewPlayerImpl, PlayerState playerState) {
        previewPlayerImpl.getClass();
        if ((playerState.isPlaying() && !playerState.isPaused()) && previewPlayerImpl.o != null) {
            previewPlayerImpl.F(false, false);
            previewPlayerImpl.m = false;
            previewPlayerImpl.n = false;
        }
    }

    static void y(PreviewPlayerImpl previewPlayerImpl, b bVar) {
        if (previewPlayerImpl.c()) {
            previewPlayerImpl.p.dispose();
            if (bVar != b.a) {
                b bVar2 = previewPlayerImpl.o;
                if (bVar2 != null) {
                    y yVar = previewPlayerImpl.c;
                    yVar.getClass();
                    previewPlayerImpl.i.b(bVar2.c(), previewPlayerImpl.o.e().orNull(), yVar.f());
                    previewPlayerImpl.o = null;
                    previewPlayerImpl.F(false, false);
                }
                previewPlayerImpl.o = bVar;
                previewPlayerImpl.c.a(new y.a(previewPlayerImpl.d, new oj()).a(Uri.parse(bVar.e().get())));
                previewPlayerImpl.c.j(true);
                previewPlayerImpl.c.seekTo(0);
                previewPlayerImpl.i.c(previewPlayerImpl.o.c(), previewPlayerImpl.o.e().orNull());
            } else if (previewPlayerImpl.o != null) {
                previewPlayerImpl.F(true, true);
            }
        }
    }

    public /* synthetic */ Object C() {
        this.m = true;
        return Boolean.TRUE;
    }

    public /* synthetic */ b D(b bVar, String str) {
        if (TextUtils.isEmpty(bVar.c())) {
            return b.a;
        }
        b bVar2 = this.o;
        if (bVar2 != null && bVar2.c().equals(bVar.c())) {
            if (!this.o.d().isPresent() || !bVar.d().isPresent()) {
                return b.a;
            }
            if (this.o.d().get().equals(bVar.d().get())) {
                return b.a;
            }
        }
        n.b bVar3 = (n.b) bVar.f();
        bVar3.e(Optional.of(str.replace("{id}", bVar.c())));
        return bVar3.a();
    }

    public void E(b bVar, long j2) {
        this.i.a(bVar.c(), bVar.e().orNull(), bVar.b().get().longValue());
        io.reactivex.subjects.a<z> aVar = this.k;
        z zVar = z.a;
        o.b bVar2 = new o.b();
        bVar2.f(bVar.c());
        bVar2.g(bVar.d().or((Optional<String>) ""));
        bVar2.d(false);
        bVar2.c(false);
        bVar2.e(Long.valueOf(j2));
        bVar2.b(Long.valueOf(j2));
        bVar2.h(Long.valueOf(this.h.a()));
        aVar.onNext(bVar2.a());
        F(true, true);
    }

    @Override // com.spotify.music.preview.v
    public boolean a(String str) {
        b bVar = this.o;
        if (bVar == null || !bVar.d().isPresent()) {
            return false;
        }
        return str.equals(this.o.d().get());
    }

    @Override // com.spotify.music.preview.v
    public void b(String str, String str2) {
        PublishSubject<b> publishSubject = this.j;
        n.b bVar = (n.b) b.a();
        bVar.c(str);
        n.b bVar2 = bVar;
        bVar2.d(Optional.of(str2));
        publishSubject.onNext(bVar2.a());
    }

    @Override // com.spotify.music.preview.v
    public boolean c() {
        return this.c != null;
    }

    @Override // com.spotify.music.preview.v
    public void d(String str, long j2) {
        PublishSubject<b> publishSubject = this.j;
        n.b bVar = (n.b) b.a();
        bVar.c(str);
        n.b bVar2 = bVar;
        bVar2.b(Optional.of(Long.valueOf(j2)));
        publishSubject.onNext(bVar2.a());
    }

    @Override // com.spotify.music.preview.v
    public void e(String str) {
        b bVar = this.o;
        if (bVar != null && bVar.d().isPresent() && bVar.d().get().equals(str)) {
            this.j.onNext(b.a);
        }
    }

    @Override // com.spotify.music.preview.v
    public void f(String str) {
        PublishSubject<b> publishSubject = this.j;
        n.b bVar = (n.b) b.a();
        bVar.c(str);
        publishSubject.onNext(bVar.a());
    }

    @Override // com.spotify.music.preview.v
    public s<z> g() {
        return this.k.F(m.a);
    }

    @Override // com.spotify.music.preview.v
    public void h() {
        this.j.onNext(b.a);
    }

    @Override // com.spotify.music.preview.v
    public void i(String str, String str2) {
        PublishSubject<b> publishSubject = this.j;
        n.b bVar = (n.b) b.a();
        bVar.c(str);
        bVar.d(Optional.of(str2));
        bVar.b(Optional.of(10000L));
        publishSubject.onNext(bVar.a());
    }

    @Override // com.spotify.music.preview.v
    public void j(String str) {
        b bVar = this.o;
        if (bVar != null && bVar.c().equals(str)) {
            this.j.onNext(b.a);
        }
    }

    @Override // com.spotify.music.preview.v
    public void k(String str) {
        d(str, 10000);
    }
}
