package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import java.util.List;

public final /* synthetic */ class d3 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;

    public /* synthetic */ d3(ContextMenuHelper contextMenuHelper, boolean z, String str, List list, List list2) {
        this.a = contextMenuHelper;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = list2;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.W0(this.b, this.c, this.d, this.e, bVar);
    }
}
