package defpackage;

import com.spotify.music.feedback.b;

/* renamed from: jwb  reason: default package */
public final class jwb implements fjf<iwb> {
    private final wlf<b> a;

    public jwb(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iwb(this.a.get());
    }
}
