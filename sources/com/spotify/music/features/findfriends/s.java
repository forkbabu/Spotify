package com.spotify.music.features.findfriends;

import android.view.View;

public final /* synthetic */ class s implements View.OnFocusChangeListener {
    public final /* synthetic */ w0 a;

    public /* synthetic */ s(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.l(view, z);
    }
}
