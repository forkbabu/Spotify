package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: e5  reason: default package */
public class e5 {
    private final Object a;

    /* renamed from: e5$a */
    static class a extends AccessibilityNodeProvider {
        final e5 a;

        a(e5 e5Var) {
            this.a = e5Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            d5 a2 = this.a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.u0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.d(i, i2, bundle);
        }
    }

    /* renamed from: e5$b */
    static class b extends a {
        b(e5 e5Var) {
            super(e5Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            d5 b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.u0();
        }
    }

    public e5() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a = new b(this);
        } else {
            this.a = new a(this);
        }
    }

    public d5 a(int i) {
        return null;
    }

    public d5 b(int i) {
        return null;
    }

    public Object c() {
        return this.a;
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }

    public e5(Object obj) {
        this.a = obj;
    }
}
