package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.d;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

public final /* synthetic */ class l2 implements nmf {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;
    public final /* synthetic */ d f;

    public /* synthetic */ l2(ContextMenuHelper contextMenuHelper, String str, e eVar, d dVar) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = eVar;
        this.f = dVar;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.u0(this.b, this.c, this.f, (a.C0377a) obj);
        return f.a;
    }
}
