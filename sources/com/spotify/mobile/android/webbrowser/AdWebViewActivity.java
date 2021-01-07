package com.spotify.mobile.android.webbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.protobuf.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.InAppBrowserEvent;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.InAppBrowserLogEvent;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class AdWebViewActivity extends ss2 {
    gl0<u> G;
    cqe H;
    private final Handler I = new Handler();
    private WebView J;
    private View K;
    private View L;
    private ProgressBar M;
    private TextView N;
    private Runnable O;
    private Runnable P;
    private boolean Q;
    private int R = 0;
    private String S;
    private boolean T;

    /* access modifiers changed from: private */
    public void j1(boolean z) {
        this.Q = z;
        if (z) {
            this.M.setVisibility(0);
            this.I.removeCallbacks(this.O);
            this.O = null;
        } else if (this.O == null) {
            d dVar = new d(this);
            this.O = dVar;
            this.I.postDelayed(dVar, 100);
        }
    }

    /* access modifiers changed from: private */
    public void k1(int i) {
        int i2 = 0;
        Logger.g("Changing state %d -> %d", Integer.valueOf(this.R), Integer.valueOf(i));
        this.R = i;
        boolean z = i == 0 || !(i == 1 || i == 3);
        WebView webView = this.J;
        if (webView != null) {
            webView.setVisibility(z ? 0 : 8);
        }
        View view = this.K;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        View view2 = this.L;
        if (view2 != null) {
            if (z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            this.L.setEnabled(!z);
        }
    }

    public void d1(View view) {
        view.setEnabled(false);
        this.J.reload();
    }

    public /* synthetic */ void f1() {
        if (this.R == 0) {
            k1(1);
        }
    }

    public /* synthetic */ void i1() {
        this.M.setVisibility(4);
        this.I.removeCallbacks(this.O);
        this.O = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.J.canGoBack()) {
            this.J.goBack();
        } else {
            finish();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_webview);
        this.J = (WebView) findViewById(C0707R.id.webview);
        this.K = findViewById(C0707R.id.error_info);
        View findViewById = findViewById(C0707R.id.button_reload);
        this.L = findViewById;
        findViewById.setOnClickListener(new c(this));
        this.M = (ProgressBar) findViewById(C0707R.id.progress);
        j1(this.Q);
        SpotifyIconView spotifyIconView = (SpotifyIconView) findViewById(C0707R.id.btn_close);
        spotifyIconView.setOnClickListener(new b(this));
        spotifyIconView.setIcon(SpotifyIconV2.X);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        this.S = intent.getStringExtra("advertiser");
        TextView textView = (TextView) findViewById(C0707R.id.webview_title);
        this.N = textView;
        textView.setText(this.S);
        TextView textView2 = (TextView) findViewById(C0707R.id.webview_url);
        try {
            textView2.setText(new URL(stringExtra).getHost());
        } catch (MalformedURLException unused) {
            textView2.setText(stringExtra);
        }
        WebSettings settings = this.J.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        this.J.setWebViewClient(new e(this));
        k1(this.R);
        int i = this.R;
        if (i == 0 || i == 1) {
            a aVar = new a(this);
            this.P = aVar;
            this.I.postDelayed(aVar, 1000);
            this.J.loadUrl(stringExtra);
        }
        Logger.b("[AdBrowser]: Web browser open", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("browserType", "webView");
        } catch (JSONException e) {
            Logger.e(e, "Unable to create json data", new Object[0]);
        }
        InAppBrowserEvent.b n = InAppBrowserEvent.n();
        n.o(InAppBrowserLogEvent.OPENED.d());
        n.p(this.H.d());
        n.n(jSONObject.toString());
        this.G.c(n.build());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Logger.b("[AdBrowser]: Web browser closed", new Object[0]);
        InAppBrowserEvent.b n = InAppBrowserEvent.n();
        n.o(InAppBrowserLogEvent.CLOSED.d());
        n.p(this.H.d());
        n.n("");
        this.G.c(n.build());
        WebView webView = this.J;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.J.setWebViewClient(null);
            this.J = null;
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            this.I.removeCallbacks(runnable);
            this.P = null;
        }
    }
}
