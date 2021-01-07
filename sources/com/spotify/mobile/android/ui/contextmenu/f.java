package com.spotify.mobile.android.ui.contextmenu;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ ContextMenuFragment a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ aj9 c;
    public final /* synthetic */ String f;

    public /* synthetic */ f(ContextMenuFragment contextMenuFragment, r3 r3Var, aj9 aj9, String str) {
        this.a = contextMenuFragment;
        this.b = r3Var;
        this.c = aj9;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContextMenuFragment contextMenuFragment = this.a;
        r3 r3Var = this.b;
        aj9 aj9 = this.c;
        String str = this.f;
        contextMenuFragment.x0.c(r3Var.c().h(), "ContextMenuFragment");
        aj9.E(r3Var.c().i().path(), str);
    }
}
