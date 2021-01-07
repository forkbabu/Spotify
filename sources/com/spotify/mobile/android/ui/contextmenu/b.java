package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ ContextMenuFragment a;

    public /* synthetic */ b(ContextMenuFragment contextMenuFragment) {
        this.a = contextMenuFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d5((ContextMenuViewModel) obj);
    }
}
