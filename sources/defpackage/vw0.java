package defpackage;

import com.spotify.ondemandselector.proto.OndemandResponse;
import io.reactivex.z;
import retrofit2.w;

/* renamed from: vw0  reason: default package */
public class vw0 implements ww0 {
    private final ww0 a;

    public vw0(w wVar) {
        w.b f = wVar.f();
        f.h().add(0, gqf.c());
        this.a = (ww0) f.e().d(ww0.class);
    }

    @Override // defpackage.ww0
    public z<OndemandResponse> a() {
        return this.a.a();
    }
}
