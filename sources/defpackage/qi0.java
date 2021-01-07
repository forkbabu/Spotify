package defpackage;

import android.app.Activity;
import android.os.Build;
import androidx.core.content.a;
import java.util.concurrent.Executor;

/* renamed from: qi0  reason: default package */
public final class qi0 implements fjf<Executor> {
    private final wlf<Activity> a;

    public qi0(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Executor executor;
        Activity activity = this.a.get();
        if (Build.VERSION.SDK_INT >= 28) {
            executor = activity.getMainExecutor();
        } else {
            executor = a.e(activity);
        }
        yif.g(executor, "Cannot return null from a non-@Nullable @Provides method");
        return executor;
    }
}
