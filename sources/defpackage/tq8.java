package defpackage;

import androidx.fragment.app.DialogFragment;
import com.spotify.mobile.android.ui.activity.c;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.y;

/* renamed from: tq8  reason: default package */
public class tq8 extends m implements pq8 {
    private final rq8 a;
    private final c b;
    private final com.spotify.music.features.tasteonboarding.c c;
    private final lq8 f;
    private final y n;
    private b o = EmptyDisposable.INSTANCE;
    private qq8 p;

    public tq8(rq8 rq8, c cVar, com.spotify.music.features.tasteonboarding.c cVar2, lq8 lq8, y yVar, k kVar) {
        this.a = rq8;
        this.b = cVar;
        this.c = cVar2;
        this.f = lq8;
        this.n = yVar;
        ((jd0) kVar).y0(this);
    }

    public void E2() {
        this.a.a();
        ((DialogFragment) this.p).M4();
    }

    public void F2() {
        this.a.c();
    }

    public void G2() {
        if (this.c.b() > 0) {
            this.o = this.f.d().A(this.n).subscribe(Functions.c, sq8.a);
        }
        this.a.b();
        this.b.a();
    }

    public void H2(qq8 qq8) {
        this.p = qq8;
    }

    public void I2() {
        this.p = null;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.o.dispose();
    }
}
