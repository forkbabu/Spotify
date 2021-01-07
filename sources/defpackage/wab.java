package defpackage;

import com.spotify.music.libs.voice.b;

/* renamed from: wab  reason: default package */
public final class wab implements fjf<vab> {
    private final wlf<b> a;

    public wab(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vab(this.a.get());
    }
}
