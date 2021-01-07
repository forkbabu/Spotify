package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import android.graphics.Rect;
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
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.libs.facepile.d;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.mobile.android.ui.view.x;
import com.spotify.music.C0707R;
import com.spotify.music.coverimage.CoverImageActivity;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.t;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class z0 implements y0, x0 {
    private final r0 a;
    private final g b;
    private final Picasso c;
    private final Context f;
    private final c.a n;
    private final cqe o;
    private RecyclerView p;
    private c q;
    private u r;
    private CoordinatorLayout s;
    private AppBarLayout t;
    private ViewGroup u;
    private Optional<Boolean> v = Optional.absent();
    private x w;
    private n0 x;
    private Drawable y;
    private final b z = new b(null);

    class a extends dwd {
        a() {
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            mc0 a = lc0.a(new ColorDrawable(i), new kc0(z0.this.f));
            AppBarLayout appBarLayout = z0.this.t;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a);
        }
    }

    /* access modifiers changed from: private */
    public static final class b extends RecyclerView.l {
        private int a;

        b(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            if (recyclerView.Z(view) == 0) {
                rect.top = this.a;
            }
        }

        public void m(int i) {
            this.a = i;
        }
    }

    public z0(Picasso picasso, Context context, s0 s0Var, c.a aVar, cqe cqe, g gVar, Optional<v0> optional) {
        this.a = s0Var.b(gVar, optional);
        this.n = aVar;
        this.b = gVar;
        this.c = picasso;
        this.f = context;
        this.o = cqe;
    }

    private void R(boolean z2) {
        x xVar = this.w;
        if (xVar != null) {
            if (z2) {
                xVar.setOnOwnerClickListener(new d0(this));
            } else {
                xVar.setOnOwnerClickListener(new c0(this));
            }
        }
    }

    private void w(boolean z2) {
        int l = nud.l(this.f, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(this.f);
        int i = 0;
        if (z2) {
            float f2 = (float) ((this.b.b().d() ? 6 : 0) + 24);
            this.t.setPadding(0, l, 0, nud.q(f2, this.f.getResources()));
            this.t.setClipToPadding(false);
            this.z.m(nud.q(f2, this.f.getResources()));
        } else {
            this.t.setPadding(0, l, 0, 0);
            this.z.m(0);
        }
        ViewGroup viewGroup = this.u;
        if (!z2) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public /* synthetic */ void A(int i) {
        this.s.post(new a0(this, i));
    }

    public /* synthetic */ void B(View view) {
        this.a.l();
    }

    public /* synthetic */ void C(View view, AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        this.x.e0(abs, height);
        this.x.getView().setTranslationY(f2);
        this.r.o(height);
    }

    public /* synthetic */ void D(View view) {
        this.a.c();
    }

    public /* synthetic */ void E(View view) {
        this.a.m();
    }

    public /* synthetic */ void F(int i) {
        this.t.i(false, false);
        RecyclerView.m layoutManager = this.p.getLayoutManager();
        if (i > -1 && layoutManager != null) {
            layoutManager.v1(i);
        }
    }

    public /* synthetic */ void G(View view) {
        this.a.m();
    }

    public /* synthetic */ void H(View view) {
        this.a.b();
    }

    public /* synthetic */ void I(View view) {
        this.a.b();
    }

    public /* synthetic */ void J(View view) {
        this.a.m();
    }

    public /* synthetic */ void K(View view) {
        this.a.k();
    }

    public void L(String str, String str2) {
        Uri uri;
        ImageView imageView = this.x.getImageView();
        imageView.getClass();
        if (MoreObjects.isNullOrEmpty(str2) || !this.f.getResources().getBoolean(C0707R.bool.useLargerPlaylistImageResolution)) {
            uri = !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
        } else {
            uri = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
        }
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        CoverImageActivity.X0(this.f, iArr[0], iArr[1], imageView.getWidth(), imageView.getHeight(), uri, this.f.getResources().getConfiguration().orientation);
    }

    public void M() {
        this.x.E2().setOnClickListener(null);
        R(false);
    }

    public void N(boolean z2) {
        AppBarLayout appBarLayout = this.t;
        if (appBarLayout != null) {
            appBarLayout.i(z2, false);
        } else {
            this.v = Optional.of(Boolean.valueOf(z2));
        }
    }

    public boolean O() {
        AppBarLayout appBarLayout = this.t;
        if (appBarLayout == null || appBarLayout.getHeight() - this.t.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public void P(String str) {
        x xVar = this.w;
        if (xVar != null) {
            xVar.getInfoPageOwnerButton().setContentDescription(str);
        }
        this.x.E2().setContentDescription(str);
    }

    public void Q(boolean z2) {
        this.x.F2().setChecked(z2);
    }

    public void S(String str, long j, int i) {
        x xVar = this.w;
        if (xVar != null) {
            xVar.getDescriptionView().setText(z42.m(str));
            this.w.a(true);
            this.w.c(!TextUtils.isEmpty(str));
            this.w.b(this.o, j);
            this.w.setDuration(i);
        }
    }

    public void T(String str, String str2) {
        if (this.w != null) {
            String upperCase = str.toUpperCase(Locale.getDefault());
            String upperCase2 = str2.toUpperCase(Locale.getDefault());
            this.w.setByTextContentDescription(this.f.getString(C0707R.string.playlist_header_playlist_by_username, upperCase));
            this.w.setOwnerButtonText(upperCase2);
        }
    }

    public void U(h76 h76, String str, v0 v0Var) {
        this.x.getSubtitleView().setVisibility(v0Var.a(h76, str, this.x.getSubtitleView()) ? 0 : 8);
    }

    public void V(String str) {
        this.x.setSubtitle(str);
    }

    public void W(boolean z2) {
        FacePileView E2 = this.x.E2();
        if (z2) {
            E2.setOnClickListener(new x(this));
        } else {
            E2.setOnClickListener(new z(this));
        }
        R(z2);
    }

    public void X(boolean z2) {
        c cVar = this.q;
        if (cVar != null) {
            cVar.a(z2);
        }
    }

    public void Y(boolean z2) {
        c cVar = this.q;
        if (cVar != null) {
            cVar.b(z2);
        }
    }

    public void Z(String str, String str2) {
        Uri uri;
        if (this.f.getResources().getBoolean(C0707R.bool.useLargerPlaylistImageResolution)) {
            uri = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.parse(str);
        } else {
            uri = !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.parse(str2);
        }
        boolean z2 = !Uri.EMPTY.equals(uri);
        this.x.getImageView().setOnClickListener(z2 ? new y(this) : null);
        Drawable drawable = this.x.getImageView().getDrawable();
        if (!z2 || drawable == null) {
            drawable = this.y;
        }
        this.x.getImageView().setTag(C0707R.id.playlist_cover_art_uri_tag, uri.toString());
        z l = this.c.l(uri);
        l.t(drawable);
        l.g(drawable);
        l.o(rwd.h(this.x.getImageView(), new a()));
    }

    public void a0(boolean z2) {
        boolean z3 = true;
        boolean z4 = z2 && this.q != null;
        if (this.u.getVisibility() != 0) {
            z3 = false;
        }
        if (z4 != z3) {
            w(z4);
        }
    }

    @Override // defpackage.ar6
    public b66 b() {
        return this.b.b();
    }

    public void b0(String str) {
        this.x.setTitle(str);
        this.r.setTitle(str);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.a.o(bundle);
    }

    public void c0(d dVar) {
        FacePileView E2 = this.x.E2();
        E2.setVisibility(0);
        E2.setFacePile(this.c, dVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.a.n(bundle);
    }

    public void d0(boolean z2) {
        this.x.F2().setVisibility(z2 ? 0 : 8);
    }

    public void e0(boolean z2) {
        this.x.getSubtitleView().setVisibility(z2 ? 0 : 8);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.a.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        return this.a.d();
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public RecyclerView getRecyclerView() {
        return this.p;
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
        return com.spotify.mobile.android.util.x.f(this.f) && !this.f.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.p(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public List<View> o(LayoutInflater layoutInflater, ViewGroup viewGroup, com.spotify.android.glue.components.toolbar.d dVar) {
        c cVar;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(C0707R.layout.vanilla_playlist_header, viewGroup, false);
        this.s = coordinatorLayout;
        this.p = (RecyclerView) coordinatorLayout.findViewById(C0707R.id.recycler_view);
        this.t = (AppBarLayout) this.s.findViewById(C0707R.id.header_view);
        this.u = (ViewGroup) this.s.findViewById(C0707R.id.accessory);
        this.p.setLayoutManager(new LinearLayoutManager(this.f));
        this.p.k(this.z, -1);
        if (this.b.a()) {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.s.findViewById(C0707R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.setRecyclerView(this.p);
            recyclerViewFastScroller.setEnabled(true);
            this.p.setVerticalScrollBarEnabled(false);
        }
        com.spotify.android.goldenpath.a.b(this.f);
        this.r = dVar.R();
        boolean z2 = this.f.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader);
        this.r.o(0.0f);
        if (!this.b.d() || !z2) {
            w(false);
        } else {
            if (this.b.b().d()) {
                cVar = this.n.a(this.f);
            } else {
                cVar = this.n.b(com.spotify.android.paste.app.c.g().a(this.f));
            }
            cVar.setOnClickListener(new b0(this));
            this.u.addView(cVar.getView());
            this.q = cVar;
            w(true);
        }
        n0 n0Var = new n0(this.f, this.t, this.b.e());
        this.x = n0Var;
        View view = n0Var.getView();
        this.t.addView(view);
        this.t.a(new e0(this, view));
        this.y = yc0.f(this.f);
        this.x.getImageView().setImageDrawable(this.y);
        this.x.F2().setOnClickListener(new v(this));
        x G2 = this.x.G2();
        this.w = G2;
        if (G2 != null) {
            G2.setOnOwnerClickListener(new u(this));
            this.w.getInfoPageIconFacePileView().getClass();
            d a2 = d.a(ImmutableList.of(com.spotify.libs.facepile.c.a(null, "", 0)));
            FacePileView E2 = this.x.E2();
            E2.setVisibility(0);
            E2.setFacePile(this.c, a2);
        }
        if (this.v.isPresent()) {
            this.t.i(this.v.get().booleanValue(), false);
            this.v = Optional.absent();
        }
        return Collections.singletonList(this.s);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.q();
    }

    public void y(int i) {
        this.p.post(new w(this, i));
    }

    public void z() {
        FacePileView E2 = this.x.E2();
        E2.setVisibility(8);
        E2.setFacePile(this.c, d.a(ImmutableList.of()));
    }
}
