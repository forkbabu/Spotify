package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class u implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;

    public /* synthetic */ u(ContextMenuHelper contextMenuHelper, String str) {
        this.a = contextMenuHelper;
        this.b = str;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.F0(this.b, bVar);
    }
}
