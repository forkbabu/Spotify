package com.spotify.music.carmodehome.shortcuts;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.music.carmodehome.model.c;
import com.spotify.music.carmodehome.shortcuts.e;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class d implements e {
    private final Picasso a;
    private final cs2 b;
    private final HomeShortcutsItemCardView c;

    static final class a implements View.OnClickListener {
        final /* synthetic */ d a;
        final /* synthetic */ e.a b;

        a(d dVar, e.a aVar) {
            this.a = dVar;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.a(this.a);
        }
    }

    public d(Picasso picasso, cs2 cs2, HomeShortcutsItemCardView homeShortcutsItemCardView) {
        h.e(picasso, "picasso");
        h.e(cs2, "placeholderProvider");
        h.e(homeShortcutsItemCardView, "view");
        this.a = picasso;
        this.b = cs2;
        this.c = homeShortcutsItemCardView;
        homeShortcutsItemCardView.setPicasso(picasso);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void a() {
        this.c.setVisibility(0);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void b() {
        this.c.setVisibility(8);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void c(boolean z) {
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void d(c cVar) {
        h.e(cVar, "image");
        Drawable a2 = this.b.a(cVar.a());
        Uri parse = Uri.parse(MoreObjects.nullToEmpty(cVar.c()));
        HomeShortcutsItemCardView homeShortcutsItemCardView = this.c;
        h.d(parse, "mainUri");
        homeShortcutsItemCardView.p(parse, a2);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void e() {
        this.c.setTitleActive(false);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void f(e.a aVar) {
        h.e(aVar, "listener");
        this.c.setOnClickListener(new a(this, aVar));
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void g() {
        this.c.setTitleActive(true);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void setTitle(String str) {
        h.e(str, "title");
        this.c.setTitle(str);
    }
}
