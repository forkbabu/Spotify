package defpackage;

import com.spotify.remoteconfig.AndroidLibsSocialListeningProperties;

/* renamed from: dfd  reason: default package */
public final class dfd implements fjf<cfd> {
    private final wlf<AndroidLibsSocialListeningProperties> a;

    public dfd(wlf<AndroidLibsSocialListeningProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cfd(this.a.get());
    }
}
