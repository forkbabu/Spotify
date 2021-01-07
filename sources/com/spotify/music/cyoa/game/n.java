package com.spotify.music.cyoa.game;

import android.view.View;
import com.spotify.music.cyoa.model.CyoaGameOption;

public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ CyoaGameOption b;

    public /* synthetic */ n(u uVar, CyoaGameOption cyoaGameOption) {
        this.a = uVar;
        this.b = cyoaGameOption;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i(this.b, view);
    }
}
