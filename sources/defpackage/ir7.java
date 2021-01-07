package defpackage;

import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import defpackage.gs7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: ir7  reason: default package */
public final /* synthetic */ class ir7 implements g0 {
    public static final /* synthetic */ ir7 a = new ir7();

    private /* synthetic */ ir7() {
    }

    @Override // com.spotify.mobius.g0
    public final e0 a(Object obj, Object obj2) {
        Object obj3;
        hs7 hs7 = (hs7) obj;
        gs7 gs7 = (gs7) obj2;
        cs7 cs7 = new cs7(hs7);
        as7 as7 = new as7(hs7);
        ur7 ur7 = new ur7(hs7);
        wr7 wr7 = new wr7(hs7);
        sr7 sr7 = new sr7(hs7);
        ds7 ds7 = new ds7(hs7);
        vr7 vr7 = new vr7(hs7);
        yr7 yr7 = new yr7(hs7);
        bs7 bs7 = new bs7(hs7);
        xr7 xr7 = new xr7(hs7);
        tr7 tr7 = tr7.a;
        zr7 zr7 = zr7.a;
        gs7.getClass();
        h.e(cs7, "dc");
        h.e(as7, "cdpc");
        h.e(ur7, "pnc");
        h.e(wr7, "epc");
        h.e(sr7, "followClicked");
        h.e(ds7, "ppc");
        h.e(vr7, "followersClicked");
        h.e(yr7, "followingClicked");
        h.e(bs7, "sarpac");
        h.e(xr7, "sappc");
        h.e(tr7, "pic");
        h.e(zr7, "aic");
        if (gs7 instanceof gs7.c) {
            obj3 = cs7.invoke(gs7);
        } else if (gs7 instanceof gs7.b) {
            obj3 = as7.invoke(gs7);
        } else if (gs7 instanceof gs7.i) {
            obj3 = ur7.invoke(gs7);
        } else if (gs7 instanceof gs7.d) {
            obj3 = wr7.invoke(gs7);
        } else if (gs7 instanceof gs7.e) {
            obj3 = sr7.invoke(gs7);
        } else if (gs7 instanceof gs7.j) {
            obj3 = ds7.invoke(gs7);
        } else if (gs7 instanceof gs7.f) {
            obj3 = vr7.invoke(gs7);
        } else if (gs7 instanceof gs7.g) {
            obj3 = yr7.invoke(gs7);
        } else if (gs7 instanceof gs7.l) {
            obj3 = bs7.invoke(gs7);
        } else if (gs7 instanceof gs7.k) {
            obj3 = xr7.invoke(gs7);
        } else if (gs7 instanceof gs7.h) {
            obj3 = tr7.invoke(gs7);
        } else if (gs7 instanceof gs7.a) {
            obj3 = zr7.invoke(gs7);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (e0) obj3;
    }
}
