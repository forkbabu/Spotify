package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class t0 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ t0(ContextMenuHelper contextMenuHelper, String str, String str2, String str3) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.c0(this.b, this.c, this.d, bVar);
    }
}
