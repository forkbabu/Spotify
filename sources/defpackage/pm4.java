package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.LoginIntent;
import com.spotify.music.features.connect.cast.discovery.d;
import io.reactivex.functions.g;

/* renamed from: pm4  reason: default package */
public final /* synthetic */ class pm4 implements g {
    public final /* synthetic */ d a;

    public /* synthetic */ pm4(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d dVar = this.a;
        LoginIntent loginIntent = (LoginIntent) obj;
        Logger.b("Login resolved for: %s", loginIntent.deviceId);
        dVar.b(loginIntent.deviceId, loginIntent.username, loginIntent.blob, loginIntent.clientKey, loginIntent.tokenType);
    }
}
