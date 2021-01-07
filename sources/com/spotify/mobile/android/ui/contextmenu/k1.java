package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import java.util.List;

public final /* synthetic */ class k1 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ List b;

    public /* synthetic */ k1(ContextMenuHelper contextMenuHelper, List list) {
        this.a = contextMenuHelper;
        this.b = list;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.k0(this.b, bVar);
    }
}
