package com.spotify.music.features.home.common.viewbinder;

import android.view.View;
import com.spotify.music.libs.followfeed.entrypoint.b;
import com.spotify.ubi.specification.factories.g1;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ g1.e.a b;
    public final /* synthetic */ b.a c;

    public /* synthetic */ c(u uVar, g1.e.a aVar, b.a aVar2) {
        this.a = uVar;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e(this.b, this.c, view);
    }
}
