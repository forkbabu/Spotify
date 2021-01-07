package com.spotify.music.libs.yourepisodes.views.tooltip;

import com.google.android.material.appbar.AppBarLayout;
import com.spotify.mobile.android.spotlets.tooltip.c;
import com.spotify.mobile.android.spotlets.tooltip.d;
import kotlin.jvm.internal.h;

public final class o implements n {
    private final j a;

    public static final class a implements c {
        private AppBarLayout.c a;
        final /* synthetic */ o b;
        final /* synthetic */ AppBarLayout c;

        /* renamed from: com.spotify.music.libs.yourepisodes.views.tooltip.o$a$a  reason: collision with other inner class name */
        static final class C0302a implements AppBarLayout.c {
            final /* synthetic */ a a;

            C0302a(a aVar) {
                this.a = aVar;
            }

            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (i != 0) {
                    this.a.b.a.dismiss();
                }
            }
        }

        a(o oVar, AppBarLayout appBarLayout) {
            this.b = oVar;
            this.c = appBarLayout;
        }

        @Override // com.spotify.mobile.android.spotlets.tooltip.c
        public void c() {
            AppBarLayout.c cVar = this.a;
            if (cVar != null) {
                this.c.g(cVar);
            }
        }

        @Override // com.spotify.mobile.android.spotlets.tooltip.c
        public void d(d dVar) {
            h.e(dVar, "scrollObserver");
            C0302a aVar = new C0302a(this);
            this.a = aVar;
            this.c.a(aVar);
        }
    }

    public o(j jVar) {
        h.e(jVar, "dismisser");
        this.a = jVar;
    }

    @Override // com.spotify.music.libs.yourepisodes.views.tooltip.n
    public c a(AppBarLayout appBarLayout) {
        h.e(appBarLayout, "header");
        return new a(this, appBarLayout);
    }
}
