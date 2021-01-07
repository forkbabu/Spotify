package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b28  reason: default package */
public class b28 extends b {
    private final Map<String, a> a = new HashMap();

    /* renamed from: b28$a */
    public interface a {
        void start();

        void stop();
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.a.remove(activity.getLocalClassName());
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        if (this.a.containsKey(activity.getLocalClassName())) {
            this.a.get(activity.getLocalClassName()).stop();
        }
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        if (this.a.containsKey(activity.getLocalClassName())) {
            this.a.get(activity.getLocalClassName()).start();
        }
    }

    public void r(String str, a aVar) {
        this.a.put(str, aVar);
    }
}
