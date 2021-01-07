package com.spotify.pushnotifications;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.core.app.q;
import com.spotify.base.java.logging.Logger;
import com.spotify.localization.SpotifyLocale;
import io.reactivex.internal.disposables.EmptyDisposable;

public class l {
    private final Context a;
    private final yzd b;
    private final n c;

    public l(yzd yzd, Context context, n nVar) {
        this.a = context;
        this.b = yzd;
        this.c = nVar;
    }

    public void a() {
        boolean z = false;
        Logger.l("start", new Object[0]);
        boolean a2 = q.e(this.a).a();
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getSystemService("accessibility");
        if (accessibilityManager != null) {
            z = accessibilityManager.isTouchExplorationEnabled();
        }
        this.b.e(SpotifyLocale.e(), z, a2);
        this.c.a();
    }

    public void b() {
        this.c.c();
        EmptyDisposable.INSTANCE.d();
    }
}
