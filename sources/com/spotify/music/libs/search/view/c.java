package com.spotify.music.libs.search.view;

import android.view.View;

public final /* synthetic */ class c implements View.OnFocusChangeListener {
    public final /* synthetic */ i a;

    public /* synthetic */ c(i iVar) {
        this.a = iVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.s(z);
    }
}
