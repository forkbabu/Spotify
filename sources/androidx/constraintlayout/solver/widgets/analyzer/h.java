package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.f;
import java.util.ArrayList;

public class h {
    public static n a(ConstraintWidget constraintWidget, int i, ArrayList<n> arrayList, n nVar) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = constraintWidget.F0;
        } else {
            i2 = constraintWidget.G0;
        }
        int i4 = 0;
        if (i2 != -1 && (nVar == null || i2 != nVar.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                n nVar2 = arrayList.get(i5);
                if (nVar2.b == i2) {
                    if (nVar != null) {
                        nVar.d(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.h) {
                androidx.constraintlayout.solver.widgets.h hVar = (androidx.constraintlayout.solver.widgets.h) constraintWidget;
                int i6 = 0;
                while (true) {
                    if (i6 >= hVar.I0) {
                        i3 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = hVar.H0[i6];
                    if ((i == 0 && (i3 = constraintWidget2.F0) != -1) || (i == 1 && (i3 = constraintWidget2.G0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = arrayList.get(i7);
                        if (nVar3.b == i3) {
                            nVar = nVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n(i);
            }
            arrayList.add(nVar);
        }
        if (nVar.a(constraintWidget)) {
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                ConstraintAnchor L0 = fVar.L0();
                if (fVar.M0() == 0) {
                    i4 = 1;
                }
                L0.c(i4, arrayList, nVar);
            }
            if (i == 0) {
                constraintWidget.F0 = nVar.b;
                constraintWidget.F.c(i, arrayList, nVar);
                constraintWidget.H.c(i, arrayList, nVar);
            } else {
                constraintWidget.G0 = nVar.b;
                constraintWidget.G.c(i, arrayList, nVar);
                constraintWidget.J.c(i, arrayList, nVar);
                constraintWidget.I.c(i, arrayList, nVar);
            }
            constraintWidget.M.c(i, arrayList, nVar);
        }
        return nVar;
    }

    private static n b(ArrayList<n> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = arrayList.get(i2);
            if (i == nVar.b) {
                return nVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:184:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x039a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(androidx.constraintlayout.solver.widgets.d r19, androidx.constraintlayout.solver.widgets.analyzer.b.AbstractC0022b r20) {
        /*
        // Method dump skipped, instructions count: 932
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.h.c(androidx.constraintlayout.solver.widgets.d, androidx.constraintlayout.solver.widgets.analyzer.b$b):boolean");
    }

    public static boolean d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == dimensionBehaviour6 || (dimensionBehaviour3 == dimensionBehaviour5 && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == dimensionBehaviour6 || (dimensionBehaviour4 == dimensionBehaviour5 && dimensionBehaviour2 != dimensionBehaviour6));
    }
}
