package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.u;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lh3  reason: default package */
final class lh3 extends e0 implements th3 {
    private final s<Boolean> c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final p e = new p();
    private final nh3 f;
    private final y g;

    /* renamed from: lh3$a */
    static class a extends g0.d {
        private final s<Boolean> a;
        private final nh3 b;
        private final y c;

        a(s<Boolean> sVar, nh3 nh3, y yVar) {
            this.a = sVar;
            this.b = nh3;
            this.c = yVar;
        }

        @Override // androidx.lifecycle.g0.d, androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            return new lh3(this.a, this.b, this.c);
        }
    }

    lh3(s<Boolean> sVar, nh3 nh3, y yVar) {
        this.c = sVar;
        this.f = nh3;
        this.g = yVar;
    }

    @Override // defpackage.th3
    public LiveData<Boolean> a() {
        Boolean bool = Boolean.FALSE;
        u uVar = new u(bool);
        this.e.b(s.n(this.c, this.f.a(), fh3.a).Q(new hh3(this)).N0(1).J0(new gh3(this)).s0(bool).J(new ih3(this)).subscribe(new eh3(uVar)));
        return uVar;
    }

    @Override // defpackage.th3
    public void b() {
        this.f.b();
        this.d.set(true);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        this.e.a();
    }

    public boolean g(Boolean bool) {
        return bool.booleanValue() && !this.d.get();
    }

    public /* synthetic */ v h(Boolean bool) {
        return io.reactivex.a.L(10, TimeUnit.SECONDS, this.g).g(s.i0(Boolean.FALSE)).G0(Boolean.TRUE);
    }

    public /* synthetic */ void i() {
        this.d.set(true);
    }
}
