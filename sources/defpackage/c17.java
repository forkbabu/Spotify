package defpackage;

import io.reactivex.functions.d;

/* renamed from: c17  reason: default package */
public final /* synthetic */ class c17 implements d {
    public static final /* synthetic */ c17 a = new c17();

    private /* synthetic */ c17() {
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
