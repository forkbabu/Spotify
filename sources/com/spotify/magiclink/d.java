package com.spotify.magiclink;

import com.spotify.login.w0;

public final /* synthetic */ class d implements si0 {
    public final /* synthetic */ q a;

    public /* synthetic */ d(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        q qVar = this.a;
        w0.a aVar = (w0.a) obj;
        qVar.getClass();
        if (aVar.c() == 1) {
            MagicLinkActivity magicLinkActivity = qVar.a;
            magicLinkActivity.E.a(i11.d(p11.c(), m11.a()));
            magicLinkActivity.F.a(magicLinkActivity);
            return;
        }
        MagicLinkActivity.P0(qVar.a, aVar.c());
    }
}
