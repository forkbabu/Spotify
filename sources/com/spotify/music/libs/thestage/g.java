package com.spotify.music.libs.thestage;

import android.text.TextUtils;
import com.google.protobuf.u;
import com.spotify.messages.InAppBrowserEvent;
import com.spotify.music.features.ads.InAppBrowserLogEvent;

public class g {
    private final cqe a;
    private final gl0<u> b;

    public g(cqe cqe, gl0<u> gl0) {
        this.a = cqe;
        this.b = gl0;
    }

    private void e(InAppBrowserLogEvent inAppBrowserLogEvent, String str) {
        gl0<u> gl0 = this.b;
        InAppBrowserEvent.b n = InAppBrowserEvent.n();
        n.o(inAppBrowserLogEvent.d());
        n.p(this.a.d());
        n.n(TextUtils.isEmpty(str) ? "TheStage" : je.x0("TheStage - ", str));
        gl0.c(n.build());
    }

    public void a() {
        e(InAppBrowserLogEvent.CLOSED, null);
    }

    public void b(String str) {
        e(InAppBrowserLogEvent.ERROR, str);
    }

    public void c() {
        e(InAppBrowserLogEvent.OPENED, null);
    }

    public void d(String str) {
        e(InAppBrowserLogEvent.PAGE_LOADED, str);
    }
}
