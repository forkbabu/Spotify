package com.spotify.music.features.podcast.episode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.libs.yourepisodes.views.tooltip.f;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.g;

public class r0 implements o0 {
    private final mc7 a;
    private final Picasso b;
    private final ajf<l0> c;
    private final dc7 d;
    private final wd7 e;
    private final vb7 f;
    private final nf7 g;
    private final fd7 h;
    private final z97 i;
    private final gb7 j;
    private final l27 k;
    private final ph7 l;
    private final sc7 m;
    private final vc7 n;
    private final boolean o;
    private final boolean p;
    private final f q;
    private AppBarLayout r;
    private ImageView s;
    private ImageView t;
    private TextView u;
    private ImageView v;
    private Button w;
    private Button x;
    private View y;

    class a implements g {
        a() {
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            r0.this.v.setVisibility(8);
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            r0.this.v.setVisibility(0);
        }
    }

    public r0(mc7 mc7, dc7 dc7, wd7 wd7, vb7 vb7, nf7 nf7, fd7 fd7, z97 z97, gb7 gb7, Picasso picasso, ajf<l0> ajf, l27 l27, boolean z, boolean z2, ph7 ph7, sc7 sc7, vc7 vc7, f fVar) {
        this.a = mc7;
        this.d = dc7;
        this.e = wd7;
        this.f = vb7;
        this.g = nf7;
        this.h = fd7;
        this.i = z97;
        this.j = gb7;
        this.b = picasso;
        this.c = ajf;
        this.k = l27;
        this.o = z;
        this.p = z2;
        this.l = ph7;
        this.m = sc7;
        this.n = vc7;
        this.q = fVar;
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_podcast_episode, viewGroup, false);
        this.y = inflate;
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(C0707R.id.header_view);
        this.r = appBarLayout;
        this.a.B1(layoutInflater, (ViewGroup) inflate, appBarLayout);
        View view = this.y;
        this.s = (ImageView) view.findViewById(C0707R.id.btn_share);
        this.u = (TextView) view.findViewById(C0707R.id.txt_metadata);
        this.v = (ImageView) view.findViewById(C0707R.id.img_cover_art);
        this.x = (Button) view.findViewById(C0707R.id.btn_play);
        this.w = (Button) view.findViewById(C0707R.id.btn_see_all);
        ImageView imageView = (ImageView) view.findViewById(C0707R.id.btn_add_your_episodes);
        this.t = imageView;
        if (this.p) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        Context context = view.getContext();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHEVRON_RIGHT, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.std_24dp));
        if (Build.VERSION.SDK_INT > 17) {
            this.w.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, spotifyIconDrawable, (Drawable) null);
        } else {
            this.w.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, spotifyIconDrawable, (Drawable) null);
        }
        ImageView imageView2 = this.s;
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIconV2.SHARE_ANDROID, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.std_24dp));
        spotifyIconDrawable2.s(androidx.core.content.a.c(context, C0707R.color.glue_button_text));
        imageView2.setImageDrawable(spotifyIconDrawable2);
        bvd c2 = dvd.c(this.w);
        c2.g(this.w);
        c2.a();
        this.g.a((RecyclerView) this.y.findViewById(C0707R.id.recycler_featured_content));
        View view2 = this.y;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(C0707R.id.recycler_recommendations);
        if (this.o) {
            recyclerView.setPadding(0, 0, 0, 0);
        }
        this.h.a(recyclerView, (Group) view2.findViewById(C0707R.id.group_recommendations));
        View view3 = this.y;
        this.i.d((TextView) view3.findViewById(C0707R.id.txt_explore_this_episode_link), view3.findViewById(C0707R.id.included_track_list_item), view3.findViewById(C0707R.id.free_experience_banner), (Group) view3.findViewById(C0707R.id.explore_this_episode_link_group));
        this.j.b(this.y.findViewById(C0707R.id.included_transcript_link));
        this.d.c((LottieAnimationView) this.y.findViewById(C0707R.id.lottie_animated_icon));
        this.f.b((TextView) this.y.findViewById(C0707R.id.txt_description));
        this.k.a((RecyclerView) this.y.findViewById(C0707R.id.audio_plus_content));
        this.l.b((ViewGroup) this.y.findViewById(C0707R.id.quote_sharing_carousel));
        ViewGroup viewGroup2 = (ViewGroup) this.y.findViewById(C0707R.id.podcast_interactivity_content);
        this.n.a(layoutInflater, viewGroup2);
        this.m.a(layoutInflater, viewGroup2);
        return this.y;
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public View b() {
        return this.y;
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void c() {
        this.x.setText(C0707R.string.header_play);
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void d(Bundle bundle) {
        this.c.get().j(bundle);
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void e() {
        this.x.setText(C0707R.string.header_pause);
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void f(Bundle bundle) {
        this.c.get().k(bundle);
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void g(a0 a0Var) {
        this.e.g(a0Var);
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void h(g77 g77) {
        this.u.setText(g77.n());
        this.b.m(g77.b()).n(this.v, new a());
        this.w.setOnClickListener(new z(this, g77));
        this.x.setOnClickListener(new a0(this, g77));
        this.s.setOnClickListener(new y(this, g77));
        this.t.setOnClickListener(new b0(this));
        this.d.a(g77);
        this.f.a(g77);
        this.g.b(g77.j());
        this.h.b(g77.s());
        this.i.c(g77.u());
        this.k.b(g77.a());
        this.l.a(g77.g());
        this.j.a(g77.h());
        ImageView imageView = this.t;
        Context context = imageView.getContext();
        boolean m2 = g77.m();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, m2 ? SpotifyIconV2.CHECK_ALT_FILL : SpotifyIconV2.PLUS_ALT, context.getResources().getDimension(C0707R.dimen.action_card_primary_action_height));
        if (m2) {
            spotifyIconDrawable.r(androidx.core.content.a.b(context, C0707R.color.cat_accessory_green_focused));
        } else {
            spotifyIconDrawable.s(androidx.core.content.a.c(context, C0707R.color.glue_button_text));
        }
        imageView.setImageDrawable(spotifyIconDrawable);
        if (!g77.m() && this.q.a()) {
            this.q.b(this.t, this.r);
        }
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void i(int i2) {
        this.d.b(i2);
    }

    @Override // com.spotify.music.features.podcast.episode.o0
    public void j(rc7 rc7) {
        this.a.T1(rc7);
        this.e.a(rc7);
    }

    public /* synthetic */ void l(g77 g77, View view) {
        this.c.get().h(g77.r());
    }

    public /* synthetic */ void m(g77 g77, View view) {
        this.c.get().g(g77.r(), g77.l());
    }

    public void n(g77 g77, View view) {
        Context context = view.getContext();
        this.c.get().l(g77.i(), g77.f(), g77.t(), context.getString(C0707R.string.share_episode_of_name, g77.q()));
    }

    public /* synthetic */ void o(View view) {
        this.c.get().f();
    }
}
