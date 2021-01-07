package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

public class c0 extends z3 {
    final RecyclerView a;
    private final a b;

    public static class a extends z3 {
        final c0 a;
        private Map<View, z3> b = new WeakHashMap();

        public a(c0 c0Var) {
            this.a = c0Var;
        }

        /* access modifiers changed from: package-private */
        public z3 a(View view) {
            return this.b.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void b(View view) {
            z3 g = q4.g(view);
            if (g != null && g != this) {
                this.b.put(view, g);
            }
        }

        @Override // defpackage.z3
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                return z3Var.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // defpackage.z3
        public e5 getAccessibilityNodeProvider(View view) {
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                return z3Var.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                z3Var.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            if (this.a.b() || this.a.a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, d5Var);
                return;
            }
            this.a.a.getLayoutManager().T0(view, d5Var);
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                z3Var.onInitializeAccessibilityNodeInfo(view, d5Var);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, d5Var);
            }
        }

        @Override // defpackage.z3
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                z3Var.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // defpackage.z3
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            z3 z3Var = this.b.get(viewGroup);
            if (z3Var != null) {
                return z3Var.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.z3
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.a.b() || this.a.a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                if (z3Var.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            RecyclerView.m layoutManager = this.a.a.getLayoutManager();
            RecyclerView.s sVar = layoutManager.b.b;
            return layoutManager.l1();
        }

        @Override // defpackage.z3
        public void sendAccessibilityEvent(View view, int i) {
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                z3Var.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // defpackage.z3
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            z3 z3Var = this.b.get(view);
            if (z3Var != null) {
                z3Var.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public c0(RecyclerView recyclerView) {
        this.a = recyclerView;
        a aVar = this.b;
        if (aVar != null) {
            this.b = aVar;
        } else {
            this.b = new a(this);
        }
    }

    public z3 a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.a.g0();
    }

    @Override // defpackage.z3
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Q0(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.z3
    public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
        super.onInitializeAccessibilityNodeInfo(view, d5Var);
        if (!b() && this.a.getLayoutManager() != null) {
            RecyclerView.m layoutManager = this.a.getLayoutManager();
            RecyclerView recyclerView = layoutManager.b;
            layoutManager.S0(recyclerView.b, recyclerView.q0, d5Var);
        }
    }

    @Override // defpackage.z3
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (b() || this.a.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = this.a.getLayoutManager();
        RecyclerView recyclerView = layoutManager.b;
        return layoutManager.k1(recyclerView.b, recyclerView.q0, i, bundle);
    }
}
