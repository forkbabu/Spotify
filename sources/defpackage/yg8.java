package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.transition.l;
import com.spotify.music.libs.search.transition.m;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.search.view.n;
import com.spotify.music.libs.viewuri.c;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.e61;
import defpackage.owd;

/* renamed from: yg8  reason: default package */
public class yg8 extends r51 implements nqa, wg8 {
    private final Activity a;
    private final Context b;
    private final c.a c;
    private final e d;
    private final Picasso e;
    private final ic8 f;
    private final ViewGroup g;
    private final RecyclerView h;
    private final RecyclerView i;
    private final n j;
    private final fh8 k;
    private ImageButton l;
    private final int m;
    private int n = 0;
    private nvd o;
    private ValueAnimator p;
    private String q;
    private final m r;
    private m.a s;
    private pd8 t;
    private final zab u;
    private final ViewTreeObserver.OnPreDrawListener v;
    private final owd<View> w;
    private final s98 x;

    /* renamed from: yg8$a */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            yg8.this.h.getViewTreeObserver().removeOnPreDrawListener(this);
            yg8.this.u();
            return true;
        }
    }

    /* renamed from: yg8$b */
    class b implements owd.d {
        b() {
        }

        @Override // defpackage.owd.d
        public void a(int i) {
            yg8.this.Q(i, false);
        }

        @Override // defpackage.owd.d
        public void b(Drawable drawable) {
            yg8 yg8 = yg8.this;
            yg8.Q(androidx.core.content.a.b(yg8.b, R.color.gray_15), false);
        }
    }

    /* renamed from: yg8$c */
    class c extends RecyclerView.q {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 1) {
                yg8.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void c(RecyclerView recyclerView, int i, int i2) {
            yg8.this.k.g(recyclerView, yg8.this.j.y(), i2);
            yg8 yg8 = yg8.this;
            yg8.N(yg8, recyclerView, yg8.k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: yg8$d */
    public class d implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;

        d(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            yg8.this.h.getViewTreeObserver().removeOnPreDrawListener(this);
            yg8.O(yg8.this, this.a, this.b);
            return true;
        }
    }

    /* renamed from: yg8$e */
    public interface e {
        View a();
    }

    public yg8(Activity activity, c.a aVar, String str, zab zab, boolean z, l lVar, e eVar, l.c cVar, s98 s98, Picasso picasso, com.spotify.music.libs.search.transition.n nVar, ic8 ic8, com.spotify.mobile.android.hubframework.defaults.m mVar, RecyclerView.q qVar, boolean z2, ViewGroup viewGroup) {
        int i2 = m.a;
        this.s = com.spotify.music.libs.search.transition.b.a;
        this.v = new a();
        this.w = new owd<>(new b());
        this.a = activity;
        this.c = aVar;
        this.d = eVar;
        this.x = s98;
        this.e = picasso;
        this.f = ic8;
        Context s0Var = new s0(activity, C0707R.style.res_2132083580_theme_search);
        this.b = s0Var;
        ViewGroup viewGroup2 = (ViewGroup) activity.getLayoutInflater().cloneInContext(s0Var).inflate(C0707R.layout.fragment_search_hub, viewGroup, false);
        this.g = viewGroup2;
        RecyclerView zg8 = new zg8(this, s0Var);
        zg8.setLayoutManager(mVar.create());
        zg8.setHasFixedSize(true);
        zg8.setId(C0707R.id.search_body);
        zg8.setClipToPadding(false);
        zg8.setPadding(0, activity.getResources().getDimensionPixelSize(C0707R.dimen.search_results_top_space), 0, 0);
        this.h = zg8;
        RecyclerView E = r51.E(s0Var);
        this.i = E;
        int b2 = androidx.core.content.a.b(s0Var, R.color.gray_15);
        this.m = b2;
        zg8.setItemAnimator(null);
        n nVar2 = new n(activity, (ToolbarSearchFieldView) q4.G(viewGroup2, C0707R.id.search_toolbar), z, this);
        this.j = nVar2;
        nVar2.j(str);
        nVar2.u(cVar);
        this.o = ovd.f(b2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, C0707R.id.search_toolbar);
        viewGroup2.addView(zg8, layoutParams);
        viewGroup2.addView(E, layoutParams);
        this.u = zab;
        this.k = new fh8(viewGroup2.findViewById(C0707R.id.gradient_background), b2);
        zg8.n(new c());
        if (z2) {
            zg8.n(qVar);
        }
        m a2 = nVar.a(s0Var, lVar, viewGroup2, zg8, nVar2, new lg8(this));
        this.r = a2;
        a2.b();
        ic8.e(zg8);
        ic8.e(E);
    }

    static void N(yg8 yg8, RecyclerView recyclerView, fh8 fh8) {
        yg8.getClass();
        if (recyclerView.getChildCount() != 0) {
            yg8.R().setColor(yg8.o.a(fh8.c() ? yg8.k.a() : 1.0f));
        }
    }

    static void O(yg8 yg8, int i2, boolean z) {
        ColorDrawable R = yg8.R();
        int h2 = nud.h(yg8.b, 16842836);
        nvd d2 = ovd.d(R.getColor(), i2);
        ValueAnimator valueAnimator = yg8.p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            yg8.p.cancel();
            yg8.p = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        yg8.p = ofFloat;
        ofFloat.setDuration(z ? 0 : 250);
        yg8.p.addUpdateListener(new mg8(yg8, d2, R, h2));
        yg8.p.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Q(int i2, boolean z) {
        this.n = i2;
        int a2 = ovd.a(i2, 0.4f);
        this.o = ovd.d(a2, this.m);
        this.h.getViewTreeObserver().addOnPreDrawListener(new d(a2, z));
    }

    private ColorDrawable R() {
        View x2 = this.j.x();
        if (!(x2.getBackground() instanceof ColorDrawable)) {
            ColorDrawable colorDrawable = new ColorDrawable(this.m);
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            x2.setBackground(colorDrawable);
        }
        return (ColorDrawable) x2.getBackground();
    }

    @Override // defpackage.ch8
    public void A() {
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.i;
    }

    public void P() {
        this.j.m();
    }

    public /* synthetic */ void S(nvd nvd, ColorDrawable colorDrawable, int i2, ValueAnimator valueAnimator) {
        int a2 = nvd.a(valueAnimator.getAnimatedFraction());
        colorDrawable.setColor(a2);
        this.k.h(a2, i2);
    }

    public /* synthetic */ void T() {
        this.s.a();
        this.g.post(new ng8(this));
    }

    @Override // defpackage.e61
    public View b() {
        return this.g;
    }

    @Override // defpackage.wg8
    public void c(String str, int i2) {
        this.k.d(i2);
        String str2 = this.q;
        if (str2 != null && !str.equals(str2)) {
            this.e.c(this.w);
        }
        if (!MoreObjects.isNullOrEmpty(str) && !str.equals(this.q)) {
            z m2 = this.e.m(str);
            m2.w(str);
            m2.x(fwd.b);
            m2.o(this.w);
        } else if (MoreObjects.isNullOrEmpty(str)) {
            ValueAnimator valueAnimator = this.p;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.p.cancel();
                this.p = null;
            }
            this.h.getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        this.q = str;
    }

    @Override // defpackage.i8b
    public void d() {
        View a2 = this.d.a();
        if (a2 instanceof EditText) {
            this.j.b();
            gf0.h((EditText) a2);
        }
    }

    @Override // defpackage.r51, defpackage.e61
    public Parcelable e() {
        RecyclerView.m layoutManager = this.h.getLayoutManager();
        layoutManager.getClass();
        Parcelable i1 = layoutManager.i1();
        RecyclerView.m layoutManager2 = this.i.getLayoutManager();
        layoutManager2.getClass();
        return new og8(new e61.a(i1, layoutManager2.i1()), this.j.A(), this.k.f(), this.n);
    }

    @Override // defpackage.r51, defpackage.e61
    public void f(Parcelable parcelable) {
        if (parcelable instanceof pg8) {
            pg8 pg8 = (pg8) parcelable;
            RecyclerView.m layoutManager = this.h.getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(pg8.b().a);
            RecyclerView.m layoutManager2 = this.i.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(pg8.b().b);
            this.j.z(pg8.e());
            this.k.e(pg8.a());
            if (pg8.c() != 0) {
                int c2 = pg8.c();
                this.n = c2;
                int a2 = ovd.a(c2, 0.4f);
                this.o = ovd.d(a2, this.m);
                this.h.getViewTreeObserver().addOnPreDrawListener(new ah8(this, a2));
            }
        }
    }

    @Override // defpackage.ch8
    public void g(ob8 ob8, boolean z) {
        zab zab = this.u;
        Activity activity = this.a;
        ViewGroup viewGroup = this.g;
        ob8.getClass();
        ImageButton b2 = zab.b(activity, viewGroup, new kg8(ob8));
        this.l = b2;
        b2.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.ch8
    public void j() {
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
    }

    @Override // defpackage.nqa
    public void l() {
        pd8 pd8 = this.t;
        if (pd8 != null) {
            pd8.a();
        }
    }

    @Override // defpackage.nqa
    public void m() {
        this.x.a(this.c.getViewUri());
    }

    @Override // defpackage.wg8
    public void o() {
        this.r.a();
    }

    @Override // defpackage.wg8
    public com.spotify.music.libs.search.view.l q() {
        return this.j;
    }

    @Override // defpackage.wg8
    public void r(int i2) {
        this.j.l(i2);
    }

    @Override // defpackage.wg8
    public void t(m.a aVar) {
        this.s = aVar;
    }

    @Override // defpackage.wg8
    public void u() {
        this.n = 0;
        Q(androidx.core.content.a.b(this.b, R.color.gray_15), true);
        this.k.h(0, 0);
    }

    @Override // defpackage.wg8
    public void v(pd8 pd8) {
        this.t = pd8;
    }

    @Override // defpackage.wg8
    public void x() {
        this.f.i(this.h);
        this.f.i(this.i);
    }

    @Override // defpackage.ch8
    public void y() {
        this.u.d(this.u.e(this.a, this.g), this.g, this.c, true);
    }
}
