package com.spotify.inappmessaging.preview.views;

import android.view.View;

public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ i a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ f(i iVar, da2 da2) {
        this.a = iVar;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(this.b, view);
    }
}
