package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.DeviceState;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.volume.controllers.p;
import io.reactivex.functions.c;
import io.reactivex.s;
import java.util.Iterator;
import java.util.List;

/* renamed from: ro4  reason: default package */
public class ro4 implements qo4 {
    private final s<ConnectManager> a;
    private final p b;
    private final cs0 c;

    /* renamed from: ro4$b */
    private static class b implements c<List<com.spotify.libs.connect.model.a>, Optional<GaiaDevice>, List<com.spotify.libs.connect.model.a>> {
        b(a aVar) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public List<com.spotify.libs.connect.model.a> a(List<com.spotify.libs.connect.model.a> list, Optional<GaiaDevice> optional) {
            com.spotify.libs.connect.model.a a;
            List<com.spotify.libs.connect.model.a> list2 = list;
            Optional<GaiaDevice> optional2 = optional;
            Iterator<com.spotify.libs.connect.model.a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a = com.spotify.libs.connect.model.c.b("unknown", "local_device", DeviceState.GaiaDeviceState.LOGGED_IN, DeviceType.GaiaTypes.UNKNOWN).a();
                    break;
                }
                a = it.next();
                if (a.isSelf()) {
                    break;
                }
            }
            if (optional2.isPresent() && optional2.get().isSelf()) {
                a.setActive();
            }
            return list2;
        }
    }

    public ro4(s<ConnectManager> sVar, p pVar, cs0 cs0) {
        this.a = sVar.v0(1).h1();
        this.b = pVar;
        this.c = cs0;
    }

    private s<ConnectManager> e() {
        return this.a.W(eo4.a, false, Integer.MAX_VALUE);
    }

    @Override // defpackage.qo4
    public io.reactivex.disposables.b a() {
        return e().subscribe(oo4.a, mo4.a);
    }

    @Override // defpackage.qo4
    public io.reactivex.disposables.b b() {
        return e().subscribe(po4.a);
    }

    @Override // defpackage.qo4
    public io.reactivex.disposables.b c(com.spotify.libs.connect.model.a aVar) {
        return e().subscribe(new ko4(aVar));
    }

    @Override // defpackage.qo4
    public s<List<com.spotify.libs.connect.model.a>> d() {
        return s.n(e().W(new ho4(this), false, Integer.MAX_VALUE), e().W(new io4(this), false, Integer.MAX_VALUE), new b(null)).E();
    }
}
