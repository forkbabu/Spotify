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
import com.spotify.music.coverimage.CoverImageActivity;
import com.spotify.music.features.playlistentity.configuration.h;
import com.spotify.music.features.playlistentity.t;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: sb6  reason: default package */
public final class sb6 implements rb6, qb6 {
    private final nb6 a;
    private final Picasso b;
    private final Context c;
    private final c.a f;
    private final h n;
    private CoordinatorLayout o;
    private u p;
    private AppBarLayout q;
    private gb6 r;
    private ViewGroup s;
    private c t;
    private RecyclerView u;
    private Optional<Boolean> v = Optional.absent();
    private Drawable w;

    /* access modifiers changed from: package-private */
    /* renamed from: sb6$a */
    public class a extends dwd {
        a() {
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            mc0 a = lc0.a(new ColorDrawable(i), new kc0(sb6.this.c));
            AppBarLayout appBarLayout = sb6.this.q;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a);
        }
    }

    /* renamed from: sb6$b */
    class b implements f0 {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            BitmapDrawable bitmapDrawable = new BitmapDrawable(sb6.this.c.getResources(), bitmap);
            jc0 jc0 = new jc0();
            jc0.c(bitmapDrawable, new ColorDrawable(this.a));
            jc0.d(true);
            mc0 a2 = lc0.a(jc0, new kc0(sb6.this.c));
            AppBarLayout appBarLayout = sb6.this.q;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(a2);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public sb6(Picasso picasso, Context context, ob6 ob6, c.a aVar, h hVar, Optional<kb6> optional) {
        this.a = ob6.b(hVar, optional);
        this.b = picasso;
        this.c = context;
        this.f = aVar;
        this.n = hVar;
    }

    private void S(Uri uri) {
        ImageView H2 = this.r.H2();
        H2.setVisibility(0);
        boolean z = !Uri.EMPTY.equals(uri);
        this.r.H2().setOnClickListener(z ? new eb6(this) : null);
        Drawable drawable = H2.getDrawable();
        if (!z || drawable == null) {
            drawable = this.w;
        }
        this.r.H2().setTag(C0707R.id.playlist_cover_art_uri_tag, uri.toString());
        z l = this.b.l(uri);
        l.t(drawable);
        l.g(drawable);
        l.o(rwd.h(H2, new a()));
    }

    private void w(boolean z) {
        int l = nud.l(this.c, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(this.c);
        AppBarLayout appBarLayout = this.q;
        appBarLayout.setPadding(appBarLayout.getPaddingLeft(), l, this.q.getPaddingRight(), this.q.getPaddingBottom());
        int i = 0;
        this.q.setClipToPadding(false);
        ViewGroup viewGroup = this.s;
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }

    public /* synthetic */ void A(View view) {
        this.a.i();
    }

    public /* synthetic */ void B(int i) {
        this.q.i(false, false);
        RecyclerView.m layoutManager = this.u.getLayoutManager();
        if (i > -1 && layoutManager != null) {
            layoutManager.v1(i);
        }
    }

    public /* synthetic */ void C(int i) {
        this.o.post(new bb6(this, i));
    }

    public /* synthetic */ void D(View view) {
        this.a.g();
    }

    public void E(String str, String str2) {
        Uri uri;
        ImageView H2 = this.r.H2();
        H2.getClass();
        if (MoreObjects.isNullOrEmpty(str2) || !this.c.getResources().getBoolean(C0707R.bool.useLargerPlaylistImageResolution)) {
            uri = !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
        } else {
            uri = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : Uri.EMPTY;
        }
        int[] iArr = new int[2];
        H2.getLocationOnScreen(iArr);
        CoverImageActivity.X0(this.c, iArr[0], iArr[1], H2.getWidth(), H2.getHeight(), uri, this.c.getResources().getConfiguration().orientation);
    }

    public void F(boolean z) {
        AppBarLayout appBarLayout = this.q;
        if (appBarLayout != null) {
            appBarLayout.i(z, false);
        } else {
            this.v = Optional.of(Boolean.valueOf(z));
        }
    }

    public boolean G() {
        AppBarLayout appBarLayout = this.q;
        if (appBarLayout == null || appBarLayout.getHeight() - this.q.getBottom() != 0) {
            return false;
        }
        return true;
    }

    public void H(int i) {
        this.u.post(new cb6(this, i));
    }

    public void I(CharSequence charSequence) {
        this.r.B0(charSequence);
    }

    public void J(boolean z) {
        this.r.F2().setChecked(z);
    }

    public void K(String str, String str2, int i) {
        if (this.c.getResources().getBoolean(C0707R.bool.fullBleed)) {
            this.r.H2().setVisibility(4);
            b bVar = new b(i);
            this.q.setTag(bVar);
            this.b.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).o(bVar);
            return;
        }
        S(Uri.parse(str2));
    }

    public void L(String str) {
        if (this.c.getResources().getBoolean(C0707R.bool.fullBleed)) {
            this.r.I2(str);
            this.r.setTitle(null);
            return;
        }
        this.r.setTitle(str);
        this.r.I2(null);
    }

    public void M(h76 h76, String str, kb6 kb6) {
        this.r.G2().setVisibility(kb6.b(h76, str, this.r.G2()) ? 0 : 8);
    }

    public void N(String str) {
        this.r.J2(str);
    }

    public void O(boolean z) {
        c cVar = this.t;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    public void P(boolean z) {
        c cVar = this.t;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    public void Q(int i) {
        if (this.q.getBackground() == null) {
            mc0 c2 = lc0.c(this.c, i);
            AppBarLayout appBarLayout = this.q;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(c2);
        }
    }

    public void R(boolean z) {
        boolean z2 = true;
        boolean z3 = z && this.t != null;
        if (this.s.getVisibility() != 0) {
            z2 = false;
        }
        if (z3 != z2) {
            w(z3);
        }
    }

    public void T(String str, String str2) {
        Uri uri;
        if (this.c.getResources().getBoolean(C0707R.bool.useLargerPlaylistImageResolution)) {
            if (!TextUtils.isEmpty(str2)) {
                uri = Uri.parse(str2);
            } else {
                uri = Uri.parse(str);
            }
        } else if (!TextUtils.isEmpty(str)) {
            uri = Uri.parse(str);
        } else {
            uri = Uri.parse(str2);
        }
        S(uri);
    }

    public void U(String str) {
        this.r.setTitle(str);
        this.r.I2(null);
    }

    public void V(String str) {
        u uVar = this.p;
        if (uVar != null) {
            uVar.setTitle(str);
        }
    }

    public void W(boolean z) {
        this.r.F2().setVisibility(z ? 0 : 8);
    }

    public void X(boolean z) {
        this.r.G2().setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.ar6
    public b66 b() {
        return this.n.b();
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
        return this.a.b();
    }

    @Override // com.spotify.music.features.playlistentity.header.m0
    public RecyclerView getRecyclerView() {
        return this.u;
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
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(C0707R.layout.refresh_header, viewGroup, false);
        this.o = coordinatorLayout;
        this.q = (AppBarLayout) coordinatorLayout.findViewById(C0707R.id.app_bar_layout);
        this.s = (ViewGroup) this.o.findViewById(C0707R.id.accessory);
        this.u = (RecyclerView) this.o.findViewById(C0707R.id.recycler_view);
        gb6 gb6 = new gb6(this.c, this.q);
        this.r = gb6;
        this.q.addView(gb6.getView());
        com.spotify.android.goldenpath.a.b(this.c);
        u R = dVar.R();
        this.p = R;
        R.o(0.0f);
        this.q.a(new za6(this));
        this.u.setLayoutManager(new LinearLayoutManager(this.c));
        if (this.n.a()) {
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.o.findViewById(C0707R.id.recycler_view_fast_scroll);
            recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
            recyclerViewFastScroller.setRecyclerView(this.u);
            recyclerViewFastScroller.setEnabled(true);
            this.u.setVerticalScrollBarEnabled(false);
        }
        this.w = yc0.f(this.c);
        this.r.H2().setImageDrawable(this.w);
        this.r.F2().setOnClickListener(new db6(this));
        boolean z = this.c.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader);
        if (!this.n.d() || !z) {
            w(false);
        } else {
            c a2 = this.f.a(this.c);
            this.s.addView(a2.getView());
            a2.setOnClickListener(new ab6(this));
            this.t = a2;
            w(true);
        }
        if (this.v.isPresent()) {
            this.q.i(this.v.get().booleanValue(), false);
            this.v = Optional.absent();
        }
        return Collections.singletonList(this.o);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.a.m();
    }

    public /* synthetic */ void y(AppBarLayout appBarLayout, int i) {
        int abs = Math.abs(i);
        float f2 = (float) abs;
        float min = Math.min(f2 / ((float) this.r.E2().getHeight()), 1.0f);
        this.r.e0(abs, min);
        this.r.H2().setTranslationY(f2);
        this.p.o(min);
    }

    public /* synthetic */ void z(View view) {
        this.a.h();
    }
}
