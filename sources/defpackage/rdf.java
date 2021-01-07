package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.superbird.earcon.EarconType;
import com.spotify.voice.external.experience.domain.model.b;

/* renamed from: rdf  reason: default package */
public final /* synthetic */ class rdf implements sg0 {
    public static final /* synthetic */ rdf a = new rdf();

    private /* synthetic */ rdf() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        int i = bef.b;
        String i2 = ((b) obj).i();
        if (MoreObjects.isNullOrEmpty(i2)) {
            return z42.l(kef.e(EarconType.CONFIRMATION), kef.i());
        }
        return z42.l(kef.d(i2));
    }
}
