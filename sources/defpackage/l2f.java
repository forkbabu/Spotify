package defpackage;

import com.spotify.mobius.e0;
import defpackage.p2f;
import defpackage.q2f;

/* renamed from: l2f  reason: default package */
public final /* synthetic */ class l2f implements ti0 {
    public static final /* synthetic */ l2f a = new l2f();

    private /* synthetic */ l2f() {
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002e: APUT  
      (r0v1 p2f[])
      (3 ??[int, float, short, byte, char])
      (wrap: p2f$c : 0x002b: CONSTRUCTOR  (r2v3 p2f$c) = (r4v3 java.lang.String) call: p2f.c.<init>(java.lang.String):void type: CONSTRUCTOR)
     */
    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        boolean v = ((q2f.a) obj).v();
        p2f[] p2fArr = new p2f[4];
        p2fArr[0] = new p2f.e0();
        p2fArr[1] = new p2f.b0();
        p2fArr[2] = new p2f.d0();
        p2fArr[3] = new p2f.c(v ? "ACCEPT" : "REJECT");
        return e0.a(z42.l(p2fArr));
    }
}
