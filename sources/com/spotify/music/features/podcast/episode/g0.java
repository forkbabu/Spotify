package com.spotify.music.features.podcast.episode;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import io.reactivex.disposables.b;
import io.reactivex.y;

public class g0 {
    private final ExplicitContentFacade a;
    private final y b;
    private b c;
    private boolean d;

    class a extends m {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            this.a.e1(this);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStart() {
            g0.a(g0.this);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            if (g0.this.c != null) {
                g0.this.c.dispose();
            }
        }
    }

    public g0(ExplicitContentFacade explicitContentFacade, y yVar, k kVar) {
        this.a = explicitContentFacade;
        this.b = yVar;
        kVar.y0(new a(kVar));
    }

    static void a(g0 g0Var) {
        g0Var.c = g0Var.a.c().o0(g0Var.b).subscribe(new c(g0Var), b.a);
    }

    public /* synthetic */ void c(Boolean bool) {
        this.d = bool.booleanValue();
    }

    public boolean d() {
        return this.d;
    }
}
