package com.spotify.music.libs.viewartistscontextmenu.ui;

import android.view.View;
import com.spotify.android.glue.patterns.contextmenu.model.b;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ d a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(d dVar, b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, view);
    }
}
