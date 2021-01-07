package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.protobuf.u;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.inappmessaging.display.n;
import com.spotify.inappmessaging.m;
import com.spotify.messages.InAppMessagingErrorEvent;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.C0707R;
import com.spotify.music.features.quicksilver.utils.g;
import com.spotify.remoteconfig.c6;
import defpackage.b28;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.List;

/* renamed from: s18  reason: default package */
public class s18 implements hy7 {
    private final m a;
    private final c6 b;
    private final c18 c;
    private final v08 d;
    private final q08 e;
    private final h28 f;
    private final SpSharedPreferences<Object> g;
    private final rp0 h;
    private final Activity i;
    private final e18 j;
    private final q18 k;
    private final gl0<u> l;
    private final n18 m;
    private final b28 n;
    private final io.reactivex.disposables.a o = new io.reactivex.disposables.a();
    private b p = EmptyDisposable.INSTANCE;

    /* access modifiers changed from: package-private */
    /* renamed from: s18$a */
    public class a implements b28.a {
        a() {
        }

        @Override // defpackage.b28.a
        public void start() {
            s18.b(s18.this);
        }

        @Override // defpackage.b28.a
        public void stop() {
            s18.this.g();
        }
    }

    public s18(m mVar, c6 c6Var, c18 c18, v08 v08, q08 q08, h28 h28, SpSharedPreferences<Object> spSharedPreferences, rp0 rp0, Activity activity, e18 e18, q18 q18, gl0<u> gl0, n18 n18, b28 b28) {
        this.a = mVar;
        this.b = c6Var;
        this.c = c18;
        this.d = v08;
        this.e = q08;
        this.f = h28;
        this.g = spSharedPreferences;
        this.h = rp0;
        this.i = activity;
        this.j = e18;
        this.k = q18;
        this.l = gl0;
        this.m = n18;
        this.n = b28;
    }

    static void b(s18 s18) {
        if (s18.b.a() && !s18.m.a()) {
            m mVar = s18.a;
            List<FormatType> b2 = s18.j.b();
            List<ActionType> a2 = s18.j.a();
            List<TriggerType> e2 = s18.j.e();
            SpSharedPreferences<Object> spSharedPreferences = s18.g;
            SpSharedPreferences.b<Object, Boolean> bVar = g.a;
            mVar.b(b2, a2, e2, spSharedPreferences.d(bVar, false));
            s18.p = s18.k.a().subscribe(new oz7(s18));
            if (s18.j.b().contains(FormatType.FULLSCREEN)) {
                s18.o.b(s18.a.d().Q(nz7.a).subscribe(s18.c, new kz7(s18)));
            }
            if (s18.j.b().contains(FormatType.CARDS)) {
                s18.o.b(s18.a.d().Q(mz7.a).subscribe(s18.d, new kz7(s18)));
            }
            if (s18.j.b().contains(FormatType.BANNERS)) {
                s18.o.b(s18.a.d().Q(lz7.a).subscribe(s18.e, new kz7(s18)));
            }
            if (s18.j.b().contains(FormatType.NOTES)) {
                s18.o.b(s18.a.d().Q(jz7.a).subscribe(s18.f, new kz7(s18)));
            }
            if (s18.g.d(g.b, false)) {
                s18.h.b((ViewGroup) s18.i.findViewById(C0707R.id.preview_container), s18.g.d(bVar, false));
            }
        }
    }

    public static void e(s18 s18, Throwable th) {
        s18.g();
        InAppMessagingErrorEvent.b l2 = InAppMessagingErrorEvent.l();
        l2.m(th.toString());
        l2.n(th.getMessage());
        s18.l.c(l2.build());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void g() {
        if (this.b.a() && !this.m.a()) {
            this.a.stop();
            this.o.f();
            if (!this.p.d()) {
                this.p.dispose();
            }
            this.h.c((ViewGroup) this.i.findViewById(C0707R.id.preview_container));
        }
    }

    @Override // defpackage.hy7
    public void a() {
        this.n.r(this.i.getLocalClassName(), new a());
    }

    /* access modifiers changed from: package-private */
    public n d(FormatType formatType) {
        int ordinal = formatType.ordinal();
        if (ordinal == 0) {
            return this.d;
        }
        if (ordinal == 1) {
            return this.c;
        }
        if (ordinal == 2) {
            return this.e;
        }
        if (ordinal != 3) {
            return new n.b();
        }
        return this.f;
    }

    public /* synthetic */ void f(u3 u3Var) {
        this.a.c().a(u3Var.a, u3Var.b);
    }
}
