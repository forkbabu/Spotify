package defpackage;

import com.spotify.rcs.model.proto.Bootstrap$BootstrapResponse;
import com.spotify.rcs.model.proto.Bootstrap$RemoteConfigResponseV1;
import io.reactivex.functions.l;
import retrofit2.v;

/* renamed from: p2a  reason: default package */
public final class p2a implements l<v<Bootstrap$BootstrapResponse>, y2a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public y2a apply(v<Bootstrap$BootstrapResponse> vVar) {
        v<Bootstrap$BootstrapResponse> vVar2 = vVar;
        if (!vVar2.f()) {
            return new z2a();
        }
        Bootstrap$BootstrapResponse a = vVar2.a();
        if (a == null) {
            return new z2a();
        }
        if (a.h() == Bootstrap$BootstrapResponse.RemoteConfigResponseCase.REMOTE_CONFIG_RESPONSE_V1 && a.i().l() == Bootstrap$RemoteConfigResponseV1.ResultCase.SUCCESS) {
            return new a3a(a.i().m().h().toByteArray());
        }
        return new z2a();
    }
}
