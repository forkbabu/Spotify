package defpackage;

import com.spotify.music.lyrics.core.experience.model.b;
import defpackage.ycb;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: adb  reason: default package */
public final class adb implements fjf<s<b>> {
    private final wlf<xcb> a;

    public adb(wlf<xcb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        xcb xcb = this.a.get();
        ycb.a aVar = ycb.a;
        h.e(xcb, "lyricsLoader");
        return xcb.b();
    }
}
