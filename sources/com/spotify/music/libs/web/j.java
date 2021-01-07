package com.spotify.music.libs.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.base.java.logging.Logger;

/* access modifiers changed from: package-private */
public class j extends WebViewClient {
    final /* synthetic */ WebViewFragment a;

    j(WebViewFragment webViewFragment, boolean z) {
        this.a = webViewFragment;
    }

    private boolean a(WebView webView, Uri uri) {
        if (!this.a.a5(uri)) {
            if (!(this.a.u0)) {
                this.a.t0 = true;
            }
            this.a.u0 = false;
            webView.loadUrl(uri.toString());
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.g("Page finished loading: %s", str);
        this.a.i5(false);
        if (this.a.t0) {
            this.a.t0 = false;
        } else {
            this.a.u0 = true;
            if (this.a.q0 == 3 && !(this.a.r0)) {
                this.a.j5(2);
            }
        }
        this.a.c5(str);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0014: APUT  (r5v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r4v3 java.lang.String) */
    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = this.a.r0 ? " (error)" : "";
        Logger.g("Page started loading: %s%s", objArr);
        this.a.r0 = false;
        this.a.u0 = false;
        if (this.a.q0 != 3) {
            this.a.j5(2);
        }
        this.a.i5(true);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.n("Error %d %s when loading: %s", Integer.valueOf(i), str, str2);
        this.a.j5(3);
        this.a.r0 = true;
        this.a.d5(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Logger.n("SSL error: %s", sslError);
        this.a.e5(sslError);
        this.a.j5(3);
        this.a.r0 = true;
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        a(webView, webResourceRequest.getUrl());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, Uri.parse(str));
        return true;
    }
}
