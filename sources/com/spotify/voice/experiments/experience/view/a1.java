package com.spotify.voice.experiments.experience.view;

import android.view.View;

public final /* synthetic */ class a1 implements View.OnClickListener {
    public final /* synthetic */ k1 a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ a1(k1 k1Var, da2 da2) {
        this.a = k1Var;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u(this.b, view);
    }
}
