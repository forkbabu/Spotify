package com.spotify.music.libs.freetiertrackpreview;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;

final class a implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ Context b;
    final /* synthetic */ b4 c;
    final /* synthetic */ Object f;
    final /* synthetic */ c n;

    a(View.OnClickListener onClickListener, Context context, b4 b4Var, Object obj, c cVar) {
        this.a = onClickListener;
        this.b = context;
        this.c = b4Var;
        this.f = obj;
        this.n = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.onClick(view);
        ContextMenuFragment.b5(this.b, this.c, this.f, this.n);
    }
}
