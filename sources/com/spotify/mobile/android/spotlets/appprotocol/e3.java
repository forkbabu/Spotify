package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.i4;
import io.reactivex.functions.g;

public final /* synthetic */ class e3 implements g {
    public final /* synthetic */ i4.e a;
    public final /* synthetic */ oq1 b;

    public /* synthetic */ e3(i4.e eVar, oq1 oq1) {
        this.a = eVar;
        this.b = oq1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        i4.e eVar = this.a;
        oq1 oq1 = this.b;
        JacksonModel jacksonModel = (JacksonModel) obj;
        eVar.getClass();
        Logger.l("WAMP served request with id: %d, proc: %s, data: %s", Integer.valueOf(oq1.i()), oq1.h(), jacksonModel);
        i4.this.r(oq1.i(), jacksonModel);
    }
}
