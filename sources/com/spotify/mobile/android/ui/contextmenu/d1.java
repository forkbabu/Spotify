package com.spotify.mobile.android.ui.contextmenu;

import io.reactivex.functions.g;

public final /* synthetic */ class d1 implements g {
    public final /* synthetic */ ContextMenuHelper a;
    public final /* synthetic */ int b;

    public /* synthetic */ d1(ContextMenuHelper contextMenuHelper, int i) {
        this.a = contextMenuHelper;
        this.b = i;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.l1(this.b, (Throwable) obj);
    }
}
