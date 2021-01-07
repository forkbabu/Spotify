package com.spotify.signup.splitflow;

import defpackage.iee;
import defpackage.lee;

public final /* synthetic */ class l0 implements si0 {
    public final /* synthetic */ x1 a;

    public /* synthetic */ l0(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        x1 x1Var = this.a;
        iee.b bVar = (iee.b) obj;
        x1Var.getClass();
        if (bVar.y() instanceof lee.a) {
            ((lee.a) bVar.y()).a().match(w0.a, new s0(x1Var), new s1(x1Var));
        } else if (bVar.y() instanceof lee.c) {
            ((lee.c) bVar.y()).a().match(p1.a, new g0(x1Var), new o1(x1Var));
        } else if (bVar.y() instanceof lee.b) {
            ((lee.b) bVar.y()).a().match(x.a, new m1(x1Var));
        }
    }
}
