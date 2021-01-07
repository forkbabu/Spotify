package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.d;
import com.spotify.ubi.specification.factories.s0;

public final /* synthetic */ class g3 implements d {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ g3(boolean z, s0 s0Var, String str) {
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
            return s0Var.E().b(str);
        }
        return s0Var.E().a(str);
    }
}
