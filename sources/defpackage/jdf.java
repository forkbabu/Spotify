package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.voice.external.experience.domain.model.b;

/* renamed from: jdf  reason: default package */
public final /* synthetic */ class jdf implements sg0 {
    public static final /* synthetic */ jdf a = new jdf();

    private /* synthetic */ jdf() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        int i = bef.b;
        String i2 = ((b) obj).i();
        if (MoreObjects.isNullOrEmpty(i2)) {
            return z42.l(kef.i());
        }
        return z42.l(kef.d(i2));
    }
}
