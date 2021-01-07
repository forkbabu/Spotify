package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.d;
import com.spotify.ubi.specification.factories.s0;

public final /* synthetic */ class g2 implements d {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ g2(s0 s0Var, String str) {
        this.a = s0Var;
        this.b = str;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.d
    public final nqe a() {
        s0 s0Var = this.a;
        return s0Var.C().a(this.b);
    }
}
