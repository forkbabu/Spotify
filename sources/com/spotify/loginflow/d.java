package com.spotify.loginflow;

import android.view.View;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ LoginActivity a;

    public /* synthetic */ d(LoginActivity loginActivity) {
        this.a = loginActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.onBackPressed();
    }
}
