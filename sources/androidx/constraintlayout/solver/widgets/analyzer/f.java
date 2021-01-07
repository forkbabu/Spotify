package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;

/* access modifiers changed from: package-private */
public class f extends DependencyNode {
    public int m;

    public f(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof k) {
            this.e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.DependencyNode
    public void c(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            for (d dVar : this.k) {
                dVar.a(dVar);
            }
        }
    }
}
