package com.spotify.mobile.android.ui.contextmenu;

public final /* synthetic */ class d implements ua0 {
    public final /* synthetic */ ContextMenuFragment a;

    public /* synthetic */ d(ContextMenuFragment contextMenuFragment) {
        this.a = contextMenuFragment;
    }

    @Override // defpackage.ua0
    public final void onDismiss() {
        ContextMenuFragment contextMenuFragment = this.a;
        int i = ContextMenuFragment.J0;
        if (contextMenuFragment.e3()) {
            contextMenuFragment.M4();
        }
    }
}
