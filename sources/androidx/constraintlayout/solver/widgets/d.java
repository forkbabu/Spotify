package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class d extends k {
    b I0 = new b(this);
    public e J0 = new e(this);
    protected b.AbstractC0022b K0 = null;
    private boolean L0 = false;
    protected androidx.constraintlayout.solver.d M0 = new androidx.constraintlayout.solver.d();
    int N0;
    int O0;
    public int P0 = 0;
    public int Q0 = 0;
    c[] R0 = new c[4];
    c[] S0 = new c[4];
    private int T0 = 257;
    private boolean U0 = false;
    private boolean V0 = false;
    private WeakReference<ConstraintAnchor> W0 = null;
    private WeakReference<ConstraintAnchor> X0 = null;
    private WeakReference<ConstraintAnchor> Y0 = null;
    private WeakReference<ConstraintAnchor> Z0 = null;
    public b.a a1 = new b.a();

    public static boolean Z0(ConstraintWidget constraintWidget, b.AbstractC0022b bVar, b.a aVar, int i) {
        int i2;
        int i3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (bVar == null) {
            return false;
        }
        aVar.a = constraintWidget.z();
        aVar.b = constraintWidget.L();
        aVar.c = constraintWidget.N();
        aVar.d = constraintWidget.w();
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour3 == dimensionBehaviour4;
        boolean z2 = aVar.b == dimensionBehaviour4;
        boolean z3 = z && constraintWidget.U > 0.0f;
        boolean z4 = z2 && constraintWidget.U > 0.0f;
        if (z && constraintWidget.R(0) && constraintWidget.l == 0 && !z3) {
            aVar.a = dimensionBehaviour;
            if (z2 && constraintWidget.m == 0) {
                aVar.a = dimensionBehaviour2;
            }
            z = false;
        }
        if (z2 && constraintWidget.R(1) && constraintWidget.m == 0 && !z4) {
            aVar.b = dimensionBehaviour;
            if (z && constraintWidget.l == 0) {
                aVar.b = dimensionBehaviour2;
            }
            z2 = false;
        }
        if (constraintWidget.Y()) {
            aVar.a = dimensionBehaviour2;
            z = false;
        }
        if (constraintWidget.Z()) {
            aVar.b = dimensionBehaviour2;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.n[0] == 4) {
                aVar.a = dimensionBehaviour2;
            } else if (!z2) {
                if (aVar.b == dimensionBehaviour2) {
                    i3 = aVar.d;
                } else {
                    aVar.a = dimensionBehaviour;
                    bVar.b(constraintWidget, aVar);
                    i3 = aVar.f;
                }
                aVar.a = dimensionBehaviour2;
                int i4 = constraintWidget.V;
                if (i4 == 0 || i4 == -1) {
                    aVar.c = (int) (constraintWidget.U * ((float) i3));
                } else {
                    aVar.c = (int) (constraintWidget.U / ((float) i3));
                }
            }
        }
        if (z4) {
            if (constraintWidget.n[1] == 4) {
                aVar.b = dimensionBehaviour2;
            } else if (!z) {
                if (aVar.a == dimensionBehaviour2) {
                    i2 = aVar.c;
                } else {
                    aVar.b = dimensionBehaviour;
                    bVar.b(constraintWidget, aVar);
                    i2 = aVar.e;
                }
                aVar.b = dimensionBehaviour2;
                int i5 = constraintWidget.V;
                if (i5 == 0 || i5 == -1) {
                    aVar.d = (int) (((float) i2) / constraintWidget.U);
                } else {
                    aVar.d = (int) (((float) i2) * constraintWidget.U);
                }
            }
        }
        bVar.b(constraintWidget, aVar);
        constraintWidget.G0(aVar.e);
        constraintWidget.o0(aVar.f);
        constraintWidget.n0(aVar.h);
        constraintWidget.e0(aVar.g);
        aVar.j = 0;
        return aVar.i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void J0(boolean z, boolean z2) {
        super.J0(z, z2);
        int size = this.H0.size();
        for (int i = 0; i < size; i++) {
            this.H0.get(i).J0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0330  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.constraintlayout.solver.widgets.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L0() {
        /*
        // Method dump skipped, instructions count: 908
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.d.L0():void");
    }

    /* access modifiers changed from: package-private */
    public void M0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.P0 + 1;
            c[] cVarArr = this.S0;
            if (i2 >= cVarArr.length) {
                this.S0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.S0;
            int i3 = this.P0;
            cVarArr2[i3] = new c(constraintWidget, 0, this.L0);
            this.P0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.Q0 + 1;
            c[] cVarArr3 = this.R0;
            if (i4 >= cVarArr3.length) {
                this.R0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.R0;
            int i5 = this.Q0;
            cVarArr4[i5] = new c(constraintWidget, 1, this.L0);
            this.Q0 = i5 + 1;
        }
    }

    public boolean N0(androidx.constraintlayout.solver.d dVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean a12 = a1(64);
        f(dVar, a12);
        int size = this.H0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.H0.get(i);
            constraintWidget.s0(0, false);
            constraintWidget.s0(1, false);
            if (constraintWidget instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.H0.get(i2);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).R0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.H0.get(i3);
            if (constraintWidget3.e()) {
                constraintWidget3.f(dVar, a12);
            }
        }
        if (androidx.constraintlayout.solver.d.p) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = this.H0.get(i4);
                if (!constraintWidget4.e()) {
                    hashSet.add(constraintWidget4);
                }
            }
            d(this, dVar, hashSet, z() == dimensionBehaviour2 ? 0 : 1, false);
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                i.a(this, dVar, next);
                next.f(dVar, a12);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget5 = this.H0.get(i5);
                if (constraintWidget5 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget5.Q;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        dimensionBehaviourArr[0] = dimensionBehaviour;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        dimensionBehaviourArr[1] = dimensionBehaviour;
                    }
                    constraintWidget5.f(dVar, a12);
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        constraintWidget5.r0(dimensionBehaviour3);
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        constraintWidget5.E0(dimensionBehaviour4);
                    }
                } else {
                    i.a(this, dVar, constraintWidget5);
                    if (!constraintWidget5.e()) {
                        constraintWidget5.f(dVar, a12);
                    }
                }
            }
        }
        if (this.P0 > 0) {
            b.a(this, dVar, null, 0);
        }
        if (this.Q0 > 0) {
            b.a(this, dVar, null, 1);
        }
        return true;
    }

    public void O0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.Z0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.Z0.get().e()) {
            this.Z0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* access modifiers changed from: package-private */
    public void P0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.Y0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.Y0.get().e()) {
            this.Y0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.W0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.W0.get().e()) {
            this.W0 = new WeakReference<>(constraintAnchor);
        }
    }

    public void R0(androidx.constraintlayout.solver.e eVar) {
        this.M0.getClass();
    }

    public b.AbstractC0022b S0() {
        return this.K0;
    }

    public int T0() {
        return this.T0;
    }

    public androidx.constraintlayout.solver.d U0() {
        return this.M0;
    }

    public boolean V0() {
        return this.V0;
    }

    public boolean W0() {
        return this.L0;
    }

    public boolean X0() {
        return this.U0;
    }

    public long Y0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.N0 = i8;
        this.O0 = i9;
        this.I0.c(this, i, i2, i3, i4, i5);
        return 0;
    }

    @Override // androidx.constraintlayout.solver.widgets.k, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void a0() {
        this.M0.v();
        this.N0 = 0;
        this.O0 = 0;
        super.a0();
    }

    public boolean a1(int i) {
        return (this.T0 & i) == i;
    }

    public void b1(b.AbstractC0022b bVar) {
        this.K0 = bVar;
        this.J0.m(bVar);
    }

    public void c1(int i) {
        this.T0 = i;
        androidx.constraintlayout.solver.d.p = a1(512);
    }

    public void d1(boolean z) {
        this.L0 = z;
    }

    public void e1() {
        this.I0.d(this);
    }
}
