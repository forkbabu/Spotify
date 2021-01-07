package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class v2 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    public /* synthetic */ v2(ContextMenuHelper contextMenuHelper, String str, e eVar) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = eVar;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.n1(this.b, this.c, bVar);
    }
}
