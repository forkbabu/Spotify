package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.u;
import com.spotify.music.connection.n;
import com.spotify.music.spotlets.offline.util.c;
import com.spotify.rxjava2.p;
import defpackage.wt4;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: ut4  reason: default package */
public class ut4 implements wt4 {
    private final hba a;
    private final c b;
    private final n c;
    private final y d;
    private final com.spotify.libs.connect.sorting.hashing.a e;
    private final p f = new p();
    private List<GaiaDevice> g;
    private final yu0 h;
    private final u i;
    private wt4.a j;

    /* renamed from: ut4$a */
    private static class a implements Comparator<GaiaDevice> {
        private final Map<String, Long> a;
        private final com.spotify.libs.connect.sorting.hashing.a b;

        a(Map<String, Long> map, com.spotify.libs.connect.sorting.hashing.a aVar) {
            this.a = map;
            this.b = aVar;
        }

        private long a(Map<String, Long> map, GaiaDevice gaiaDevice) {
            Long l;
            if (gaiaDevice.isSelf()) {
                return Long.MAX_VALUE;
            }
            String a2 = this.b.a(gaiaDevice.getPhysicalIdentifier());
            if (!map.containsKey(a2) || (l = map.get(a2)) == null) {
                return Long.MIN_VALUE;
            }
            return l.longValue();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2) {
            GaiaDevice gaiaDevice3 = gaiaDevice;
            GaiaDevice gaiaDevice4 = gaiaDevice2;
            long a2 = a(this.a, gaiaDevice3);
            long a3 = a(this.a, gaiaDevice4);
            return a2 == a3 ? gaiaDevice3.getName().compareTo(gaiaDevice4.getName()) : (a3 > a2 ? 1 : (a3 == a2 ? 0 : -1));
        }
    }

    public ut4(hba hba, c cVar, n nVar, y yVar, yu0 yu0, com.spotify.libs.connect.sorting.hashing.a aVar, u uVar) {
        this.a = hba;
        this.c = nVar;
        this.b = cVar;
        this.d = yVar;
        this.e = aVar;
        this.g = new ArrayList(0);
        this.h = yu0;
        this.i = uVar;
    }

    public static void h(ut4 ut4, List list) {
        ut4.g = list;
        wt4.a aVar = ut4.j;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.wt4
    public s<Boolean> a() {
        return this.c.b();
    }

    @Override // defpackage.wt4
    public s<Boolean> b() {
        return this.a.b().j0(lt4.a).E();
    }

    @Override // defpackage.wt4
    public void c(s<List<GaiaDevice>> sVar) {
        this.f.b(sVar.o0(this.d).subscribe(new nt4(this)));
    }

    @Override // defpackage.wt4
    public s<List<GaiaDevice>> d() {
        s<List<GaiaDevice>> sVar;
        if (this.i.b()) {
            sVar = s.n(this.h.b(), g(), new rt4(this));
        } else {
            sVar = g();
        }
        return s.n(s.n(a(), this.b.a(), st4.a), sVar, pt4.a);
    }

    @Override // defpackage.wt4
    public s<GaiaDevice> e() {
        return this.a.b().W(mt4.a, false, Integer.MAX_VALUE).E();
    }

    @Override // defpackage.wt4
    public void f(wt4.a aVar) {
        this.j = aVar;
    }

    /* access modifiers changed from: package-private */
    public s<List<GaiaDevice>> g() {
        return this.a.b().j0(ot4.a).W(qt4.a, false, Integer.MAX_VALUE).E();
    }

    @Override // defpackage.wt4
    public List<GaiaDevice> getItems() {
        return this.g;
    }

    public /* synthetic */ List i(Map map, List list) {
        Collections.sort(list, new a(map, this.e));
        return list;
    }

    @Override // defpackage.wt4
    public void start() {
        this.f.a();
        c(d());
    }

    @Override // defpackage.wt4
    public void stop() {
        this.f.a();
    }
}
