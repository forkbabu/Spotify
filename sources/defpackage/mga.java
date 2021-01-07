package defpackage;

import com.spotify.remoteconfig.h8;

/* renamed from: mga  reason: default package */
public final class mga implements fjf<lga> {
    private final wlf<h8> a;

    public mga(wlf<h8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lga(this.a.get());
    }
}
