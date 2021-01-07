package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.h;
import androidx.constraintlayout.solver.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {
    private HashSet<ConstraintAnchor> a = null;
    private int b;
    private boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public int g = 0;
    int h = -1;
    SolverVariable i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.d = constraintWidget;
        this.e = type;
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i2) {
        return b(constraintAnchor, i2, -1, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z) {
        if (constraintAnchor == null) {
            n();
            return true;
        } else if (!z && !m(constraintAnchor)) {
            return false;
        } else {
            this.f = constraintAnchor;
            if (constraintAnchor.a == null) {
                constraintAnchor.a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i2 > 0) {
                this.g = i2;
            } else {
                this.g = 0;
            }
            this.h = i3;
            return true;
        }
    }

    public void c(int i2, ArrayList<n> arrayList, n nVar) {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                h.a(it.next().d, i2, arrayList, nVar);
            }
        }
    }

    public HashSet<ConstraintAnchor> d() {
        return this.a;
    }

    public int e() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public int f() {
        ConstraintAnchor constraintAnchor;
        if (this.d.M() == 8) {
            return 0;
        }
        if (this.h <= -1 || (constraintAnchor = this.f) == null || constraintAnchor.d.M() != 8) {
            return this.g;
        }
        return this.h;
    }

    public final ConstraintAnchor g() {
        switch (this.e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.d.H;
            case 2:
                return this.d.I;
            case 3:
                return this.d.F;
            case 4:
                return this.d.G;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public SolverVariable h() {
        return this.i;
    }

    public boolean i() {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().l()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean k() {
        return this.c;
    }

    public boolean l() {
        return this.f != null;
    }

    public boolean m(ConstraintAnchor constraintAnchor) {
        Type type = Type.CENTER_Y;
        Type type2 = Type.CENTER_X;
        Type type3 = Type.BASELINE;
        boolean z = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type4 = constraintAnchor.e;
        Type type5 = this.e;
        if (type4 != type5) {
            switch (type5.ordinal()) {
                case 0:
                case 5:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    boolean z2 = type4 == Type.LEFT || type4 == Type.RIGHT;
                    if (!(constraintAnchor.d instanceof f)) {
                        return z2;
                    }
                    if (z2 || type4 == type2) {
                        z = true;
                    }
                    return z;
                case 2:
                case 4:
                    boolean z3 = type4 == Type.TOP || type4 == Type.BOTTOM;
                    if (!(constraintAnchor.d instanceof f)) {
                        return z3;
                    }
                    if (z3 || type4 == type) {
                        z = true;
                    }
                    return z;
                case 6:
                    if (type4 == type3 || type4 == type2 || type4 == type) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.e.name());
            }
        } else if (type5 != type3 || (constraintAnchor.d.Q() && this.d.Q())) {
            return true;
        } else {
            return false;
        }
    }

    public void n() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.a) == null)) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = -1;
        this.c = false;
        this.b = 0;
    }

    public void o() {
        this.c = false;
        this.b = 0;
    }

    public void p() {
        SolverVariable solverVariable = this.i;
        if (solverVariable == null) {
            this.i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.d();
        }
    }

    public void q(int i2) {
        this.b = i2;
        this.c = true;
    }

    public void r(int i2) {
        if (l()) {
            this.h = i2;
        }
    }

    public String toString() {
        return this.d.t() + ":" + this.e.toString();
    }
}
