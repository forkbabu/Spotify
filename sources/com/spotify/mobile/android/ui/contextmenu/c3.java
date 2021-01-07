package com.spotify.mobile.android.ui.contextmenu;

import android.view.View;

public final /* synthetic */ class c3 implements View.OnClickListener {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ c3(ContextMenuHelper contextMenuHelper, boolean z, String str) {
        this.a = contextMenuHelper;
        this.b = z;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g1(this.b, this.c, view);
    }
}
