package defpackage;

import defpackage.kvd;
import defpackage.rwd;

/* renamed from: qwd  reason: default package */
class qwd implements kvd.d {
    final /* synthetic */ rwd.a a;

    qwd(rwd.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.kvd.d
    public void onGenerated(kvd kvd) {
        if (this.a.c instanceof dwd) {
            ((dwd) this.a.c).onPaletteGenerated(kvd);
        }
    }
}
