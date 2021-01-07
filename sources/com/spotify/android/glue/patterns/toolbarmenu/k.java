package com.spotify.android.glue.patterns.toolbarmenu;

import android.view.View;
import com.spotify.music.libs.followfeed.entrypoint.b;
import com.spotify.music.libs.viewuri.c;

public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ c b;
    public final /* synthetic */ b.a c;

    public /* synthetic */ k(e0 e0Var, c cVar, b.a aVar) {
        this.a = e0Var;
        this.b = cVar;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.x(this.b, this.c, view);
    }
}
