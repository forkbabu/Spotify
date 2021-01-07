package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class i0 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ ContextMenuEvent b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ e e;

    public /* synthetic */ i0(ContextMenuHelper contextMenuHelper, ContextMenuEvent contextMenuEvent, String str, boolean z, e eVar) {
        this.a = contextMenuHelper;
        this.b = contextMenuEvent;
        this.c = str;
        this.d = z;
        this.e = eVar;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.m1(this.b, this.c, this.d, this.e, bVar);
    }
}
