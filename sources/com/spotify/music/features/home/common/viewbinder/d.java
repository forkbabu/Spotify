package com.spotify.music.features.home.common.viewbinder;

import android.view.View;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ t a;

    public /* synthetic */ d(t tVar) {
        this.a = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d(ViewUris.E2.toString());
    }
}
