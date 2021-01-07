package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.v;
import defpackage.om;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sl  reason: default package */
public final class sl implements om.c {
    private final int a;
    private final List<d0> b;

    public sl(int i, List<d0> list) {
        this.a = i;
        this.b = list;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0090 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.util.ArrayList */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.util.ArrayList */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.util.ArrayList */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    private List<d0> b(om.b bVar) {
        int i;
        String str;
        List list;
        if (c(32)) {
            return this.b;
        }
        v vVar = new v(bVar.d);
        ArrayList arrayList = this.b;
        while (vVar.a() > 0) {
            int x = vVar.x();
            int b2 = vVar.b() + vVar.x();
            if (x == 134) {
                arrayList = new ArrayList();
                int x2 = vVar.x() & 31;
                for (int i2 = 0; i2 < x2; i2++) {
                    String u = vVar.u(3);
                    int x3 = vVar.x();
                    boolean z = (x3 & 128) != 0;
                    if (z) {
                        i = x3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte x4 = (byte) vVar.x();
                    vVar.L(1);
                    if (z) {
                        list = Collections.singletonList(new byte[]{(byte) ((x4 & 64) != 0 ? 1 : 0)});
                    } else {
                        list = null;
                    }
                    arrayList.add(d0.v(null, str, null, -1, 0, u, i, null, Long.MAX_VALUE, list));
                }
            }
            vVar.K(b2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    private boolean c(int i) {
        return (i & this.a) != 0;
    }

    @Override // defpackage.om.c
    public om a(int i, om.b bVar) {
        if (i == 2) {
            return new dm(new wl(new qm(b(bVar))));
        }
        if (i == 3 || i == 4) {
            return new dm(new bm(bVar.b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new dm(new zl());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new dm(new yl(new jm(b(bVar))));
                    }
                    if (i == 89) {
                        return new dm(new ul(bVar.c));
                    }
                    if (i != 138) {
                        if (i == 172) {
                            return new dm(new pl(bVar.b));
                        }
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (c(16)) {
                                    return null;
                                } else {
                                    return new im(new km());
                                }
                            } else if (!c(64)) {
                                return null;
                            }
                        }
                        return new dm(new nl(bVar.b));
                    }
                    return new dm(new tl(bVar.b));
                } else if (c(4)) {
                    return null;
                } else {
                    return new dm(new xl(new jm(b(bVar)), c(1), c(8)));
                }
            } else if (c(2)) {
                return null;
            } else {
                return new dm(new am(bVar.b));
            }
        } else if (c(2)) {
            return null;
        } else {
            return new dm(new rl(false, bVar.b));
        }
    }

    public sl(int i) {
        List<d0> singletonList = Collections.singletonList(d0.u(null, "application/cea-608", 0, null, null));
        this.a = i;
        this.b = singletonList;
    }
}
