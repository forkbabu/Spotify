package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.util.ui.b;
import defpackage.ij9;
import io.reactivex.s;

/* renamed from: gj9  reason: default package */
public class gj9 extends b {
    private final yv9 a;
    private final kj9 b;
    private Activity c;

    gj9(yv9 yv9, kj9 kj9) {
        yv9.getClass();
        this.a = yv9;
        kj9.getClass();
        this.b = kj9;
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        s<ej9> sVar;
        Activity activity2 = this.c;
        activity.getClass();
        if (activity2 != activity) {
            Activity activity3 = this.c;
            if (activity3 instanceof ij9.b) {
                this.a.e(activity3.isChangingConfigurations());
            }
            if (activity instanceof ij9.b) {
                sVar = ((ij9.b) activity).u0().e();
            } else {
                sVar = ij9.d(activity.getClass().getSimpleName()).e();
            }
            if (activity instanceof zi9) {
                sVar = s.n(sVar, ((zi9) activity).o(), wi9.a).E();
            }
            this.a.f(sVar);
            this.c = activity;
            this.b.b(activity);
        }
    }

    @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        if (this.c == activity) {
            this.a.e(activity.isChangingConfigurations());
            this.c = null;
            this.b.a();
        }
    }
}
