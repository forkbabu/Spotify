package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class f0 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f0(ContextMenuHelper contextMenuHelper, String str, boolean z, boolean z2) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.f0(this.b, this.c, this.d, bVar);
    }
}
