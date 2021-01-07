package defpackage;

import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import defpackage.mp7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: ap7  reason: default package */
public final /* synthetic */ class ap7 implements g0 {
    public static final /* synthetic */ ap7 a = new ap7();

    private /* synthetic */ ap7() {
    }

    @Override // com.spotify.mobius.g0
    public final e0 a(Object obj, Object obj2) {
        Object obj3;
        np7 np7 = (np7) obj;
        mp7 mp7 = (mp7) obj2;
        dp7 dp7 = new dp7(np7);
        hp7 hp7 = new hp7(np7);
        ep7 ep7 = new ep7(np7);
        fp7 fp7 = new fp7(np7);
        cp7 cp7 = cp7.a;
        jp7 jp7 = new jp7(np7);
        ip7 ip7 = new ip7(np7);
        gp7 gp7 = new gp7(np7);
        mp7.getClass();
        h.e(dp7, "i");
        h.e(hp7, "bpd");
        h.e(ep7, "bpdf");
        h.e(fp7, "cpd");
        h.e(cp7, "cpdf");
        h.e(jp7, "fsr");
        h.e(ip7, "rau");
        h.e(gp7, "rawtu");
        if (mp7 instanceof mp7.f) {
            obj3 = dp7.invoke(mp7);
        } else if (mp7 instanceof mp7.a) {
            obj3 = hp7.invoke(mp7);
        } else if (mp7 instanceof mp7.b) {
            obj3 = ep7.invoke(mp7);
        } else if (mp7 instanceof mp7.c) {
            obj3 = fp7.invoke(mp7);
        } else if (mp7 instanceof mp7.d) {
            obj3 = cp7.invoke(mp7);
        } else if (mp7 instanceof mp7.e) {
            obj3 = jp7.invoke(mp7);
        } else if (mp7 instanceof mp7.g) {
            obj3 = ip7.invoke(mp7);
        } else if (mp7 instanceof mp7.h) {
            obj3 = gp7.invoke(mp7);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (e0) obj3;
    }
}
