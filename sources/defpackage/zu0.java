package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.sorting.data.DevicePickerSortingDatabase;
import com.spotify.rxjava2.q;
import defpackage.ru0;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: zu0  reason: default package */
public final class zu0 implements yu0, ru0.a {
    private final q a = new q();
    private final DevicePickerSortingDatabase b;
    private final com.spotify.libs.connect.sorting.data.b c;
    private final com.spotify.libs.connect.sorting.hashing.a d;
    private final aqe e;
    private final y f;

    /* renamed from: zu0$a */
    static final class a<T> implements g<List<? extends com.spotify.libs.connect.sorting.data.a>> {
        final /* synthetic */ zu0 a;

        a(zu0 zu0) {
            this.a = zu0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(List<? extends com.spotify.libs.connect.sorting.data.a> list) {
            this.a.b.d();
        }
    }

    /* renamed from: zu0$b */
    static final class b<T, R> implements l<List<? extends com.spotify.libs.connect.sorting.data.a>, Map<String, ? extends Long>> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Map<String, ? extends Long> apply(List<? extends com.spotify.libs.connect.sorting.data.a> list) {
            List<? extends com.spotify.libs.connect.sorting.data.a> list2 = list;
            h.e(list2, "devices");
            ArrayList arrayList = new ArrayList(d.e(list2, 10));
            for (T t : list2) {
                arrayList.add(new Pair(t.a(), Long.valueOf(t.b())));
            }
            return d.S(arrayList);
        }
    }

    /* renamed from: zu0$c */
    static final class c implements io.reactivex.functions.a {
        final /* synthetic */ com.spotify.libs.connect.sorting.data.a a;

        c(com.spotify.libs.connect.sorting.data.a aVar) {
            this.a = aVar;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            StringBuilder V0 = je.V0("Inserted: ");
            V0.append(this.a);
            Logger.b(V0.toString(), new Object[0]);
        }
    }

    public zu0(DevicePickerSortingDatabase devicePickerSortingDatabase, com.spotify.libs.connect.sorting.data.b bVar, com.spotify.libs.connect.sorting.hashing.a aVar, aqe aqe, y yVar) {
        h.e(devicePickerSortingDatabase, "database");
        h.e(bVar, "dao");
        h.e(aVar, "hasher");
        h.e(aqe, "clock");
        h.e(yVar, "scheduler");
        this.b = devicePickerSortingDatabase;
        this.c = bVar;
        this.d = aVar;
        this.e = aqe;
        this.f = yVar;
    }

    @Override // defpackage.yu0
    public void a() {
        this.a.a(this.c.a().S().q(this.f).subscribe(new a(this)));
    }

    @Override // defpackage.yu0
    public s<Map<String, Long>> b() {
        s<R> j0 = this.c.a().I0(this.f).j0(b.a);
        h.d(j0, "dao.getAll()\n           … it.timestamp }.toMap() }");
        return j0;
    }

    @Override // defpackage.yu0
    public void c(String str, cmf<f> cmf) {
        h.e(str, "physicalIdentifier");
        h.e(cmf, "callback");
        String a2 = this.d.a(str);
        this.e.getClass();
        com.spotify.libs.connect.sorting.data.a aVar = new com.spotify.libs.connect.sorting.data.a(a2, System.currentTimeMillis());
        this.a.a(this.c.b(aVar).p(new c(aVar)).G(this.f).subscribe(new av0(cmf)));
    }

    @Override // defpackage.ru0.a
    public void onStart() {
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.a.c();
    }
}
