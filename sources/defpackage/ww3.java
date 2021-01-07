package defpackage;

import defpackage.k91;

/* renamed from: ww3  reason: default package */
public final /* synthetic */ class ww3 implements k91.a {
    public static final /* synthetic */ ww3 a = new ww3();

    private /* synthetic */ ww3() {
    }

    @Override // defpackage.k91.a
    public final s81 a(s81 s81) {
        q81 q81 = ay3.e;
        String id = s81.componentId().id();
        return "freetier:offlineSwitchComponent".equals(id) || ay3.e.id().equals(id) ? z81.c().s("download-toggle").n(ay3.e).e("click", z81.b().e("download")).h(s81.logging()).l() : s81;
    }
}
