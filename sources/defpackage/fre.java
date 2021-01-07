package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.instrumentation.performance.r;
import com.spotify.performancesdk.timekeeper.m;
import kotlin.jvm.internal.h;

/* renamed from: fre  reason: default package */
public final class fre {
    private final r a;
    private final m b;
    private final Handler c;

    public fre(r rVar, m mVar, Handler handler) {
        h.e(rVar, "viewLoadPublisher");
        h.e(mVar, "clock");
        h.e(handler, "mainHandler");
        this.a = rVar;
        this.b = mVar;
        this.c = handler;
    }

    public final ViewLoadingTracker a(View view, String str, Bundle bundle, Context context) {
        h.e(view, "view");
        h.e(str, "name");
        h.e(context, "context");
        ViewLoadingTracker viewLoadingTracker = new ViewLoadingTracker(view, this.a, this.b, str, bundle, this.c, context);
        viewLoadingTracker.w();
        return viewLoadingTracker;
    }
}
