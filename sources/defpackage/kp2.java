package defpackage;

import com.spotify.music.libs.carmodeengine.util.y;

/* renamed from: kp2  reason: default package */
public final class kp2 implements fjf<jp2> {
    private final wlf<y> a;

    public kp2(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jp2(this.a.get());
    }
}
