package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.inappmessaging.MessageRequest;
import com.spotify.rxjava2.p;
import io.reactivex.d0;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: mp1  reason: default package */
public final class mp1 implements op1 {
    private final io.reactivex.subjects.a<Boolean> a;
    private final p b = new p();
    private final qp1 c;
    private final com.spotify.music.inappmessaging.b d;
    private final s<Boolean> e;
    private final y f;

    /* access modifiers changed from: package-private */
    /* renamed from: mp1$a */
    /* compiled from: java-style lambda group */
    public static final class a<T> implements n<Boolean> {
        public static final a b = new a(0);
        public static final a c = new a(1);
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public final boolean test(Boolean bool) {
            int i = this.a;
            if (i == 0) {
                Boolean bool2 = bool;
                h.e(bool2, "isInForeground");
                return bool2.booleanValue();
            } else if (i == 1) {
                Boolean bool3 = bool;
                h.e(bool3, "messageEnable");
                return bool3.booleanValue();
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mp1$b */
    public static final class b<T, R> implements l<Boolean, v<? extends Boolean>> {
        final /* synthetic */ mp1 a;

        b(mp1 mp1) {
            this.a = mp1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Boolean> apply(Boolean bool) {
            h.e(bool, "it");
            return this.a.a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mp1$c */
    public static final class c<T, R> implements l<Boolean, d0<? extends Integer>> {
        final /* synthetic */ mp1 a;

        c(mp1 mp1) {
            this.a = mp1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends Integer> apply(Boolean bool) {
            h.e(bool, "it");
            return this.a.c.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mp1$d */
    public static final class d<T> implements n<Integer> {
        public static final d a = new d();

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Integer num) {
            Integer num2 = num;
            h.e(num2, "remainingSkips");
            return num2.intValue() == 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mp1$e */
    public static final class e<T> implements g<Integer> {
        final /* synthetic */ mp1 a;

        e(mp1 mp1) {
            this.a = mp1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Integer num) {
            this.a.d.b(MessageRequest.a("banner", "skip-limit", "v1"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: mp1$f */
    public static final class f<T> implements g<Throwable> {
        public static final f a = new f();

        f() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Logger.e(th, "Failed to fetch remaining skips.", new Object[0]);
        }
    }

    public mp1(qp1 qp1, com.spotify.music.inappmessaging.b bVar, s<Boolean> sVar, y yVar) {
        h.e(qp1, "skipLimitReachedDataSource");
        h.e(bVar, "messageRequester");
        h.e(sVar, "appForegroundObservable");
        h.e(yVar, "mainThreadScheduler");
        this.c = qp1;
        this.d = bVar;
        this.e = sVar;
        this.f = yVar;
        io.reactivex.subjects.a<Boolean> i1 = io.reactivex.subjects.a.i1(Boolean.TRUE);
        h.d(i1, "BehaviorSubject.createDefault(true)");
        this.a = i1;
    }

    @Override // defpackage.op1
    public void a() {
        this.a.onNext(Boolean.FALSE);
    }

    public final void e() {
        this.b.b(this.e.E().Q(a.b).W(new b(this), false, Integer.MAX_VALUE).Q(a.c).L0(new c(this)).Q(d.a).o0(this.f).subscribe(new e(this), f.a));
    }

    public final void f() {
        this.b.a();
    }
}
