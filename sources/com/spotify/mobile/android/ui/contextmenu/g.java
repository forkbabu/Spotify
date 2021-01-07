package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ ContextMenuFragment a;

    public /* synthetic */ g(ContextMenuFragment contextMenuFragment) {
        this.a = contextMenuFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c5((ContextMenuViewModel) obj);
    }
}
