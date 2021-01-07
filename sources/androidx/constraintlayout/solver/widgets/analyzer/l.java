package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class l {
    public static int c;
    WidgetRun a = null;
    ArrayList<WidgetRun> b = new ArrayList<>();

    public l(WidgetRun widgetRun, int i) {
        c++;
        this.a = widgetRun;
    }

    private long b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof j) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = dependencyNode.k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.min(j2, b(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.i) {
            return j2;
        }
        long j3 = j - widgetRun.j();
        return Math.min(Math.min(j2, b(widgetRun.h, j3)), j3 - ((long) widgetRun.h.f));
    }

    private long c(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof j) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = dependencyNode.k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.max(j2, c(dependencyNode2, ((long) dependencyNode2.f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.h) {
            return j2;
        }
        long j3 = j + widgetRun.j();
        return Math.max(Math.max(j2, c(widgetRun.i, j3)), j3 - ((long) widgetRun.i.f));
    }

    public long a(d dVar, int i) {
        WidgetRun widgetRun = this.a;
        long j = 0;
        if (widgetRun instanceof c) {
            if (((c) widgetRun).f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(widgetRun instanceof k)) {
                return 0;
            }
        } else if (!(widgetRun instanceof m)) {
            return 0;
        }
        DependencyNode dependencyNode = (i == 0 ? dVar.d : dVar.e).h;
        DependencyNode dependencyNode2 = (i == 0 ? dVar.d : dVar.e).i;
        boolean contains = widgetRun.h.l.contains(dependencyNode);
        boolean contains2 = this.a.i.l.contains(dependencyNode2);
        long j2 = this.a.j();
        if (contains && contains2) {
            long c2 = c(this.a.h, 0);
            long b2 = b(this.a.i, 0);
            long j3 = c2 - j2;
            WidgetRun widgetRun2 = this.a;
            int i2 = widgetRun2.i.f;
            if (j3 >= ((long) (-i2))) {
                j3 += (long) i2;
            }
            int i3 = widgetRun2.h.f;
            long j4 = ((-b2) - j2) - ((long) i3);
            if (j4 >= ((long) i3)) {
                j4 -= (long) i3;
            }
            float q = widgetRun2.b.q(i);
            if (q > 0.0f) {
                j = (long) ((((float) j3) / (1.0f - q)) + (((float) j4) / q));
            }
            float f = (float) j;
            long a2 = ((long) ((f * q) + 0.5f)) + j2 + ((long) je.a(1.0f, q, f, 0.5f));
            WidgetRun widgetRun3 = this.a;
            return (((long) widgetRun3.h.f) + a2) - ((long) widgetRun3.i.f);
        } else if (contains) {
            DependencyNode dependencyNode3 = this.a.h;
            return Math.max(c(dependencyNode3, (long) dependencyNode3.f), ((long) this.a.h.f) + j2);
        } else if (contains2) {
            DependencyNode dependencyNode4 = this.a.i;
            return Math.max(-b(dependencyNode4, (long) dependencyNode4.f), ((long) (-this.a.i.f)) + j2);
        } else {
            WidgetRun widgetRun4 = this.a;
            return (widgetRun4.j() + ((long) widgetRun4.h.f)) - ((long) this.a.i.f);
        }
    }
}
