package com.spotify.connect.snacks;

import android.view.View;

final class g implements View.OnClickListener {
    final /* synthetic */ ConnectSnacksPlugin a;
    final /* synthetic */ String b;

    g(ConnectSnacksPlugin connectSnacksPlugin, String str) {
        this.a = connectSnacksPlugin;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConnectSnacksPlugin.i(this.a).a(ConnectSnacksPlugin.h(this.a).b().c().a(this.b));
        ConnectSnacksPlugin.g(this.a).c(this.b);
    }
}
