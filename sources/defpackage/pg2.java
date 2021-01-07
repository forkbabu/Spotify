package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.pitstop.model.PitstopAppProtocol$LogMessage;
import defpackage.cf2;
import io.reactivex.a;
import io.reactivex.s;
import java.util.Collection;

/* renamed from: pg2  reason: default package */
public final /* synthetic */ class pg2 implements cf2.c {
    public final /* synthetic */ rg2 a;

    public /* synthetic */ pg2(rg2 rg2) {
        this.a = rg2;
    }

    @Override // defpackage.cf2.c
    public final s a(JacksonModel jacksonModel) {
        rg2 rg2 = this.a;
        rg2.getClass();
        return a.u(new qg2(rg2, Collections2.newArrayList(Collections2.transform((Collection) ((PitstopAppProtocol$LogMessage) jacksonModel).body(), (Function) og2.a)))).g(s.i0(AppProtocolBase.a));
    }
}
