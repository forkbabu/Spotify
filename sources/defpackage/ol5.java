package defpackage;

import com.google.common.collect.Collections2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.features.home.common.cache.b;
import com.spotify.music.features.home.common.datasource.j;
import defpackage.p81;
import io.reactivex.l;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ol5  reason: default package */
public class ol5 {
    private final a<byte[]> a;
    private final j b;
    private final nf5 c;
    private final b d;
    private final li5 e;
    private final kg5 f;
    private final b91 g = t71.d().l(z81.c().n(HubsCommonComponent.LOADING_SPINNER).p(z81.a().p("tag", "home-loading-empty-view").d()).v(z81.a().p("ui:group", "home-loading-empty-view").d()).l()).g();
    private final s<RecentlyPlayedItems> h;
    private final s<ng5> i;
    private final qf5 j;
    private final txc k;

    public ol5(a<byte[]> aVar, j jVar, nf5 nf5, b bVar, qf5 qf5, li5 li5, s<ng5> sVar, kg5 kg5, s<RecentlyPlayedItems> sVar2, txc txc) {
        this.a = aVar;
        this.b = jVar;
        this.c = nf5;
        this.d = bVar;
        this.j = qf5;
        this.e = li5;
        this.f = kg5;
        qf5.getClass();
        this.h = sVar2;
        this.i = sVar;
        this.k = txc;
    }

    public b91 a(b91 b91, b91 b912, Boolean bool, Boolean bool2) {
        boolean isEmpty = b912.body().isEmpty();
        boolean isEmpty2 = b91.body().isEmpty();
        if (isEmpty && isEmpty2) {
            return this.j.c(bool.booleanValue(), bool2.booleanValue()).toBuilder().h(b91.custom()).g();
        }
        if (isEmpty) {
            p81.a a2 = z81.a();
            for (String str : b91.custom().keySet()) {
                if (!str.equals("topbar")) {
                    a2 = a2.e(str, b91.custom().bundle(str));
                }
            }
            return this.j.b(bool.booleanValue(), bool2.booleanValue()).toBuilder().h(a2.d()).a(b91.body()).g();
        } else if (isEmpty2) {
            return b912.toBuilder().h(b91.custom()).g();
        } else {
            ArrayList newArrayList = Collections2.newArrayList(b91.body());
            ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(2);
            Iterator it = newArrayList.iterator();
            while (it.hasNext()) {
                s81 s81 = (s81) it.next();
                if (s81.custom().boolValue("shortcuts", false)) {
                    newArrayListWithCapacity.add(s81);
                    it.remove();
                }
                if (newArrayListWithCapacity.size() == 2) {
                    break;
                }
            }
            newArrayListWithCapacity.addAll(b912.body());
            newArrayListWithCapacity.addAll(newArrayList);
            return z81.i().h(b91.custom()).e(newArrayListWithCapacity).g();
        }
    }

    public /* synthetic */ b91 b(b91 b91) {
        return this.c.a(b91, "offline", Boolean.TRUE);
    }

    public s<b91> c() {
        l<byte[]> read = this.a.read();
        j jVar = this.b;
        jVar.getClass();
        s<R> v = read.l(new yk5(jVar)).l(this.d).e((R) HubsImmutableViewModel.EMPTY).v();
        s n = s.n(v, this.h, this.e);
        s r0 = s.n(v, this.i, this.f).r0(fl5.a);
        s<String> a2 = this.k.a("offline");
        gl5 gl5 = gl5.a;
        s<R> j0 = a2.j0(gl5);
        s<R> j02 = this.k.a("shows-collection").j0(gl5);
        s l = s.l(n, r0, j0.N0(1), j02.N0(1), new dl5(this));
        qf5 qf5 = this.j;
        qf5.getClass();
        return l.p0(s.d1(j0, j02, new zk5(qf5)).N0(1)).j0(new el5(this)).G0(this.g);
    }
}
