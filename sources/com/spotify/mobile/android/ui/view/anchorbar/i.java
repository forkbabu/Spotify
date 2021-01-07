package com.spotify.mobile.android.ui.view.anchorbar;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;

public class i extends f {
    private final o f;
    private boolean n = false;

    public i(AnchorBar anchorBar, int i, o oVar, String str) {
        super(anchorBar, i, str);
        this.f = oVar;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        Fragment U = this.f.U(e());
        if (U != null) {
            x i = this.f.i();
            i.h(U);
            i.i();
            this.f.Q();
            this.n = true;
        }
    }

    public String e() {
        StringBuilder V0 = je.V0("spotify:snackbar:");
        V0.append(d());
        return V0.toString();
    }

    public void f(Fragment fragment) {
        x i = this.f.i();
        i.c(d(), fragment, e());
        i.i();
        this.f.Q();
        this.n = true;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.f, com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public boolean isVisible() {
        return this.b && this.n;
    }
}
