package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.d;
import com.spotify.music.follow.j;
import com.spotify.ubi.specification.factories.s0;

public final /* synthetic */ class h2 implements d {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ j b;

    public /* synthetic */ h2(s0 s0Var, j jVar) {
        this.a = s0Var;
        this.b = jVar;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.d
    public final nqe a() {
        return this.a.z().a(this.b.e());
    }
}
