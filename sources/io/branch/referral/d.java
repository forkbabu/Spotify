package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.branch.referral.Branch;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public class d implements Application.ActivityLifecycleCallbacks {
    private int a = 0;
    private Set<String> b = new HashSet();

    d() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        String str = "onActivityCreated, activity = " + activity;
        Branch F = Branch.F();
        if (F != null) {
            F.g0(Branch.INTENT_STATE.PENDING);
            if (j.k().l(activity.getApplicationContext())) {
                j.k().q(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        String str = "onActivityDestroyed, activity = " + activity;
        Branch F = Branch.F();
        if (F != null) {
            if (F.B() == activity) {
                F.l.clear();
            }
            j.k().n(activity);
            this.b.remove(activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String str = "onActivityPaused, activity = " + activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        String str = "onActivityResumed, activity = " + activity;
        Branch F = Branch.F();
        if (F != null) {
            F.W(activity);
            if (F.E() == Branch.SESSION_STATE.UNINITIALISED && !Branch.t) {
                new Branch.e(activity, null).a();
            }
            this.b.add(activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        String str = "onActivityStarted, activity = " + activity;
        Branch F = Branch.F();
        if (F != null) {
            F.l = new WeakReference<>(activity);
            F.g0(Branch.INTENT_STATE.PENDING);
            boolean z = true;
            this.a++;
            Branch F2 = Branch.F();
            if (F2 != null) {
                if (F2.I() == null || F2.C() == null || F2.C().g() == null || F2.H() == null || F2.H().B() == null) {
                    z = false;
                }
                if (z) {
                    if (!F2.H().B().equals(F2.C().g().b()) && !F2.L() && !F2.I().a()) {
                        F2.c0(F2.C().g().m(activity, F2));
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        String str = "onActivityStopped, activity = " + activity;
        Branch F = Branch.F();
        if (F != null) {
            int i = this.a - 1;
            this.a = i;
            if (i < 1) {
                F.f0(false);
                F.w();
            }
        }
    }
}
