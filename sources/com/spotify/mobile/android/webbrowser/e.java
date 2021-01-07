package com.spotify.mobile.android.webbrowser;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.InAppBrowserEvent;
import com.spotify.music.features.ads.InAppBrowserLogEvent;
import org.json.JSONException;
import org.json.JSONObject;

class e extends WebViewClient {
    final /* synthetic */ AdWebViewActivity a;

    e(AdWebViewActivity adWebViewActivity) {
        this.a = adWebViewActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.b("[AdBrowser]: Page load finished", new Object[0]);
        InAppBrowserEvent.b n = InAppBrowserEvent.n();
        n.o(InAppBrowserLogEvent.PAGE_LOADED.d());
        n.p(this.a.H.d());
        n.n("");
        this.a.G.c(n.build());
        AdWebViewActivity.a1(this.a, false);
        if (AdWebViewActivity.W0(this.a) == 3 && !AdWebViewActivity.U0(this.a)) {
            AdWebViewActivity.X0(this.a, 2);
        }
        if (TextUtils.isEmpty(AdWebViewActivity.b1(this.a))) {
            AdWebViewActivity.c1(this.a).setText(webView.getTitle());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.b("[AdBrowser]: Page load started", new Object[0]);
        AdWebViewActivity.V0(this.a, false);
        if (AdWebViewActivity.W0(this.a) != 3) {
            AdWebViewActivity.X0(this.a, 2);
        }
        AdWebViewActivity.a1(this.a, true);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.b("[AdBrowser]: Page load error", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put("errorReason", String.valueOf(str));
        } catch (JSONException e) {
            Logger.e(e, "Unable to create json data", new Object[0]);
        }
        InAppBrowserEvent.b n = InAppBrowserEvent.n();
        n.o(InAppBrowserLogEvent.ERROR.d());
        n.p(this.a.H.d());
        n.n(jSONObject.toString());
        this.a.G.c(n.build());
        AdWebViewActivity.X0(this.a, 3);
        AdWebViewActivity.V0(this.a, true);
    }
}
