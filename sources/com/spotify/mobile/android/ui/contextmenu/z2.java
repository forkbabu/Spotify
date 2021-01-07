package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class z2 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ z2(ContextMenuHelper contextMenuHelper, boolean z, String str, String str2) {
        this.a = contextMenuHelper;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.V0(this.b, this.c, this.d, bVar);
    }
}
