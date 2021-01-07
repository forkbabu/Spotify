package defpackage;

import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.remoteconfig.k5;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

/* renamed from: f6a  reason: default package */
public final class f6a {
    private final s<Boolean> a;

    /* renamed from: f6a$a */
    static final class a<V> implements Callable<v<? extends Boolean>> {
        final /* synthetic */ wlf a;
        final /* synthetic */ y b;
        final /* synthetic */ s c;

        a(wlf wlf, y yVar, s sVar) {
            this.a = wlf;
            this.b = yVar;
            this.c = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public v<? extends Boolean> call() {
            if (((k5) this.a.get()).c()) {
                return s.i0(Boolean.TRUE);
            }
            if (this.b.g()) {
                return this.c.j0(e6a.a);
            }
            return s.i0(Boolean.FALSE);
        }
    }

    public f6a(s<d7a> sVar, y yVar, wlf<k5> wlf) {
        h.e(sVar, "carModeStateObservable");
        h.e(yVar, "featureAvailability");
        h.e(wlf, "remoteConfiguration");
        s<Boolean> E = s.B(new a(wlf, yVar, sVar)).E();
        h.d(E, "Observable.defer {\n     … }.distinctUntilChanged()");
        this.a = E;
    }

    public final s<Boolean> a() {
        return this.a;
    }
}
