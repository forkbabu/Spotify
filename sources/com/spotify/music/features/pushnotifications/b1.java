package com.spotify.music.features.pushnotifications;

import android.os.Build;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.pushnotifications.model.PushRegistrationData;
import com.spotify.pushnotifications.o;
import io.reactivex.a;

public class b1 implements o {
    private final a1 a;
    private final t b;

    public b1(a1 a1Var, t tVar) {
        this.a = a1Var;
        this.b = tVar;
    }

    @Override // com.spotify.pushnotifications.o
    public a a(String str) {
        Logger.b("Token Registration V1 Endpoint", new Object[0]);
        StringBuilder V0 = je.V0("app id: ");
        V0.append(this.b.y());
        V0.append(" os version : ");
        String str2 = Build.VERSION.RELEASE;
        V0.append(str2);
        Logger.b("info %s", V0.toString());
        return this.a.a(PushRegistrationData.create("prod", "gcm", str, true, this.b.y(), str2)).t(c0.a);
    }
}
