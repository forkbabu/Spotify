package defpackage;

import defpackage.kvd;
import defpackage.owd;

/* renamed from: nwd  reason: default package */
class nwd implements kvd.d {
    final /* synthetic */ owd.a a;

    nwd(owd.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.kvd.d
    public void onGenerated(kvd kvd) {
        owd.a(owd.this, dwd.b(kvd));
    }
}
