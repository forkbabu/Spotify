package com.spotify.music.libs.viewartistscontextmenu.ui;

import android.content.Context;
import android.view.View;
import com.spotify.android.glue.patterns.contextmenu.glue.d;
import com.spotify.android.glue.patterns.contextmenu.glue.j;
import com.spotify.android.glue.patterns.contextmenu.glue.l;
import com.spotify.android.glue.patterns.contextmenu.glue.m;
import com.spotify.android.glue.patterns.contextmenu.glue.o;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;

public class f extends l {
    private final d e;
    private final j f;
    o g;

    public f(Context context, ua0 ua0, Picasso picasso) {
        super(context, ua0, picasso, d.a);
        this.g = new o(context, ua0);
        m mVar = new m(context, picasso, context.getString(C0707R.string.context_menu_show_more));
        this.f = new j(context, ua0);
        this.e = new d(context, ua0, mVar, picasso);
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.l, defpackage.va0
    public void a(ContextMenuViewModel contextMenuViewModel) {
        if (contextMenuViewModel.u()) {
            this.g.v();
            return;
        }
        this.f.d(contextMenuViewModel.q());
        this.e.f(contextMenuViewModel);
        this.g.t(this.f, this.e);
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.l, defpackage.va0
    public void b() {
        this.g.p();
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.l
    public View e() {
        return this.g.q();
    }
}
