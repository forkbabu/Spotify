package defpackage;

import defpackage.ff2;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: zh2  reason: default package */
public class zh2 extends ff2 {
    public static final /* synthetic */ int h = 0;
    private final y e;
    private final g<k9f> f;
    private final a g = new a();

    protected zh2(ff2.a aVar, y yVar, g<k9f> gVar) {
        super(aVar);
        this.e = yVar;
        this.f = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.g.b(this.f.Q(this.e).F(yh2.a).subscribe(new xh2(this)));
    }

    @Override // defpackage.ff2
    public void e() {
        this.g.f();
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i) {
    }
}
