package defpackage;

import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.remoteconfig.k5;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

/* renamed from: j6a  reason: default package */
public final class j6a {
    private final s<Boolean> a;

    /* renamed from: j6a$a */
    static final class a<V> implements Callable<v<? extends Boolean>> {
        final /* synthetic */ y a;
        final /* synthetic */ wlf b;
        final /* synthetic */ s c;

        a(y yVar, wlf wlf, s sVar) {
            this.a = yVar;
            this.b = wlf;
            this.c = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public v<? extends Boolean> call() {
            if (!((k5) this.b.get()).b() || !this.a.g()) {
                return s.i0(Boolean.FALSE);
            }
            return this.c.j0(i6a.a);
        }
    }

    public j6a(s<d7a> sVar, y yVar, wlf<k5> wlf) {
        h.e(sVar, "carModeStateObservable");
        h.e(yVar, "featureAvailability");
        h.e(wlf, "remoteConfiguration");
        s<Boolean> E = s.B(new a(yVar, wlf, sVar)).E();
        h.d(E, "Observable.defer {\n     … }.distinctUntilChanged()");
        this.a = E;
    }

    public final s<Boolean> a() {
        return this.a;
    }
}
