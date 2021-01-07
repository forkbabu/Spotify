package com.spotify.connect.snacks;

import android.view.View;

final class f implements View.OnClickListener {
    final /* synthetic */ ConnectSnacksPlugin a;

    f(ConnectSnacksPlugin connectSnacksPlugin) {
        this.a = connectSnacksPlugin;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConnectSnacksPlugin.i(this.a).a(ConnectSnacksPlugin.h(this.a).b().c().b());
        ConnectSnacksPlugin.g(this.a).b();
    }
}
