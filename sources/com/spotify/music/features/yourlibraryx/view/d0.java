package com.spotify.music.features.yourlibraryx.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.domain.l;
import io.reactivex.w;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class d0 implements c0 {
    private YourLibraryXViews a;
    private final e0 b;
    private final y c;

    static final class a implements io.reactivex.functions.a {
        final /* synthetic */ d0 a;

        a(d0 d0Var) {
            this.a = d0Var;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.d();
        }
    }

    public d0(e0 e0Var, y yVar) {
        h.e(e0Var, "viewFactory");
        h.e(yVar, "mainScheduler");
        this.b = e0Var;
        this.c = yVar;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        YourLibraryXViews a2 = this.b.a(viewGroup, layoutInflater);
        this.a = a2;
        LinearLayout a3 = a2.d().a();
        h.d(a3, "views.binding.root");
        return a3;
    }

    public void b(Bundle bundle) {
        Bundle bundle2;
        if (this.a != null && bundle != null && (bundle2 = bundle.getBundle("YourLibraryXViewBinderImpl.state")) != null) {
            YourLibraryXViews yourLibraryXViews = this.a;
            if (yourLibraryXViews != null) {
                h.d(bundle2, "it");
                yourLibraryXViews.e(bundle2);
                return;
            }
            h.k("views");
            throw null;
        }
    }

    public void c(Bundle bundle) {
        h.e(bundle, "bundle");
        YourLibraryXViews yourLibraryXViews = this.a;
        if (yourLibraryXViews != null) {
            bundle.putBundle("YourLibraryXViewBinderImpl.state", yourLibraryXViews.f());
        }
    }

    public void d() {
        YourLibraryXViews yourLibraryXViews = this.a;
        if (yourLibraryXViews != null) {
            yourLibraryXViews.g();
        } else {
            h.k("views");
            throw null;
        }
    }

    public w<l, YourLibraryXEvent> e() {
        m f = i.f();
        f.c(l.a.class, new a(this), this.c);
        w<l, YourLibraryXEvent> i = f.i();
        h.d(i, "RxMobius.subtypeEffectHa…   )\n            .build()");
        return i;
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<f> t(da2<YourLibraryXEvent> da2) {
        h.e(da2, "output");
        YourLibraryXViews yourLibraryXViews = this.a;
        if (yourLibraryXViews != null) {
            return yourLibraryXViews.t(da2);
        }
        h.k("views");
        throw null;
    }
}
