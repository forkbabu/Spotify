package defpackage;

import android.os.Build;
import androidx.lifecycle.LiveData;
import com.spotify.allboarding.model.v1.proto.OnboardingRequest;
import com.spotify.allboarding.model.v1.proto.OnboardingResponse;
import com.spotify.allboarding.model.v1.proto.SearchResponse;
import com.spotify.allboarding.model.v1.proto.SelectedItem;
import com.spotify.libs.onboarding.allboarding.EntryPoint;
import com.spotify.libs.onboarding.allboarding.picker.w;
import com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase;
import com.spotify.libs.onboarding.allboarding.room.PickerStepData;
import com.spotify.libs.onboarding.allboarding.room.g;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.k;
import com.spotify.libs.onboarding.allboarding.room.l;
import com.spotify.libs.onboarding.allboarding.room.o;
import com.spotify.libs.onboarding.allboarding.room.q;
import com.spotify.libs.onboarding.allboarding.room.s;
import com.spotify.libs.onboarding.allboarding.room.v;
import com.spotify.libs.onboarding.allboarding.room.x;
import com.spotify.libs.onboarding.allboarding.room.z;
import com.spotify.mobile.android.util.Assertion;
import defpackage.nw0;
import io.reactivex.internal.operators.completable.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.h;

/* renamed from: kw0  reason: default package */
public class kw0 implements iw0 {
    private final sv0 a;
    private final AllboardingDatabase b;
    private final hw0 c;
    private final cqe d;
    private final tv0 e;

    /* renamed from: kw0$a */
    static final class a<V> implements Callable<Pair<? extends PickerStepData, ? extends List<? extends j>>> {
        final /* synthetic */ kw0 a;
        final /* synthetic */ String b;

        a(kw0 kw0, String str) {
            this.a = kw0;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Pair<? extends PickerStepData, ? extends List<? extends j>> call() {
            PickerStepData g = ((s) this.a.b.x()).g(this.b);
            if (g != null) {
                return new Pair<>(g, ((l) this.a.b.u()).g(g.b()));
            }
            StringBuilder Z0 = je.Z0("PickerStepData was null during fetchNextStep. ", "SessionId: ");
            Z0.append(this.b);
            Z0.append(", ");
            Z0.append("Number of steps: ");
            Z0.append(((s) this.a.b.x()).c());
            throw new IllegalStateException(Z0.toString());
        }
    }

    /* renamed from: kw0$b */
    static final class b<T, R> implements io.reactivex.functions.l<Pair<? extends PickerStepData, ? extends List<? extends j>>, io.reactivex.e> {
        final /* synthetic */ kw0 a;
        final /* synthetic */ String b;

        b(kw0 kw0, String str) {
            this.a = kw0;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public io.reactivex.e apply(Pair<? extends PickerStepData, ? extends List<? extends j>> pair) {
            Pair<? extends PickerStepData, ? extends List<? extends j>> pair2 = pair;
            h.e(pair2, "pair");
            sv0 sv0 = this.a.a;
            StringBuilder V0 = je.V0("allboarding");
            V0.append(this.b);
            String sb = V0.toString();
            kw0 kw0 = this.a;
            List<T> list = (List) pair2.d();
            kw0.getClass();
            OnboardingRequest.b i = OnboardingRequest.i();
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
            for (T t : list) {
                SelectedItem.b i2 = SelectedItem.i();
                i2.m(t.i());
                arrayList.add((SelectedItem) i2.build());
            }
            i.m(arrayList);
            OnboardingRequest onboardingRequest = (OnboardingRequest) i.build();
            h.d(onboardingRequest, "getOnboardingRequest(pair.second)");
            String c = this.a.e.c();
            String str = Build.MANUFACTURER;
            h.d(str, "Build.MANUFACTURER");
            String str2 = Build.MODEL;
            h.d(str2, "Build.MODEL");
            return new i(sv0.d(sb, onboardingRequest, c, str, str2, "android").A(new lw0(this, pair2)));
        }
    }

    /* renamed from: kw0$c */
    static final class c implements Runnable {
        final /* synthetic */ kw0 a;
        final /* synthetic */ j b;
        final /* synthetic */ String c;

        c(kw0 kw0, j jVar, String str) {
            this.a = kw0;
            this.b = jVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.l() == null) {
                Assertion.g("insertAndSelectArtist only supports artist pickers that is selectable != null");
                return;
            }
            if (((l) this.a.b.u()).c(this.b.i()) != null) {
                ((l) this.a.b.u()).k(this.b.i(), true, this.a.d.d());
            } else {
                k u = this.a.b.u();
                j jVar = this.b;
                ((l) u).i(j.a(jVar, null, null, this.c, null, null, z.a(jVar.l(), true, false, 0, 6), null, null, null, null, null, null, 4059));
            }
            if (this.b.l().b()) {
                kw0.b(this.a, this.b, true);
            }
            this.a.u(this.c, -1, kotlin.collections.d.t(this.b.i()));
            kw0.h(this.a, this.c, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kw0$d */
    public static final class d<T, R> implements io.reactivex.functions.l<OnboardingResponse, PickerStepData> {
        final /* synthetic */ kw0 a;
        final /* synthetic */ String b;
        final /* synthetic */ PickerStepData c;

        d(kw0 kw0, String str, PickerStepData pickerStepData) {
            this.a = kw0;
            this.b = str;
            this.c = pickerStepData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public PickerStepData apply(OnboardingResponse onboardingResponse) {
            OnboardingResponse onboardingResponse2 = onboardingResponse;
            h.e(onboardingResponse2, "it");
            ((com.spotify.libs.onboarding.allboarding.room.i) this.a.b.t()).a(new g(this.b, null, 2));
            long h = ((s) this.a.b.x()).h(this.c);
            ((com.spotify.libs.onboarding.allboarding.room.i) this.a.b.t()).b(this.b, h);
            kw0 kw0 = this.a;
            PickerStepData a2 = PickerStepData.a(this.c, h, null, null, null, null, null, null, null, null, false, 0, null, 4094);
            kw0.a(kw0, a2, onboardingResponse2);
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kw0$e */
    public static final class e<T, R> implements io.reactivex.functions.l<PickerStepData, Long> {
        public static final e a = new e();

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Long apply(PickerStepData pickerStepData) {
            PickerStepData pickerStepData2 = pickerStepData;
            h.e(pickerStepData2, "it");
            return Long.valueOf(pickerStepData2.b());
        }
    }

    /* renamed from: kw0$f */
    static final class f<V> implements Callable<w> {
        final /* synthetic */ kw0 a;
        final /* synthetic */ j b;

        f(kw0 kw0, j jVar) {
            this.a = kw0;
            this.b = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public w call() {
            int i;
            z l = this.b.l();
            boolean z = l != null && !l.e();
            String j = this.b.j();
            h.c(j);
            w.b bVar = w.b.b;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = 0;
            this.a.b.r(new mw0(this, z, j, ref$IntRef));
            int b2 = ((q) this.a.b.w()).b(this.b.j(), this.b.i());
            if ((this.b.b() != null || this.b.m() != null) && z) {
                return new w.c(j, b2);
            }
            return ((this.b.c() == null && this.b.n() == null) || (i = ref$IntRef.element) == 0) ? bVar : new w.c(j, b2 - i);
        }
    }

    public kw0(sv0 sv0, AllboardingDatabase allboardingDatabase, hw0 hw0, cqe cqe, tv0 tv0) {
        h.e(sv0, "allboardingEndpoint");
        h.e(allboardingDatabase, "allboardingDatabase");
        h.e(hw0, "allboardingFollowManager");
        h.e(cqe, "clock");
        h.e(tv0, "deeplinkTracker");
        this.a = sv0;
        this.b = allboardingDatabase;
        this.c = hw0;
        this.d = cqe;
        this.e = tv0;
    }

    public static final PickerStepData a(kw0 kw0, PickerStepData pickerStepData, OnboardingResponse onboardingResponse) {
        kw0.b.r(new jw0(kw0, pickerStepData, onboardingResponse));
        return pickerStepData;
    }

    public static final void b(kw0 kw0, j jVar, boolean z) {
        kw0.getClass();
        if (jVar.b() != null) {
            kw0.c.a(new nw0.a(jVar.i()), z);
        } else if (jVar.m() != null) {
            kw0.c.a(new nw0.b(jVar.i()), z);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x0112 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [kw0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125 A[SYNTHETIC, Splitter:B:42:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x024d A[LOOP:5: B:84:0x0247->B:86:0x024d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x029b A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int h(defpackage.kw0 r29, java.lang.String r30, com.spotify.libs.onboarding.allboarding.room.j r31) {
        /*
        // Method dump skipped, instructions count: 690
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw0.h(kw0, java.lang.String, com.spotify.libs.onboarding.allboarding.room.j):int");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void u(String str, int i, List<String> list) {
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
        Iterator<T> it = list.iterator();
        int i2 = i;
        while (it.hasNext()) {
            i2++;
            arrayList.add(new o(i2, it.next(), str));
        }
        ((q) this.b.w()).d(str, i, arrayList.size());
        ((q) this.b.w()).c(arrayList);
    }

    public void i(long j, j jVar) {
        h.e(jVar, "picker");
        int d2 = ((x) this.b.y()).d(j);
        com.spotify.libs.onboarding.allboarding.room.w y = this.b.y();
        StringBuilder sb = new StringBuilder();
        String j2 = jVar.j();
        h.c(j2);
        sb.append(j2);
        sb.append("title");
        ((x) y).f(new v(sb.toString(), j, "title", null, null, d2 - 1));
        String str = jVar.b() != null ? "artist" : "show";
        ((x) this.b.y()).f(new v(jVar.j(), j, str, null, null, d2 - 2, 24));
    }

    public io.reactivex.a j(String str, String str2) {
        h.e(str, "sessionId");
        h.e(str2, "postUrl");
        io.reactivex.a G = io.reactivex.z.y(new a(this, str)).t(new b(this, str2)).G(io.reactivex.schedulers.a.c());
        h.d(G, "Single.fromCallable {\n  …scribeOn(Schedulers.io())");
        return G;
    }

    public LiveData<List<v>> k(long j) {
        return ((x) this.b.y()).c(j);
    }

    public LiveData<PickerStepData> l(String str) {
        h.e(str, "sessionId");
        return ((s) this.b.x()).d(str);
    }

    public int m(String str, String str2) {
        h.e(str, "sectionId");
        h.e(str2, "pickerUri");
        return ((q) this.b.w()).b(str, str2);
    }

    public LiveData<List<j>> n(String str) {
        h.e(str, "sectionId");
        return ((l) this.b.u()).d(str);
    }

    public LiveData<PickerStepData> o(long j) {
        return ((s) this.b.x()).e(j);
    }

    public String p(String str) {
        h.e(str, "sectionId");
        return ((x) this.b.y()).e(str);
    }

    public LiveData<List<j>> q(String str) {
        h.e(str, "sessionId");
        return ((l) this.b.u()).e(str);
    }

    public LiveData<List<j>> r(long j) {
        return ((l) this.b.u()).f(j);
    }

    public void s(String str, long j, j jVar) {
        h.e(str, "sectionId");
        h.e(jVar, "picker");
        this.b.r(new c(this, jVar, str));
    }

    public io.reactivex.z<Long> t(String str, EntryPoint entryPoint) {
        h.e(str, "sessionId");
        h.e(entryPoint, "entryPoint");
        PickerStepData pickerStepData = new PickerStepData(0, str, null, null, null, null, null, null, null, false, 0, null, 3069);
        sv0 sv0 = this.a;
        String d2 = entryPoint.d();
        String c2 = this.e.c();
        String g = entryPoint.g();
        String str2 = Build.MANUFACTURER;
        h.d(str2, "Build.MANUFACTURER");
        String str3 = Build.MODEL;
        h.d(str3, "Build.MODEL");
        io.reactivex.z<R> A = sv0.c(d2, c2, g, str2, str3, "android").A(new d(this, str, pickerStepData)).A(e.a);
        h.d(A, "response\n            .ma…           .map { it.id }");
        return A;
    }

    public io.reactivex.z<SearchResponse> v(String str, String str2, String str3) {
        je.x(str, "searchUri", str2, "query", str3, "sessionId");
        return this.a.a(je.x0("allboarding", str), str2, String.valueOf(this.d.d()), str3);
    }

    public io.reactivex.z<w> w(long j, j jVar) {
        h.e(jVar, "picker");
        io.reactivex.z<w> H = io.reactivex.z.y(new f(this, jVar)).H(io.reactivex.schedulers.a.c());
        h.d(H, "Single.fromCallable {\n  …scribeOn(Schedulers.io())");
        return H;
    }
}
