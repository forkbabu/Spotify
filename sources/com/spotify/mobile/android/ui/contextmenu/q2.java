package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class q2 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ q2(ContextMenuHelper contextMenuHelper, String str, String str2) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = str2;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.m0(this.b, this.c, bVar);
    }
}
