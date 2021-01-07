package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.Assertion;
import defpackage.rl5;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: tq2  reason: default package */
public final class tq2 {
    private final il5 a;
    private final qf5 b;
    private final s<b91> c;
    private final y d;

    /* access modifiers changed from: package-private */
    /* renamed from: tq2$a */
    public static final class a<T> implements g<Throwable> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Assertion.w("CarModeHomeLoad: onError", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tq2$b */
    public static final class b<T, R> implements l<Throwable, b91> {
        final /* synthetic */ tq2 a;

        b(tq2 tq2) {
            this.a = tq2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public b91 apply(Throwable th) {
            h.e(th, "it");
            return this.a.b.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tq2$c */
    public static final class c<T, R> implements l<rl5, b91> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public b91 apply(rl5 rl5) {
            rl5 rl52 = rl5;
            h.e(rl52, "it");
            return rl52.b();
        }
    }

    public tq2(il5 il5, qf5 qf5, s<b91> sVar, y yVar) {
        h.e(il5, "resultSelector");
        h.e(qf5, "homeEmptyStateFactory");
        h.e(sVar, "homeLoadableObservable");
        h.e(yVar, "ioScheduler");
        this.a = il5;
        this.b = qf5;
        this.c = sVar;
        this.d = yVar;
    }

    public final s<b91> b() {
        s<b91> r0 = this.c.L(a.a).r0(new b(this));
        rl5.a a2 = rl5.a();
        a2.a(HubsImmutableViewModel.EMPTY);
        s<R> I0 = r0.y0(a2.build(), this.a).E().j0(c.a).I0(this.d);
        h.d(I0, "homeLoadableObservable\n ….subscribeOn(ioScheduler)");
        return I0;
    }
}
