package com.spotify.music.features.payfail;

import android.content.Intent;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.c;

public class s implements c {
    private final v a;
    private u b;

    public s(v vVar) {
        this.a = vVar;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void P0(Intent intent) {
    }

    public void a() {
        u uVar = this.b;
        if (uVar != null) {
            uVar.b();
        }
    }

    public void b() {
        u uVar = this.b;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void r2(AnchorBar anchorBar) {
        r rVar = new r(anchorBar);
        anchorBar.e(rVar);
        this.b = this.a.b(rVar);
    }
}
