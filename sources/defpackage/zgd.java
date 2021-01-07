package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.C0707R;
import com.spotify.music.spotlets.scannables.ScannablesException;
import com.spotify.music.spotlets.scannables.c;
import com.spotify.music.spotlets.scannables.model.IdModel;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.lang.ref.WeakReference;

/* renamed from: zgd  reason: default package */
public class zgd implements ygd {
    private final hgd a;
    private final hhd b;
    private final ghd c;
    private final g<SessionState> d;
    private final y e;
    private final y f;
    private final igd g;
    private WeakReference<com.spotify.music.spotlets.scannables.view.g> h;
    private final c i;
    private final w52 j;
    private io.reactivex.disposables.b k;
    private io.reactivex.disposables.b l;
    private final io.reactivex.disposables.a m = new io.reactivex.disposables.a();
    private final io.reactivex.functions.g<Throwable> n = new a();
    private final io.reactivex.functions.g<u3<IdModel, String>> o = new b();

    /* renamed from: zgd$a */
    class a implements io.reactivex.functions.g<Throwable> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            com.spotify.music.spotlets.scannables.view.g gVar = (com.spotify.music.spotlets.scannables.view.g) zgd.this.h.get();
            if (gVar != null) {
                gVar.h();
                if (th2 instanceof ScannablesException) {
                    gVar.g();
                } else {
                    gVar.f();
                }
            }
        }
    }

    /* renamed from: zgd$b */
    class b implements io.reactivex.functions.g<u3<IdModel, String>> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(u3<IdModel, String> u3Var) {
            u3<IdModel, String> u3Var2 = u3Var;
            com.spotify.music.spotlets.scannables.view.g gVar = (com.spotify.music.spotlets.scannables.view.g) zgd.this.h.get();
            if (gVar != null) {
                igd igd = zgd.this.g;
                F f = u3Var2.a;
                f.getClass();
                igd.d(f.getTarget());
                igd igd2 = zgd.this.g;
                F f2 = u3Var2.a;
                f2.getClass();
                String target = f2.getTarget();
                S s = u3Var2.b;
                s.getClass();
                igd2.n(target, s);
                gVar.h();
                gVar.e(u3Var2.a.getTarget());
            }
        }
    }

    public zgd(y yVar, y yVar2, g<SessionState> gVar, igd igd, hgd hgd, hhd hhd, ghd ghd, io.reactivex.disposables.b bVar, io.reactivex.disposables.b bVar2, c cVar, w52 w52) {
        this.e = yVar;
        this.f = yVar2;
        this.d = gVar;
        this.g = igd;
        this.c = ghd;
        this.b = hhd;
        this.k = bVar;
        this.l = bVar2;
        this.i = cVar;
        this.j = w52;
        this.a = hgd;
    }

    private void t(io.reactivex.functions.g<SessionState> gVar) {
        this.m.b(this.d.C(ugd.a).E().B(this.f).subscribe(gVar));
    }

    @Override // defpackage.ygd
    public void a(String str) {
        this.g.d(str);
        this.g.j(str);
    }

    @Override // defpackage.ygd
    public void b() {
        this.g.l();
    }

    @Override // defpackage.ygd
    public void c(com.spotify.music.spotlets.scannables.view.g gVar) {
        this.h = new WeakReference<>(gVar);
        this.m.b(this.l);
        this.m.b(this.k);
    }

    @Override // defpackage.ygd
    public void d() {
        this.m.f();
    }

    @Override // defpackage.ygd
    public void e(Context context) {
        t(new sgd(this, context));
    }

    @Override // defpackage.ygd
    public void f() {
        this.g.h();
    }

    @Override // defpackage.ygd
    public void g(Context context) {
        t(new ogd(this, context));
    }

    @Override // defpackage.ygd
    public void h() {
        this.g.c();
    }

    @Override // defpackage.ygd
    public void i(ContentResolver contentResolver, Uri uri) {
        this.l.dispose();
        this.b.getClass();
        io.reactivex.disposables.b subscribe = s.c0(new chd(contentResolver, uri)).o0(this.f).I0(this.e).W(new mgd(this), false, Integer.MAX_VALUE).j0(new ngd("scannables/imagePicker")).M(new tgd(this), Functions.c).o0(this.f).subscribe(this.o, this.n);
        this.l = subscribe;
        this.m.b(subscribe);
    }

    @Override // defpackage.ygd
    public void j() {
        com.spotify.music.spotlets.scannables.view.g gVar = this.h.get();
        if (gVar != null) {
            this.g.o();
            this.g.k();
            this.g.m();
            gVar.b();
        }
    }

    @Override // defpackage.ygd
    public void k(g<com.spotify.music.spotlets.scannables.model.a> gVar) {
        this.k.dispose();
        io.reactivex.disposables.b subscribe = new v(gVar).U(new rgd(this), 4).Q(lgd.a).T().P().j0(pgd.a).N(new qgd(this)).W(new mgd(this), false, Integer.MAX_VALUE).j0(new ngd("scannables/scanner")).o0(this.f).subscribe(this.o, this.n);
        this.k = subscribe;
        this.m.b(subscribe);
    }

    /* access modifiers changed from: protected */
    public s<IdModel> n(String str) {
        return this.a.a(str).P();
    }

    public /* synthetic */ void o(Context context, SessionState sessionState) {
        this.i.d(context, sessionState.currentUserName(), true);
    }

    public /* synthetic */ void p(Context context, SessionState sessionState) {
        boolean c2 = this.i.c(context, sessionState.currentUserName());
        boolean f2 = this.j.f(context, "android.permission.CAMERA");
        if (!c2 || !f2) {
            com.spotify.music.spotlets.scannables.view.g gVar = this.h.get();
            if (gVar != null) {
                gVar.c();
                return;
            }
            return;
        }
        com.spotify.music.spotlets.scannables.view.g gVar2 = this.h.get();
        if (gVar2 != null) {
            gVar2.a();
        }
    }

    public /* synthetic */ void q(String str) {
        com.spotify.music.spotlets.scannables.view.g gVar = this.h.get();
        if (gVar != null) {
            gVar.i(C0707R.string.scannables_progress_dialog_title, C0707R.string.scannables_progress_dialog_contacting_server);
            gVar.d();
        }
    }

    public /* synthetic */ void r(io.reactivex.disposables.b bVar) {
        com.spotify.music.spotlets.scannables.view.g gVar = this.h.get();
        if (gVar != null) {
            gVar.j();
            gVar.i(C0707R.string.scannables_progress_dialog_title, C0707R.string.scannables_progress_dialog_decoding);
        }
    }

    public io.reactivex.v s(com.spotify.music.spotlets.scannables.model.a aVar) {
        this.c.getClass();
        return s.c0(new bhd(aVar)).I0(this.e);
    }
}
