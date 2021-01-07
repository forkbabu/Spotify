package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import io.reactivex.s;

public final class j implements z3<com.spotify.playlist.models.j> {
    private final d b;

    public j(d dVar) {
        this.b = dVar;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.z3
    public s<y3<com.spotify.playlist.models.j>> a(y3<com.spotify.playlist.models.j> y3Var) {
        return this.b.a(y3Var.j()).A(new c(y3Var)).P();
    }
}
