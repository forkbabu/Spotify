package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;

/* renamed from: mi2  reason: default package */
public final class mi2 implements fjf<ShortcutManager> {
    private final wlf<Context> a;

    public mi2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ShortcutManager shortcutManager = (ShortcutManager) this.a.get().getSystemService(ShortcutManager.class);
        yif.g(shortcutManager, "Cannot return null from a non-@Nullable @Provides method");
        return shortcutManager;
    }
}
