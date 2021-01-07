package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.instrumentation.model.InstrumentationAppProtocol$Interaction;
import defpackage.cf2;
import io.reactivex.a;
import io.reactivex.s;

/* renamed from: rf2  reason: default package */
public final /* synthetic */ class rf2 implements cf2.c {
    public final /* synthetic */ uf2 a;

    public /* synthetic */ rf2(uf2 uf2) {
        this.a = uf2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        uf2 uf2 = this.a;
        uf2.getClass();
        return a.u(new tf2(uf2, (InstrumentationAppProtocol$Interaction) jacksonModel)).g(s.i0(AppProtocolBase.a));
    }
}
