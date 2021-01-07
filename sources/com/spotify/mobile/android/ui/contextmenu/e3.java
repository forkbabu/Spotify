package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.ubi.specification.factories.s0;

public final /* synthetic */ class e3 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e3(ContextMenuHelper contextMenuHelper, s0 s0Var, String str) {
        this.a = contextMenuHelper;
        this.b = s0Var;
        this.c = str;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.D0(this.b, this.c, bVar);
    }
}
