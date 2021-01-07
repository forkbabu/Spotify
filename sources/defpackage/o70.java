package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import java.util.Collections;
import java.util.List;

/* renamed from: o70  reason: default package */
public class o70 {
    private final Context a;
    private final AccessibilityManager b;
    private final CaptioningManager c;

    public o70(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        Object systemService = applicationContext.getSystemService("accessibility");
        CaptioningManager captioningManager = null;
        this.b = (AccessibilityManager) ((systemService == null || !AccessibilityManager.class.isInstance(systemService)) ? null : AccessibilityManager.class.cast(systemService));
        this.c = Build.VERSION.SDK_INT >= 19 ? (CaptioningManager) applicationContext.getSystemService("captioning") : captioningManager;
    }

    private List<AccessibilityServiceInfo> a(int i) {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null) {
            return Collections.emptyList();
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(i);
        return enabledAccessibilityServiceList == null ? Collections.emptyList() : enabledAccessibilityServiceList;
    }

    private boolean c(String str) {
        for (AccessibilityServiceInfo accessibilityServiceInfo : a(-1)) {
            if (accessibilityServiceInfo.getId().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return this.b != null;
    }

    public boolean d() {
        return c("com.google.android.marvin.talkback/com.google.android.accessibility.accessibilitymenu.AccessibilityMenuService");
    }

    public boolean e() {
        return !a(5).isEmpty();
    }

    public boolean f() {
        CaptioningManager captioningManager;
        if (Build.VERSION.SDK_INT < 19 || (captioningManager = this.c) == null || !captioningManager.isEnabled()) {
            return false;
        }
        return true;
    }

    public boolean g() {
        return Settings.Secure.getInt(this.a.getContentResolver(), "accessibility_display_inversion_enabled", 0) == 1;
    }

    public boolean h() {
        return c("com.google.android.marvin.talkback/com.android.switchaccess.SwitchAccessService");
    }

    public boolean i() {
        AccessibilityManager accessibilityManager = this.b;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }
}
