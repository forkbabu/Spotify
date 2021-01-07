package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: npe  reason: default package */
public class npe {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final gpe b;
    private final com.spotify.superbird.pitstop.room.b c;
    private final y d;

    /* renamed from: npe$a */
    static final class a<T, R> implements l<Throwable, io.reactivex.e> {
        final /* synthetic */ npe a;
        final /* synthetic */ List b;
        final /* synthetic */ String c;

        a(npe npe, List list, String str) {
            this.a = npe;
            this.b = list;
            this.c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public io.reactivex.e apply(Throwable th) {
            kotlin.jvm.internal.h.e(th, "it");
            com.spotify.superbird.pitstop.room.b bVar = this.a.c;
            List<T> list = this.b;
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
            for (T t : list) {
                arrayList.add(new mpe(this.c, t));
            }
            return bVar.c(arrayList).B();
        }
    }

    /* renamed from: npe$b */
    static final class b implements io.reactivex.functions.a {
        public static final b a = new b();

        b() {
        }

        @Override // io.reactivex.functions.a
        public final void run() {
        }
    }

    /* renamed from: npe$c */
    static final class c<T> implements io.reactivex.functions.g<Throwable> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Logger.e(th, "Failed to send a log.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: npe$d */
    public static final class d<T> implements n<List<? extends mpe>> {
        public static final d a = new d();

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(List<? extends mpe> list) {
            List<? extends mpe> list2 = list;
            kotlin.jvm.internal.h.e(list2, "it");
            return !list2.isEmpty();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: npe$e */
    public static final class e<T, R> implements l<List<? extends mpe>, io.reactivex.e> {
        final /* synthetic */ npe a;

        e(npe npe) {
            this.a = npe;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public io.reactivex.e apply(List<? extends mpe> list) {
            List<? extends mpe> list2 = list;
            kotlin.jvm.internal.h.e(list2, "events");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t : list2) {
                String c = t.c();
                Object obj = linkedHashMap.get(c);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c, obj);
                }
                ((List) obj).add(t);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                gpe gpe = this.a.b;
                String str = (String) entry.getKey();
                Iterable<T> iterable = (Iterable) entry.getValue();
                ArrayList arrayList2 = new ArrayList(kotlin.collections.d.e(iterable, 10));
                for (T t2 : iterable) {
                    arrayList2.add(t2.a().a());
                }
                io.reactivex.a B = gpe.a(str, arrayList2).d(this.a.c.b((List) entry.getValue())).B();
                kotlin.jvm.internal.h.d(B, "pitstopEndpoint.log(entr…value)).onErrorComplete()");
                arrayList.add(B);
            }
            return io.reactivex.a.y(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: npe$f */
    public static final class f implements io.reactivex.functions.a {
        public static final f a = new f();

        f() {
        }

        @Override // io.reactivex.functions.a
        public final void run() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: npe$g */
    public static final class g<T> implements io.reactivex.functions.g<Throwable> {
        public static final g a = new g();

        g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Logger.e(th, "Failed to send Pitstop logs.", new Object[0]);
        }
    }

    /* renamed from: npe$h */
    static final class h<T> implements io.reactivex.functions.g<Long> {
        final /* synthetic */ npe a;

        h(npe npe) {
            this.a = npe;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Long l) {
            this.a.d();
        }
    }

    public npe(gpe gpe, com.spotify.superbird.pitstop.room.b bVar, y yVar) {
        kotlin.jvm.internal.h.e(gpe, "pitstopEndpoint");
        kotlin.jvm.internal.h.e(bVar, "dao");
        kotlin.jvm.internal.h.e(yVar, "ioScheduler");
        this.b = gpe;
        this.c = bVar;
        this.d = yVar;
    }

    public void c(String str, List<? extends lpe> list) {
        kotlin.jvm.internal.h.e(str, "serial");
        kotlin.jvm.internal.h.e(list, "events");
        io.reactivex.disposables.a aVar = this.a;
        gpe gpe = this.b;
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        aVar.b(gpe.a(str, arrayList).D(new a(this, list, str)).subscribe(b.a, c.a));
    }

    public final void d() {
        this.a.b(this.c.a().r(d.a).h(new e(this)).G(this.d).subscribe(f.a, g.a));
    }

    public void e() {
        this.a.b(io.reactivex.g.M(5, 5, TimeUnit.MINUTES, this.d).e0(this.d).subscribe(new h(this)));
    }

    public void f() {
        this.a.f();
    }
}
