package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.waze.model.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: rb2  reason: default package */
public class rb2 implements fb2 {
    private final b a;
    private io.reactivex.disposables.b b = EmptyDisposable.INSTANCE;
    private final y c;
    private final vla d;
    private s3<Boolean> e = ra2.a;

    rb2(b bVar, y yVar, vla vla) {
        this.a = bVar;
        this.c = yVar;
        this.d = vla;
    }

    public static void c(rb2 rb2, boolean z) {
        if (z) {
            rb2.d.c("waze");
        }
        rb2.e.accept(Boolean.valueOf(z));
    }

    public static void d(rb2 rb2, Throwable th) {
        rb2.getClass();
        Logger.o(th, "Error listening to the Waze model", new Object[0]);
        rb2.e.accept(Boolean.FALSE);
    }

    @Override // defpackage.fb2
    public void a(s3<Boolean> s3Var) {
        this.e = s3Var;
        this.b = this.a.b().j0(ta2.a).E().o0(this.c).subscribe(new sa2(this), new ua2(this));
    }

    @Override // defpackage.fb2
    public void b(Intent intent) {
    }

    @Override // defpackage.fb2
    public void onStop() {
        this.b.dispose();
    }
}
