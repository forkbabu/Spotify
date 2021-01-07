package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.voice.external.experience.domain.model.b;

/* renamed from: idf  reason: default package */
public final /* synthetic */ class idf implements sg0 {
    public static final /* synthetic */ idf a = new idf();

    private /* synthetic */ idf() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        int i = bef.b;
        String i2 = ((b) obj).i();
        if (MoreObjects.isNullOrEmpty(i2)) {
            return z42.l(kef.n(true));
        }
        return z42.l(kef.o(i2));
    }
}
