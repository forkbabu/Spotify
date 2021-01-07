package com.spotify.music.homecomponents.promotionv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.promotionv2.ui.PlayButton;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.g;
import com.squareup.picasso.z;
import defpackage.urc;

public class l implements m {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView f;
    private final ImageView n;
    private final ImageView o;
    private final PlayButton p;
    private boolean q;
    private boolean r = true;
    private int s = -1;
    private final Picasso t;
    private final Context u;
    private final jq9 v;
    private final urc w;
    private final urc.b x;

    class a implements urc.b {
        a() {
        }

        private void c(Drawable drawable) {
            l.this.n.setImageDrawable(drawable);
        }

        @Override // defpackage.urc.b
        public void a(Drawable drawable) {
            l.this.n.setImageDrawable(drawable);
            l.b(l.this);
        }

        @Override // defpackage.urc.b
        public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var) {
            int b = sq9.b(e7Var);
            MoreObjects.checkArgument(!bitmap.isRecycled());
            l.this.v.a(bitmap, loadedFrom != Picasso.LoadedFrom.MEMORY);
            MoreObjects.checkArgument(!bitmap.isRecycled());
            c(l.this.v);
            if (l.this.r) {
                l.this.s = b;
            }
            l.b(l.this);
            l.this.p.f(l.this.q);
        }

        @Override // defpackage.urc.b
        public void onPrepareLoad(Drawable drawable) {
            l.this.n.setImageDrawable(drawable);
        }
    }

    class b implements g {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            l.this.setTitle(this.a);
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            l.W(l.this, this.a);
        }
    }

    public l(Picasso picasso, ViewGroup viewGroup) {
        int i = trc.a;
        urc urc = new urc(src.b);
        this.w = urc;
        a aVar = new a();
        this.x = aVar;
        picasso.getClass();
        this.t = picasso;
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        this.u = context;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_promotion_v2_layout, viewGroup, false);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.promotion_title);
        this.b = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.promotion_subtitle);
        this.c = textView2;
        TextView textView3 = (TextView) inflate.findViewById(C0707R.id.promotion_label);
        this.f = textView3;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.promotion_background_image);
        this.n = imageView;
        this.o = (ImageView) inflate.findViewById(C0707R.id.promotion_logo);
        this.p = (PlayButton) inflate.findViewById(C0707R.id.promotion_play_button);
        jq9 jq9 = new jq9(context, C0707R.dimen.home_promotion_background_corner_radius);
        this.v = jq9;
        imageView.setBackground(new kq9(context.getResources(), C0707R.dimen.home_promotion_background_corner_radius));
        imageView.setImageDrawable(jq9);
        bvd b2 = dvd.b(inflate.findViewById(C0707R.id.promotion_root_view));
        b2.f(textView, textView2, textView3, imageView);
        b2.g(inflate);
        b2.a();
        urc.e(aVar);
        q4.J(inflate, true);
    }

    private static Uri I0(String str) {
        return TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    static void W(l lVar, String str) {
        lVar.o.setContentDescription(str);
        lVar.o.setVisibility(0);
        lVar.b.setVisibility(8);
    }

    static void b(l lVar) {
        lVar.b.setTextColor(lVar.s);
        iq9 iq9 = new iq9(lVar.u, lVar.s);
        PlayButton playButton = lVar.p;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        playButton.setBackground(iq9);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setText(charSequence);
            this.b.setVisibility(0);
            this.o.setVisibility(8);
            return;
        }
        this.b.setText("");
        this.b.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void B(String str, String str2) {
        f0 f2 = this.w.f();
        Optional<V> transform = n71.a(str2).transform(new f(this));
        z l = this.t.l(I0(str));
        if (transform.isPresent()) {
            l.t(transform.get());
            l.g(transform.get());
        }
        l.o(f2);
    }

    public Drawable J0(SpotifyIconV2 spotifyIconV2) {
        return yc0.d(this.u, spotifyIconV2, (float) nud.g((float) 64, this.u.getResources()));
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void a0(int i) {
        this.r = false;
        this.s = i;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void h() {
        this.q = false;
        this.p.setVisibility(8);
        this.p.f(false);
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void j(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.setText(charSequence);
            this.f.setVisibility(0);
            return;
        }
        this.f.setText("");
        this.f.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public View m() {
        return this.p;
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void o1() {
        this.r = true;
        this.s = -1;
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void p() {
        this.q = true;
        this.p.setVisibility(0);
        this.p.f(true);
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void p1(String str, String str2) {
        if (I0(str) == Uri.EMPTY) {
            setTitle(str2);
        } else {
            this.t.l(I0(str)).n(this.o, new b(str2));
        }
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
            return;
        }
        this.c.setText("");
        this.c.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.promotionv2.m
    public void x() {
        this.q = false;
        this.p.setVisibility(0);
        this.p.f(false);
    }
}
