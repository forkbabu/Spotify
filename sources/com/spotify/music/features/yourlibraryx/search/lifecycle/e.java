package com.spotify.music.features.yourlibraryx.search.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import com.spotify.mobius.q;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.effecthandlers.g;
import kotlin.jvm.internal.h;

public final class e {
    private final g0 a;
    private final g b;
    private final q<YourLibraryXEvent> c;
    private final wbb d;

    public static final class a implements g0.b {
        final /* synthetic */ e a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.a = eVar;
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            h.e(cls, "modelClass");
            return new b(this.a.b, this.a.c, this.a.d);
        }
    }

    public e(Fragment fragment, g gVar, q<YourLibraryXEvent> qVar, wbb wbb) {
        h.e(fragment, "fragment");
        h.e(gVar, "effectHandlers");
        h.e(qVar, "eventSource");
        h.e(wbb, "flags");
        this.b = gVar;
        this.c = qVar;
        this.d = wbb;
        this.a = new g0(fragment.Z(), new a(this));
    }

    public final b d() {
        e0 a2 = this.a.a(b.class);
        h.d(a2, "viewModelProvider.get(Yo…rchViewModel::class.java)");
        return (b) a2;
    }
}
