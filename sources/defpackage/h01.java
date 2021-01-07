package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse;

/* renamed from: h01  reason: default package */
public final /* synthetic */ class h01 implements si0 {
    public static final /* synthetic */ h01 a = new h01();

    private /* synthetic */ h01() {
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginResponse.Error error = (LoginResponse.Error) obj;
        Logger.g("The user failed to autologin: %d (%s)", Integer.valueOf(error.status()), error.error());
    }
}
