package com.spotify.music.features.ads.audioplus;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.android.goldenpath.a;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.music.C0707R;

public class h extends f {
    private final o f;
    private boolean n = false;

    public h(AnchorBar anchorBar, o oVar) {
        super(anchorBar, C0707R.id.top_banner_ad_container, h.class.getSimpleName());
        this.f = oVar;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        StringBuilder V0 = je.V0("spotify:snackbar:");
        V0.append(d());
        Fragment U = this.f.U(V0.toString());
        if (U != null) {
            x i = this.f.i();
            i.h(U);
            i.i();
            this.f.Q();
            this.n = true;
        }
        Context context = viewGroup.getContext();
        viewGroup.setPadding(0, viewGroup.getPaddingTop() + (a.g(context) ? a.f(context) : 0), 0, 0);
    }

    public void e(Fragment fragment) {
        x i = this.f.i();
        int d = d();
        StringBuilder V0 = je.V0("spotify:snackbar:");
        V0.append(d());
        i.q(d, fragment, V0.toString());
        i.i();
        this.f.Q();
        this.n = true;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.f, com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public boolean isVisible() {
        return super.isVisible() && this.n;
    }
}
