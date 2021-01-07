package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.model.LoginResponse;

/* renamed from: g01  reason: default package */
public final /* synthetic */ class g01 implements si0 {
    public static final /* synthetic */ g01 a = new g01();

    private /* synthetic */ g01() {
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginResponse.CodeRequired codeRequired = (LoginResponse.CodeRequired) obj;
        Logger.g("Unexpected response type: CodeRequired", new Object[0]);
    }
}
