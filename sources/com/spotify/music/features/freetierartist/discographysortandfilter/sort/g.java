package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

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
import kotlin.jvm.internal.h;

public final class g extends l {
    private o e;
    private j f;
    private f g;
    private final Context h;
    private final ua0 i;
    private final Picasso j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, ua0 ua0, Picasso picasso) {
        super(context, ua0, picasso, d.a);
        h.e(context, "context");
        h.e(ua0, "callback");
        h.e(picasso, "picasso");
        this.h = context;
        this.i = ua0;
        this.j = picasso;
        this.e = new o(context, ua0);
        this.f = new j(context, ua0);
        this.g = new f(context, ua0, new m(context, picasso, context.getString(C0707R.string.context_menu_show_more)));
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.l, defpackage.va0
    public void a(ContextMenuViewModel contextMenuViewModel) {
        h.e(contextMenuViewModel, "contextMenu");
        this.f.d(contextMenuViewModel.q());
        this.g.f(contextMenuViewModel);
        this.e.t(this.f, this.g);
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.l, defpackage.va0
    public void b() {
        this.e.p();
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.l
    public View e() {
        View q = this.e.q();
        h.d(q, "glueMenuViews.contentView");
        return q;
    }
}
