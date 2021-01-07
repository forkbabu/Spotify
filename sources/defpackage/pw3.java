package defpackage;

import com.spotify.music.libs.collection.util.k;
import io.reactivex.y;

/* renamed from: pw3  reason: default package */
public final class pw3 implements fjf<ow3> {
    private final wlf<k> a;
    private final wlf<y> b;
    private final wlf<String> c;

    public pw3(wlf<k> wlf, wlf<y> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ow3(this.a.get(), this.b.get(), this.c.get());
    }
}
