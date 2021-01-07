package defpackage;

import io.reactivex.functions.d;

/* renamed from: ns6  reason: default package */
public final /* synthetic */ class ns6 implements d {
    public static final /* synthetic */ ns6 a = new ns6();

    private /* synthetic */ ns6() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        h76 h76 = (h76) obj;
        h76 h762 = (h76) obj2;
        if (h76 == null && h762 == null) {
            return true;
        }
        if (h76 == null || h762 == null || !h76.f().equals(h762.f()) || h76.j() != h762.j()) {
            return false;
        }
        return true;
    }
}
