package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.music.libs.viewuri.c;

public final /* synthetic */ class r2 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;

    public /* synthetic */ r2(ContextMenuHelper contextMenuHelper, c cVar, String str) {
        this.a = contextMenuHelper;
        this.b = cVar;
        this.c = str;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.K0(this.b, this.c, bVar);
    }
}
