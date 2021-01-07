package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.music.libs.collection.played.a;

public final /* synthetic */ class j implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a d;
    public final /* synthetic */ o32 e;

    public /* synthetic */ j(ContextMenuHelper contextMenuHelper, boolean z, String str, a aVar, o32 o32) {
        this.a = contextMenuHelper;
        this.b = z;
        this.c = str;
        this.d = aVar;
        this.e = o32;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.n0(this.b, this.c, this.d, this.e, bVar);
    }
}
