package com.spotify.music.libs.performance.tracking;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.instrumentation.performance.p;
import com.spotify.libs.instrumentation.performance.q;
import com.spotify.messages.ViewLoadSequence;

class r implements q {
    private final Context a;
    private final fd0 b;

    r(Context context, fd0 fd0) {
        this.a = context;
        this.b = fd0;
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public /* synthetic */ void a(ViewLoadSequence viewLoadSequence) {
        p.a(this, viewLoadSequence);
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public void b(ViewLoadSequence viewLoadSequence) {
        if (this.b.a("VIEW_LOAD", false)) {
            String v = viewLoadSequence.v();
            ViewLoadingTracker.Step step = ViewLoadingTracker.Step.FINISHED;
            if (step.toString().equals(v)) {
                Long l = viewLoadSequence.u().get(ViewLoadingTracker.Step.STARTED.toString());
                Long l2 = viewLoadSequence.u().get(step.toString());
                if (l != null && l2 != null) {
                    long longValue = l2.longValue() - l.longValue();
                    Logger.b("View %s took %dms. to load", viewLoadSequence.w(), Long.valueOf(longValue));
                    e6 b2 = e6.b(this.a);
                    yla yla = new yla(viewLoadSequence.w(), viewLoadSequence.s(), longValue);
                    Intent intent = new Intent("ACTION_VIEW_LOAD_UPDATE");
                    intent.putExtra("EXTRA_VIEW_LOAD_UPDATE", yla);
                    b2.d(intent);
                }
            } else if (ViewLoadingTracker.Step.CANCELLED.toString().equals(v)) {
                Logger.b("Cancelling %s", viewLoadSequence.w());
            } else {
                Logger.d("Unknown terminal state %s", v);
            }
        }
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public /* synthetic */ void shutdown() {
        p.b(this);
    }
}
