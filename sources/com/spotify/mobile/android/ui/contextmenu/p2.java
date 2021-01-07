package com.spotify.mobile.android.ui.contextmenu;

import io.reactivex.functions.g;

public final /* synthetic */ class p2 implements g {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ int b;

    public /* synthetic */ p2(ContextMenuHelper contextMenuHelper, int i) {
        this.a = contextMenuHelper;
        this.b = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k1(this.b, (String) obj);
    }
}
