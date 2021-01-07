package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse;

/* renamed from: b01  reason: default package */
public final /* synthetic */ class b01 implements si0 {
    public static final /* synthetic */ b01 a = new b01();

    private /* synthetic */ b01() {
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginResponse.Success success = (LoginResponse.Success) obj;
        Logger.g("The user have successfully logged in using stored credentials", new Object[0]);
    }
}
