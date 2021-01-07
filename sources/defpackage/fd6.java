package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.homemix.header.playbutton.HomeMixPlayButton;
import com.spotify.music.features.playlistentity.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.Collections;
import java.util.List;

/* renamed from: fd6  reason: default package */
public class fd6 implements cd6 {
    private final Context a;
    private final Picasso b;
    private final zc6 c;
    private final g f;
    private RecyclerView n;
    private GlueHeaderViewV2 o;
    private HomeMixPlayButton p;
    private yc6 q;
    private u r;
    private GlueHeaderLayout s;
    private t.b t;
    private id6 u;
    gd6 v;

    public fd6(Context context, Picasso picasso, gd6 gd6, ad6 ad6, g gVar) {
        this.a = context;
        this.b = picasso;
        this.v = gd6;
        this.c = ad6.b(gVar);
        this.f = gVar;
    }

    public void A(String str) {
        u uVar = this.r;
        if (uVar != null) {
            uVar.setTitle(str);
        }
    }

    public void B(String str, int i) {
        ImageView imageView = this.q.getImageView();
        z l = this.b.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = yc0.f(this.a);
        }
        HomeMixPlayButton homeMixPlayButton = this.p;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.setColor(i);
        }
        if (this.o != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, a.b(this.a, C0707R.color.headerEndGray)});
            gradientDrawable.setCornerRadius(0.0f);
            l.t(drawable);
            l.g(drawable);
            l.m(imageView);
            mc0 a2 = lc0.a(new ColorDrawable(i), gradientDrawable);
            GlueHeaderViewV2 glueHeaderViewV2 = this.o;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            glueHeaderViewV2.setBackground(a2);
        }
    }

    public void C() {
        HomeMixPlayButton homeMixPlayButton = this.p;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.setVisibility(0);
        }
    }

    @Override // defpackage.ar6
    public b66 b() {
        return this.f.b();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.c.a(null);
        id6 id6 = this.u;
        if (id6 != null) {
            id6.g();
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.c.b();
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public RecyclerView getRecyclerView() {
        return this.n;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.c.a(this);
        id6 id6 = this.u;
        if (id6 != null) {
            id6.f(this.t);
            this.u.j(true);
        }
    }

    @Override // defpackage.ar6
    public boolean i() {
        return true;
    }

    @Override // defpackage.ar6
    public boolean j() {
        return false;
    }

    public void k() {
        HomeMixPlayButton homeMixPlayButton = this.p;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.setVisibility(8);
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.c.h(bVar);
        this.t = bVar;
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public List<View> o(LayoutInflater layoutInflater, ViewGroup viewGroup, d dVar) {
        GlueHeaderLayout glueHeaderLayout = (GlueHeaderLayout) layoutInflater.inflate(C0707R.layout.playlist_entity_home_mix_playlist_header, viewGroup, false);
        this.s = glueHeaderLayout;
        this.n = (RecyclerView) glueHeaderLayout.findViewById(C0707R.id.recycler_view);
        this.o = (GlueHeaderViewV2) this.s.findViewById(C0707R.id.header_view);
        this.n.setLayoutManager(new LinearLayoutManager(this.a));
        com.spotify.android.goldenpath.a.b(this.a);
        u R = dVar.R();
        this.r = R;
        R.o(0.0f);
        int l = nud.l(this.a, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.d(this.a);
        this.o.setContentTopMargin(l);
        this.q = new yc6(this.a, this.o);
        HomeMixPlayButton homeMixPlayButton = new HomeMixPlayButton(this.a);
        this.p = homeMixPlayButton;
        homeMixPlayButton.setOnClickListener(new sc6(this));
        this.u = this.v.b(this.s);
        this.o.setScrollObserver(new rc6(this, new AccelerateInterpolator(2.0f)));
        this.s.F(this.p, true);
        this.o.setContentBottomMargin(nud.g(38.0f, this.a.getResources()));
        this.o.setStickyAreaSize(nud.g(22.0f, this.a.getResources()) + l);
        this.o.setContentViewBinder(this.q);
        return Collections.singletonList(this.s);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.c.i();
    }

    public /* synthetic */ void u(View view) {
        this.c.g();
    }

    public void w(Interpolator interpolator, float f2) {
        float interpolation = interpolator.getInterpolation(f2);
        this.r.o(interpolation);
        if (this.o.getBackground() instanceof mc0) {
            ((mc0) this.o.getBackground()).getDrawable(1).setAlpha(Math.max((int) ((1.0f - interpolation) * 255.0f), 100));
            this.o.invalidate();
        }
        id6 id6 = this.u;
        if (id6 != null) {
            id6.e(interpolation);
        }
    }

    public void y() {
        HomeMixPlayButton homeMixPlayButton = this.p;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.j();
        }
    }

    public void z() {
        HomeMixPlayButton homeMixPlayButton = this.p;
        if (homeMixPlayButton != null) {
            homeMixPlayButton.k();
        }
    }
}
