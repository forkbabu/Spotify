package defpackage;

import android.app.Activity;
import android.view.Window;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.b;
import java.util.Collections;
import java.util.Set;

/* renamed from: zw1  reason: default package */
public class zw1 extends b {
    private final Set<Activity> a = Collections.newSetFromMap(gf0.b());
    private boolean b;

    private void t(Activity activity) {
        Window window = activity.getWindow();
        if (this.b) {
            Logger.g("Device is docked now: %s", activity.getLocalClassName());
            window.addFlags(128);
            return;
        }
        Logger.g("Device is un-docked now: %s", activity.getLocalClassName());
        window.clearFlags(128);
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        this.a.add(activity);
        t(activity);
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.a.remove(activity);
    }

    public void r(boolean z) {
        this.b = z;
        for (Activity activity : this.a) {
            t(activity);
        }
    }

    public void s() {
        for (Activity activity : this.a) {
            t(activity);
        }
    }
}
