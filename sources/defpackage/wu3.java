package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: wu3  reason: default package */
public final /* synthetic */ class wu3 implements g {
    public static final /* synthetic */ wu3 a = new wu3();

    private /* synthetic */ wu3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Response response = (Response) obj;
        if (response.getStatus() == 200) {
            Logger.b("ADS: Accessory Update Succeeded", new Object[0]);
        } else {
            Logger.b("ADS: Accessory Update Failed. Status Code:%d", Integer.valueOf(response.getStatus()));
        }
    }
}
