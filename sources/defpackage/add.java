package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import com.spotify.music.sociallistening.models.b;
import defpackage.ddd;
import defpackage.edd;

/* renamed from: add  reason: default package */
public final /* synthetic */ class add implements ti0 {
    public final /* synthetic */ edd a;

    public /* synthetic */ add(edd edd) {
        this.a = edd;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        edd edd = this.a;
        b e = ((ddd.b) obj).e();
        edd.a b = edd.b();
        b.b(Optional.of(e));
        return e0.f(b.a());
    }
}
