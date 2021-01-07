package com.spotify.music.features.nowplayingbar.view;

import defpackage.lu5;

public final /* synthetic */ class j implements si0 {
    public final /* synthetic */ s0 a;

    public /* synthetic */ j(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        s0 s0Var = this.a;
        lu5.b bVar = (lu5.b) obj;
        s0Var.a.A.i(bVar.g());
        s0Var.a.E.e(bVar);
        s0Var.a.x.accept(Boolean.TRUE);
    }
}
