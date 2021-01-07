package com.spotify.voice.experience;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.a;
import com.google.common.base.Supplier;

public final class j implements fjf<Supplier<Boolean>> {
    private final wlf<Context> a;

    public j(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f((AccessibilityManager) a.f(this.a.get(), AccessibilityManager.class));
    }
}
