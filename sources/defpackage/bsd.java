package defpackage;

import com.google.common.base.Optional;
import com.spotify.packagevalidator.denylist.cache.db.a;
import com.spotify.packagevalidator.denylist.data.AndroidDenylist;
import io.reactivex.d0;
import io.reactivex.z;

/* renamed from: bsd  reason: default package */
public class bsd implements asd {
    private final dsd a;
    private final isd b;
    private final jsd c;

    public bsd(dsd dsd, isd isd, jsd jsd) {
        this.a = dsd;
        this.b = isd;
        this.c = jsd;
    }

    @Override // defpackage.asd
    public z<AndroidDenylist> a() {
        return this.b.a().s(new xrd(this));
    }

    public d0 b(Optional optional) {
        if (!optional.isPresent() || this.c.a((a) optional.get())) {
            return this.a.a().A(yrd.a).s(new vrd(this)).E(new wrd(optional));
        }
        a aVar = (a) optional.get();
        return z.z(AndroidDenylist.create(aVar.b(), aVar.a()));
    }

    public /* synthetic */ d0 c(AndroidDenylist androidDenylist) {
        return this.b.b(androidDenylist).h(z.z(androidDenylist));
    }
}
