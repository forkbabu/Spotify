package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.d;
import com.spotify.ubi.specification.factories.s0;

public final /* synthetic */ class x implements d {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x(boolean z, s0 s0Var, String str) {
        this.a = z;
        this.b = s0Var;
        this.c = str;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.d
    public final nqe a() {
        boolean z = this.a;
        s0 s0Var = this.b;
        String str = this.c;
        if (z) {
            return s0Var.D().b(str);
        }
        return s0Var.D().a(str);
    }
}
