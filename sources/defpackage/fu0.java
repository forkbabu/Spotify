package defpackage;

import com.spotify.libs.connect.ConnectStates$State;
import com.spotify.libs.connect.instrumentation.f;
import com.spotify.ubi.specification.factories.m0;

/* renamed from: fu0  reason: default package */
public class fu0 implements f.a {
    private final ere a;
    private final bu0 b;

    public fu0(ere ere, bu0 bu0) {
        this.a = ere;
        this.b = bu0;
    }

    public void a(ConnectStates$State connectStates$State, String str, String str2) {
        nqe nqe;
        this.b.getClass();
        m0 m0Var = new m0(str);
        int ordinal = connectStates$State.ordinal();
        if (ordinal == 1) {
            nqe = m0Var.d().a(str2);
        } else if (ordinal == 2) {
            nqe = m0Var.c().a(str2);
        } else if (ordinal != 3) {
            nqe = m0Var.e().a(str2);
        } else {
            nqe = m0Var.b().a(str2);
        }
        this.a.a(nqe);
    }
}
