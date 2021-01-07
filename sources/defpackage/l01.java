package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.session.impl.SessionClientImpl;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.cosmos.session.model.LoginRequest;
import io.reactivex.disposables.b;

/* renamed from: l01  reason: default package */
public class l01 {
    private final Cosmonaut a;
    private final wlf<LoginOptions> b;

    l01(Cosmonaut cosmonaut, wlf<LoginOptions> wlf) {
        this.a = cosmonaut;
        this.b = wlf;
    }

    public b a(RxRouter rxRouter) {
        return new SessionClientImpl(this.a, rxRouter).login(LoginRequest.create(LoginCredentials.autologin(), this.b.get())).subscribe(e01.a, d01.a);
    }
}
