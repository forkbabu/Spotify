package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.api.SlotApi;
import io.reactivex.s;
import java.util.Collections;

/* renamed from: ajb  reason: default package */
public class ajb implements bjb {
    private final ol3 a;

    public ajb(ol3 ol3) {
        this.a = ol3;
    }

    @Override // defpackage.bjb
    public s<Response> a(SlotApi.Intent intent) {
        Logger.b("[Marquee] - get fetch intent response", new Object[0]);
        return this.a.b("marquee", intent.d(), Collections.emptyMap()).f(new n1e()).P();
    }
}
