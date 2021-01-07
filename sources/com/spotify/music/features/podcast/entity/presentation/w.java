package com.spotify.music.features.podcast.entity.presentation;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.h;

public final class w implements c {
    private final AccessibilityManager a;
    private final Context b;

    public w(Context context) {
        h.e(context, "context");
        this.b = context;
        Object systemService = context.getSystemService("accessibility");
        this.a = (AccessibilityManager) (!(systemService instanceof AccessibilityManager) ? null : systemService);
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.c
    public boolean a() {
        AccessibilityManager accessibilityManager = this.a;
        return accessibilityManager != null && accessibilityManager.isEnabled() && this.a.isTouchExplorationEnabled();
    }
}
