package com.spotify.mobile.android.sso;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.k;
import com.spotify.mobile.android.sso.protocol.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import java.net.HttpCookie;
import java.util.Locale;

public class AuthorizationActivity extends ss2 implements uw1, g<tv1, rv1> {
    private c G;
    private ProgressDialog H;
    private boolean I;
    private boolean J;
    private AuthorizationRequest K;
    private WebView L;
    private String M = "";
    com.spotify.mobile.android.sso.util.b N;
    MobiusLoop.g<tv1, rv1> O;
    i P;
    nhd Q;

    class a extends WebViewClient {
        final /* synthetic */ String a;

        /* renamed from: com.spotify.mobile.android.sso.AuthorizationActivity$a$a  reason: collision with other inner class name */
        class C0194a implements com.spotify.mobile.android.sso.util.a {
            C0194a() {
            }

            @Override // com.spotify.mobile.android.sso.util.a
            public void a(Uri uri, Uri uri2) {
                a aVar = a.this;
                aVar.getClass();
                AuthorizationActivity.this.startActivity(new Intent("android.intent.action.VIEW", uri2));
            }

            @Override // com.spotify.mobile.android.sso.util.a
            public void b(Uri uri) {
                AuthorizationActivity.this.c1(uri.toString());
            }
        }

        a(String str) {
            this.a = str;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            AuthorizationActivity.this.L.setVisibility(0);
            if (AuthorizationActivity.this.I) {
                AuthorizationActivity.this.H.dismiss();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (AuthorizationActivity.this.I) {
                AuthorizationActivity.this.H.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            Logger.d("%s, code: %s, failing url: %s", str, Integer.valueOf(i), str2);
            AuthorizationActivity authorizationActivity = AuthorizationActivity.this;
            authorizationActivity.n1(ErrorMessage.ACCOUNTS_SERVICE_ERROR, null, AuthorizationActivity.X0(authorizationActivity));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return com.spotify.mobile.android.share.menu.preview.b.g(Uri.parse(this.a), Uri.parse(str), new C0194a());
        }
    }

    class b implements h<tv1> {
        b() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            AuthorizationRequest a2 = ((tv1) obj).a();
            if (a2 != null) {
                AuthorizationActivity.this.M = a2.e();
                AuthorizationActivity.this.K = a2;
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    static String X0(AuthorizationActivity authorizationActivity) {
        String i;
        AuthorizationRequest authorizationRequest = authorizationActivity.K;
        return (authorizationRequest == null || (i = authorizationRequest.i()) == null) ? "" : i;
    }

    private void d1(ErrorMessage errorMessage, String str) {
        Uri d = f1().d(Uri.parse(this.M), errorMessage, str);
        if (d != null) {
            startActivity(new Intent("android.intent.action.VIEW", d));
        }
    }

    private c f1() {
        if (this.G == null) {
            Assertion.p("The in-app protocol has not been set");
        }
        c cVar = this.G;
        cVar.getClass();
        return cVar;
    }

    private void m1() {
        if (!isFinishing()) {
            d1(ErrorMessage.CANCELLED, null);
            setResult(0);
            finish();
        }
    }

    public void c1(String str) {
        k a2 = h.a(Uri.parse(str));
        a2.c(new b(this, a2), new e(this, a2), new d(this, a2), new a(this, a2), new c(this, a2));
    }

    public void i1(k kVar, k.a aVar) {
        kVar.getClass();
        k.a aVar2 = (k.a) kVar;
        c f1 = f1();
        Bundle f = f1.f(aVar2.d(), aVar2.e(), aVar2.g());
        if (!isFinishing()) {
            setResult(-1, f1.b(f));
            finish();
        }
    }

    public void j1(k kVar, k.b bVar) {
        kVar.getClass();
        k.b bVar2 = (k.b) kVar;
        c f1 = f1();
        Bundle g = f1.g(bVar2.d(), bVar2.f());
        if (!isFinishing()) {
            Uri e = f1().e(Uri.parse(this.M), bVar2);
            if (e != null) {
                startActivity(new Intent("android.intent.action.VIEW", e));
            }
            setResult(-1, f1.b(g));
            finish();
        }
    }

    public /* synthetic */ void k1(DialogInterface dialogInterface) {
        Logger.d("The user canceled", new Object[0]);
        m1();
    }

    public void n1(ErrorMessage errorMessage, String str, String str2) {
        if (!isFinishing()) {
            Logger.d(errorMessage.d(), new Object[0]);
            d1(errorMessage, str);
            setResult(-2, f1().a(errorMessage, str, str2));
            finish();
        }
    }

    public void o1(HttpCookie httpCookie, Uri uri, String str) {
        WebView webView = (WebView) findViewById(C0707R.id.com_spotify_sdk_login_webview);
        this.L = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        this.L.setWebViewClient(new a(str));
        CookieManager.getInstance().setCookie(httpCookie.getDomain(), httpCookie.toString());
        this.L.loadUrl(uri.toString());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            if (i == 1337) {
                Logger.d("The Login flow was canceled", new Object[0]);
            }
            m1();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.I = true;
        super.onAttachedToWindow();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m1();
        Logger.d("The user canceled", new Object[0]);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            this.Q.a(null, Uri.parse(callingPackage));
        }
        this.O.c(this);
        this.G = c.c(getIntent());
        try {
            setContentView(C0707R.layout.activity_sdk_sso);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().toLowerCase(Locale.ENGLISH).contains("webview")) {
                throw e;
            }
            n1(ErrorMessage.WEBVIEW_ERROR, "The system WebView is not available right now or is being updated. Try again later", "");
        }
        ProgressDialog progressDialog = new ProgressDialog(this, C0707R.style.res_2132083499_theme_glue_dialog_alert);
        this.H = progressDialog;
        progressDialog.setMessage(getString(C0707R.string.placeholders_loading));
        this.H.setOnCancelListener(new f(this));
        this.H.show();
        this.J = bundle != null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        this.O.d();
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.I = false;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        i iVar = this.P;
        intent.getClass();
        iVar.b(intent);
    }

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.O.stop();
    }

    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.O.start();
        if (!this.J) {
            i iVar = this.P;
            Intent intent = getIntent();
            intent.getClass();
            iVar.b(intent);
        }
    }

    public void p1() {
        startActivityForResult(this.N.a(this), 1337);
    }

    @Override // com.spotify.mobius.g
    public h<tv1> t(da2<rv1> da2) {
        return new b();
    }
}
