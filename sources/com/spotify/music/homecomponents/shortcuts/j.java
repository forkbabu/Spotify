package com.spotify.music.homecomponents.shortcuts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.a;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;

public class j implements k {
    private final View a;
    private final r b;
    private final ImageView c;
    private final LottieAnimationView f;
    private final TextView n;
    private final f o;
    private final ProgressBar p;
    private final c q;

    public j(Context context, ViewGroup viewGroup, Picasso picasso) {
        this.b = new r(new c0(picasso), context);
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_shortcuts_item_layout, viewGroup, false);
        this.a = inflate;
        ImageView imageView = (ImageView) q4.G(inflate, C0707R.id.shortcuts_item_image);
        this.c = imageView;
        TextView textView = (TextView) q4.G(inflate, C0707R.id.shortcuts_item_title);
        this.n = textView;
        this.f = (LottieAnimationView) q4.G(inflate, C0707R.id.shortcuts_item_accessory);
        this.p = (ProgressBar) q4.G(inflate, C0707R.id.shortcuts_progress_bar);
        f fVar = new f();
        this.o = fVar;
        fVar.F(e.j(context, C0707R.raw.playback_indicator).b());
        fVar.U(-1);
        fVar.V(2);
        c cVar = new c(a.d(context, C0707R.drawable.freshness_badge), 0.66f);
        this.q = cVar;
        cVar.b(0);
        new ewd(0.75d, 0.4f, nud.g(4.0f, inflate.getContext().getResources()));
        bvd c2 = dvd.c(inflate);
        c2.g(textView);
        c2.f(imageView);
        c2.a();
    }

    @Override // com.spotify.music.homecomponents.shortcuts.k
    public void J1() {
        this.f.setVisibility(8);
        this.f.setImageDrawable(null);
        this.o.f();
    }

    @Override // com.spotify.music.homecomponents.shortcuts.k
    public void N0() {
        this.f.setImageDrawable(this.q);
        this.f.setVisibility(0);
    }

    @Override // com.spotify.music.homecomponents.shortcuts.k
    public void X0() {
        if (this.o.l() != null) {
            this.f.setImageDrawable(this.o);
            this.o.B();
            this.f.setVisibility(0);
        }
    }

    @Override // com.spotify.music.homecomponents.shortcuts.k
    public void a(Uri uri, Drawable drawable, String str) {
        z c2 = this.b.c(uri);
        c2.t(drawable);
        c2.g(drawable);
        c2.m(this.c);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.homecomponents.shortcuts.k
    public void h0(int i) {
        this.p.setProgress(i);
        this.p.setVisibility(0);
    }

    @Override // com.spotify.music.homecomponents.shortcuts.k
    public void h1() {
        this.p.setVisibility(8);
        this.p.setProgress(0);
    }

    @Override // com.spotify.music.homecomponents.shortcuts.k
    public void setTitle(CharSequence charSequence) {
        this.n.setText(charSequence);
    }
}
