package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.premiummini.k;
import com.spotify.remoteconfig.d5;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ay3  reason: default package */
public class ay3 implements w<b91, b91> {
    public static final q81 e = z81.d("row:downloadToggle", HubsComponentCategory.ROW.name());
    private final com.spotify.mobile.android.rx.w a;
    private final vwc b;
    private final k c;
    private final d5 d;

    public ay3(com.spotify.mobile.android.rx.w wVar, vwc vwc, d5 d5Var, k kVar) {
        this.a = wVar;
        this.b = vwc;
        this.d = d5Var;
        this.c = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[EDGE_INSN: B:15:0x0052->B:13:0x0052 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.b91 a(defpackage.ay3 r2, boolean r3, boolean r4, defpackage.b91 r5) {
        /*
            com.spotify.remoteconfig.d5 r2 = r2.d
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x001a
            if (r4 == 0) goto L_0x000b
            goto L_0x001a
        L_0x000b:
            if (r3 != 0) goto L_0x000e
            goto L_0x0056
        L_0x000e:
            k91 r2 = new k91
            ww3 r3 = defpackage.ww3.a
            r2.<init>(r3)
            b91 r5 = r2.b(r5)
            goto L_0x0056
        L_0x001a:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = r5.body()
            r2.<init>(r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x0027:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r3.next()
            s81 r4 = (defpackage.s81) r4
            q81 r0 = r4.componentId()
            java.lang.String r0 = r0.id()
            java.lang.String r1 = "freetier:offlineSwitchComponent"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x004f
            q81 r1 = defpackage.ay3.e
            java.lang.String r1 = r1.id()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x004f:
            r2.remove(r4)
        L_0x0052:
            b91 r5 = defpackage.je.L(r5, r2)
        L_0x0056:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay3.a(ay3, boolean, boolean, b91):b91");
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        vwc vwc = this.b;
        com.spotify.mobile.android.rx.w wVar = this.a;
        vwc.getClass();
        wVar.getClass();
        return s.m(wVar.a("offline").j0(new qwc("1")), this.c.b(), sVar, new xw3(this)).E();
    }
}
