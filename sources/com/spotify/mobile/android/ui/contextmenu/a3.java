package com.spotify.mobile.android.ui.contextmenu;

import android.view.View;

public final /* synthetic */ class a3 implements View.OnClickListener {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ String b;

    public /* synthetic */ a3(ContextMenuHelper contextMenuHelper, String str) {
        this.a = contextMenuHelper;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h1(this.b, view);
    }
}
