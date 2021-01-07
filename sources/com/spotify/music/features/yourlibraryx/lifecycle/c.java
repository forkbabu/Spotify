package com.spotify.music.features.yourlibraryx.lifecycle;

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

public final class c extends e0 {
    private final io.reactivex.subjects.a<f> c;
    private MobiusLoop.g<f, YourLibraryXEvent> d;
    private f e;
    private f f;
    private final g g;
    private final q<YourLibraryXEvent> h;
    private final kh9 i;
    private final a j;
    private final wbb k;

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

    public c(g gVar, q<YourLibraryXEvent> qVar, kh9 kh9, a aVar, wbb wbb) {
        h.e(gVar, "effectHandlers");
        h.e(qVar, "eventSource");
        h.e(kh9, "preferences");
        h.e(aVar, "filters");
        h.e(wbb, "flags");
        this.g = gVar;
        this.h = qVar;
        this.i = kh9;
        this.j = aVar;
        this.k = wbb;
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
        this.e = (f) bundle.getParcelable("YourLibraryXViewModel.model");
        return kotlin.f.a;
    }

    public final kotlin.f i(Bundle bundle) {
        h.e(bundle, "bundle");
        f j1 = this.c.j1();
        if (j1 == null) {
            return null;
        }
        this.f = j1;
        this.j.b(j1.c());
        f.a aVar = f.y;
        h.d(j1, "it");
        bundle.putParcelable("YourLibraryXViewModel.model", aVar.a(j1));
        return kotlin.f.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.spotify.music.features.yourlibraryx.lifecycle.d] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.spotify.music.features.yourlibraryx.lifecycle.e] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(com.spotify.mobius.g<com.spotify.music.features.yourlibraryx.domain.f, com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent> r32, io.reactivex.w<com.spotify.music.features.yourlibraryx.domain.l, com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent> r33) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.lifecycle.c.j(com.spotify.mobius.g, io.reactivex.w):void");
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
