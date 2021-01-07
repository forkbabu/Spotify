package com.spotify.android.glue.patterns.contextmenu.glue;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.android.glue.patterns.contextmenu.model.c;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ c b;
    public final /* synthetic */ AppCompatImageButton c;

    public /* synthetic */ b(j jVar, c cVar, AppCompatImageButton appCompatImageButton) {
        this.a = jVar;
        this.b = cVar;
        this.c = appCompatImageButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.b, this.c, view);
    }
}
