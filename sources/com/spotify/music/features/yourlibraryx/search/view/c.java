package com.spotify.music.features.yourlibraryx.search.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.g;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class c implements g {
    private YourLibraryXSearchViews a;
    private final d b;

    public c(d dVar, y yVar) {
        h.e(dVar, "viewFactory");
        h.e(yVar, "mainScheduler");
        this.b = dVar;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        YourLibraryXSearchViews a2 = this.b.a(viewGroup, layoutInflater);
        this.a = a2;
        ConstraintLayout a3 = a2.d().a();
        h.d(a3, "views.binding.root");
        return a3;
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<f> t(da2<YourLibraryXEvent> da2) {
        h.e(da2, "output");
        YourLibraryXSearchViews yourLibraryXSearchViews = this.a;
        if (yourLibraryXSearchViews != null) {
            return yourLibraryXSearchViews.t(da2);
        }
        h.k("views");
        throw null;
    }
}
