package com.spotify.encore.mobile.snackbar;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.b;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public class SnackbarManager {
    private Snackbar currentSnackBar;
    private final boolean floatingStyleEnabled;
    private final List<SnackBarListener> listeners = new ArrayList();
    private SnackbarConfiguration queuedConfiguration;
    private final List<Activity> resumedActivities = new ArrayList(1);

    public SnackbarManager(Application application, @FloatingStyleEnabled boolean z) {
        h.e(application, "application");
        this.floatingStyleEnabled = z;
        application.registerActivityLifecycleCallbacks(new b(this) {
            /* class com.spotify.encore.mobile.snackbar.SnackbarManager.AnonymousClass1 */
            final /* synthetic */ SnackbarManager this$0;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.this$0 = r1;
            }

            @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                h.e(activity, "activity");
                this.this$0.resumedActivities.remove(activity);
            }

            @Override // com.spotify.mobile.android.util.ui.b, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                h.e(activity, "activity");
                this.this$0.resumedActivities.add(activity);
                SnackbarConfiguration snackbarConfiguration = this.this$0.queuedConfiguration;
                if (snackbarConfiguration != null) {
                    this.this$0.show(snackbarConfiguration, new SnackbarManager$1$onActivityResumed$1$1(activity));
                }
                this.this$0.queuedConfiguration = null;
            }
        });
    }

    /* access modifiers changed from: private */
    public final Snackbar buildSnackbar(SnackbarConfiguration snackbarConfiguration, View view) {
        String str;
        String str2;
        Integer orNull = snackbarConfiguration.infoTextRes().orNull();
        if (orNull == null || (str = view.getContext().getString(orNull.intValue())) == null) {
            str = snackbarConfiguration.infoText();
        }
        Integer orNull2 = snackbarConfiguration.actionTextRes().orNull();
        if (orNull2 == null || (str2 = view.getContext().getString(orNull2.intValue())) == null) {
            str2 = snackbarConfiguration.actionText();
        }
        Snackbar E = Snackbar.E(view, str, SnackbarUtilsKt.getSnackbarDuration(str2));
        h.d(E, "Snackbar.make(snackbarCo…ge, snackbarDurationInMs)");
        E.F(str2, snackbarConfiguration.onClickListener());
        if (!this.floatingStyleEnabled || Build.VERSION.SDK_INT < 21) {
            SnackbarUtilsKt.applyStyle(E);
        } else {
            SnackbarUtilsKt.applyFloatingStyle(E);
        }
        return E;
    }

    /* access modifiers changed from: private */
    public final View findSnackbarContainerView(nmf<? super Integer, ? extends View> nmf) {
        View view = this.floatingStyleEnabled ? (View) nmf.invoke(Integer.valueOf(R.id.snackbarContainer)) : null;
        return view != null ? view : (View) nmf.invoke(Integer.valueOf((int) C0707R.id.content));
    }

    public void addListener(SnackBarListener snackBarListener) {
        h.e(snackBarListener, "listener");
        this.listeners.add(snackBarListener);
    }

    public void dismiss() {
        Snackbar snackbar = this.currentSnackBar;
        if (snackbar != null) {
            snackbar.o();
        }
    }

    public boolean isAttached() {
        Activity activity = (Activity) d.l(this.resumedActivities);
        return (activity != null ? findSnackbarContainerView(new SnackbarManager$isAttached$containerView$1$1(activity)) : null) != null;
    }

    public boolean isSnackbarShowing() {
        Snackbar snackbar = this.currentSnackBar;
        return snackbar != null && snackbar.D();
    }

    public void removeListener(SnackBarListener snackBarListener) {
        h.e(snackBarListener, "listener");
        this.listeners.remove(snackBarListener);
    }

    public void show(SnackbarConfiguration snackbarConfiguration) {
        h.e(snackbarConfiguration, "snackbarConfiguration");
        Activity activity = (Activity) d.l(this.resumedActivities);
        if (activity != null) {
            show(snackbarConfiguration, new SnackbarManager$show$1(activity));
        } else {
            Assertion.g("Snackbar is not shown because no resumed activity could be found!");
        }
    }

    public void showInView(SnackbarConfiguration snackbarConfiguration, View view) {
        h.e(snackbarConfiguration, "snackbarConfiguration");
        h.e(view, "view");
        show(snackbarConfiguration, new SnackbarManager$showInView$1(view));
    }

    public void showOnNextAttach(SnackbarConfiguration snackbarConfiguration) {
        this.queuedConfiguration = snackbarConfiguration;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void show(SnackbarConfiguration snackbarConfiguration, nmf<? super Integer, ? extends View> nmf) {
        ((Activity) d.j(this.resumedActivities)).runOnUiThread(new SnackbarManager$show$2(this, nmf, snackbarConfiguration));
    }
}
