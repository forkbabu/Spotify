package defpackage;

import com.spotify.mobile.android.rx.w;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: g9b  reason: default package */
public class g9b implements m9b {
    private final y b;
    private final i9b c;
    private final k9b d;
    private final w e;
    protected b f = c.a();

    public g9b(y yVar, i9b i9b, k9b k9b, w wVar) {
        this.b = yVar;
        this.c = i9b;
        this.d = k9b;
        this.e = wVar;
    }

    public void a() {
        this.f.dispose();
        this.f = s.n(this.c.b(), this.e.c("payment-state"), z8b.a).o0(this.b).subscribe(this.d, y8b.a);
    }

    @Override // defpackage.m9b
    public void pause() {
        this.f.dispose();
    }

    @Override // defpackage.m9b
    public void resume() {
        this.f.dispose();
        this.f = this.c.b().o0(this.b).subscribe(this.d, a9b.a);
    }
}
