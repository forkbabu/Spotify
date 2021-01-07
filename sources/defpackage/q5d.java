package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.mobius.e0;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.sociallistening.models.b;
import defpackage.h6d;
import defpackage.i6d;

/* renamed from: q5d  reason: default package */
public final /* synthetic */ class q5d implements ti0 {
    public final /* synthetic */ k6d a;

    public /* synthetic */ q5d(k6d k6d) {
        this.a = k6d;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k6d k6d = this.a;
        if (((i6d.h) obj).p()) {
            return e0.a(z42.l(new h6d.b(true)));
        }
        Optional<b> b = k6d.b();
        Optional absent = Optional.absent();
        if (b.isPresent()) {
            Optional tryFind = Collections2.tryFind(b.get().d(), c6d.a);
            if (tryFind.isPresent()) {
                absent = Optional.of(((Participant) tryFind.get()).getDisplayName());
            }
        }
        return e0.a(z42.l(new h6d.g(absent)));
    }
}
