package defpackage;

import com.google.common.base.Optional;
import com.spotify.accountinfostore.room.LocalAccountInfoDatabase;
import com.spotify.accountinfostore.room.a;
import com.spotify.accountinfostore.room.c;
import io.reactivex.e;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: g70  reason: default package */
public class g70 {
    private final cqe a;
    private final y b;
    private final ajf<LocalAccountInfoDatabase> c;

    public g70(cqe cqe, y yVar, ajf<LocalAccountInfoDatabase> ajf) {
        this.a = cqe;
        this.b = yVar;
        this.c = ajf;
    }

    private LocalAccountInfoDatabase b() {
        return this.c.get();
    }

    public z<Optional<f70>> a() {
        long d = this.a.d();
        return ((c) b().t()).g(d - TimeUnit.DAYS.toMillis(30)).G(this.b).d(((c) b().t()).k(d).G(this.b)).h(((c) b().t()).h().A(e70.a).H(this.b));
    }

    public a c(j70 j70, Optional optional) {
        String str;
        a aVar = (a) optional.orNull();
        if (aVar == null) {
            aVar = new a(j70.d());
        }
        if (j70.b() != null) {
            aVar.b = j70.b();
        }
        if (j70.a() != null && ((str = aVar.c) == null || str.isEmpty())) {
            aVar.c = j70.a();
        }
        if (j70.c() != null) {
            aVar.d = j70.c();
        }
        aVar.e = this.a.d();
        return aVar;
    }

    public /* synthetic */ e d(a aVar) {
        return ((c) b().t()).j(aVar);
    }

    public io.reactivex.a e() {
        return ((c) b().t()).f().G(this.b);
    }

    public io.reactivex.a f(j70 j70) {
        return ((c) b().t()).i(j70.d()).A(new c70(this, j70)).t(new d70(this)).G(this.b);
    }
}
