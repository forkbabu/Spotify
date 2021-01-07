package com.spotify.music.homecomponents.singleitem.card;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.encore.consumer.elements.heart.HeartButton;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.promotionv2.ui.PlayButton;
import com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class g implements HomeSingleFocusCardViewBinder {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final TextView f;
    private final PlayButton n;
    private final HeartButton o;
    private final TextView p;
    private final int q;
    private final int r;
    private final ColorDrawable s;
    private final r t;
    private final Context u;
    private final m71 v;

    static final class a implements View.OnClickListener {
        final /* synthetic */ g a;
        final /* synthetic */ nmf b;

        a(g gVar, nmf nmf) {
            this.a = gVar;
            this.b = nmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.invoke(Boolean.valueOf(this.a.b().g()));
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ cmf a;

        b(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    public g(Context context, m71 m71, Picasso picasso, ViewGroup viewGroup) {
        h.e(context, "context");
        h.e(m71, "iconCache");
        h.e(picasso, "picasso");
        h.e(viewGroup, "parent");
        this.u = context;
        this.v = m71;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_single_focus_card, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(cont…ocus_card, parent, false)");
        this.a = inflate;
        View findViewById = inflate.findViewById(C0707R.id.single_focus_card_image);
        h.d(findViewById, "rootView.findViewById(R.….single_focus_card_image)");
        ImageView imageView = (ImageView) findViewById;
        this.b = imageView;
        View findViewById2 = inflate.findViewById(C0707R.id.single_focus_card_title);
        h.d(findViewById2, "rootView.findViewById(R.….single_focus_card_title)");
        TextView textView = (TextView) findViewById2;
        this.c = textView;
        View findViewById3 = inflate.findViewById(C0707R.id.single_focus_card_subtitle);
        h.d(findViewById3, "rootView.findViewById(R.…ngle_focus_card_subtitle)");
        TextView textView2 = (TextView) findViewById3;
        this.f = textView2;
        View findViewById4 = inflate.findViewById(C0707R.id.single_focus_card_play_btn);
        h.d(findViewById4, "rootView.findViewById(R.…ngle_focus_card_play_btn)");
        PlayButton playButton = (PlayButton) findViewById4;
        this.n = playButton;
        View findViewById5 = inflate.findViewById(C0707R.id.single_focus_card_heart_btn);
        h.d(findViewById5, "rootView.findViewById(R.…gle_focus_card_heart_btn)");
        HeartButton heartButton = (HeartButton) findViewById5;
        this.o = heartButton;
        View findViewById6 = inflate.findViewById(C0707R.id.single_focus_card_show_more_btn);
        h.d(findViewById6, "rootView.findViewById(R.…focus_card_show_more_btn)");
        TextView textView3 = (TextView) findViewById6;
        this.p = textView3;
        this.q = androidx.core.content.a.b(context, C0707R.color.home_title_text_default);
        this.r = androidx.core.content.a.b(context, C0707R.color.home_green_highlight);
        this.s = new ColorDrawable(androidx.core.content.a.b(context, R.color.gray_15));
        this.t = new r(new c0(picasso), context);
        heartButton.render(new Heart.Model(false, null, 2, null));
        yq9 yq9 = new yq9(context);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        playButton.setBackground(yq9);
        textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SpotifyIconDrawable(context, SpotifyIconV2.CHEVRON_DOWN, (float) nud.g(10.0f, context.getResources())), (Drawable) null);
        textView3.setCompoundDrawablePadding(nud.g(8.0f, context.getResources()));
        bvd b2 = dvd.b(inflate);
        b2.f(imageView);
        b2.g(textView, textView2);
        b2.a();
        dvd.a(heartButton).a();
        dvd.a(textView3).a();
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void C1(nmf<? super Boolean, f> nmf) {
        h.e(nmf, "event");
        this.n.setOnClickListener(new a(this, nmf));
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void C2(boolean z) {
        this.c.setTextColor(z ? this.r : this.q);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void L1(CharSequence charSequence) {
        if (!(e.n(charSequence))) {
            this.p.setText(charSequence);
            d(this.p);
            return;
        }
        c();
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void N1() {
        this.o.render(new Heart.Model(false, null, 2, null));
        this.o.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void O0(nmf<? super Boolean, f> nmf) {
        h.e(nmf, "event");
        this.o.onEvent(nmf);
    }

    public final PlayButton b() {
        return this.n;
    }

    public void c() {
        this.p.setText("");
        this.p.setVisibility(8);
    }

    public final void d(View view) {
        h.e(view, "view");
        int id = view.getId();
        if (id == C0707R.id.single_focus_card_heart_btn) {
            c();
            this.o.setVisibility(0);
            br9.a(this.f);
        } else if (id == C0707R.id.single_focus_card_play_btn) {
            c();
            this.n.setVisibility(0);
            br9.a(this.f);
        } else if (id == C0707R.id.single_focus_card_show_more_btn) {
            N1();
            h();
            this.p.setVisibility(0);
            br9.a(this.f);
        } else {
            h();
            N1();
            c();
            br9.a(this.f);
        }
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void f0(HomeSingleFocusCardViewBinder.Size size) {
        ConstraintLayout.LayoutParams layoutParams;
        h.e(size, "size");
        int dimensionPixelSize = this.u.getResources().getDimensionPixelSize(size.d());
        ImageView imageView = this.b;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (!(layoutParams2 instanceof ConstraintLayout.LayoutParams)) {
            layoutParams2 = null;
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
        if (layoutParams3 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).width = dimensionPixelSize;
            ((ViewGroup.MarginLayoutParams) layoutParams3).height = dimensionPixelSize;
            layoutParams = layoutParams3;
        } else {
            layoutParams = this.b.getLayoutParams();
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void h() {
        this.n.f(false);
        this.n.setVisibility(8);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void o2(int i) {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
        } else {
            layoutParams = this.a.getLayoutParams();
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void reset() {
        f0(HomeSingleFocusCardViewBinder.Size.STANDARD);
        o2(-1);
        this.b.setImageDrawable(null);
        this.c.setText("");
        this.c.setTextColor(this.q);
        this.f.setText("");
        this.p.setText("");
        br9.a(this.f);
        h();
        c();
        N1();
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void setSubtitle(CharSequence charSequence) {
        br9.a(this.f);
        this.f.setText(charSequence);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void setTitle(CharSequence charSequence) {
        br9.a(this.f);
        this.c.setText(charSequence);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void u1(boolean z) {
        d(this.n);
        this.n.f(z);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void w1(Uri uri, String str) {
        Drawable drawable;
        h.e(uri, "imageUri");
        h.e(str, "placeholder");
        if (!e.n(str)) {
            drawable = this.v.b(str, HubsGlueImageConfig.THUMBNAIL);
        } else {
            drawable = this.s;
        }
        z c2 = this.t.c(uri);
        c2.t(drawable);
        c2.g(drawable);
        c2.m(this.b);
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void x2(cmf<f> cmf) {
        h.e(cmf, "event");
        this.p.setOnClickListener(new b(cmf));
    }

    @Override // com.spotify.music.homecomponents.singleitem.card.HomeSingleFocusCardViewBinder
    public void y2(boolean z) {
        d(this.o);
        this.o.render(new Heart.Model(z, null, 2, null));
    }
}
