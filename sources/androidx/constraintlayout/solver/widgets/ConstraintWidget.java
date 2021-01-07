package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.c;
import androidx.constraintlayout.solver.widgets.analyzer.k;
import androidx.constraintlayout.solver.widgets.analyzer.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget {
    private boolean A = false;
    public float[] A0;
    private boolean B;
    protected ConstraintWidget[] B0;
    private boolean C = false;
    protected ConstraintWidget[] C0;
    private int D = 0;
    ConstraintWidget D0;
    private int E = 0;
    ConstraintWidget E0;
    public ConstraintAnchor F;
    public int F0;
    public ConstraintAnchor G;
    public int G0;
    public ConstraintAnchor H;
    public ConstraintAnchor I;
    public ConstraintAnchor J;
    ConstraintAnchor K;
    ConstraintAnchor L;
    public ConstraintAnchor M;
    public ConstraintAnchor[] N;
    protected ArrayList<ConstraintAnchor> O;
    private boolean[] P;
    public DimensionBehaviour[] Q;
    public ConstraintWidget R;
    int S;
    int T;
    public float U;
    protected int V;
    protected int W;
    protected int X;
    int Y;
    int Z;
    public boolean a = false;
    protected int a0;
    public c b;
    protected int b0;
    public c c;
    int c0;
    public k d = null;
    protected int d0;
    public m e = null;
    protected int e0;
    public boolean[] f = {true, true};
    float f0;
    private boolean g = true;
    float g0;
    private boolean h = false;
    private Object h0;
    private boolean i = false;
    private int i0;
    public int j = -1;
    private int j0;
    public int k = -1;
    private String k0;
    public int l = 0;
    private String l0;
    public int m = 0;
    int m0;
    public int[] n = new int[2];
    int n0;
    public int o = 0;
    int o0;
    public int p = 0;
    int p0;
    public float q = 1.0f;
    boolean q0;
    public int r = 0;
    boolean r0;
    public int s = 0;
    boolean s0;
    public float t = 1.0f;
    boolean t0;
    public boolean u;
    boolean u0;
    public boolean v;
    boolean v0;
    int w = -1;
    int w0;
    float x = 1.0f;
    int x0;
    private int[] y = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    boolean y0;
    private float z = 0.0f;
    boolean z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.F = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.G = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.H = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.I = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.J = constraintAnchor5;
        this.K = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.L = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.M = constraintAnchor6;
        this.N = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.O = arrayList;
        this.P = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.Q = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.R = null;
        this.S = 0;
        this.T = 0;
        this.U = 0.0f;
        this.V = -1;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = null;
        this.l0 = null;
        this.w0 = 0;
        this.x0 = 0;
        this.A0 = new float[]{-1.0f, -1.0f};
        this.B0 = new ConstraintWidget[]{null, null};
        this.C0 = new ConstraintWidget[]{null, null};
        this.D0 = null;
        this.E0 = null;
        this.F0 = -1;
        this.G0 = -1;
        arrayList.add(this.F);
        this.O.add(this.G);
        this.O.add(this.H);
        this.O.add(this.I);
        this.O.add(this.K);
        this.O.add(this.L);
        this.O.add(this.M);
        this.O.add(this.J);
    }

    private boolean S(int i2) {
        int i3 = i2 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.N;
        if (!(constraintAnchorArr[i3].f == null || constraintAnchorArr[i3].f.f == constraintAnchorArr[i3])) {
            int i4 = i3 + 1;
            if (constraintAnchorArr[i4].f != null && constraintAnchorArr[i4].f.f == constraintAnchorArr[i4]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0317 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0436 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x045c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:319:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:323:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(androidx.constraintlayout.solver.d r31, boolean r32, boolean r33, boolean r34, boolean r35, androidx.constraintlayout.solver.SolverVariable r36, androidx.constraintlayout.solver.SolverVariable r37, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r38, boolean r39, androidx.constraintlayout.solver.widgets.ConstraintAnchor r40, androidx.constraintlayout.solver.widgets.ConstraintAnchor r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
        // Method dump skipped, instructions count: 1217
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.h(androidx.constraintlayout.solver.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A() {
        return this.D;
    }

    public void A0(int i2) {
        if (i2 < 0) {
            this.d0 = 0;
        } else {
            this.d0 = i2;
        }
    }

    public int B() {
        return this.E;
    }

    public void B0(int i2, int i3) {
        this.W = i2;
        this.X = i3;
    }

    public int C() {
        return this.y[1];
    }

    public void C0(float f2) {
        this.g0 = f2;
    }

    public int D() {
        return this.y[0];
    }

    public void D0(int i2) {
        this.x0 = i2;
    }

    public int E() {
        return this.e0;
    }

    public void E0(DimensionBehaviour dimensionBehaviour) {
        this.Q[1] = dimensionBehaviour;
    }

    public int F() {
        return this.d0;
    }

    public void F0(int i2) {
        this.j0 = i2;
    }

    public ConstraintWidget G(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor3 = this.H;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
            if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
                return null;
            }
            return constraintAnchor4.d;
        } else if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.I).f) != null && constraintAnchor2.f == constraintAnchor) {
            return constraintAnchor2.d;
        } else {
            return null;
        }
    }

    public void G0(int i2) {
        this.S = i2;
        int i3 = this.d0;
        if (i2 < i3) {
            this.S = i3;
        }
    }

    public ConstraintWidget H(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor3 = this.F;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
            if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
                return null;
            }
            return constraintAnchor4.d;
        } else if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.G).f) != null && constraintAnchor2.f == constraintAnchor) {
            return constraintAnchor2.d;
        } else {
            return null;
        }
    }

    public void H0(int i2) {
        this.W = i2;
    }

    public int I() {
        return O() + this.S;
    }

    public void I0(int i2) {
        this.X = i2;
    }

    public float J() {
        return this.g0;
    }

    public void J0(boolean z2, boolean z3) {
        int i2;
        int i3;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        boolean k2 = z2 & this.d.k();
        boolean k3 = z3 & this.e.k();
        k kVar = this.d;
        int i4 = kVar.h.g;
        m mVar = this.e;
        int i5 = mVar.h.g;
        int i6 = kVar.i.g;
        int i7 = mVar.i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (k2) {
            this.W = i4;
        }
        if (k3) {
            this.X = i5;
        }
        if (this.j0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        if (k2) {
            if (this.Q[0] == dimensionBehaviour && i9 < (i3 = this.S)) {
                i9 = i3;
            }
            this.S = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.S = i11;
            }
        }
        if (k3) {
            if (this.Q[1] == dimensionBehaviour && i10 < (i2 = this.T)) {
                i10 = i2;
            }
            this.T = i10;
            int i12 = this.e0;
            if (i10 < i12) {
                this.T = i12;
            }
        }
    }

    public int K() {
        return this.x0;
    }

    public void K0(d dVar, boolean z2) {
        int i2;
        int i3;
        m mVar;
        k kVar;
        int p2 = dVar.p(this.F);
        int p3 = dVar.p(this.G);
        int p4 = dVar.p(this.H);
        int p5 = dVar.p(this.I);
        if (z2 && (kVar = this.d) != null) {
            DependencyNode dependencyNode = kVar.h;
            if (dependencyNode.j) {
                DependencyNode dependencyNode2 = kVar.i;
                if (dependencyNode2.j) {
                    p2 = dependencyNode.g;
                    p4 = dependencyNode2.g;
                }
            }
        }
        if (z2 && (mVar = this.e) != null) {
            DependencyNode dependencyNode3 = mVar.h;
            if (dependencyNode3.j) {
                DependencyNode dependencyNode4 = mVar.i;
                if (dependencyNode4.j) {
                    p3 = dependencyNode3.g;
                    p5 = dependencyNode4.g;
                }
            }
        }
        int i4 = p5 - p3;
        if (p4 - p2 < 0 || i4 < 0 || p2 == Integer.MIN_VALUE || p2 == Integer.MAX_VALUE || p3 == Integer.MIN_VALUE || p3 == Integer.MAX_VALUE || p4 == Integer.MIN_VALUE || p4 == Integer.MAX_VALUE || p5 == Integer.MIN_VALUE || p5 == Integer.MAX_VALUE) {
            p5 = 0;
            p2 = 0;
            p3 = 0;
            p4 = 0;
        }
        int i5 = p4 - p2;
        int i6 = p5 - p3;
        this.W = p2;
        this.X = p3;
        if (this.j0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.Q;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i5 < (i3 = this.S)) {
            i5 = i3;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i6 < (i2 = this.T)) {
            i6 = i2;
        }
        this.S = i5;
        this.T = i6;
        int i7 = this.e0;
        if (i6 < i7) {
            this.T = i7;
        }
        int i8 = this.d0;
        if (i5 < i8) {
            this.S = i8;
        }
    }

    public DimensionBehaviour L() {
        return this.Q[1];
    }

    public int M() {
        return this.j0;
    }

    public int N() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.S;
    }

    public int O() {
        ConstraintWidget constraintWidget = this.R;
        if (constraintWidget == null || !(constraintWidget instanceof d)) {
            return this.W;
        }
        return ((d) constraintWidget).N0 + this.W;
    }

    public int P() {
        ConstraintWidget constraintWidget = this.R;
        if (constraintWidget == null || !(constraintWidget instanceof d)) {
            return this.X;
        }
        return ((d) constraintWidget).O0 + this.X;
    }

    public boolean Q() {
        return this.A;
    }

    public boolean R(int i2) {
        if (i2 == 0) {
            return (this.F.f != null ? 1 : 0) + (this.H.f != null ? 1 : 0) < 2;
        }
        if ((this.G.f != null ? 1 : 0) + (this.I.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public boolean T() {
        ConstraintAnchor constraintAnchor = this.F;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.H;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public boolean U() {
        return this.B;
    }

    public boolean V() {
        ConstraintAnchor constraintAnchor = this.G;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.I;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public boolean W() {
        return this.C;
    }

    public boolean X() {
        return this.g && this.j0 != 8;
    }

    public boolean Y() {
        return this.h || (this.F.k() && this.H.k());
    }

    public boolean Z() {
        return this.i || (this.G.k() && this.I.k());
    }

    public void a0() {
        this.F.n();
        this.G.n();
        this.H.n();
        this.I.n();
        this.J.n();
        this.K.n();
        this.L.n();
        this.M.n();
        this.R = null;
        this.z = 0.0f;
        this.S = 0;
        this.T = 0;
        this.U = 0.0f;
        this.V = -1;
        this.W = 0;
        this.X = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.Q;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.l0 = null;
        this.u0 = false;
        this.v0 = false;
        this.w0 = 0;
        this.x0 = 0;
        this.y0 = false;
        this.z0 = false;
        float[] fArr = this.A0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.j = -1;
        this.k = -1;
        int[] iArr = this.y;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.l = 0;
        this.m = 0;
        this.q = 1.0f;
        this.t = 1.0f;
        this.p = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.o = 0;
        this.r = 0;
        this.w = -1;
        this.x = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.C = false;
        boolean[] zArr2 = this.P;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
    }

    public void b0() {
        ConstraintWidget constraintWidget = this.R;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).n();
        }
    }

    public void c0() {
        this.h = false;
        this.i = false;
        int size = this.O.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.O.get(i2).o();
        }
    }

    public void d(d dVar, d dVar2, HashSet<ConstraintWidget> hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                i.a(dVar, dVar2, this);
                hashSet.remove(this);
                f(dVar2, dVar.a1(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet<ConstraintAnchor> d2 = this.F.d();
            if (d2 != null) {
                Iterator<ConstraintAnchor> it = d2.iterator();
                while (it.hasNext()) {
                    it.next().d.d(dVar, dVar2, hashSet, i2, true);
                }
            }
            HashSet<ConstraintAnchor> d3 = this.H.d();
            if (d3 != null) {
                Iterator<ConstraintAnchor> it2 = d3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.d(dVar, dVar2, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> d4 = this.G.d();
        if (d4 != null) {
            Iterator<ConstraintAnchor> it3 = d4.iterator();
            while (it3.hasNext()) {
                it3.next().d.d(dVar, dVar2, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> d5 = this.I.d();
        if (d5 != null) {
            Iterator<ConstraintAnchor> it4 = d5.iterator();
            while (it4.hasNext()) {
                it4.next().d.d(dVar, dVar2, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> d6 = this.J.d();
        if (d6 != null) {
            Iterator<ConstraintAnchor> it5 = d6.iterator();
            while (it5.hasNext()) {
                it5.next().d.d(dVar, dVar2, hashSet, i2, true);
            }
        }
    }

    public void d0(androidx.constraintlayout.solver.c cVar) {
        this.F.p();
        this.G.p();
        this.H.p();
        this.I.p();
        this.J.p();
        this.M.p();
        this.K.p();
        this.L.p();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return (this instanceof j) || (this instanceof f);
    }

    public void e0(int i2) {
        this.c0 = i2;
        this.A = i2 > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:228:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x063c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(androidx.constraintlayout.solver.d r54, boolean r55) {
        /*
        // Method dump skipped, instructions count: 1761
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.f(androidx.constraintlayout.solver.d, boolean):void");
    }

    public void f0(Object obj) {
        this.h0 = obj;
    }

    public boolean g() {
        return this.j0 != 8;
    }

    public void g0(String str) {
        this.k0 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.U = r9
            r8.V = r1
        L_0x008d:
            return
        L_0x008e:
            r8.U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.h0(java.lang.String):void");
    }

    public void i(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2) {
        boolean z2;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.CENTER_Y;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.CENTER_X;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.LEFT;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.TOP;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.BOTTOM;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.CENTER;
        if (type == type9) {
            if (type2 == type9) {
                ConstraintAnchor o2 = o(type5);
                ConstraintAnchor o3 = o(type7);
                ConstraintAnchor o4 = o(type6);
                ConstraintAnchor o5 = o(type8);
                boolean z3 = true;
                if ((o2 == null || !o2.l()) && (o3 == null || !o3.l())) {
                    i(type5, constraintWidget, type5, 0);
                    i(type7, constraintWidget, type7, 0);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((o4 == null || !o4.l()) && (o5 == null || !o5.l())) {
                    i(type6, constraintWidget, type6, 0);
                    i(type8, constraintWidget, type8, 0);
                } else {
                    z3 = false;
                }
                if (z2 && z3) {
                    o(type9).a(constraintWidget.o(type9), 0);
                } else if (z2) {
                    o(type4).a(constraintWidget.o(type4), 0);
                } else if (z3) {
                    o(type3).a(constraintWidget.o(type3), 0);
                }
            } else if (type2 == type5 || type2 == type7) {
                i(type5, constraintWidget, type2, 0);
                i(type7, constraintWidget, type2, 0);
                o(type9).a(constraintWidget.o(type2), 0);
            } else if (type2 == type6 || type2 == type8) {
                i(type6, constraintWidget, type2, 0);
                i(type8, constraintWidget, type2, 0);
                o(type9).a(constraintWidget.o(type2), 0);
            }
        } else if (type == type4 && (type2 == type5 || type2 == type7)) {
            ConstraintAnchor o6 = o(type5);
            ConstraintAnchor o7 = constraintWidget.o(type2);
            ConstraintAnchor o8 = o(type7);
            o6.a(o7, 0);
            o8.a(o7, 0);
            o(type4).a(o7, 0);
        } else if (type == type3 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor o9 = constraintWidget.o(type2);
            o(type6).a(o9, 0);
            o(type8).a(o9, 0);
            o(type3).a(o9, 0);
        } else if (type == type4 && type2 == type4) {
            o(type5).a(constraintWidget.o(type5), 0);
            o(type7).a(constraintWidget.o(type7), 0);
            o(type4).a(constraintWidget.o(type2), 0);
        } else if (type == type3 && type2 == type3) {
            o(type6).a(constraintWidget.o(type6), 0);
            o(type8).a(constraintWidget.o(type8), 0);
            o(type3).a(constraintWidget.o(type2), 0);
        } else {
            ConstraintAnchor o10 = o(type);
            ConstraintAnchor o11 = constraintWidget.o(type2);
            if (o10.m(o11)) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.BASELINE;
                if (type == type10) {
                    ConstraintAnchor o12 = o(type6);
                    ConstraintAnchor o13 = o(type8);
                    if (o12 != null) {
                        o12.n();
                    }
                    if (o13 != null) {
                        o13.n();
                    }
                    i2 = 0;
                } else if (type == type6 || type == type8) {
                    ConstraintAnchor o14 = o(type10);
                    if (o14 != null) {
                        o14.n();
                    }
                    ConstraintAnchor o15 = o(type9);
                    if (o15.f != o11) {
                        o15.n();
                    }
                    ConstraintAnchor g2 = o(type).g();
                    ConstraintAnchor o16 = o(type3);
                    if (o16.l()) {
                        g2.n();
                        o16.n();
                    }
                } else if (type == type5 || type == type7) {
                    ConstraintAnchor o17 = o(type9);
                    if (o17.f != o11) {
                        o17.n();
                    }
                    ConstraintAnchor g3 = o(type).g();
                    ConstraintAnchor o18 = o(type4);
                    if (o18.l()) {
                        g3.n();
                        o18.n();
                    }
                }
                o10.a(o11, i2);
            }
        }
    }

    public void i0(int i2) {
        if (this.A) {
            int i3 = i2 - this.c0;
            int i4 = this.T + i3;
            this.X = i3;
            this.G.q(i3);
            this.I.q(i4);
            this.J.q(i2);
            this.i = true;
        }
    }

    public void j(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        if (constraintAnchor.d == this) {
            i(constraintAnchor.e, constraintAnchor2.d, constraintAnchor2.e, i2);
        }
    }

    public void j0(int i2, int i3) {
        this.F.q(i2);
        this.H.q(i3);
        this.W = i2;
        this.S = i3 - i2;
        this.h = true;
    }

    public void k(ConstraintWidget constraintWidget, float f2, int i2) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        o(type).b(constraintWidget.o(type), i2, 0, true);
        this.z = f2;
    }

    public void k0(int i2) {
        this.F.q(i2);
        this.W = i2;
    }

    public void l(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.j = constraintWidget.j;
        this.k = constraintWidget.k;
        this.l = constraintWidget.l;
        this.m = constraintWidget.m;
        int[] iArr = this.n;
        int[] iArr2 = constraintWidget.n;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.o = constraintWidget.o;
        this.p = constraintWidget.p;
        this.r = constraintWidget.r;
        this.s = constraintWidget.s;
        this.t = constraintWidget.t;
        this.u = constraintWidget.u;
        this.v = constraintWidget.v;
        this.w = constraintWidget.w;
        this.x = constraintWidget.x;
        int[] iArr3 = constraintWidget.y;
        this.y = Arrays.copyOf(iArr3, iArr3.length);
        this.z = constraintWidget.z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        this.F.n();
        this.G.n();
        this.H.n();
        this.I.n();
        this.J.n();
        this.K.n();
        this.L.n();
        this.M.n();
        this.Q = (DimensionBehaviour[]) Arrays.copyOf(this.Q, 2);
        ConstraintWidget constraintWidget2 = null;
        this.R = this.R == null ? null : hashMap.get(constraintWidget.R);
        this.S = constraintWidget.S;
        this.T = constraintWidget.T;
        this.U = constraintWidget.U;
        this.V = constraintWidget.V;
        this.W = constraintWidget.W;
        this.X = constraintWidget.X;
        this.Y = constraintWidget.Y;
        this.Z = constraintWidget.Z;
        this.a0 = constraintWidget.a0;
        this.b0 = constraintWidget.b0;
        this.c0 = constraintWidget.c0;
        this.d0 = constraintWidget.d0;
        this.e0 = constraintWidget.e0;
        this.f0 = constraintWidget.f0;
        this.g0 = constraintWidget.g0;
        this.h0 = constraintWidget.h0;
        this.i0 = constraintWidget.i0;
        this.j0 = constraintWidget.j0;
        this.k0 = constraintWidget.k0;
        this.l0 = constraintWidget.l0;
        this.m0 = constraintWidget.m0;
        this.n0 = constraintWidget.n0;
        this.o0 = constraintWidget.o0;
        this.p0 = constraintWidget.p0;
        this.q0 = constraintWidget.q0;
        this.r0 = constraintWidget.r0;
        this.s0 = constraintWidget.s0;
        this.t0 = constraintWidget.t0;
        this.u0 = constraintWidget.u0;
        this.v0 = constraintWidget.v0;
        this.w0 = constraintWidget.w0;
        this.x0 = constraintWidget.x0;
        this.y0 = constraintWidget.y0;
        this.z0 = constraintWidget.z0;
        float[] fArr = this.A0;
        float[] fArr2 = constraintWidget.A0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.B0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.B0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.C0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.C0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.D0;
        this.D0 = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.E0;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.E0 = constraintWidget2;
    }

    public void l0(int i2) {
        this.G.q(i2);
        this.X = i2;
    }

    public void m(d dVar) {
        dVar.l(this.F);
        dVar.l(this.G);
        dVar.l(this.H);
        dVar.l(this.I);
        if (this.c0 > 0) {
            dVar.l(this.J);
        }
    }

    public void m0(int i2, int i3) {
        this.G.q(i2);
        this.I.q(i3);
        this.X = i2;
        this.T = i3 - i2;
        if (this.A) {
            this.J.q(i2 + this.c0);
        }
        this.i = true;
    }

    public void n() {
        if (this.d == null) {
            this.d = new k(this);
        }
        if (this.e == null) {
            this.e = new m(this);
        }
    }

    public void n0(boolean z2) {
        this.A = z2;
    }

    public ConstraintAnchor o(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.F;
            case 2:
                return this.G;
            case 3:
                return this.H;
            case 4:
                return this.I;
            case 5:
                return this.J;
            case 6:
                return this.M;
            case 7:
                return this.K;
            case 8:
                return this.L;
            default:
                throw new AssertionError(type.name());
        }
    }

    public void o0(int i2) {
        this.T = i2;
        int i3 = this.e0;
        if (i2 < i3) {
            this.T = i3;
        }
    }

    public int p() {
        return this.c0;
    }

    public void p0(float f2) {
        this.f0 = f2;
    }

    public float q(int i2) {
        if (i2 == 0) {
            return this.f0;
        }
        if (i2 == 1) {
            return this.g0;
        }
        return -1.0f;
    }

    public void q0(int i2) {
        this.w0 = i2;
    }

    public int r() {
        return P() + this.T;
    }

    public void r0(DimensionBehaviour dimensionBehaviour) {
        this.Q[0] = dimensionBehaviour;
    }

    public Object s() {
        return this.h0;
    }

    /* access modifiers changed from: protected */
    public void s0(int i2, boolean z2) {
        this.P[i2] = z2;
    }

    public String t() {
        return this.k0;
    }

    public void t0(boolean z2) {
        this.B = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(this.l0 != null ? je.I0(je.V0("type: "), this.l0, " ") : str);
        if (this.k0 != null) {
            str = je.I0(je.V0("id: "), this.k0, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.W);
        sb.append(", ");
        sb.append(this.X);
        sb.append(") - (");
        sb.append(this.S);
        sb.append(" x ");
        return je.B0(sb, this.T, ")");
    }

    public DimensionBehaviour u(int i2) {
        if (i2 == 0) {
            return z();
        }
        if (i2 == 1) {
            return L();
        }
        return null;
    }

    public void u0(boolean z2) {
        this.C = z2;
    }

    public int v() {
        return this.V;
    }

    public void v0(int i2, int i3) {
        this.D = i2;
        this.E = i3;
        this.g = false;
    }

    public int w() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.T;
    }

    public void w0(int i2) {
        this.y[1] = i2;
    }

    public float x() {
        return this.f0;
    }

    public void x0(int i2) {
        this.y[0] = i2;
    }

    public int y() {
        return this.w0;
    }

    public void y0(boolean z2) {
        this.g = z2;
    }

    public DimensionBehaviour z() {
        return this.Q[0];
    }

    public void z0(int i2) {
        if (i2 < 0) {
            this.e0 = 0;
        } else {
            this.e0 = i2;
        }
    }
}
