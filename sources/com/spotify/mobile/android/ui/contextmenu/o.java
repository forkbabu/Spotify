package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.d;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

public final /* synthetic */ class o implements nmf {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;
    public final /* synthetic */ d f;

    public /* synthetic */ o(ContextMenuHelper contextMenuHelper, String str, e eVar, d dVar) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = eVar;
        this.f = dVar;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.w0(this.b, this.c, this.f, (a.e) obj);
        return f.a;
    }
}
