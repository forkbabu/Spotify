package defpackage;

import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.y;
import com.spotify.mobile.android.audioplayer.domain.c;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import io.reactivex.functions.g;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: b41  reason: default package */
public final class b41 {

    /* renamed from: b41$a */
    /* compiled from: java-style lambda group */
    static final class a implements io.reactivex.functions.a {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            int i = this.a;
            if (i == 0) {
                ((y) this.b).j(false);
            } else if (i == 1) {
                ((y) this.b).j(true);
            } else {
                throw null;
            }
        }
    }

    /* renamed from: b41$b */
    static final class b<T> implements g<c.C0172c> {
        final /* synthetic */ y a;
        final /* synthetic */ w b;

        b(y yVar, w wVar) {
            this.a = yVar;
            this.b = wVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.C0172c cVar) {
            this.a.a(this.b.a(cVar.a()));
            this.a.j(false);
        }
    }

    /* renamed from: b41$c */
    static final class c<T> implements g<c.f> {
        final /* synthetic */ y a;

        c(y yVar) {
            this.a = yVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.f fVar) {
            this.a.seekTo(fVar.a());
            this.a.j(true);
        }
    }

    /* renamed from: b41$d */
    static final class d<T> implements g<c.d> {
        final /* synthetic */ cmf a;

        d(cmf cmf) {
            this.a = cmf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.d dVar) {
            this.a.invoke();
        }
    }

    /* renamed from: b41$e */
    static final class e<T> implements g<c.a> {
        final /* synthetic */ cmf a;

        e(cmf cmf) {
            this.a = cmf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(c.a aVar) {
            this.a.invoke();
        }
    }

    public static final io.reactivex.w<com.spotify.mobile.android.audioplayer.domain.c, com.spotify.mobile.android.audioplayer.domain.d> a(y yVar, w wVar, cmf<f> cmf, cmf<f> cmf2) {
        h.e(yVar, "exoPlayer");
        h.e(wVar, "mediaSourceFactory");
        h.e(cmf, "requestAudioFocusAction");
        h.e(cmf2, "abandonAudioFocusAction");
        m f = i.f();
        f.e(c.C0172c.class, new b(yVar, wVar), io.reactivex.android.schedulers.a.b());
        f.e(c.f.class, new c(yVar), io.reactivex.android.schedulers.a.b());
        f.c(c.b.class, new a(0, yVar), io.reactivex.android.schedulers.a.b());
        f.c(c.e.class, new a(1, yVar), io.reactivex.android.schedulers.a.b());
        f.e(c.d.class, new d(cmf), io.reactivex.android.schedulers.a.b());
        f.e(c.a.class, new e(cmf2), io.reactivex.android.schedulers.a.b());
        return f.i();
    }
}
