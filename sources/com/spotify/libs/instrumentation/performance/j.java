package com.spotify.libs.instrumentation.performance;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.messages.ViewLoadSequence;

public class j implements q {
    private final ColdStartTracker a;

    public j(ColdStartTracker coldStartTracker) {
        this.a = coldStartTracker;
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public void a(ViewLoadSequence viewLoadSequence) {
        b(viewLoadSequence);
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public void b(ViewLoadSequence viewLoadSequence) {
        Long l;
        if (!c(viewLoadSequence) && (l = viewLoadSequence.u().get(ViewLoadingTracker.Step.STARTED.toString())) != null) {
            Long l2 = viewLoadSequence.u().get(ViewLoadingTracker.Step.DATA_LOADED.toString());
            this.a.n("view_loading_started", l.longValue());
            if (l2 != null) {
                this.a.n("view_data_loaded", l2.longValue());
            }
            String v = viewLoadSequence.v();
            ViewLoadingTracker.Step step = ViewLoadingTracker.Step.FINISHED;
            if (step.toString().equals(v)) {
                Long l3 = viewLoadSequence.u().get(step.toString());
                String t = viewLoadSequence.t();
                String w = viewLoadSequence.w();
                if (d(viewLoadSequence)) {
                    this.a.b("usable_state", l3.longValue(), t);
                    return;
                }
                Logger.n("Received complete event for uri %s that is not in cold start list", w);
                this.a.b("non_default_uri_requested", l3.longValue(), t);
                return;
            }
            ViewLoadingTracker.Step step2 = ViewLoadingTracker.Step.CANCELLED;
            if (step2.toString().equals(v)) {
                this.a.b("first_view_cancel", viewLoadSequence.u().get(step2.toString()).longValue(), viewLoadSequence.t());
                return;
            }
            ViewLoadingTracker.Step step3 = ViewLoadingTracker.Step.FAILED;
            if (step3.toString().equals(v)) {
                this.a.b("first_view_error", viewLoadSequence.u().get(step3.toString()).longValue(), viewLoadSequence.t());
            }
        }
    }

    public boolean c(ViewLoadSequence viewLoadSequence) {
        return false;
    }

    public boolean d(ViewLoadSequence viewLoadSequence) {
        return true;
    }

    @Override // com.spotify.libs.instrumentation.performance.q
    public void shutdown() {
        this.a.c("shut_down", null);
    }
}
