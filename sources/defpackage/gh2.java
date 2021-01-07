package defpackage;

import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: gh2  reason: default package */
public class gh2 extends ff2 {
    private final y e;
    private final g<SetupSubscriptionEvent> f;
    private b g = c.a();

    protected gh2(ff2.a aVar, y yVar, g<SetupSubscriptionEvent> gVar) {
        super(aVar);
        this.e = yVar;
        this.f = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.g = this.f.Q(this.e).O(eh2.a).subscribe(new fh2(this));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void e() {
        this.g.dispose();
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i) {
    }
}
