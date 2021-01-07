package defpackage;

import com.spotify.image.provider.MediaUriUtil;
import com.spotify.music.libs.mediabrowserservice.d2;

/* renamed from: oja  reason: default package */
public final class oja implements fjf<nja> {
    private final wlf<MediaUriUtil> a;
    private final wlf<d2> b;
    private final wlf<kja> c;
    private final wlf<c4e> d;

    public oja(wlf<MediaUriUtil> wlf, wlf<d2> wlf2, wlf<kja> wlf3, wlf<c4e> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nja(this.a, this.b, this.c, this.d);
    }
}
