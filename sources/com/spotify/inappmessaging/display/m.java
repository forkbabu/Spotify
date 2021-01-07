package com.spotify.inappmessaging.display;

import android.webkit.JavascriptInterface;
import com.spotify.inappmessaging.InAppMessagingLogger;
import com.spotify.inappmessaging.display.n;
import java.util.Collections;
import org.json.JSONException;

/* access modifiers changed from: package-private */
public class m {
    private final o a;
    private final n b;
    private TouchBoundaryFrameLayout c;
    private final float d;
    private final n.a e;

    m(o oVar, n nVar, float f) {
        this.a = oVar;
        this.d = f;
        oVar.getClass();
        this.e = new b(oVar);
        this.b = nVar;
    }

    public void a(TouchBoundaryFrameLayout touchBoundaryFrameLayout) {
        this.c = touchBoundaryFrameLayout;
    }

    @JavascriptInterface
    public void bannerHeight(int i) {
        this.b.a(i);
    }

    @JavascriptInterface
    public void call(String str) {
        this.a.a(str);
        if (this.a.e(str)) {
            this.a.c(InAppMessagingLogger.DismissType.DISMISS_CTA);
            this.b.dismiss();
        }
    }

    @JavascriptInterface
    public void documentReady() {
        this.b.c(this.e);
        this.c.a();
    }

    @JavascriptInterface
    public void noteHeight(int i) {
        this.b.a(i);
    }

    @JavascriptInterface
    public void documentReady(String str) {
        try {
            if (!str.isEmpty() && str.length() > 2) {
                this.c.c(TouchBoundaryFrameLayout.b(str, this.d));
            }
            this.b.c(this.e);
        } catch (JSONException unused) {
            this.a.b(Collections.singleton("ERROR_PARSING_TOUCH_BOUNDARIES"));
            this.b.dismiss();
        }
    }
}
