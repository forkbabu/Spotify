package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import com.spotify.music.C0707R;
import com.spotify.music.share.loadingview.ShareLoadingDialogFragment;
import com.spotify.music.share.loadingview.a;
import com.spotify.music.share.logging.ShareMenuLogger;
import com.spotify.share.sharedata.t;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.functions.f;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: u0d  reason: default package */
public class u0d implements r0d, b1d, f {
    private final x6e a;
    private final a1d b;
    private final c c;
    private final t0d d;
    private final z7e e;
    private final d8e f;
    private final a g;
    private final pzc h;
    private final y i;
    private b j = io.reactivex.disposables.c.a();
    private final xzc k;
    private final ShareMenuLogger l;
    private boolean m;

    public u0d(x6e x6e, a1d a1d, c cVar, z7e z7e, d8e d8e, a aVar, t0d t0d, pzc pzc, y yVar, xzc xzc, ShareMenuLogger shareMenuLogger) {
        this.a = x6e;
        this.c = cVar;
        this.e = z7e;
        this.f = d8e;
        this.d = t0d;
        this.g = aVar;
        this.h = pzc;
        this.b = a1d;
        this.i = yVar;
        this.k = xzc;
        this.l = shareMenuLogger;
    }

    private void g(o8e o8e, int i2, String str, String str2) {
        if (o8e.id() == C0707R.id.share_app_facebook_feed || o8e.id() == C0707R.id.share_app_facebook_stories) {
            this.l.b(o8e.a(), i2, str, str2);
        } else {
            this.l.e(o8e.a(), i2, str, str2);
        }
    }

    public /* synthetic */ void a(o8e o8e, int i2, t tVar, Throwable th) {
        g(o8e, i2, tVar.g(), null);
    }

    public /* synthetic */ void b(DialogInterface dialogInterface) {
        this.j.dispose();
    }

    public /* synthetic */ d0 c(o8e o8e, int i2, t tVar) {
        return this.a.a(this.c, o8e, tVar, this.e, this.f, (long) i2).A(new j0d(tVar)).m(new g0d(this, o8e, i2, tVar));
    }

    @Override // io.reactivex.functions.f
    public void cancel() {
        this.j.dispose();
    }

    public /* synthetic */ void d(u3 u3Var, Throwable th) {
        this.m = false;
        ((DialogFragment) this.g).M4();
    }

    public /* synthetic */ void e() {
        this.m = false;
        this.d.c();
        ((DialogFragment) this.g).M4();
    }

    public /* synthetic */ void f(o8e o8e, int i2, u3 u3Var) {
        g(o8e, i2, u3Var.a, u3Var.b);
        this.d.a();
    }

    public void h(int i2) {
        this.b.a(this.h, this.e, this, this.d, (long) i2);
    }

    public void i(o8e o8e, int i2) {
        if (!this.m) {
            this.m = true;
            a aVar = this.g;
            c cVar = this.c;
            ShareLoadingDialogFragment shareLoadingDialogFragment = (ShareLoadingDialogFragment) aVar;
            shareLoadingDialogFragment.getClass();
            shareLoadingDialogFragment.Y4(cVar.v0(), ShareLoadingDialogFragment.class.getSimpleName());
            ((ShareLoadingDialogFragment) this.g).a5(new h0d(this));
            z B = new SingleDoOnDispose(this.k.a(o8e, this.h).s(new f0d(this, o8e, i2)).n(new k0d(this)), new i0d(this)).B(this.i);
            e0d e0d = new e0d(this, o8e, i2);
            t0d t0d = this.d;
            t0d.getClass();
            this.j = B.subscribe(e0d, new p0d(t0d));
        }
    }
}
