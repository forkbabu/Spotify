package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class i {
    static boolean[] a = new boolean[3];

    static void a(d dVar, d dVar2, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        constraintWidget.j = -1;
        constraintWidget.k = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar.Q[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour2 != dimensionBehaviour3 && constraintWidget.Q[0] == dimensionBehaviour) {
            int i = constraintWidget.F.g;
            int N = dVar.N() - constraintWidget.H.g;
            ConstraintAnchor constraintAnchor = constraintWidget.F;
            constraintAnchor.i = dVar2.l(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.H;
            constraintAnchor2.i = dVar2.l(constraintAnchor2);
            dVar2.e(constraintWidget.F.i, i);
            dVar2.e(constraintWidget.H.i, N);
            constraintWidget.j = 2;
            constraintWidget.W = i;
            int i2 = N - i;
            constraintWidget.S = i2;
            int i3 = constraintWidget.d0;
            if (i2 < i3) {
                constraintWidget.S = i3;
            }
        }
        if (dVar.Q[1] != dimensionBehaviour3 && constraintWidget.Q[1] == dimensionBehaviour) {
            int i4 = constraintWidget.G.g;
            int w = dVar.w() - constraintWidget.I.g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.G;
            constraintAnchor3.i = dVar2.l(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.I;
            constraintAnchor4.i = dVar2.l(constraintAnchor4);
            dVar2.e(constraintWidget.G.i, i4);
            dVar2.e(constraintWidget.I.i, w);
            if (constraintWidget.c0 > 0 || constraintWidget.M() == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.J;
                constraintAnchor5.i = dVar2.l(constraintAnchor5);
                dVar2.e(constraintWidget.J.i, constraintWidget.c0 + i4);
            }
            constraintWidget.k = 2;
            constraintWidget.X = i4;
            int i5 = w - i4;
            constraintWidget.T = i5;
            int i6 = constraintWidget.e0;
            if (i5 < i6) {
                constraintWidget.T = i6;
            }
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
