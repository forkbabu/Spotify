package com.spotify.music.libs.performance.tracking;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.instrumentation.performance.r;
import com.spotify.performancesdk.timekeeper.m;
import java.lang.ref.WeakReference;

public class h0 {
    private final m a;
    private final r b;
    private final Handler c;
    private final Context d;

    public h0(m mVar, r rVar, Handler handler, Context context) {
        this.a = mVar;
        this.b = rVar;
        this.c = handler;
        this.d = context;
    }

    private ViewLoadingTracker d(View view, String str, Bundle bundle, ij9 ij9, boolean z, Optional<ViewLoadingTracker.Reason> optional) {
        ViewLoadingTracker viewLoadingTracker = new ViewLoadingTracker(view, this.b, this.a, str, bundle, this.c, this.d);
        if (bundle == null && z) {
            if (optional.isPresent()) {
                viewLoadingTracker.x(optional.get());
            } else {
                viewLoadingTracker.w();
            }
        }
        ij9.e().subscribe(new i(new WeakReference(viewLoadingTracker)), h.a);
        return viewLoadingTracker;
    }

    public ViewLoadingTracker a(View view, String str, Bundle bundle, ij9 ij9) {
        return d(view, str, bundle, ij9, false, Optional.absent());
    }

    public ViewLoadingTracker b(View view, String str, Bundle bundle, ij9 ij9) {
        return d(view, str, bundle, ij9, true, Optional.absent());
    }

    public ViewLoadingTracker c(View view, String str, Bundle bundle, ij9 ij9, ViewLoadingTracker.Reason reason) {
        return d(view, str, bundle, ij9, true, Optional.of(reason));
    }
}
