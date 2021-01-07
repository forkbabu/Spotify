package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.C0707R;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.sociallistening.facepile.FacePile;
import com.spotify.music.sociallistening.facepile.d;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.spotlets.offline.util.c;
import com.spotify.rxjava2.p;
import defpackage.h6d;
import defpackage.k6d;
import defpackage.qu0;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: n5d  reason: default package */
public class n5d implements p4d {
    private final f4d a;
    private final u7d b;
    private final x9d c;
    private final d d;
    private final y e;
    private final c f;
    private final com.spotify.player.controls.d g;
    private final q7d h;
    private final cfd i;
    private final e j;
    private final g4d k;
    private final fad l;
    private final p m = new p();
    private final Supplier<s<k6d>> n = MoreObjects.memoize(new v4d(this));
    private qu0.a o = f5d.a;
    private k6d.b p = k6d.b.a;
    private ImmutableList<Participant> q = ImmutableList.of();
    private k6d r;

    /* renamed from: n5d$a */
    protected static class a extends RecyclerView.b0 {
        final TextView C;
        final LinearLayout D;
        final TextView E;
        final LinearLayout F;
        final View G;
        final Button H;
        final FacePile I;
        final Button J;
        final Button K;
        final Button L;
        final Button M;
        final Button N;

        protected a(View view) {
            super(view);
            this.C = (TextView) view.findViewById(C0707R.id.social_listening_title);
            this.D = (LinearLayout) view.findViewById(C0707R.id.social_listening_title_container);
            this.E = (TextView) view.findViewById(C0707R.id.social_listening_subtitle);
            this.G = view.findViewById(C0707R.id.loading_view_layout);
            this.F = (LinearLayout) view.findViewById(C0707R.id.error_layout);
            TextView textView = (TextView) view.findViewById(C0707R.id.error_title);
            this.H = (Button) view.findViewById(C0707R.id.error_retry_button);
            this.I = (FacePile) view.findViewById(C0707R.id.facepile);
            this.J = (Button) view.findViewById(C0707R.id.start_session_button);
            this.K = (Button) view.findViewById(C0707R.id.see_listeners_button);
            this.L = (Button) view.findViewById(C0707R.id.scan_code_button);
            this.M = (Button) view.findViewById(C0707R.id.leave_button);
            this.N = (Button) view.findViewById(C0707R.id.end_button);
        }
    }

    public n5d(f4d f4d, u7d u7d, x9d x9d, d dVar, y yVar, c cVar, com.spotify.player.controls.d dVar2, q7d q7d, cfd cfd, e eVar, g4d g4d, fad fad) {
        this.a = f4d;
        this.b = u7d;
        this.c = x9d;
        this.d = dVar;
        this.e = yVar;
        this.f = cVar;
        this.g = dVar2;
        this.h = q7d;
        this.i = cfd;
        this.j = eVar;
        this.k = g4d;
        this.l = fad;
        dVar.Z(new r4d(this));
    }

    @Override // defpackage.p4d
    public void a(qu0.a aVar) {
        this.o = aVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i2) {
        a aVar = new a(je.G(viewGroup, C0707R.layout.social_listening, viewGroup, false));
        aVar.I.setAdapter(this.d);
        aVar.H.setOnClickListener(new b5d(this));
        aVar.J.setOnClickListener(new t4d(this));
        aVar.K.setOnClickListener(new s4d(this));
        aVar.L.setOnClickListener(new g5d(this));
        aVar.M.setOnClickListener(new d5d(this));
        aVar.N.setOnClickListener(new u4d(this));
        return aVar;
    }

    @Override // defpackage.qu0
    public int c() {
        return 1;
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{101};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i2) {
        if (b0Var instanceof a) {
            a aVar = (a) b0Var;
            aVar.I.setVisibility(this.p.d() ? 0 : 8);
            ImmutableList<Participant> i3 = this.p.i();
            if (!i3.equals(this.q)) {
                d dVar = this.d;
                Iterable transform = Collections2.transform((Iterable) i3, (Function) w4d.a);
                ImmutableList.Builder builder = new ImmutableList.Builder();
                builder.addAll(transform);
                dVar.b0(builder.build());
                this.q = i3;
            }
            aVar.G.setVisibility(this.p.g() ? 0 : 4);
            int i4 = this.i.e() ? 8388627 : 17;
            aVar.D.setGravity(i4);
            q4.J(aVar.D, true);
            aVar.E.setGravity(i4);
            if (!this.p.a()) {
                aVar.C.setText(C0707R.string.social_listening_title_multi_output_no_session);
                aVar.E.setText(C0707R.string.social_listening_subtitle_multi_output_no_session);
            } else if (this.p.e() || !this.p.l()) {
                aVar.C.setText(C0707R.string.social_listening_title_multi_output_in_session);
                aVar.E.setText(C0707R.string.social_listening_subtitle_multi_output_in_session_with_participants);
            } else {
                aVar.C.setText(C0707R.string.social_listening_title_multi_output_in_session);
                aVar.E.setText(C0707R.string.social_listening_subtitle_multi_output_in_session);
            }
            aVar.J.setVisibility(this.p.m() ? 0 : 8);
            aVar.K.setVisibility(this.p.k() ? 0 : 8);
            aVar.L.setVisibility(this.p.j() ? 0 : 8);
            aVar.M.setVisibility(this.p.f() ? 0 : 8);
            aVar.N.setVisibility(this.p.b() ? 0 : 8);
            if (!this.p.c()) {
                aVar.F.setVisibility(8);
            } else if (aVar.F.getVisibility() != 0) {
                aVar.F.setVisibility(0);
                this.c.h();
            }
            ((vt0) this.j.b()).m();
        }
    }

    public v g() {
        s<Object> sVar = e0.a;
        q4d q4d = q4d.a;
        f4d f4d = this.a;
        com.spotify.player.controls.d dVar = this.g;
        u7d u7d = this.b;
        x9d x9d = this.c;
        q7d q7d = this.h;
        g4d g4d = this.k;
        fad fad = this.l;
        y yVar = this.e;
        m f2 = i.f();
        f2.e(h6d.e.class, new s6d(g4d, x9d), yVar);
        f2.e(h6d.d.class, new n6d(fad), yVar);
        f2.e(h6d.g.class, new p6d(u7d, q7d, x9d), yVar);
        f2.e(h6d.f.class, new c7d(u7d, q7d, x9d), yVar);
        f2.e(h6d.l.class, new x6d(u7d), yVar);
        f2.e(h6d.h.class, new q6d(u7d), yVar);
        f2.e(h6d.i.class, new w6d(u7d), yVar);
        f2.e(h6d.j.class, new r6d(u7d), yVar);
        f2.e(h6d.k.class, new d7d(u7d), yVar);
        f2.h(h6d.b.class, new b7d(f4d, yVar, dVar));
        f2.d(h6d.c.class, new m6d(f4d));
        f2.d(h6d.a.class, new u6d(f4d));
        MobiusLoop.f d2 = i.c(q4d, f2.i()).b(y4d.a).d(z4d.a);
        q7d q7d2 = this.h;
        f4d f4d2 = this.a;
        MobiusLoop.f h2 = d2.h(i.a(q7d2.b(), f4d2.m().j0(k7d.a), f4d2.a().j0(p7d.a), this.f.a().j0(m7d.a)));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return sVar.q(i.e(h2, MoreObjects.firstNonNull(this.r, k6d.a), z42.l(h6d.a(false)))).N(new a5d(this));
    }

    @Override // defpackage.qu0
    public long getItemId(int i2) {
        return (long) -1869328791;
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i2) {
        return 101;
    }

    public /* synthetic */ void h(View view) {
        this.h.accept(i6d.b());
        this.c.t();
    }

    public /* synthetic */ void i(k6d k6d) {
        this.r = k6d;
    }

    public /* synthetic */ void j(View view) {
        this.h.accept(i6d.o());
        this.c.o();
    }

    public /* synthetic */ void k(View view) {
        this.h.accept(i6d.n());
        this.c.r();
    }

    public /* synthetic */ void l(View view) {
        this.h.accept(i6d.k());
        this.c.p();
    }

    public /* synthetic */ void m(View view) {
        this.h.accept(i6d.j());
        this.c.u();
    }

    public /* synthetic */ void n(View view) {
        this.h.accept(i6d.g(false));
        this.c.d();
    }

    public /* synthetic */ void o(View view) {
        this.h.accept(i6d.a(false));
        this.c.f();
    }

    public /* synthetic */ void p(k6d.b bVar) {
        this.p = bVar;
        this.o.a();
    }

    @Override // defpackage.p4d
    public void start() {
        this.m.b(this.n.get().j0(h5d.a).E().o0(this.e).subscribe(new x4d(this), e5d.a));
    }

    @Override // defpackage.p4d
    public void stop() {
        this.m.a();
    }
}
