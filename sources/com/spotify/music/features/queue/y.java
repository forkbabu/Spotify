package com.spotify.music.features.queue;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.queue.playcontrols.QueuePlayerControlsView;
import com.spotify.music.features.queue.playcontrols.e;
import com.spotify.music.features.queue.playcontrols.f;
import com.spotify.music.features.queue.view.AddRemoveQueueView;
import com.spotify.music.libs.connect.k;
import com.spotify.music.libs.connect.o;
import com.spotify.music.nowplaying.common.view.header.TitleHeader;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.sociallistening.facepile.FacePile;
import com.spotify.music.sociallistening.facepile.d;
import com.spotify.music.sociallistening.models.b;
import com.spotify.pageloader.s0;
import com.spotify.remoteconfig.u6;
import com.spotify.rxjava2.q;
import com.squareup.picasso.Picasso;
import java.util.Collection;

public class y implements s0, d0, ws2 {
    private AddRemoveQueueView A;
    private fw7 B;
    private TitleHeader C;
    private View D;
    private final q E = new q();
    private View F;
    private Context G;
    private e H;
    private final Activity a;
    private final v b;
    private final f c;
    private final c f;
    private final b0 n;
    private final rw7 o;
    private final k p;
    private final o q;
    private final f4d r;
    private final uba s;
    private final io.reactivex.a t;
    private final nsb u;
    private final Picasso v;
    private final d w;
    private final u6 x;
    private a0 y;
    private QueuePlayerControlsView z;

    class a extends RecyclerView.q {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                y.this.y.i();
            }
        }
    }

    public y(Activity activity, v vVar, f fVar, c cVar, b0 b0Var, rw7 rw7, k kVar, o oVar, f4d f4d, uba uba, io.reactivex.a aVar, nsb nsb, Picasso picasso, d dVar, u6 u6Var) {
        this.a = activity;
        this.b = vVar;
        this.c = fVar;
        this.f = cVar;
        this.n = b0Var;
        this.o = rw7;
        this.p = kVar;
        this.q = oVar;
        this.r = f4d;
        this.s = uba;
        this.t = aVar;
        this.u = nsb;
        this.v = picasso;
        this.w = dVar;
        this.x = u6Var;
    }

    public static void l(y yVar, b bVar) {
        yVar.D.setVisibility(0);
        d dVar = yVar.w;
        Iterable transform = Collections2.transform((Iterable) ImmutableList.copyOf((Collection) bVar.d()), (Function) i.a);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.addAll(transform);
        dVar.b0(builder.build());
    }

    @Override // defpackage.ws2
    public boolean b() {
        this.y.f();
        return true;
    }

    public void c() {
        this.B.X();
    }

    public void e() {
        this.a.finish();
    }

    public void g(boolean z2) {
        this.B.Y(z2);
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.F;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.G = context;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_queue, viewGroup, false);
        this.F = inflate;
        View findViewById = inflate.findViewById(C0707R.id.facepile_container);
        this.D = findViewById;
        ((FacePile) findViewById.findViewById(C0707R.id.facepile)).setAdapter(this.w);
        this.w.Z(new m(this));
        RecyclerView recyclerView = (RecyclerView) this.F.findViewById(C0707R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.F.getContext()));
        recyclerView.setVisibility(0);
        recyclerView.n(new a());
        this.C = (TitleHeader) this.F.findViewById(C0707R.id.title_header);
        QueuePlayerControlsView queuePlayerControlsView = (QueuePlayerControlsView) this.F.findViewById(C0707R.id.player_controller);
        this.z = queuePlayerControlsView;
        queuePlayerControlsView.setVisibility(0);
        this.F.findViewById(C0707R.id.btn_close).setOnClickListener(new l(this));
        AddRemoveQueueView addRemoveQueueView = (AddRemoveQueueView) this.F.findViewById(C0707R.id.add_remove_container);
        this.A = addRemoveQueueView;
        addRemoveQueueView.setOnRemoveFromQueueListener(new o(this));
        this.A.setOnAddToQueueListener(new n(this));
        e b2 = this.c.b(this.z);
        this.H = b2;
        this.z.c(b2);
        a0 b3 = this.n.b(this.q.b(this.p.b(this.o.b(this.z.getConnectView()))));
        this.y = b3;
        b3.p(this);
        ix7 ix7 = new ix7();
        p pVar = new p(ix7);
        pVar.g(recyclerView);
        this.B = new fw7(this.b, this.y, new r(pVar), this.v, this.F.getContext(), this.x.b());
        ix7.r(this.y);
        ix7.s(this.B);
        recyclerView.setAdapter(this.B);
    }

    public void j(boolean z2) {
        this.B.b0(z2);
    }

    public void k() {
        this.z.setVisibility(0);
        this.A.setVisibility(8);
    }

    public /* synthetic */ void m(View view) {
        if (this.w.u() == 1) {
            this.s.b();
        }
    }

    public /* synthetic */ void n(View view) {
        this.y.h();
    }

    public /* synthetic */ void o(View view) {
        this.y.m();
    }

    public /* synthetic */ void p(View view) {
        this.y.e();
    }

    public /* synthetic */ boolean q(b bVar) {
        return this.x.d();
    }

    public void r(boolean z2) {
        this.A.setAddButtonVisibility(z2);
    }

    public void s(boolean z2) {
        this.A.setRemoveButtonVisibility(z2);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.y.n();
        this.B.onStart();
        this.H.d();
        this.f.c(this.C);
        this.E.a(this.t.subscribe(new a(this)));
        this.E.a(this.r.a().Q(new j(this)).subscribe(new k(this)));
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.B.onStop();
        this.z.b();
        this.y.o();
        this.H.e();
        this.f.d();
        this.E.c();
    }

    public void t() {
        if (!x.f(this.G)) {
            this.z.setVisibility(8);
        }
        this.A.setVisibility(0);
    }

    public void u() {
        this.u.a();
        this.a.finish();
    }
}
