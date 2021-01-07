package com.spotify.music.features.yourlibraryx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import com.spotify.mobius.q;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.effecthandlers.g;
import kotlin.jvm.internal.h;

public final class f {
    private final g0 a;
    private final g b;
    private final q<YourLibraryXEvent> c;
    private final kh9 d;
    private final a e;
    private final wbb f;

    public static final class a implements g0.b {
        final /* synthetic */ f a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(f fVar) {
            this.a = fVar;
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            h.e(cls, "modelClass");
            return new c(this.a.b, this.a.c, this.a.d, this.a.e, this.a.f);
        }
    }

    public f(Fragment fragment, g gVar, q<YourLibraryXEvent> qVar, kh9 kh9, a aVar, wbb wbb) {
        h.e(fragment, "fragment");
        h.e(gVar, "effectHandlers");
        h.e(qVar, "eventSource");
        h.e(kh9, "preferences");
        h.e(aVar, "filters");
        h.e(wbb, "flags");
        this.b = gVar;
        this.c = qVar;
        this.d = kh9;
        this.e = aVar;
        this.f = wbb;
        this.a = new g0(fragment.Z(), new a(this));
    }

    public final c f() {
        e0 a2 = this.a.a(c.class);
        h.d(a2, "viewModelProvider.get(Yo…ryXViewModel::class.java)");
        return (c) a2;
    }
}
