package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.voice.external.experience.domain.model.b;

/* renamed from: pdf  reason: default package */
public final /* synthetic */ class pdf implements sg0 {
    public static final /* synthetic */ pdf a = new pdf();

    private /* synthetic */ pdf() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        int i = bef.b;
        String i2 = ((b) obj).i();
        if (!MoreObjects.isNullOrEmpty(i2)) {
            return z42.l(kef.d(i2));
        }
        throw new IllegalArgumentException("No intent and no URI.");
    }
}
