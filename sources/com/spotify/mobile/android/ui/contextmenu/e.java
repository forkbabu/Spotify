package com.spotify.mobile.android.ui.contextmenu;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ ContextMenuFragment a;

    public /* synthetic */ e(ContextMenuFragment contextMenuFragment) {
        this.a = contextMenuFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContextMenuFragment contextMenuFragment = this.a;
        if (contextMenuFragment.e3()) {
            contextMenuFragment.M4();
        }
    }
}
