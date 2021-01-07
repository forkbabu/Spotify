package com.spotify.voice.experience;

import android.view.accessibility.AccessibilityManager;
import com.google.common.base.Supplier;

public final /* synthetic */ class f implements Supplier {
    public final /* synthetic */ AccessibilityManager a;

    public /* synthetic */ f(AccessibilityManager accessibilityManager) {
        this.a = accessibilityManager;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        AccessibilityManager accessibilityManager = this.a;
        return Boolean.valueOf(accessibilityManager != null && accessibilityManager.isEnabled());
    }
}
