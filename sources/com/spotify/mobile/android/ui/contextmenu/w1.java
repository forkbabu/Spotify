package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class w1 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ w1(ContextMenuHelper contextMenuHelper, boolean z, String str) {
        this.a = contextMenuHelper;
        this.b = z;
        this.c = str;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.X0(this.b, this.c, bVar);
    }
}
