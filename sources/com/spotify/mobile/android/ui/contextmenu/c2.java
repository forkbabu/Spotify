package com.spotify.mobile.android.ui.contextmenu;

import io.reactivex.functions.a;

public final /* synthetic */ class c2 implements a {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ int b;

    public /* synthetic */ c2(ContextMenuHelper contextMenuHelper, int i) {
        this.a = contextMenuHelper;
        this.b = i;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.d1(this.b);
    }
}
