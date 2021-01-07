package com.spotify.music.libs.web;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.C0707R;
import java.util.Map;

public abstract class WebViewFragment extends Fragment {
    private final Handler g0 = new Handler();
    private WebView h0;
    private WebView i0;
    private View j0;
    private ProgressBar k0;
    private TextView l0;
    private TextView m0;
    private ibb n0;
    private Runnable o0;
    private Runnable p0;
    private int q0 = 0;
    private boolean r0;
    private boolean s0;
    private boolean t0;
    private boolean u0 = true;
    private boolean v0 = true;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.setEnabled(false);
            WebViewFragment.K4(WebViewFragment.this);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebViewFragment.this.q0 == 0) {
                WebViewFragment.this.j5(1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebViewFragment.this.k0.setVisibility(4);
            WebViewFragment.this.g0.removeCallbacks(WebViewFragment.this.o0);
            WebViewFragment.this.o0 = null;
        }
    }

    static {
        SpSharedPreferences.b.c("webview_debug_custom_spotify_host");
        SpSharedPreferences.b.c("webview_debug_ignore_ssl_errors");
    }

    static void K4(WebViewFragment webViewFragment) {
        webViewFragment.i0.reload();
    }

    /* access modifiers changed from: private */
    public void i5(boolean z) {
        this.s0 = z;
        if (z) {
            this.k0.setVisibility(0);
            this.g0.removeCallbacks(this.o0);
            this.o0 = null;
        } else if (this.o0 == null) {
            c cVar = new c();
            this.o0 = cVar;
            this.g0.postDelayed(cVar, 100);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j5(int i) {
        int i2 = 0;
        boolean z = true;
        Logger.g("Changing state %d -> %d", Integer.valueOf(this.q0), Integer.valueOf(i));
        this.q0 = i;
        boolean z2 = i == 0 || !(i == 1 || i == 3);
        WebView webView = this.i0;
        if (webView != null) {
            webView.setVisibility(z2 ? 0 : 8);
        }
        TextView textView = this.l0;
        if (textView != null) {
            textView.setVisibility(z2 ? 8 : 0);
        }
        TextView textView2 = this.m0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 8 : 0);
        }
        View view = this.j0;
        if (view != null) {
            if (z2 || !this.v0) {
                z = false;
            }
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
            this.j0.setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    public int Y4() {
        return C0707R.layout.fragment_webview;
    }

    /* access modifiers changed from: protected */
    public WebView Z4() {
        return this.i0;
    }

    /* access modifiers changed from: protected */
    public boolean a5(Uri uri) {
        return false;
    }

    public boolean b() {
        WebView webView = this.i0;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        this.i0.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void b5();

    /* access modifiers changed from: protected */
    public void c5(String str) {
    }

    /* access modifiers changed from: protected */
    public void d5(int i, String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public void e5(SslError sslError) {
    }

    public void f5(boolean z) {
        this.v0 = z;
    }

    /* access modifiers changed from: protected */
    public void g5(String str) {
        h5(str, null);
    }

    /* access modifiers changed from: protected */
    public void h5(String str, Map<String, String> map) {
        this.g0.removeCallbacks(this.p0);
        int i = this.q0;
        if (i == 0 || i == 1) {
            j5(2);
            WebView webView = this.i0;
            if (webView == null) {
                return;
            }
            if (map == null) {
                webView.loadUrl(str);
            } else {
                webView.loadUrl(str, map);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        this.n0.a(i, i2, intent);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x000d: APUT  (r0v0 java.lang.Object[]), (0 ??[int, short, byte, char]), (r1v1 java.lang.String) */
    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = new Object[1];
        objArr[0] = this.h0 == null ? "" : " (using retained webview)";
        Logger.g("onCreateView()%s", objArr);
        androidx.fragment.app.c B2 = B2();
        View inflate = layoutInflater.inflate(Y4(), viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.button_reload);
        findViewById.getClass();
        this.j0 = findViewById;
        findViewById.setOnClickListener(new a());
        WebView webView = this.h0;
        if (webView != null) {
            this.i0 = webView;
            this.h0 = null;
        } else {
            this.i0 = new WebView(B2);
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(false);
            }
            WebSettings settings = this.i0.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            ibb ibb = new ibb(new b(this), new c(this));
            this.n0 = ibb;
            this.i0.setWebChromeClient(ibb);
            this.i0.setWebViewClient(new j(this, false));
        }
        View findViewById2 = inflate.findViewById(C0707R.id.webview_placeholder);
        findViewById2.getClass();
        ((ViewGroup) findViewById2).addView(this.i0, -1, -1);
        View findViewById3 = inflate.findViewById(C0707R.id.error_title);
        findViewById3.getClass();
        this.l0 = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.error_message);
        findViewById4.getClass();
        this.m0 = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(C0707R.id.progress);
        findViewById5.getClass();
        this.k0 = (ProgressBar) findViewById5;
        i5(this.s0);
        j5(this.q0);
        int i = this.q0;
        if (i == 0 || i == 1) {
            b bVar = new b();
            this.p0 = bVar;
            this.g0.postDelayed(bVar, 1000);
            b5();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        WebView webView = this.i0;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.i0.setWebViewClient(null);
            this.i0 = null;
        }
        Runnable runnable = this.p0;
        if (runnable != null) {
            this.g0.removeCallbacks(runnable);
            this.p0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        ViewParent parent;
        Logger.g("onDestroyView()", new Object[0]);
        super.y3();
        this.j0 = null;
        this.l0 = null;
        this.m0 = null;
        if (this.i0 != null) {
            if (S2() && (parent = this.i0.getParent()) != null) {
                ((ViewGroup) parent).removeView(this.i0);
                this.h0 = this.i0;
            }
            this.i0 = null;
        }
        ibb ibb = this.n0;
        if (ibb != null) {
            ibb.b();
        }
    }
}
