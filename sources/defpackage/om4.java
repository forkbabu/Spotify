package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.LogoutResponse;
import com.spotify.music.features.connect.cast.discovery.d;
import io.reactivex.functions.g;

/* renamed from: om4  reason: default package */
public final /* synthetic */ class om4 implements g {
    public final /* synthetic */ d a;

    public /* synthetic */ om4(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d dVar = this.a;
        LogoutResponse logoutResponse = (LogoutResponse) obj;
        Logger.b(" Logout resolved for: %s", logoutResponse.deviceId);
        dVar.a(logoutResponse.deviceId);
    }
}
