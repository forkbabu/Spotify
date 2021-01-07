package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class k0 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s7a c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ k0(ContextMenuHelper contextMenuHelper, boolean z, s7a s7a, String str, String str2) {
        this.a = contextMenuHelper;
        this.b = z;
        this.c = s7a;
        this.d = str;
        this.e = str2;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.g0(this.b, this.c, this.d, this.e, bVar);
    }
}
