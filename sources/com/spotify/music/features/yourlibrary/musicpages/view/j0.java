package com.spotify.music.features.yourlibrary.musicpages.view;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.gradients.factory.GlueGradients;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.paste.app.d;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;
import com.spotify.music.features.yourlibrary.musicpages.view.h0;
import java.util.List;

public class j0 implements g<MusicPagesModel, s0> {
    private View A;
    private c1 B;
    private final CoordinatorLayout a;
    private final ViewGroup b;
    private final e1 c;
    private final AppBarLayout f;
    private final h0 n;
    private final d1 o;
    private final Context p;
    private final LockableBehavior q;
    private final ViewGroup r;
    private final c.a s;
    private final int t;
    private final int u;
    private View v;
    private boolean w = false;
    private final MusicPagesLogger x;
    private boolean y;
    private List<fb9> z;

    class a extends AppBarLayout.Behavior.a {
        a(j0 j0Var) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.a
        public boolean a(AppBarLayout appBarLayout) {
            return false;
        }
    }

    class b implements h<MusicPagesModel> {
        private c a;
        private String b = "";
        private boolean c;
        final /* synthetic */ u d;
        final /* synthetic */ da2 e;

        b(u uVar, da2 da2) {
            this.d = uVar;
            this.e = da2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            if (!this.c) {
                j0.a(j0.this, this.d, this.e, musicPagesModel);
                this.c = true;
            }
            String r = musicPagesModel.m().r();
            if (!r.equals(this.b)) {
                this.b = r;
                this.d.setTitle(r);
                if (j0.this.B != null) {
                    j0.this.B.setTitle(r);
                }
            }
            f0 f0Var = new f0(musicPagesModel.u(), musicPagesModel.l(), true ^ musicPagesModel.n());
            if (!f0Var.equals(this.a)) {
                this.a = f0Var;
                j0.e(j0.this, this.d, this.e, f0Var);
            }
            j0.this.z = musicPagesModel.f();
            j0.this.y = musicPagesModel.u();
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            if (j0.this.A != null) {
                j0.this.A.setOnClickListener(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public abstract MusicPagesModel.LoadingState b();

        /* access modifiers changed from: package-private */
        public abstract boolean c();
    }

    public j0(CoordinatorLayout coordinatorLayout, h0 h0Var, d1 d1Var, ViewGroup viewGroup, e1 e1Var, c.a aVar, MusicPagesLogger musicPagesLogger) {
        this.a = coordinatorLayout;
        this.b = viewGroup;
        this.c = e1Var;
        this.s = aVar;
        this.x = musicPagesLogger;
        AppBarLayout appBarLayout = (AppBarLayout) coordinatorLayout.findViewById(C0707R.id.header_view);
        this.f = appBarLayout;
        LockableBehavior lockableBehavior = (LockableBehavior) ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).c();
        this.q = lockableBehavior;
        lockableBehavior.x(new a(this));
        this.n = h0Var;
        this.o = d1Var;
        this.r = (ViewGroup) coordinatorLayout.findViewById(C0707R.id.accessory);
        Context context = coordinatorLayout.getContext();
        this.p = context;
        this.t = com.spotify.android.goldenpath.a.f(context);
        this.u = d.b(context);
    }

    static void a(j0 j0Var, u uVar, da2 da2, MusicPagesModel musicPagesModel) {
        Context context = j0Var.a.getContext();
        boolean z2 = !musicPagesModel.n();
        if (musicPagesModel.m().l() != PageAction.NO_ACTION) {
            AppBarLayout appBarLayout = j0Var.f;
            com.spotify.music.features.yourlibrary.musicpages.pages.u m = musicPagesModel.m();
            mc0 b2 = lc0.b(context, GlueGradients.Style.AQUATIC);
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(b2);
            c1 c1Var = new c1(context, appBarLayout);
            c1Var.getView().setTag(C0707R.id.glue_viewholder_tag, c1Var);
            j0Var.B = c1Var;
            AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
            View view = j0Var.B.getView();
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
            layoutParams.a(1);
            j0Var.f.removeAllViews();
            j0Var.f.addView(view, layoutParams);
            j0Var.B.setTitle(m.r());
            uVar.o(0.0f);
            b bVar = new b(da2, j0Var.x.M(j0Var.z, j0Var.y));
            if (m.l() != PageAction.SHUFFLE_PLAY || !j0Var.c.y()) {
                j0Var.n.getClass();
                h0.a aVar = new h0.a(LayoutInflater.from(context).inflate(C0707R.layout.your_library_music_button_primary_row, (ViewGroup) appBarLayout.getRootView(), false));
                aVar.getView().setTag(C0707R.id.glue_viewholder_tag, aVar);
                Button l = aVar.l();
                l.setText(m.m());
                l.setOnClickListener(bVar);
                j0Var.A = l;
                j0Var.r.addView(aVar.getView());
            } else {
                com.spotify.libs.glue.custom.playbutton.c a2 = j0Var.s.a(context);
                a2.b(!j0Var.c.k());
                View view2 = a2.getView();
                j0Var.A = view2;
                view2.setOnClickListener(bVar);
                j0Var.r.addView(j0Var.A);
            }
            j0Var.r.setVisibility(0);
            j0Var.v = j0Var.f.findViewById(C0707R.id.title);
        }
        if (musicPagesModel.u()) {
            j0Var.h(false);
            if (z2) {
                j0Var.i();
                return;
            }
            return;
        }
        boolean z3 = !musicPagesModel.e().isPresent() || musicPagesModel.e().get().booleanValue();
        j0Var.w = true;
        j0Var.f.i(z3, false);
    }

    static void e(j0 j0Var, u uVar, da2 da2, c cVar) {
        j0Var.getClass();
        boolean c2 = cVar.c();
        MusicPagesModel.LoadingState b2 = cVar.b();
        boolean a2 = cVar.a();
        j0Var.g(true);
        if (b2 == MusicPagesModel.LoadingState.LOADED_EMPTY) {
            j0Var.b.setVisibility(8);
            j0Var.i();
            j0Var.h(false);
            uVar.o(1.0f);
        } else if (b2 == MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_FILTER || b2 == MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER) {
            j0Var.i();
            j0Var.h(false);
            uVar.o(1.0f);
        } else if (c2) {
            if (a2) {
                j0Var.i();
            } else {
                j0Var.l();
            }
            j0Var.h(true);
        } else if (b2 == MusicPagesModel.LoadingState.LOADED || b2 == MusicPagesModel.LoadingState.LOADED_PARTIALLY) {
            if (!(j0Var.f.getVisibility() == 0)) {
                j0Var.l();
                j0Var.f.setVisibility(0);
                j0Var.f.i(true, true);
                j0Var.q.B(false);
                k(j0Var.b, j0Var.u);
            }
            uVar.o(0.0f);
            j0Var.f.a(new a(j0Var, uVar, da2));
            AppBarLayout appBarLayout = j0Var.f;
            mc0 b3 = lc0.b(appBarLayout.getContext(), GlueGradients.Style.AQUATIC);
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            appBarLayout.setBackground(b3);
        }
        j0Var.o.a(c2);
    }

    private void g(boolean z2) {
        int i;
        if (!z2) {
            i = (this.b.getHeight() + this.t) - this.b.getPaddingTop();
        } else {
            i = this.t + this.u + nud.q(32.0f, this.p.getResources());
        }
        k(this.f, i);
        this.f.setClipToPadding(false);
    }

    private void h(boolean z2) {
        k(this.b, this.t);
        this.f.setVisibility(4);
        this.f.i(false, z2);
        this.q.B(true);
    }

    private void i() {
        this.r.setVisibility(8);
        this.f.setMinimumHeight(0);
        g(false);
    }

    private static void k(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    private void l() {
        this.r.setVisibility(0);
        this.f.setMinimumHeight(this.b.getHeight());
        g(true);
    }

    public void j(u uVar, da2 da2, AppBarLayout appBarLayout, int i) {
        int totalScrollRange = this.f.getTotalScrollRange();
        int abs = Math.abs(i);
        float f2 = (float) abs;
        this.B.e0(abs, f2 / ((float) totalScrollRange));
        this.B.getView().setTranslationY(f2);
        View view = this.A;
        view.getClass();
        int height = view.getHeight();
        int height2 = this.v.getHeight();
        int i2 = height / 2;
        uVar.o(((float) Math.max(0, (abs - height2) + i2)) / ((float) ((totalScrollRange - height2) + i2)));
        if (this.w) {
            da2.accept(s0.e(abs));
        }
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        return new b(l70.k(this.a.getContext()), da2);
    }
}
