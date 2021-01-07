package com.spotify.music.features.settings.adapter;

import android.view.View;

public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Item c;

    public /* synthetic */ s(p2 p2Var, String str, Item item) {
        this.a = p2Var;
        this.b = str;
        this.c = item;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.z(this.b, this.c, view);
    }
}
