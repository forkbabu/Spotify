package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.h;

/* renamed from: raa  reason: default package */
public final class raa implements qaa {
    private final AccessibilityManager a;
    private final Context b;

    public raa(Context context) {
        Object obj;
        h.e(context, "mContext");
        this.b = context;
        Object systemService = context.getSystemService("accessibility");
        h.d(systemService, "mContext.getSystemService(name)");
        if (!AccessibilityManager.class.isInstance(systemService)) {
            obj = null;
        } else {
            obj = AccessibilityManager.class.cast(systemService);
        }
        this.a = (AccessibilityManager) obj;
    }

    @Override // defpackage.qaa
    public boolean a() {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager != null) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        return false;
    }
}
