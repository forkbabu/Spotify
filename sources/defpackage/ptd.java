package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.ttd;
import defpackage.utd;

/* renamed from: ptd  reason: default package */
public final /* synthetic */ class ptd implements ti0 {
    public final /* synthetic */ Optional a;

    public /* synthetic */ ptd(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        utd.a aVar = (utd.a) obj;
        if (((Boolean) this.a.transform(qtd.a).or((Optional) Boolean.FALSE)).booleanValue()) {
            return e0.a(z42.l(new ttd.a()));
        }
        return e0.h();
    }
}
