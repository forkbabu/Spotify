package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class m1 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ m1(ContextMenuHelper contextMenuHelper, String str, int i, int i2) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.G0(this.b, this.c, this.d, bVar);
    }
}
