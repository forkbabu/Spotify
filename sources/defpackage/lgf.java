package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;

/* renamed from: lgf  reason: default package */
public final class lgf implements g<jff, hff> {
    private final vff a;
    private final ViewGroup b;
    private final View c;
    private final View f;
    private final View n;
    private final jff o;
    private final uff p;
    private final chf q;
    private zte r;
    private View s;
    private View t;
    private da2<hff> u;

    /* renamed from: lgf$a */
    class a implements h<jff> {
        final /* synthetic */ View a;
        final /* synthetic */ View.OnClickListener b;
        final /* synthetic */ View.OnClickListener c;
        final /* synthetic */ View d;
        final /* synthetic */ View e;
        final /* synthetic */ View f;
        final /* synthetic */ View g;

        a(View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View view2, View view3, View view4, View view5) {
            this.a = view;
            this.b = onClickListener;
            this.c = onClickListener2;
            this.d = view2;
            this.e = view3;
            this.f = view4;
            this.g = view5;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            jff jff = (jff) obj;
            lgf.this.b.removeAllViews();
            lgf.this.b.addView(lgf.b(lgf.this, jff));
            this.a.setOnClickListener(jff.e() ? this.b : this.c);
            lgf.this.s.setOnClickListener(new zff(this, jff));
            lgf.this.t.setOnClickListener(new agf(this, jff));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            lgf.this.r = null;
            this.d.setOnClickListener(null);
            this.e.setOnClickListener(null);
            this.f.setOnClickListener(null);
            this.g.setOnClickListener(null);
            this.a.setOnClickListener(null);
            lgf.this.s.setOnClickListener(null);
            lgf.this.t.setOnClickListener(null);
        }
    }

    public lgf(View view, LayoutInflater layoutInflater, jff jff, vff vff, uff uff) {
        this.a = vff;
        this.p = uff;
        this.o = jff;
        ViewGroup viewGroup = (ViewGroup) view;
        this.b = viewGroup;
        View inflate = layoutInflater.inflate(C0707R.layout.item_voice_onboarding_enable_wake_word, viewGroup, false);
        this.f = inflate;
        View inflate2 = layoutInflater.inflate(C0707R.layout.item_voice_onboarding_mic_permission, viewGroup, false);
        this.c = inflate2;
        View inflate3 = layoutInflater.inflate(C0707R.layout.item_voice_onboarding_tutorial_wake_word, viewGroup, false);
        this.n = inflate3;
        this.r = zte.b(layoutInflater, viewGroup, false);
        if (jff.i()) {
            ((TextView) q4.G(inflate2, 16908308)).setText(C0707R.string.mic_description_hey_spotify);
            q4.G(inflate2, 16908314).setVisibility(8);
        }
        if (jff.c()) {
            this.r.b.setText(C0707R.string.bubble_play_suggestion_expansion_one);
            this.r.c.setText(C0707R.string.bubble_play_suggestion_expansion_two);
            this.r.d.setText(C0707R.string.bubble_play_suggestion_expansion_three);
        }
        int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(C0707R.dimen.std_72dp);
        zte zte = this.r;
        chf chf = new chf(dimensionPixelSize, inflate.findViewById(16908327), inflate.findViewById(16908314), inflate.findViewById(16908313), inflate2.findViewById(16908327), inflate2.findViewById(16908313), inflate2.findViewById(16908314), inflate3.findViewById(16908313), zte.f, zte.e);
        this.q = chf;
        BottomSheetBehavior.o(view).i(chf);
    }

    static View b(lgf lgf, jff jff) {
        lgf.getClass();
        if (jff.i()) {
            if (jff.e() || jff.h()) {
                if (jff.e() && jff.h()) {
                    lgf.a.x();
                    return lgf.n;
                } else if (jff.e()) {
                    lgf.a.A();
                    lgf.q.c(new dgf(lgf));
                    return lgf.f;
                } else {
                    lgf.q.c(new cgf(lgf));
                    lgf.a.i();
                    return lgf.c;
                }
            } else {
                lgf.a.e();
                lgf.q.c(new bgf(lgf));
                return lgf.f;
            }
        } else if (jff.g()) {
            lgf.a.o();
            lgf.q.c(new fgf(lgf));
            return lgf.c;
        } else {
            lgf.a.l();
            lgf.q.c(new jgf(lgf));
            return lgf.r.a();
        }
    }

    public /* synthetic */ void i(da2 da2, View view) {
        this.a.q();
        da2.accept(hff.c());
    }

    public /* synthetic */ void j(da2 da2, View view) {
        if (this.o.e()) {
            this.a.z();
        } else {
            this.a.d();
        }
        da2.accept(hff.i());
    }

    public /* synthetic */ void k(da2 da2, View view) {
        this.a.j();
        da2.accept(hff.a());
    }

    public /* synthetic */ void l(da2 da2, View view) {
        this.a.k();
        da2.accept(hff.i());
    }

    public /* synthetic */ void m(da2 da2, View view) {
        if (this.o.i()) {
            this.a.g();
        } else {
            this.a.m();
        }
        this.a.r();
        da2.accept(hff.g());
    }

    public /* synthetic */ void n(da2 da2, View view) {
        if (this.o.i()) {
            this.a.h();
        } else {
            this.a.n();
        }
        da2.accept(hff.i());
    }

    public /* synthetic */ void o(da2 da2, View view) {
        if (this.o.e()) {
            this.a.y();
        } else {
            this.a.c();
        }
        da2.accept(hff.b());
    }

    public /* synthetic */ void p() {
        this.a.v();
    }

    public /* synthetic */ void q() {
        this.a.u();
    }

    public /* synthetic */ void r() {
        this.a.w();
    }

    public /* synthetic */ void s() {
        this.a.t();
    }

    @Override // com.spotify.mobius.g
    public h<jff> t(da2<hff> da2) {
        this.u = da2;
        egf egf = new egf(this, da2);
        yff yff = new yff(this, da2);
        View G = q4.G(this.n, 16908313);
        G.setOnClickListener(egf);
        this.r.e.setOnClickListener(new ggf(this, da2));
        this.r.f.setOnClickListener(new hgf(this, da2));
        View G2 = q4.G(this.c, 16908313);
        G2.setOnClickListener(new igf(this, da2));
        View G3 = q4.G(this.c, 16908327);
        G3.setOnClickListener(new xff(this, da2));
        this.p.a();
        this.s = q4.G(this.c, 16908314);
        View G4 = q4.G(this.f, 16908313);
        G4.setOnClickListener(new kgf(this, da2));
        View G5 = q4.G(this.f, 16908327);
        G5.setOnClickListener(yff);
        this.t = q4.G(this.f, 16908314);
        return new a(G5, egf, yff, G2, G4, G, G3);
    }

    public /* synthetic */ void u() {
        this.a.s();
    }
}
