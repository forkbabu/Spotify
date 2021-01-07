package defpackage;

import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.http.wg.WebgateTokenProvider;

/* renamed from: hc5  reason: default package */
public final class hc5 implements gc5 {
    private final WebgateTokenProvider a;

    public hc5(WebgateTokenProvider webgateTokenProvider) {
        webgateTokenProvider.getClass();
        this.a = webgateTokenProvider;
    }

    public /* synthetic */ String a() {
        return this.a.a(CrashReportManager.TIME_WINDOW);
    }
}
