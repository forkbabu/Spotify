package com.spotify.mobile.android.hubframework.defaults.view;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.LegacyHeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.paste.app.d;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import defpackage.q61;

/* access modifiers changed from: package-private */
public class f extends r51 {
    private final Context a;
    private final ViewGroup b;
    private final GlueHeaderLayout c;
    private final GridLayoutManager d;
    private final b e;
    private final RecyclerView f;
    private final RecyclerView g;
    private final HubsGlueViewBinderFactories.HeaderPolicy h;
    private final Fragment i;
    private q61 j;
    private final boolean k;
    private final boolean l;
    private final int m;
    private final int n;
    private b91 o = HubsImmutableViewModel.EMPTY;

    class a implements q61.e {
        final /* synthetic */ q61 a;

        a(q61 q61) {
            this.a = q61;
        }

        @Override // defpackage.q61.e
        public void a() {
            f fVar = f.this;
            f.N(fVar, this.a.e(fVar.c));
            f.O(f.this, this.a.d().a());
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!f.this.c.D()) {
                f.this.c.A(false);
            }
        }
    }

    static final class c implements HubsGlueViewBinderFactories.e {
        private final HubsGlueViewBinderFactories.f b;
        private final m c;
        private final com.spotify.music.libs.viewuri.c d;

        private c(HubsGlueViewBinderFactories.f fVar, m mVar, com.spotify.music.libs.viewuri.c cVar) {
            this.b = fVar;
            this.c = mVar;
            this.d = cVar;
        }

        static c c(HubsGlueViewBinderFactories.f fVar, m mVar, com.spotify.music.libs.viewuri.c cVar) {
            return new c(fVar, mVar, cVar);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.e
        public e61 a(Context context, w51 w51) {
            return b(context, w51, HubsGlueViewBinderFactories.e.a);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.e
        public e61 b(Context context, w51 w51, RecyclerView.q qVar) {
            return new f(context, w51, this.c, this.b, this.d, qVar, null);
        }
    }

    f(Context context, w51 w51, m mVar, HubsGlueViewBinderFactories.f fVar, com.spotify.music.libs.viewuri.c cVar, RecyclerView.q qVar, e eVar) {
        fVar.getClass();
        context.getClass();
        this.a = context;
        HubsGlueViewBinderFactories.HeaderPolicy d2 = fVar.d();
        d2.getClass();
        this.h = d2;
        Fragment a2 = fVar.a();
        this.i = a2;
        boolean z = a2 != null && ToolbarConfig.e(context, a2);
        this.k = z;
        this.l = fVar.c();
        RecyclerView D = r51.D(context);
        this.f = D;
        D.setId(C0707R.id.glue_header_layout_recycler);
        GridLayoutManager create = mVar.create();
        this.d = create;
        this.n = create.C2();
        D.setLayoutManager(create);
        qVar.getClass();
        D.n(qVar);
        RecyclerView E = r51.E(context);
        this.g = E;
        E.setId(C0707R.id.hub_glue_header_layout_overlays);
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context, null);
        this.c = glueHeaderLayout;
        glueHeaderLayout.setFakeActionBarWhenNoHeader(z);
        glueHeaderLayout.z(D);
        P();
        this.e = new b(w51);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(C0707R.id.hub_glue_header_layout_container);
        frameLayout.addView(glueHeaderLayout, -1, -1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z) {
            int c2 = d.c(context);
            this.m = c2;
            layoutParams.topMargin = c2;
        } else {
            this.m = 0;
        }
        frameLayout.addView(E, layoutParams);
        k b2 = fVar.b();
        if (b2 != null) {
            b2.y0(new e(this, cVar));
        }
    }

    static void N(f fVar, View view) {
        if (!fVar.Q()) {
            fVar.P();
        } else if (fVar.c.C(true) != view) {
            String str = "";
            String str2 = (String) x.n(fVar.o.title(), str);
            fVar.c.setToolbarUpdater(l70.k(fVar.a));
            fVar.c.setTitle(str2);
            if (view != null && view.getId() == -1) {
                view.setId(C0707R.id.glue_header_layout_header);
            }
            if (view instanceof GlueHeaderView) {
                fVar.c.G((GlueHeaderView) view, new GlueHeaderBehavior(), false);
                fVar.c.setFakeActionBarWhenNoHeader(false);
            } else if (view instanceof PrettyHeaderView) {
                PrettyHeaderView prettyHeaderView = (PrettyHeaderView) view;
                u k2 = l70.k(fVar.a);
                int c2 = fVar.k ? d.c(prettyHeaderView.getContext()) : 0;
                prettyHeaderView.setHasFixedSize(true);
                prettyHeaderView.setTopPadding(c2);
                prettyHeaderView.setToolbarUpdater(k2);
                s81 header = fVar.o.header();
                header.getClass();
                String title = header.text().title();
                if (title != null) {
                    str = title;
                }
                prettyHeaderView.setTitle(str);
                k2.setTitle(str2);
                fVar.c.G(prettyHeaderView, new LegacyHeaderBehavior(), false);
                fVar.c.setFakeActionBarWhenNoHeader(false);
            } else if (view instanceof GlueHeaderViewV2) {
                fVar.c.G((GlueHeaderViewV2) view, new GlueHeaderV2Behavior(), false);
                fVar.c.setFakeActionBarWhenNoHeader(false);
            } else {
                fVar.P();
            }
        }
    }

    static void O(f fVar, s81 s81) {
        boolean z = x.f(fVar.a) && fVar.l;
        if (z || !fVar.Q()) {
            fVar.c.setAccessory(null);
            if (z) {
                Fragment fragment = fVar.i;
                if (fragment != null) {
                    fragment.u4(true);
                    androidx.fragment.app.c B2 = fVar.i.B2();
                    if (B2 != null) {
                        B2.invalidateOptionsMenu();
                        return;
                    }
                    return;
                }
                Context context = fVar.a;
                if (context instanceof Activity) {
                    ((Activity) context).invalidateOptionsMenu();
                    return;
                }
                return;
            }
            return;
        }
        GlueHeaderLayout glueHeaderLayout = fVar.c;
        glueHeaderLayout.F(fVar.e.b(s81, glueHeaderLayout), true);
    }

    private void P() {
        this.c.G(new GlueNoHeaderView(this.a), new GlueNoHeaderBehavior(), true);
        this.c.setFakeActionBarWhenNoHeader(this.k);
    }

    private boolean Q() {
        if (this.o.header() == null) {
            return false;
        }
        if (this.h.ordinal() != 0) {
            return x.h(this.a);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.g;
    }

    @Override // defpackage.e61
    public View b() {
        return this.b;
    }

    @Override // defpackage.r51, defpackage.e61
    public Parcelable e() {
        RecyclerView.m layoutManager = this.f.getLayoutManager();
        layoutManager.getClass();
        Parcelable i1 = layoutManager.i1();
        RecyclerView.m layoutManager2 = this.g.getLayoutManager();
        layoutManager2.getClass();
        return new c(i1, layoutManager2.i1(), this.c.onSaveInstanceState(), HubsGlueViewBinderFactories.a(this.f));
    }

    @Override // defpackage.r51, defpackage.e61
    public void f(Parcelable parcelable) {
        if (parcelable instanceof c) {
            c cVar = (c) parcelable;
            RecyclerView.m layoutManager = this.f.getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(cVar.a);
            RecyclerView.m layoutManager2 = this.g.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(cVar.b);
            Parcelable parcelable2 = cVar.c;
            if (parcelable2 != null) {
                this.c.onRestoreInstanceState(parcelable2);
            }
            if (cVar.f) {
                this.c.post(new b());
            }
        }
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        this.j = q61;
        q61.i(new a(q61));
    }

    @Override // defpackage.r51, defpackage.e61
    public void n(int... iArr) {
        if (iArr.length > 0) {
            if (iArr[0] == 0) {
                this.c.E(false);
            } else {
                this.c.A(false);
            }
        }
        super.n(iArr);
    }

    @Override // defpackage.r51, defpackage.e61
    public void s(b91 b91) {
        b91.getClass();
        this.o = b91;
        r51.H(this.g, b91.overlays().size() > 0);
        if (this.c.D()) {
            this.d.J2(Math.max(2, this.n / 3));
        } else {
            this.d.J2(this.n);
        }
    }
}
