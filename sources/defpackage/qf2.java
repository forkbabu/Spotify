package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Impression;
import defpackage.cf2;
import io.reactivex.a;
import io.reactivex.s;

/* renamed from: qf2  reason: default package */
public final /* synthetic */ class qf2 implements cf2.c {
    public final /* synthetic */ uf2 a;

    public /* synthetic */ qf2(uf2 uf2) {
        this.a = uf2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        uf2 uf2 = this.a;
        uf2.getClass();
        return a.u(new sf2(uf2, (InstrumentationAppProtocol$Impression) jacksonModel)).g(s.i0(AppProtocolBase.a));
    }
}
