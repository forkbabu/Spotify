package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse;

/* renamed from: f01  reason: default package */
public final /* synthetic */ class f01 implements si0 {
    public static final /* synthetic */ f01 a = new f01();

    private /* synthetic */ f01() {
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginResponse.CodeSuccess codeSuccess = (LoginResponse.CodeSuccess) obj;
        Logger.g("Unexpected response type: CodeSuccess", new Object[0]);
    }
}
