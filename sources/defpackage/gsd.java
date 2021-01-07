package defpackage;

import com.google.common.base.Optional;
import com.spotify.packagevalidator.denylist.cache.db.a;
import com.spotify.packagevalidator.denylist.cache.db.b;
import com.spotify.packagevalidator.denylist.data.AndroidDenylist;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: gsd  reason: default package */
public class gsd implements isd {
    private final b a;
    private final y b;
    private final cqe c;

    public gsd(b bVar, y yVar, cqe cqe) {
        this.a = bVar;
        this.b = yVar;
        this.c = cqe;
    }

    @Override // defpackage.isd
    public z<Optional<a>> a() {
        return this.a.a().A(fsd.a).E(esd.a).H(this.b);
    }

    @Override // defpackage.isd
    public io.reactivex.a b(AndroidDenylist androidDenylist) {
        return this.a.c().B().G(this.b).d(this.a.b(new a(androidDenylist.packageNames(), androidDenylist.appSignatures(), this.c.d())).B().G(this.b));
    }
}
