package com.spotify.music.features.nowplayingbar.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.encore.consumer.elements.heart.AnimatedHeartButton;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.nudge.b;
import com.spotify.mobile.android.util.g0;
import com.spotify.mobile.android.util.ui.e;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.l0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.music.features.nowplayingbar.view.carousel.CarouselView;
import com.spotify.music.libs.accountlinkingnudges.l;
import com.spotify.music.libs.connect.destination.ConnectDestinationButton;
import com.spotify.music.libs.connect.destination.ConnectLabel;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import defpackage.iu5;
import defpackage.ju5;
import defpackage.ku5;
import defpackage.lu5;
import java.util.Collection;

public class v0 implements g<lu5, d> {
    private final st5 A;
    private final Picasso B;
    private final com.spotify.mobile.android.util.ui.d C;
    private final q0 D;
    private final hj0<lu5.b> E;
    private final Context a;
    private final View b;
    private final ImageView c;
    private final VideoSurfaceView f;
    private final l0 n;
    private final ImageButton o;
    private final ImageButton p;
    private final AnimatedHeartButton q;
    private final ConnectDestinationButton r;
    private final CarouselView s;
    private final com.spotify.music.features.nowplayingbar.view.carousel.d t;
    private final x0 u;
    private final ConnectLabel v;
    private final g0<ProgressBar> w;
    private final da2<Boolean> x;
    private final Resources y;
    private final String z;

    public v0(LayoutInflater layoutInflater, ViewGroup viewGroup, da2<Boolean> da2, Resources resources, l0 l0Var, x0 x0Var, st5 st5, Picasso picasso, e eVar, q0 q0Var, b bVar, l lVar) {
        this.y = resources;
        this.n = l0Var;
        this.u = x0Var;
        this.x = da2;
        this.A = st5;
        this.B = picasso;
        this.C = eVar.b(-14145496, 300, new n0(this));
        this.D = q0Var;
        View findViewById = layoutInflater.inflate(q0Var.d() ? C0707R.layout.now_playing_bar_floating : C0707R.layout.now_playing_bar, viewGroup, false).findViewById(C0707R.id.now_playing_bar_layout);
        this.b = findViewById;
        Context context = findViewById.getContext();
        this.a = context;
        this.c = (ImageView) findViewById.findViewById(C0707R.id.cover_image);
        this.f = (VideoSurfaceView) findViewById.findViewById(C0707R.id.video_surface);
        CarouselView carouselView = (CarouselView) findViewById.findViewById(C0707R.id.tracks_carousel_view);
        this.s = carouselView;
        this.v = (ConnectLabel) findViewById.findViewById(C0707R.id.connect_label);
        com.spotify.music.features.nowplayingbar.view.carousel.d dVar = new com.spotify.music.features.nowplayingbar.view.carousel.d(resources);
        this.t = dVar;
        carouselView.setAdapter(dVar);
        this.o = (ImageButton) findViewById.findViewById(C0707R.id.play_pause_button);
        this.p = (ImageButton) findViewById.findViewById(C0707R.id.heart_button);
        this.q = (AnimatedHeartButton) findViewById.findViewById(C0707R.id.animated_heart_button);
        ConnectDestinationButton connectDestinationButton = (ConnectDestinationButton) findViewById.findViewById(C0707R.id.connect_destination_button);
        this.r = connectDestinationButton;
        connectDestinationButton.setUseBlinkingAnimation(q0Var.c());
        bVar.a(connectDestinationButton);
        lVar.a(connectDestinationButton);
        this.z = context.getString(C0707R.string.element_content_description_context_song);
        this.w = new g0<>((ProgressBar) findViewById.findViewById(C0707R.id.progress_bar), Optional.absent());
        this.E = hj0.b(hj0.d(m.a, hj0.a(new k0(this))), hj0.d(u.a, hj0.a(new e0(this))), hj0.d(b0.a, hj0.a(new c0(this))), hj0.d(s.a, hj0.a(new i(this))), hj0.d(j0.a, hj0.a(new l(this))), hj0.d(o0.a, hj0.a(new p(this))));
    }

    public static void G(v0 v0Var, int i) {
        if (v0Var.D.b()) {
            v0Var.b.setBackgroundColor(i);
        }
    }

    public static void p(v0 v0Var, iu5 iu5) {
        v0Var.r.setVisibility(0);
        iu5.c(new w(v0Var), new a0(v0Var), new f0(v0Var), new v(v0Var));
    }

    public static void q(v0 v0Var, nu5 nu5) {
        v0Var.w.f(nu5.b(), nu5.c(), nu5.d());
    }

    public static void r(v0 v0Var, pu5 pu5) {
        v0Var.t.f0(ImmutableList.copyOf((Collection) pu5.e()));
        v0Var.s.I0(pu5.b());
        v0Var.s.setDisallowScrollLeft(pu5.c());
        v0Var.s.setDisallowScrollRight(pu5.d());
    }

    public static void s(v0 v0Var, ku5 ku5) {
        if (v0Var.D.a()) {
            v0Var.p.setVisibility(8);
            ku5.b(new n(v0Var), new g0(v0Var));
            return;
        }
        v0Var.q.setVisibility(8);
        ku5.b(new m0(v0Var), new r(v0Var));
    }

    public static void u(v0 v0Var, mu5 mu5) {
        v0Var.o.setImageDrawable(mu5.c(v0Var.a));
        v0Var.o.setContentDescription(v0Var.y.getString(mu5.a()));
    }

    public void A(iu5.d dVar) {
        GaiaDevice f2 = dVar.f();
        if (this.D.c()) {
            this.t.Z();
            this.v.setVisibility(0);
            this.v.C(f2);
        }
        this.r.g(dVar.f());
    }

    public void C(ju5.a aVar) {
        f0 f0Var;
        this.f.setVisibility(8);
        this.c.setVisibility(0);
        z m = this.B.m(aVar.d().orNull());
        m.s(C0707R.drawable.album_placeholder_npb);
        ImageView imageView = this.c;
        if (this.D.d()) {
            f0Var = rwd.g(imageView, com.spotify.paste.graphics.drawable.d.a((float) imageView.getResources().getDimensionPixelSize(C0707R.dimen.floating_now_playing_bar_cover_art_radius)), new u0(this));
        } else {
            f0Var = rwd.h(imageView, new t0(this));
        }
        m.o(f0Var);
    }

    public /* synthetic */ void D(ju5.b bVar) {
        this.c.setVisibility(8);
        this.f.setVisibility(0);
        this.n.e(this.f);
        this.C.c(-14145496);
    }

    public /* synthetic */ void E(ku5.a aVar) {
        this.p.setVisibility(8);
    }

    public /* synthetic */ void F(ku5.b bVar) {
        this.p.setVisibility(0);
        this.p.setImageDrawable(bVar.e().apply(this.a));
        this.p.setActivated(bVar.f());
        this.p.setContentDescription(this.y.getString(bVar.d()));
    }

    public View o() {
        return this.b;
    }

    @Override // com.spotify.mobius.g
    public h<lu5> t(da2<d> da2) {
        h<d> t2 = this.A.t(da2);
        this.b.setOnClickListener(new o(t2));
        this.t.g0(new q(t2));
        this.c.setOnClickListener(new z(t2));
        this.f.setOnClickListener(new h0(t2));
        this.p.setOnClickListener(new l0(t2));
        this.q.onEvent(new p0(t2));
        this.r.setOnClickListener(new x(t2));
        this.o.setOnClickListener(new d0(t2));
        this.s.V0(new i0(t2), new h(t2));
        this.s.n(this.u);
        return new s0(this);
    }

    public void v(ku5.a aVar) {
        this.q.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams.y = 0;
        layoutParams.v = 0;
        this.r.setLayoutParams(layoutParams);
    }

    public void w(ku5.b bVar) {
        this.q.setVisibility(0);
        this.q.render(new Heart.Model(bVar.f(), this.z));
        int dimensionPixelSize = this.r.getResources().getDimensionPixelSize(C0707R.dimen.now_playing_bar_actions_button_size);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams.y = dimensionPixelSize;
        layoutParams.v = dimensionPixelSize;
        this.r.setLayoutParams(layoutParams);
    }

    public void x(iu5.c cVar) {
        if (this.D.c()) {
            this.t.b0();
            this.v.setVisibility(8);
        }
        this.r.setVisibility(8);
    }

    public void y(iu5.a aVar) {
        GaiaDevice f2 = aVar.f();
        if (this.D.c()) {
            this.t.Z();
            this.v.setVisibility(0);
            this.v.D(f2);
        }
        this.r.h(aVar.f());
    }

    public void z(iu5.b bVar) {
        if (this.D.c()) {
            this.t.b0();
            this.v.setVisibility(8);
        }
        this.r.i();
    }
}
