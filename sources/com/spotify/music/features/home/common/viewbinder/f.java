package com.spotify.music.features.home.common.viewbinder;

import android.view.View;
import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.g1;

public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ g1.e.c b;
    public final /* synthetic */ t c;

    public /* synthetic */ f(u uVar, g1.e.c cVar, t tVar) {
        this.a = uVar;
        this.b = cVar;
        this.c = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, this.c, view);
    }
}
