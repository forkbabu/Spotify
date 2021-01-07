package com.spotify.music.homecomponents.singleitem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.promotionv2.ui.PlayButton;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;

public class i implements j {
    private final View a;
    private final Context b;
    private final TextView c;
    private final TextView f;
    private final ImageView n;
    private final r o;
    private final PlayButton p;
    private final int q;
    private final int r;

    public i(Context context, ViewGroup viewGroup, Picasso picasso) {
        this.b = context;
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_single_item_component, viewGroup, false);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.single_item_title);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.single_item_subtitle);
        this.f = textView2;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.single_item_image);
        this.n = imageView;
        this.o = new r(new c0(picasso), context);
        PlayButton playButton = (PlayButton) inflate.findViewById(C0707R.id.single_item_play_button);
        this.p = playButton;
        this.q = context.getResources().getColor(C0707R.color.home_title_text_default);
        this.r = context.getResources().getColor(C0707R.color.home_green_highlight);
        yq9 yq9 = new yq9(context);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        playButton.setBackground(yq9);
        bvd c2 = dvd.c(inflate);
        c2.f(imageView);
        c2.g(textView, textView2);
        c2.a();
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void a(Uri uri, Drawable drawable, String str) {
        this.n.setVisibility(0);
        z c2 = this.o.c(uri);
        br9.b(this.b, this.c, this.f);
        str.hashCode();
        if (str.equals("circular")) {
            c cVar = new c(drawable, 1.0f);
            c2.t(cVar);
            c2.g(cVar);
            c2.o(rwd.c(this.n));
            this.c.setGravity(1);
            this.f.setGravity(1);
        } else if (!str.equals("rounded")) {
            c2.t(drawable);
            c2.g(drawable);
            c2.m(this.n);
        } else {
            c2.t(drawable);
            c2.g(drawable);
            c2.o(rwd.f(this.n, d.a((float) this.a.getResources().getDimensionPixelSize(C0707R.dimen.episode_card_corner_radius))));
        }
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void g0() {
        this.c.setTextColor(this.r);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void h() {
        this.p.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public View m() {
        return this.p;
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void p() {
        this.p.setVisibility(0);
        this.p.f(true);
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void s1() {
        this.c.setTextColor(this.q);
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.setText(charSequence);
            this.f.setVisibility(0);
            return;
        }
        this.f.setText("");
        this.f.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
            return;
        }
        this.c.setText("");
        this.c.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.singleitem.j
    public void x() {
        this.p.setVisibility(0);
        this.p.f(false);
    }
}
