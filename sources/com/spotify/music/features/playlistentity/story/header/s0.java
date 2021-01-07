package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.glue.components.toolbar.d;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.e0;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import defpackage.r62;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public final class s0 implements q0, p0 {
    private final m0 a;
    private final Picasso b;
    private final Context c;
    private final f0 f;
    private final r62.a n;
    private final l72 o;
    private final c.a p;
    private u q;
    private CoordinatorLayout r;
    private AppBarLayout s;
    private ViewGroup t;
    private Optional<Boolean> u = Optional.absent();
    private e0 v;
    private RecyclerView w;
    private c x;
    private r y;
    private Drawable z;

    class a implements f0 {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            BitmapDrawable bitmapDrawable = new BitmapDrawable(s0.this.c.getResources(), bitmap);
            jc0 jc0 = new jc0();
            jc0.c(bitmapDrawable, new ColorDrawable(this.a));
            jc0.d(true);
            mc0 a2 = lc0.a(jc0, new kc0(s0.this.c));
            AppBarLayout appBarLayout = s0.this.s;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a2);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public s0(Picasso picasso, Context context, n0 n0Var, r62.a aVar, l72 l72, c.a aVar2, f0 f0Var) {
        this.a = n0Var.b(f0Var);
        this.b = picasso;
        this.c = context;
        this.p = aVar2;
        this.f = f0Var;
        this.n = aVar;
        this.o = l72;
    }

    private void y(boolean z2) {
        int l = nud.l(this.c, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(this.c);
        int i = 8;
        if (z2) {
            float f2 = (float) ((this.f.h() ? 8 : 0) + 24);
            this.s.setPadding(0, l, 0, nud.q(f2, this.c.getResources()));
            this.s.setClipToPadding(false);
            this.w.setPadding(0, nud.q(f2, this.c.getResources()), 0, 0);
            this.w.setClipToPadding(false);
        } else {
            this.s.setPadding(0, l, 0, 0);
            this.w.setPadding(0, 0, 0, 0);
        }
        ViewGroup viewGroup = this.t;
        if (z2) {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    public void A() {
        PlaylistStoryHeaderAnimatedTooltip G2 = this.v.G2();
        if (G2 != null) {
            G2.b();
        }
    }

    public /* synthetic */ void B(int i) {
        this.r.post(new x(this, i));
    }

    public /* synthetic */ void C(View view) {
        this.a.o();
    }

    public /* synthetic */ void D(View view, e0 e0Var, AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        e0Var.e0(abs, height);
        e0Var.getView().setTranslationY(f2);
        this.q.o(height);
        this.a.d(abs);
    }

    public /* synthetic */ void E(View view) {
        this.a.b();
    }

    public /* synthetic */ void F(int i) {
        this.s.i(false, false);
        RecyclerView.m layoutManager = this.w.getLayoutManager();
        if (i > -1 && layoutManager != null) {
            layoutManager.v1(i);
        }
    }

    public /* synthetic */ void G(View view) {
        this.a.p();
    }

    public /* synthetic */ void H(View view) {
        this.a.q();
    }

    public void I(String str) {
        PlaylistStoryHeaderAnimatedTooltip G2 = this.v.G2();
        if (G2 != null && !MoreObjects.isNullOrEmpty(str)) {
            G2.G(str, this.b);
        }
    }

    public void J(boolean z2) {
        AppBarLayout appBarLayout = this.s;
        if (appBarLayout != null) {
            appBarLayout.i(z2, false);
        } else {
            this.u = Optional.of(Boolean.valueOf(z2));
        }
    }

    public boolean K() {
        AppBarLayout appBarLayout = this.s;
        if (appBarLayout == null || appBarLayout.getHeight() - this.s.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public void L(boolean z2) {
        e0 e0Var = this.v;
        if (e0Var != null) {
            e0Var.E2().setChecked(z2);
        }
    }

    public void M(CharSequence charSequence) {
        e0 e0Var = this.v;
        if (e0Var != null) {
            e0Var.B0(charSequence);
        }
    }

    public void N(String str, boolean z2) {
        e0 e0Var = this.v;
        if (e0Var != null) {
            e0Var.I2(str, z2);
        }
    }

    public void O(boolean z2) {
        c cVar = this.x;
        if (cVar != null) {
            cVar.a(z2);
        }
    }

    public void P(boolean z2) {
        c cVar = this.x;
        if (cVar != null) {
            cVar.b(z2);
        }
    }

    public void Q(int i, String str) {
        a aVar = new a(i);
        this.s.setTag(aVar);
        this.b.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).o(aVar);
    }

    public void R(String str) {
        ImageView F2 = this.v.F2();
        if (F2 == null) {
            F2 = new ImageView(this.c);
        }
        Drawable drawable = F2.getDrawable();
        if (drawable == null) {
            drawable = this.z;
        }
        z l = this.b.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        l.t(drawable);
        l.g(drawable);
        l.x(new cwd());
        l.m(F2);
        F2.setOnClickListener(new t(this));
    }

    public void S(String str, p62 p62) {
        if (!MoreObjects.isNullOrEmpty(str)) {
            VideoSurfaceView H2 = this.v.H2();
            H2.setOnClickListener(new w(this));
            H2.setScaleType(VideoSurfaceView.ScaleType.ASPECT_FILL);
            String a2 = this.o.a(str);
            e0.a a3 = e0.a();
            a3.f(a2);
            a3.d(false);
            a3.e(false);
            e0 b2 = a3.b();
            if (this.y == null) {
                VideoSurfaceView H22 = this.v.H2();
                s a4 = this.n.a(p62).a();
                a4.d("Playlist Story Header");
                a4.g(false);
                a4.j(H22);
                a4.c(Collections.singletonList(new z(this)));
                this.y = a4.a();
            }
            this.y.a0(true);
            this.y.P(true);
            this.y.K(b2);
        }
    }

    public void T(String str) {
        e0 e0Var = this.v;
        if (e0Var != null) {
            e0Var.setTitle(str);
        }
        this.q.setTitle(str);
    }

    public void U() {
        PlaylistStoryHeaderAnimatedTooltip G2 = this.v.G2();
        if (G2 != null) {
            G2.a();
        }
    }

    @Override // defpackage.ar6
    public b66 b() {
        return this.f.c();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.a.s(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.a.r(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.a.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.a.c();
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.w;
        recyclerView.getClass();
        return recyclerView;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.a.a(this);
    }

    @Override // defpackage.ar6
    public boolean i() {
        return true;
    }

    @Override // defpackage.ar6
    public boolean j() {
        return false;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.t(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public List<View> o(LayoutInflater layoutInflater, ViewGroup viewGroup, d dVar) {
        c cVar;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(C0707R.layout.story_header, viewGroup, false);
        this.r = coordinatorLayout;
        this.w = (RecyclerView) coordinatorLayout.findViewById(C0707R.id.recycler_view);
        this.s = (AppBarLayout) this.r.findViewById(C0707R.id.header_view);
        this.t = (ViewGroup) this.r.findViewById(C0707R.id.accessory);
        this.w.setLayoutManager(new LinearLayoutManager(this.c));
        com.spotify.android.goldenpath.a.b(this.c);
        u R = dVar.R();
        this.q = R;
        R.o(0.0f);
        if (this.f.f()) {
            if (this.f.h()) {
                cVar = this.p.a(this.c);
            } else {
                cVar = this.p.b(com.spotify.android.paste.app.c.g().a(this.c));
            }
            cVar.setOnClickListener(new a0(this));
            this.t.addView(cVar.getView());
            this.x = cVar;
            y(true);
        } else {
            y(false);
        }
        this.z = yc0.s(this.c);
        e0 e0Var = new e0(this.c, this.s);
        this.v = e0Var;
        View view = e0Var.getView();
        this.s.addView(view);
        this.s.a(new v(this, view, e0Var));
        if (this.f.d()) {
            e0Var.E2().setVisibility(0);
            e0Var.E2().setOnClickListener(new u(this));
        }
        if (this.u.isPresent()) {
            this.s.i(this.u.get().booleanValue(), false);
            this.u = Optional.absent();
        }
        return Collections.singletonList(this.r);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.u();
        r rVar = this.y;
        if (rVar != null) {
            rVar.stop();
            this.y.d();
            this.y = null;
        }
    }

    public void z(int i) {
        this.w.post(new y(this, i));
    }
}
