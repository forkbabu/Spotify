package com.spotify.music.libs.viewartistscontextmenu.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.spotify.android.glue.patterns.contextmenu.glue.c;
import com.spotify.android.glue.patterns.contextmenu.glue.k;
import com.spotify.android.glue.patterns.contextmenu.glue.m;
import com.spotify.android.glue.patterns.contextmenu.glue.n;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class d extends k {
    private final Context g;
    private final ua0 h;
    private final Picasso i;
    private final m j;
    private ContextMenuViewModel k;

    public d(Context context, ua0 ua0, m mVar, Picasso picasso) {
        super(context, ua0, mVar, c.a);
        this.g = context;
        this.h = ua0;
        this.i = picasso;
        this.j = mVar;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public int a() {
        return this.k.l().size();
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public View b(int i2, ViewGroup viewGroup) {
        b bVar = this.k.l().get(i2);
        u90 d = e90.d().d(this.g, viewGroup);
        if (!bVar.g()) {
            bvd c = dvd.c(d.getView());
            c.g(d.Z());
            c.f(d.getImageView());
            c.a();
            String str = (String) ((b.C0146b) bVar).q();
            d.setText(bVar.d());
            ImageView imageView = d.getImageView();
            String charSequence = bVar.d().toString();
            Drawable a = yc0.a(this.g);
            if (!TextUtils.isEmpty(str)) {
                z m = this.i.m(str);
                m.t(a);
                m.g(a);
                m.o(rwd.c(imageView));
            } else if (!TextUtils.isEmpty(charSequence)) {
                imageView.setImageDrawable(a);
            }
            d.getView().setOnClickListener(new a(this, bVar));
            return d.getView();
        }
        View view = new View(this.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.g.getResources().getDimensionPixelSize(C0707R.dimen.view_artists_context_menu_dialog_divider_row_height));
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.g.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_divider_padding_top);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.g.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_divider_padding_bottom);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(a.b(this.g, 17170445));
        return view;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public int c() {
        return this.k.l().size();
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k
    public void f(ContextMenuViewModel contextMenuViewModel) {
        this.k = contextMenuViewModel;
        this.j.f(contextMenuViewModel);
    }

    public /* synthetic */ void g(b bVar, View view) {
        bVar.i();
        this.h.onDismiss();
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public n getHeader() {
        return this.j;
    }
}
