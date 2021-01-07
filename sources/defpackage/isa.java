package defpackage;

import defpackage.s81;

/* renamed from: isa  reason: default package */
public class isa implements dsa {
    @Override // defpackage.dsa
    public s81.a a(s81.a aVar) {
        x81 main = aVar.l().images().main();
        if (main == null) {
            return aVar;
        }
        return aVar.t(z81.f().f(main.toBuilder().b("style", "circular")));
    }
}
