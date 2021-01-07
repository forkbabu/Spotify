package defpackage;

import com.spotify.superbird.ota.model.f;
import defpackage.ff2;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: lg2  reason: default package */
public class lg2 extends ff2 {
    public static final /* synthetic */ int h = 0;
    private final y e;
    private final g<f> f;
    private b g = c.a();

    protected lg2(ff2.a aVar, y yVar, g<f> gVar) {
        super(aVar);
        this.e = yVar;
        this.f = gVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        this.g = this.f.Q(this.e).O(kg2.a).subscribe(new jg2(this));
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
