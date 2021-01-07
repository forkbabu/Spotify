package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse;

/* renamed from: c01  reason: default package */
public final /* synthetic */ class c01 implements si0 {
    public static final /* synthetic */ c01 a = new c01();

    private /* synthetic */ c01() {
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginResponse.BootstrapRequired bootstrapRequired = (LoginResponse.BootstrapRequired) obj;
        Logger.g("Unexpected response type: BootstrapRequired", new Object[0]);
    }
}
