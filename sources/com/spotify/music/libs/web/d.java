package com.spotify.music.libs.web;

import android.webkit.WebView;

public abstract class d {
    public static d b(WebView webView) {
        if (webView != null && webView.canGoBack()) {
            return new e(webView);
        }
        return new f();
    }

    public abstract boolean a();
}
