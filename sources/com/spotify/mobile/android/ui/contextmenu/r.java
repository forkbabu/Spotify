package com.spotify.mobile.android.ui.contextmenu;

import android.net.Uri;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;

public final /* synthetic */ class r implements e {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Uri d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ r(ContextMenuHelper contextMenuHelper, String str, String str2, Uri uri, String str3, String str4) {
        this.a = contextMenuHelper;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.model.e
    public final void a(b bVar) {
        this.a.R0(this.b, this.c, this.d, this.e, this.f, bVar);
    }
}
