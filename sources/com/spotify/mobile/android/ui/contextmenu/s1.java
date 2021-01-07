package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.mobile.android.util.LinkType;

public final /* synthetic */ class s1 implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LinkType c;

    public /* synthetic */ s1(ContextMenuHelper contextMenuHelper, String str, LinkType linkType) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = linkType;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.U0(this.b, this.c, bVar);
    }
}
