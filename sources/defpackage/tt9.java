package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: tt9  reason: default package */
public final /* synthetic */ class tt9 implements g {
    public static final /* synthetic */ tt9 a = new tt9();

    private /* synthetic */ tt9() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        StringBuilder V0 = je.V0("Disabled PS from UCS, status: ");
        V0.append(((Response) obj).getStatus());
        Logger.b(V0.toString(), new Object[0]);
    }
}
