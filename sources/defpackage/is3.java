package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: is3  reason: default package */
public final /* synthetic */ class is3 implements g {
    public static final /* synthetic */ is3 a = new is3();

    private /* synthetic */ is3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Response response = (Response) obj;
        if (response.getStatus() < 200 || response.getStatus() >= 300) {
            Logger.b("Failed to apply reward", new Object[0]);
        } else {
            Logger.b("Reward successfully applied", new Object[0]);
        }
    }
}
