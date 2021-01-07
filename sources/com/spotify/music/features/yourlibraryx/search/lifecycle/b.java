package com.spotify.music.features.yourlibraryx.search.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.e0;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.q;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.effecthandlers.g;
import io.reactivex.functions.n;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class b extends e0 {
    private final io.reactivex.subjects.a<f> c;
    private MobiusLoop.g<f, YourLibraryXEvent> d;
    private f e;
    private f f;
    private final g g;
    private final q<YourLibraryXEvent> h;
    private final wbb i;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements n<f> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(f fVar) {
            f fVar2 = fVar;
            h.e(fVar2, "it");
            h.e(fVar2, "model");
            return fVar2.f().e() && fVar2.l().b();
        }
    }

    public b(g gVar, q<YourLibraryXEvent> qVar, wbb wbb) {
        h.e(gVar, "effectHandlers");
        h.e(qVar, "eventSource");
        h.e(wbb, "flags");
        this.g = gVar;
        this.h = qVar;
        this.i = wbb;
        io.reactivex.subjects.a<f> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create<YourLibraryXModel>()");
        this.c = h1;
    }

    public final z<f> g() {
        z<f> T = this.c.Q(a.a).T();
        h.d(T, "observable\n        .filt…}\n        .firstOrError()");
        return T;
    }

    public final kotlin.f h(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        this.e = (f) bundle.getParcelable("YourLibrarySearchXViewModel.model");
        return kotlin.f.a;
    }

    public final kotlin.f i(Bundle bundle) {
        h.e(bundle, "bundle");
        f j1 = this.c.j1();
        if (j1 == null) {
            return null;
        }
        this.f = j1;
        f.a aVar = f.y;
        h.d(j1, "it");
        bundle.putParcelable("YourLibrarySearchXViewModel.model", aVar.a(j1));
        return kotlin.f.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.spotify.music.features.yourlibraryx.search.lifecycle.c] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.spotify.music.features.yourlibraryx.search.lifecycle.d] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(com.spotify.mobius.g<com.spotify.music.features.yourlibraryx.domain.f, com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "views"
            kotlin.jvm.internal.h.e(r12, r0)
            com.spotify.mobius.MobiusLoop$g<com.spotify.music.features.yourlibraryx.domain.f, com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent> r0 = r11.d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.lang.String r3 = "Controller not destroyed"
            com.spotify.mobile.android.util.Assertion.l(r0, r3)
            com.spotify.music.features.yourlibraryx.domain.f r0 = r11.f
            if (r0 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            com.spotify.music.features.yourlibraryx.domain.f r0 = r11.e
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x0035
        L_0x001d:
            com.spotify.music.features.yourlibraryx.domain.f$a r3 = com.spotify.music.features.yourlibraryx.domain.f.y
            wbb r0 = r11.i
            int r7 = r0.f()
            wbb r0 = r11.i
            int r8 = r0.e()
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 39
            com.spotify.music.features.yourlibraryx.domain.f r0 = com.spotify.music.features.yourlibraryx.domain.f.a.b(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0035:
            com.spotify.music.features.yourlibraryx.search.lifecycle.YourLibraryXSearchViewModel$createController$1 r3 = com.spotify.music.features.yourlibraryx.search.lifecycle.YourLibraryXSearchViewModel$createController$1.a
            if (r3 == 0) goto L_0x003f
            com.spotify.music.features.yourlibraryx.search.lifecycle.d r4 = new com.spotify.music.features.yourlibraryx.search.lifecycle.d
            r4.<init>(r3)
            r3 = r4
        L_0x003f:
            com.spotify.mobius.g0 r3 = (com.spotify.mobius.g0) r3
            com.spotify.music.features.yourlibraryx.effecthandlers.g r4 = r11.g
            com.spotify.music.features.yourlibraryx.search.lifecycle.a r5 = com.spotify.music.features.yourlibraryx.search.lifecycle.a.a
            io.reactivex.w r4 = r4.i(r5)
            com.spotify.mobius.MobiusLoop$f r3 = com.spotify.mobius.rx2.i.c(r3, r4)
            com.spotify.mobius.q<com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent> r4 = r11.h
            com.spotify.mobius.MobiusLoop$f r3 = r3.h(r4)
            com.spotify.music.features.yourlibraryx.search.lifecycle.YourLibraryXSearchViewModel$createController$3 r4 = com.spotify.music.features.yourlibraryx.search.lifecycle.YourLibraryXSearchViewModel$createController$3.a
            if (r4 == 0) goto L_0x005d
            com.spotify.music.features.yourlibraryx.search.lifecycle.c r5 = new com.spotify.music.features.yourlibraryx.search.lifecycle.c
            r5.<init>(r4)
            r4 = r5
        L_0x005d:
            com.spotify.mobius.t r4 = (com.spotify.mobius.t) r4
            u92 r5 = defpackage.u92.b()
            com.spotify.mobius.MobiusLoop$g r0 = com.spotify.mobius.z.a(r3, r0, r4, r5)
            java.lang.String r3 = "Mobius.controller(\n     …Runner.create()\n        )"
            kotlin.jvm.internal.h.d(r0, r3)
            r11.d = r0
            ih9 r3 = new ih9
            r4 = 2
            com.spotify.mobius.g[] r5 = new com.spotify.mobius.g[r4]
            r5[r1] = r12
            jh9 r12 = new jh9
            io.reactivex.subjects.a<com.spotify.music.features.yourlibraryx.domain.f> r1 = r11.c
            r6 = 0
            r12.<init>(r1, r6, r4)
            r5[r2] = r12
            r3.<init>(r5)
            r0.c(r3)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.search.lifecycle.b.j(com.spotify.mobius.g):void");
    }

    public final kotlin.f k() {
        MobiusLoop.g<f, YourLibraryXEvent> gVar = this.d;
        if (gVar == null) {
            return null;
        }
        gVar.stop();
        gVar.d();
        this.d = null;
        return kotlin.f.a;
    }
}
