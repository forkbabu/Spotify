package defpackage;

import com.spotify.mobile.android.ui.activity.c;
import com.spotify.music.features.tasteonboarding.f;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: dr8  reason: default package */
public class dr8 implements vq8 {
    private final c a;
    private final lq8 b;
    private final y c;
    private final s<Boolean> d;
    private final f e;
    private final hha f;
    private final q g = new q();

    public dr8(c cVar, lq8 lq8, y yVar, s<Boolean> sVar, f fVar, hha hha) {
        this.a = cVar;
        this.b = lq8;
        this.c = yVar;
        this.d = sVar;
        this.e = fVar;
        this.f = hha;
    }

    @Override // defpackage.vq8
    public void a() {
        this.g.c();
    }

    @Override // defpackage.vq8
    public void b(wq8 wq8) {
        this.g.a(this.b.d().A(this.c).subscribe(new cr8(this), zq8.a));
        this.g.a(this.d.subscribe(new ar8(this), new br8(this)));
        this.e.b();
    }

    public /* synthetic */ void c(Boolean bool) {
        this.a.a();
    }

    public /* synthetic */ void d(Throwable th) {
        this.a.a();
    }

    public /* synthetic */ void e() {
        this.f.a(true);
    }
}
