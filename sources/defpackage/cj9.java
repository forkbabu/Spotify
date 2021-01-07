package defpackage;

import androidx.fragment.app.Fragment;
import com.jakewharton.rxrelay2.b;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import defpackage.ij9;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;

/* renamed from: cj9  reason: default package */
public class cj9 implements ij9.a {
    private final b<ej9> a = b.g1();
    private io.reactivex.disposables.b b = EmptyDisposable.INSTANCE;

    /* renamed from: cj9$a */
    class a extends m {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onDestroy() {
            cj9.this.b.dispose();
            this.a.e1(this);
        }
    }

    public cj9(k kVar) {
        ((jd0) kVar).y0(new a(kVar));
    }

    @Override // defpackage.ij9.a
    public s<ej9> a() {
        return this.a;
    }

    public void e(Fragment fragment) {
        if (fragment instanceof ij9.b) {
            s<ej9> e = ((ij9.b) fragment).u0().e();
            this.b.dispose();
            this.b = e.subscribe(this.a, vi9.a);
            return;
        }
        this.a.accept(fj9.b(PageIdentifiers.UNKNOWN.path(), null));
    }
}
