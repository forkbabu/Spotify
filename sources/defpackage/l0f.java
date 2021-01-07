package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.b;
import androidx.transition.Transition;
import androidx.transition.u;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.spotify.mobile.android.util.d0;
import com.spotify.mobius.g;
import com.spotify.music.C0707R;
import com.spotify.voice.experience.view.listening.ListeningView;
import com.spotify.voice.results.impl.view.c;
import com.spotify.voice.results.model.e;
import defpackage.p1f;
import defpackage.r1f;
import io.reactivex.disposables.d;
import io.reactivex.functions.h;
import io.reactivex.internal.operators.observable.z;
import io.reactivex.s;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: l0f  reason: default package */
public final class l0f implements g<q1f, vue>, k0f {
    private final Supplier<Boolean> A;
    private q1f B = q1f.a(r1f.c(), "");
    private Optional<String> C = Optional.absent();
    private c.a D;
    private int E;
    private final int F;
    private final String G;
    private final String H;
    private final d I = new d();
    private final SparseArray<Transition> J = new SparseArray<>();
    private int K;
    private final View a;
    private final ViewPager2 b;
    private final TextView c;
    private final TextView f;
    private final View n;
    private final ImageView o;
    private final AnimatorSet p;
    private final AnimatorSet q;
    private final ListeningView r;
    private final v0f s;
    private final y0f t;
    private final w0f u;
    private final h<ImageView, String, String, ng0> v;
    private final ViewGroup w;
    private final View x;
    private final ConstraintLayout y;
    private final boolean z;

    /* renamed from: l0f$a */
    class a implements com.spotify.mobius.h<q1f> {
        private boolean a = true;

        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            q1f q1f = (q1f) obj;
            l0f.this.B = q1f;
            r1f b2 = q1f.b();
            l0f.this.C = Optional.of(q1f.c());
            b2.e(new lze(this), new tze(this), new nze(this), new wze(this), new mze(this), new jze(this), new ize(this), uze.a);
        }

        public /* synthetic */ void b(r1f.d dVar) {
            if (this.a) {
                this.a = false;
                l0f.this.s.c((String) l0f.this.C.or((Optional) ""));
            }
            l0f.m(l0f.this, d0.a(dVar.j(), Locale.getDefault()));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            l0f.this.D = null;
            l0f.this.I.dispose();
            l0f.this.q.cancel();
            l0f.this.p.cancel();
            l0f.this.n.setOnClickListener(null);
            l0f.this.o.setOnClickListener(null);
            l0f.this.a.setOnClickListener(null);
            l0f.this.x.setOnClickListener(null);
        }
    }

    public l0f(ViewGroup viewGroup, v0f v0f, y0f y0f, w0f w0f, h<ImageView, String, String, ng0> hVar, boolean z2, int i, Supplier<Boolean> supplier) {
        this.w = viewGroup;
        this.v = hVar;
        View G2 = q4.G(viewGroup, C0707R.id.drag);
        this.x = G2;
        this.c = (TextView) q4.G(viewGroup, C0707R.id.title);
        ViewPager2 viewPager2 = (ViewPager2) q4.G(viewGroup, 16908298);
        this.b = viewPager2;
        this.f = (TextView) q4.G(viewGroup, C0707R.id.description);
        View G3 = q4.G(viewGroup, 16908313);
        this.n = G3;
        ImageView imageView = (ImageView) q4.G(viewGroup, 16908294);
        this.o = imageView;
        Resources resources = viewGroup.getResources();
        this.F = resources.getInteger(C0707R.integer.title_max_lines);
        int integer = resources.getInteger(17694720);
        this.G = resources.getString(C0707R.string.search_results_for);
        this.H = resources.getString(C0707R.string.try_another_request);
        this.p = y(1.0f, integer);
        this.q = y(0.0f, integer);
        ListeningView listeningView = (ListeningView) q4.G(viewGroup, C0707R.id.listeningView);
        this.r = listeningView;
        View G4 = q4.G(viewGroup, C0707R.id.floating_action_button);
        this.a = G4;
        this.s = v0f;
        this.t = y0f;
        this.u = w0f;
        this.z = z2;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup.findViewById(C0707R.id.bottom_sheet_content);
        this.y = constraintLayout;
        this.K = i;
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setPageTransformer(new com.spotify.voice.results.impl.view.d(resources));
        this.A = supplier;
        if (z2) {
            G2.setVisibility(8);
            ((Guideline) q4.G(viewGroup, C0707R.id.guideline)).setGuidelinePercent(0.75f);
            return;
        }
        chf chf = new chf(resources.getDimensionPixelSize(C0707R.dimen.std_72dp), G3, imageView, listeningView, G4);
        chf.c(new c0f(this, y0f));
        BottomSheetBehavior.o(constraintLayout).i(chf);
    }

    /* access modifiers changed from: private */
    public void K() {
        this.f.setText("");
        this.c.setMaxLines(this.F);
        this.o.setVisibility(8);
        this.r.setVisibility(0);
        this.n.setVisibility(8);
        this.b.setVisibility(8);
        this.a.setVisibility(8);
    }

    static void c(l0f l0f, Runnable runnable) {
        l0f.q.addListener(new m0f(l0f, runnable));
        l0f.q.start();
    }

    static void e(l0f l0f, String str, String str2) {
        l0f.s.g(l0f.C.or((Optional<String>) ""));
        l0f.c.setImportantForAccessibility(1);
        l0f.c.setText(str);
        l0f.f.setText(str2);
        l0f.o.setVisibility(8);
        l0f.r.d(0.0f);
        l0f.r.setVisibility(8);
        l0f.n.setVisibility(8);
        l0f.b.setVisibility(8);
        l0f.a.setVisibility(8);
    }

    static void f(l0f l0f, String str, String str2) {
        l0f.s.e();
        l0f.c.setImportantForAccessibility(1);
        l0f.c.setText(str);
        l0f.f.setText(str2);
        l0f.o.setVisibility(8);
        l0f.r.d(0.0f);
        l0f.r.setVisibility(8);
        l0f.n.setVisibility(0);
        l0f.n.setContentDescription(str);
        l0f.b.setVisibility(8);
        l0f.a.setVisibility(8);
    }

    static void g(l0f l0f, String str, String str2, int i) {
        l0f.s.f(l0f.C.or((Optional<String>) ""));
        l0f.c.setImportantForAccessibility(1);
        l0f.c.setText(str);
        l0f.f.setText(str2);
        l0f.o.setImportantForAccessibility(2);
        l0f.o.setVisibility(0);
        l0f.o.setClickable(false);
        l0f.o.setImageResource(i);
        l0f.r.d(0.0f);
        l0f.r.setVisibility(8);
        l0f.n.setVisibility(8);
        l0f.b.setVisibility(8);
        l0f.a.setVisibility(8);
    }

    static void h(l0f l0f, String str, String str2, int i, p1f p1f) {
        l0f.getClass();
        p1f.b(new e0f(l0f), new i0f(l0f), b0f.a);
        l0f.c.setImportantForAccessibility(1);
        l0f.c.setText(str);
        l0f.f.setText(str2);
        l0f.o.setImportantForAccessibility(1);
        l0f.o.setVisibility(0);
        l0f.o.setContentDescription(l0f.H);
        l0f.o.setClickable(true);
        l0f.o.setImageResource(i);
        l0f.r.d(0.0f);
        l0f.r.setVisibility(8);
        l0f.n.setVisibility(8);
        l0f.b.setVisibility(8);
        l0f.a.setVisibility(8);
    }

    static void i(l0f l0f, String[] strArr) {
        if (l0f.I.a() != null) {
            return;
        }
        if (strArr.length > 1) {
            l0f.I.b(new z(s.e0(0, 30, TimeUnit.SECONDS).o0(io.reactivex.android.schedulers.a.b()).N(new d0f(l0f, strArr))).subscribe());
            return;
        }
        l0f.q.addListener(new m0f(l0f, new a0f(l0f, strArr)));
        l0f.q.start();
    }

    static void j(l0f l0f, e eVar) {
        l0f.getClass();
        if (!(eVar.c().size() > 1)) {
            l0f.q.addListener(new m0f(l0f, new zze(l0f, eVar)));
            l0f.q.start();
            return;
        }
        b bVar = new b();
        bVar.i(l0f.y);
        bVar.l(16908298, 3, MoreObjects.isNullOrEmpty(eVar.e()) ? C0707R.id.title : C0707R.id.description, 4);
        bVar.c(l0f.y);
        List<e.a> c2 = eVar.c();
        c cVar = (c) l0f.b.getAdapter();
        if (cVar == null) {
            ViewPager2 viewPager2 = l0f.b;
            viewPager2.setAdapter(new c(viewPager2.getContext(), c2, l0f.v, l0f.D, l0f.K));
        } else {
            cVar.f0(c2);
        }
        l0f.s.i(l0f.C.or((Optional<String>) ""));
        l0f.u.a(l0f.C.or((Optional<String>) ""));
        String f2 = eVar.f();
        String e = eVar.e();
        ViewGroup viewGroup = l0f.w;
        Context context = l0f.b.getContext();
        Transition transition = l0f.J.get(C0707R.transition.voice_show_results);
        if (transition == null) {
            transition = androidx.transition.s.c(context).d(C0707R.transition.voice_show_results);
            l0f.J.put(C0707R.transition.voice_show_results, transition);
        }
        u.a(viewGroup, transition);
        l0f.c.setImportantForAccessibility(1);
        l0f.c.setText(d0.a(f2, Locale.getDefault()));
        l0f.f.setText(d0.a(e, Locale.getDefault()));
        l0f.c.setMaxLines(2);
        l0f.c.setContentDescription(String.format(l0f.G, f2));
        l0f.a.setVisibility(l0f.z ? 8 : 0);
        l0f.b.setVisibility(0);
        l0f.o.setVisibility(8);
        l0f.r.d(0.0f);
        l0f.r.setVisibility(8);
        l0f.n.setVisibility(8);
    }

    static void k(l0f l0f, String str) {
        l0f.c.setText(str);
        l0f.f.setText("");
        l0f.o.setVisibility(8);
        l0f.r.d(0.0f);
        l0f.r.setVisibility(0);
        l0f.n.setVisibility(8);
        l0f.b.setVisibility(8);
        l0f.a.setVisibility(8);
        l0f.b.h(0, false);
        l0f.K = 0;
    }

    static void m(l0f l0f, String str) {
        l0f.getClass();
        if (!MoreObjects.isNullOrEmpty(str)) {
            l0f.c.setText(str);
        }
        l0f.c.setImportantForAccessibility(2);
        l0f.K();
    }

    static void p(l0f l0f) {
        l0f.I.b(null);
        l0f.c.setText("");
        l0f.c.setImportantForAccessibility(1);
        l0f.f.setText("");
        l0f.o.setVisibility(8);
        l0f.r.d(0.0f);
        l0f.r.setVisibility(8);
        l0f.n.setVisibility(8);
        l0f.b.setVisibility(8);
        l0f.a.setVisibility(8);
    }

    private AnimatorSet y(float f2, int i) {
        AnimatorSet duration = new AnimatorSet().setDuration((long) i);
        duration.playTogether(ObjectAnimator.ofFloat(this.b, "alpha", f2), ObjectAnimator.ofFloat(this.c, "alpha", f2), ObjectAnimator.ofFloat(this.f, "alpha", f2), ObjectAnimator.ofFloat(this.n, "alpha", f2), ObjectAnimator.ofFloat(this.r, "alpha", f2), ObjectAnimator.ofFloat(this.o, "alpha", f2));
        return duration;
    }

    public /* synthetic */ void A(da2 da2, e.a aVar, int i) {
        if (!aVar.a() || aVar.f()) {
            this.s.h(this.C.or((Optional<String>) ""), aVar.h(), i);
            this.t.a(this.C.or((Optional<String>) ""), aVar.g(), i);
            da2.accept(vue.m(aVar));
        }
    }

    public void C(da2 da2, View view) {
        v0f v0f = this.s;
        this.C.or((Optional<String>) "");
        v0f.a();
        Context context = this.n.getContext();
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", context.getPackageName(), null)));
        da2.accept(vue.i());
    }

    public /* synthetic */ void D(da2 da2, View view) {
        this.s.d(this.C.or((Optional<String>) ""));
        da2.accept(vue.l());
    }

    public void E(String[] strArr, Long l) {
        this.q.addListener(new m0f(this, new a0f(this, strArr)));
        this.q.start();
    }

    public void F(y0f y0f) {
        r1f b2 = this.B.b();
        b2.getClass();
        if (b2 instanceof r1f.f) {
            this.s.j(this.C.or((Optional<String>) ""));
            y0f.b(this.C.or((Optional<String>) ""));
        }
        this.s.k(b2.toString());
    }

    public /* synthetic */ void G(p1f.c cVar) {
        this.s.l(this.C.or((Optional<String>) ""));
    }

    public /* synthetic */ void H(p1f.a aVar) {
        this.s.b(this.C.or((Optional<String>) ""));
    }

    public /* synthetic */ void I(e eVar) {
        this.c.setText(d0.a(eVar.f(), Locale.getDefault()));
        this.f.setText(d0.a(eVar.e(), Locale.getDefault()));
    }

    public void J(float f2) {
        ListeningView listeningView = this.r;
        Handler handler = listeningView.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new com.spotify.voice.experience.view.listening.b(listeningView, f2));
        }
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<q1f> t(da2<vue> da2) {
        this.D = new j0f(this, da2);
        this.n.setOnClickListener(new h0f(this, da2));
        if (this.A.get().booleanValue()) {
            this.x.setOnClickListener(new f0f(da2));
        }
        g0f g0f = new g0f(this, da2);
        this.o.setOnClickListener(g0f);
        this.a.setOnClickListener(g0f);
        return new a();
    }

    public /* synthetic */ void z(String[] strArr) {
        int i = this.E + 1;
        this.E = i;
        this.c.setText(strArr[i % strArr.length]);
        this.f.setText("");
        this.o.setVisibility(8);
        this.r.d(0.0f);
        this.r.setVisibility(0);
        this.n.setVisibility(8);
        this.b.setVisibility(8);
        this.a.setVisibility(8);
    }
}
