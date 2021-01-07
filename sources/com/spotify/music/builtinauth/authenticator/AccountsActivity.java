package com.spotify.music.builtinauth.authenticator;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.share.menu.preview.b;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;

public class AccountsActivity extends Activity {
    public static final /* synthetic */ int b = 0;
    private WebView a;

    static void a(AccountsActivity accountsActivity, String str) {
        accountsActivity.b(new e0(false, str, null));
        accountsActivity.finish();
    }

    public static Intent c(Context context, d0 d0Var) {
        Intent intent = new Intent(context, AccountsActivity.class);
        intent.putExtra("params", d0Var);
        intent.addFlags(335544320);
        return intent;
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver) {
        e6.b(context).c(broadcastReceiver, new IntentFilter("accounts.actions"));
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver) {
        e6.b(context).e(broadcastReceiver);
    }

    /* access modifiers changed from: package-private */
    public void b(e0 e0Var) {
        e6 b2 = e6.b(getApplicationContext());
        Intent intent = new Intent("accounts.actions");
        intent.putExtra("result", e0Var);
        b2.d(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        this.a.loadUrl("about:blank");
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b(new e0(false, "Canceled", null));
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_accounts);
        d0 d0Var = (d0) getIntent().getParcelableExtra("params");
        if (d0Var == null) {
            Assertion.p("EXTRA_ACCOUNTS_PARAMS must be present!");
        }
        AuthorizationRequest a2 = AuthorizationRequest.a(d0Var.a, d0Var.b, d0Var.c, d0Var.f, null, d0Var.n, false);
        this.a = (WebView) findViewById(C0707R.id.com_spotify_sdk_login_webview);
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        this.a.setVisibility(0);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.setWebViewClient(new a(a2));
        CookieManager.getInstance().setCookie(d0Var.o.getDomain(), d0Var.o.toString());
        this.a.loadUrl(wu1.a(a2).toString());
    }

    /* access modifiers changed from: private */
    public class a extends WebViewClient {
        private final AuthorizationRequest a;

        public a(AuthorizationRequest authorizationRequest) {
            this.a = authorizationRequest;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.g("Page loaded: %s", str);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("%s request failed with an error %s", webResourceRequest, webResourceError);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            AccountsActivity.a(AccountsActivity.this, ErrorMessage.ACCOUNTS_SERVICE_ERROR.d());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Logger.d("%s received HTTP error %s", webResourceRequest, webResourceResponse);
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            AccountsActivity.a(AccountsActivity.this, ErrorMessage.ACCOUNTS_SERVICE_ERROR.d());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Logger.d("SSL error %s", sslError);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            AccountsActivity.a(AccountsActivity.this, ErrorMessage.ACCOUNTS_SERVICE_ERROR.d());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return b.g(Uri.parse(this.a.e()), Uri.parse(str), new c0(this));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return b.g(Uri.parse(this.a.e()), webResourceRequest.getUrl(), new c0(this));
        }
    }
}
