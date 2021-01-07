package defpackage;

import com.spotify.rxjava2.q;
import defpackage.iv8;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: kv8  reason: default package */
public final class kv8 implements jv8 {
    private final PublishSubject<iv8> a;
    private b b;
    private final q c = new q();
    private final y d;

    /* access modifiers changed from: package-private */
    /* renamed from: kv8$a */
    public static final class a<T> implements g<Long> {
        final /* synthetic */ kv8 a;

        a(kv8 kv8) {
            this.a = kv8;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: io.reactivex.subjects.PublishSubject */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(Long l) {
            this.a.a.onNext(iv8.b.a);
        }
    }

    public kv8(y yVar) {
        h.e(yVar, "timerScheduler");
        this.d = yVar;
        PublishSubject<iv8> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.a = h1;
    }

    public void b() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.b = null;
        this.c.c();
        this.a.onNext(iv8.a.a);
    }

    public s<iv8> c() {
        return this.a;
    }

    public void d(long j) {
        if (this.b == null) {
            this.a.onNext(iv8.c.a);
            b subscribe = s.X0(j, TimeUnit.MILLISECONDS, this.d).subscribe(new a(this));
            this.c.a(subscribe);
            this.b = subscribe;
        }
    }
}
