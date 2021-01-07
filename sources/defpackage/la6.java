package defpackage;

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
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.e;
import com.spotify.music.features.playlistentity.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: la6  reason: default package */
public final class la6 implements ka6, ja6 {
    private final ga6 a;
    private final Picasso b;
    private final Context c;
    private final e f;
    private final c.a n;
    private u o;
    private CoordinatorLayout p;
    private AppBarLayout q;
    private ViewGroup r;
    private Optional<Boolean> s = Optional.absent();
    private aa6 t;
    private RecyclerView u;
    private c v;
    private Drawable w;

    /* renamed from: la6$a */
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
            BitmapDrawable bitmapDrawable = new BitmapDrawable(la6.this.c.getResources(), bitmap);
            jc0 jc0 = new jc0();
            jc0.c(bitmapDrawable, new ColorDrawable(this.a));
            jc0.d(true);
            mc0 a2 = lc0.a(jc0, new kc0(la6.this.c));
            AppBarLayout appBarLayout = la6.this.q;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a2);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    /* renamed from: la6$b */
    class b extends dwd {
        b() {
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            mc0 a = lc0.a(new ColorDrawable(i), new kc0(la6.this.c));
            AppBarLayout appBarLayout = la6.this.q;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a);
        }
    }

    public la6(Picasso picasso, Context context, ha6 ha6, c.a aVar, e eVar) {
        this.a = ha6.b(eVar);
        this.b = picasso;
        this.c = context;
        this.f = eVar;
        this.n = aVar;
    }

    private void w(boolean z) {
        int l = nud.l(this.c, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(this.c);
        int i = 0;
        if (z) {
            float f2 = (float) ((this.f.a().d() ? 6 : 0) + 24);
            this.q.setPadding(0, l, 0, nud.q(f2, this.c.getResources()));
            this.q.setClipToPadding(false);
            this.u.setPadding(0, nud.q(f2, this.c.getResources()), 0, 0);
            this.u.setClipToPadding(false);
        } else {
            this.q.setPadding(0, l, 0, 0);
            this.u.setPadding(0, 0, 0, 0);
        }
        ViewGroup viewGroup = this.r;
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public /* synthetic */ void A(View view) {
        this.a.i();
    }

    public /* synthetic */ void B(View view, aa6 aa6, AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        aa6.e0(abs, height);
        aa6.getView().setTranslationY(f2);
        this.o.o(height);
    }

    public /* synthetic */ void C(View view) {
        this.a.b();
    }

    public /* synthetic */ void D(int i) {
        this.q.i(false, false);
        RecyclerView.m layoutManager = this.u.getLayoutManager();
        if (i > -1 && layoutManager != null) {
            layoutManager.v1(i);
        }
    }

    public void E(boolean z) {
        AppBarLayout appBarLayout = this.q;
        if (appBarLayout != null) {
            appBarLayout.i(z, false);
        } else {
            this.s = Optional.of(Boolean.valueOf(z));
        }
    }

    public boolean F() {
        AppBarLayout appBarLayout = this.q;
        if (appBarLayout == null || appBarLayout.getHeight() - this.q.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public void G(boolean z) {
        aa6 aa6 = this.t;
        if (aa6 != null) {
            aa6.E2().setChecked(z);
        }
    }

    public void H(CharSequence charSequence, String str) {
        aa6 aa6 = this.t;
        if (aa6 != null) {
            aa6.B0(charSequence);
            this.t.setSubtitle(str);
        }
    }

    public void I(String str) {
        aa6 aa6 = this.t;
        if (aa6 != null) {
            aa6.G2(str);
        }
    }

    public void J(boolean z) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    public void K(boolean z) {
        c cVar = this.v;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    public void L(int i, String str, String str2) {
        if (this.c.getResources().getBoolean(C0707R.bool.fullBleed)) {
            a aVar = new a(i);
            this.q.setTag(aVar);
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            this.b.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).o(aVar);
            return;
        }
        ImageView imageView = this.t.getImageView();
        if (imageView == null) {
            imageView = new ImageView(this.c);
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = this.w;
        }
        z l = this.b.l(!TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY);
        l.t(drawable);
        l.g(drawable);
        l.o(rwd.h(imageView, new b()));
    }

    public void M(int i) {
        aa6 aa6 = this.t;
        if (aa6 != null) {
            aa6.F2(i);
        }
        if (this.q.getBackground() == null) {
            mc0 c2 = lc0.c(this.c, i);
            AppBarLayout appBarLayout = this.q;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(c2);
        }
    }

    public void N(String str) {
        aa6 aa6 = this.t;
        if (aa6 != null) {
            aa6.setTitle(str);
        }
        this.o.setTitle(str);
    }

    @Override // defpackage.ar6
    public b66 b() {
        return this.f.a();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.a.k(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.a.j(bundle);
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
        RecyclerView recyclerView = this.u;
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
        return x.f(this.c) && !this.c.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.a.l(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public List<View> o(LayoutInflater layoutInflater, ViewGroup viewGroup, d dVar) {
        c cVar;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(C0707R.layout.p2s_header, viewGroup, false);
        this.p = coordinatorLayout;
        this.u = (RecyclerView) coordinatorLayout.findViewById(C0707R.id.recycler_view);
        this.q = (AppBarLayout) this.p.findViewById(C0707R.id.header_view);
        this.r = (ViewGroup) this.p.findViewById(C0707R.id.accessory);
        this.u.setLayoutManager(new LinearLayoutManager(this.c));
        com.spotify.android.goldenpath.a.b(this.c);
        this.o = dVar.R();
        boolean z = this.c.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader);
        this.o.o(0.0f);
        if (!this.f.d() || !z) {
            w(false);
        } else {
            if (this.f.a().d()) {
                cVar = this.n.a(this.c);
            } else {
                cVar = this.n.b(com.spotify.android.paste.app.c.g().a(this.c));
            }
            cVar.setOnClickListener(new y96(this));
            this.r.addView(cVar.getView());
            this.v = cVar;
            w(true);
        }
        this.w = yc0.f(this.c);
        aa6 aa6 = new aa6(this.c, this.q);
        this.t = aa6;
        View view = aa6.getView();
        this.q.addView(view);
        this.q.a(new v96(this, view, aa6));
        if (this.f.b()) {
            aa6.E2().setVisibility(0);
            aa6.E2().setOnClickListener(new u96(this));
        }
        if (this.s.isPresent()) {
            this.q.i(this.s.get().booleanValue(), false);
            this.s = Optional.absent();
        }
        return Collections.singletonList(this.p);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.m();
    }

    public void y(int i) {
        this.u.post(new w96(this, i));
    }

    public /* synthetic */ void z(int i) {
        this.p.post(new x96(this, i));
    }
}
