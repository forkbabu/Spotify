package com.spotify.mobile.android.ui.contextmenu;

import android.view.View;

public final /* synthetic */ class c1 implements View.OnClickListener {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;

    public /* synthetic */ c1(ContextMenuHelper contextMenuHelper, String str) {
        this.a = contextMenuHelper;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j1(this.b, view);
    }
}
