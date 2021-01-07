package com.spotify.music.features.offlinesync;

import com.spotify.base.java.logging.Logger;
import com.spotify.rxjava2.p;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Set;

public class e {
    static final OfflineProgressModel e = OfflineProgressModel.create(0, 0, false);
    private final Set<a> a = new HashSet(1);
    private final jv5 b;
    private final y c;
    private final p d = new p();

    public interface a {
        void a(OfflineProgressModel offlineProgressModel);
    }

    public e(jv5 jv5, y yVar) {
        this.b = jv5;
        this.c = yVar;
    }

    public static void d(e eVar, Throwable th) {
        eVar.getClass();
        Logger.e(th, "Offline Progress failed with %s", th);
        eVar.e(e);
    }

    /* access modifiers changed from: private */
    public void e(OfflineProgressModel offlineProgressModel) {
        for (a aVar : (a[]) this.a.toArray(new a[0])) {
            aVar.a(offlineProgressModel);
        }
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public /* synthetic */ void c() {
        e(e);
    }

    public void f(a aVar) {
        this.a.remove(aVar);
    }

    public void g() {
        this.d.b(this.b.a().j0(a.a).o0(this.c).J(new c(this)).subscribe(new b(this), new d(this)));
    }

    public void h() {
        this.d.a();
    }
}
