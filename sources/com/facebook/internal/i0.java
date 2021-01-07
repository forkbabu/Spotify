package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.k;
import com.spotify.music.C0707R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;

public class i0 extends Dialog {
    private static volatile int v;
    private String a;
    private String b;
    private f c;
    private WebView f;
    private ProgressDialog n;
    private ImageView o;
    private FrameLayout p;
    private g q;
    private boolean r;
    private boolean s;
    private boolean t;
    private WindowManager.LayoutParams u;

    /* access modifiers changed from: package-private */
    public class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            i0.this.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends WebView {
        b(i0 i0Var, Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnTouchListener {
        c(i0 i0Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* access modifiers changed from: private */
    public class e extends WebViewClient {
        e(a aVar) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!i0.this.s) {
                i0.this.n.dismiss();
            }
            i0.this.p.setBackgroundColor(0);
            i0.this.f.setVisibility(0);
            i0.this.o.setVisibility(0);
            i0.this.t = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean z = k.n;
            super.onPageStarted(webView, str, bitmap);
            if (!i0.this.s) {
                i0.this.n.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            i0.this.r(new FacebookDialogException(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            i0.this.r(new FacebookDialogException(null, -11, null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
        @Override // android.webkit.WebViewClient
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                boolean r6 = com.facebook.k.n
                com.facebook.internal.i0 r6 = com.facebook.internal.i0.this
                java.lang.String r6 = com.facebook.internal.i0.a(r6)
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x0092
                com.facebook.internal.i0 r6 = com.facebook.internal.i0.this
                android.os.Bundle r6 = r6.p(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0023
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0023:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0031
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0031:
                if (r1 != 0) goto L_0x0039
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x0039:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.f0.C(r2)
                r4 = -1
                if (r3 != 0) goto L_0x004b
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x004b }
                goto L_0x004c
            L_0x004b:
                r2 = -1
            L_0x004c:
                boolean r3 = com.facebook.internal.f0.C(r7)
                if (r3 == 0) goto L_0x0060
                boolean r3 = com.facebook.internal.f0.C(r1)
                if (r3 == 0) goto L_0x0060
                if (r2 != r4) goto L_0x0060
                com.facebook.internal.i0 r7 = com.facebook.internal.i0.this
                r7.s(r6)
                goto L_0x0091
            L_0x0060:
                if (r7 == 0) goto L_0x0078
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0072
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x0078
            L_0x0072:
                com.facebook.internal.i0 r6 = com.facebook.internal.i0.this
                r6.cancel()
                goto L_0x0091
            L_0x0078:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0082
                com.facebook.internal.i0 r6 = com.facebook.internal.i0.this
                r6.cancel()
                goto L_0x0091
            L_0x0082:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.i0 r7 = com.facebook.internal.i0.this
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r1)
                r7.r(r2)
            L_0x0091:
                return r0
            L_0x0092:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00a0
                com.facebook.internal.i0 r6 = com.facebook.internal.i0.this
                r6.cancel()
                return r0
            L_0x00a0:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00aa
                return r1
            L_0x00aa:
                com.facebook.internal.i0 r6 = com.facebook.internal.i0.this     // Catch:{ ActivityNotFoundException -> 0x00bf }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00bf }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00bf }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00bf }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00bf }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00bf }
                return r0
            L_0x00bf:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.i0.e.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    public interface f {
        void a(Bundle bundle, FacebookException facebookException);
    }

    /* access modifiers changed from: private */
    public class g extends AsyncTask<Void, Void, String[]> {
        private String a;
        private Bundle b;
        private Exception[] c;

        g(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        /* access modifiers changed from: protected */
        public String[] b() {
            if (uf.c(this)) {
                return null;
            }
            try {
                String[] stringArray = this.b.getStringArray("media");
                String[] strArr = new String[stringArray.length];
                this.c = new Exception[stringArray.length];
                CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                com.facebook.a e = com.facebook.a.e();
                for (int i = 0; i < stringArray.length; i++) {
                    try {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTask) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri parse = Uri.parse(stringArray[i]);
                        if (f0.E(parse)) {
                            strArr[i] = parse.toString();
                            countDownLatch.countDown();
                        } else {
                            concurrentLinkedQueue.add(com.facebook.share.internal.c.y(e, parse, new k0(this, strArr, i, countDownLatch)).h());
                        }
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((AsyncTask) it2.next()).cancel(true);
                        }
                        return null;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Throwable th) {
                uf.b(th, this);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void c(String[] strArr) {
            if (!uf.c(this)) {
                try {
                    i0.this.n.dismiss();
                    Exception[] excArr = this.c;
                    for (Exception exc : excArr) {
                        if (exc != null) {
                            i0.this.r(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        i0.this.r(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List asList = Arrays.asList(strArr);
                    if (asList.contains(null)) {
                        i0.this.r(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    f0.K(this.b, "media", new JSONArray((Collection) asList));
                    i0.this.a = f0.c(d0.a(), k.n() + "/dialog/" + this.a, this.b).toString();
                    i0.this.v((i0.this.o.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (uf.c(this)) {
                return null;
            }
            try {
                Void[] voidArr2 = voidArr;
                return b();
            } catch (Throwable th) {
                uf.b(th, this);
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (!uf.c(this)) {
                try {
                    c(strArr);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected i0(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            com.facebook.internal.h0.h()
            int r0 = com.facebook.internal.i0.v
            if (r0 != 0) goto L_0x000c
            com.facebook.internal.h0.h()
            int r0 = com.facebook.internal.i0.v
        L_0x000c:
            r1.<init>(r2, r0)
            java.lang.String r2 = "fbconnect://success"
            r1.b = r2
            r2 = 0
            r1.r = r2
            r1.s = r2
            r1.t = r2
            r1.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.i0.<init>(android.content.Context, java.lang.String):void");
    }

    private int j(int i, float f2, int i2, int i3) {
        int i4 = (int) (((float) i) / f2);
        double d2 = 0.5d;
        if (i4 <= i2) {
            d2 = 1.0d;
        } else if (i4 < i3) {
            double d3 = (double) (i3 - i4);
            double d4 = (double) (i3 - i2);
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = 0.5d + ((d3 / d4) * 0.5d);
        }
        double d5 = (double) i;
        Double.isNaN(d5);
        return (int) (d5 * d2);
    }

    protected static void l(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null && v == 0) {
                    int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                    if (i == 0) {
                        i = C0707R.style.com_facebook_activity_theme;
                    }
                    v = i;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    public static i0 o(Context context, String str, Bundle bundle, int i, f fVar) {
        l(context);
        return new i0(context, str, bundle, i, fVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void v(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        b bVar = new b(this, getContext());
        this.f = bVar;
        bVar.setVerticalScrollBarEnabled(false);
        this.f.setHorizontalScrollBarEnabled(false);
        this.f.setWebViewClient(new e(null));
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.loadUrl(this.a);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f.setVisibility(4);
        this.f.getSettings().setSavePassword(false);
        this.f.getSettings().setSaveFormData(false);
        this.f.setFocusable(true);
        this.f.setFocusableInTouchMode(true);
        this.f.setOnTouchListener(new c(this));
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f);
        linearLayout.setBackgroundColor(-872415232);
        this.p.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.c != null && !this.r) {
            r(new FacebookOperationCanceledException());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.s && (progressDialog = this.n) != null && progressDialog.isShowing()) {
            this.n.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public WebView k() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return this.t;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        AutofillManager autofillManager;
        boolean z = false;
        this.s = false;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        if (z && (layoutParams = this.u) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            StringBuilder V0 = je.V0("Set token on onAttachedToWindow(): ");
            V0.append(this.u.token);
            V0.toString();
            boolean z2 = k.n;
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.n = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.n.setMessage(getContext().getString(C0707R.string.com_facebook_loading));
        this.n.setCanceledOnTouchOutside(false);
        this.n.setOnCancelListener(new a());
        requestWindowFeature(1);
        this.p = new FrameLayout(getContext());
        q();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        ImageView imageView = new ImageView(getContext());
        this.o = imageView;
        imageView.setOnClickListener(new j0(this));
        this.o.setImageDrawable(getContext().getResources().getDrawable(C0707R.drawable.com_facebook_close));
        this.o.setVisibility(4);
        if (this.a != null) {
            v((this.o.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.p.addView(this.o, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.p);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.s = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        g gVar = this.q;
        if (gVar == null || gVar.getStatus() != AsyncTask.Status.PENDING) {
            q();
            return;
        }
        this.q.execute(new Void[0]);
        this.n.show();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        g gVar = this.q;
        if (gVar != null) {
            gVar.cancel(true);
            this.n.dismiss();
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.u = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    public Bundle p(String str) {
        Uri parse = Uri.parse(str);
        Bundle J = f0.J(parse.getQuery());
        J.putAll(f0.J(parse.getFragment()));
        return J;
    }

    public void q() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        getWindow().setLayout(Math.min(j(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(j(i, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    public void r(Throwable th) {
        FacebookException facebookException;
        if (this.c != null && !this.r) {
            this.r = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.c.a(null, facebookException);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void s(Bundle bundle) {
        f fVar = this.c;
        if (fVar != null && !this.r) {
            this.r = true;
            fVar.a(bundle, null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void t(String str) {
        this.b = str;
    }

    public void u(f fVar) {
        this.c = fVar;
    }

    public static class d {
        private Context a;
        private String b;
        private String c;
        private f d;
        private Bundle e;
        private com.facebook.a f;

        public d(Context context, String str, Bundle bundle) {
            this.f = com.facebook.a.e();
            if (!com.facebook.a.p()) {
                String q = f0.q(context);
                if (q != null) {
                    this.b = q;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            this.a = context;
            this.c = str;
            if (bundle != null) {
                this.e = bundle;
            } else {
                this.e = new Bundle();
            }
        }

        public i0 a() {
            com.facebook.a aVar = this.f;
            if (aVar != null) {
                this.e.putString("app_id", aVar.c());
                this.e.putString("access_token", this.f.n());
            } else {
                this.e.putString("app_id", this.b);
            }
            return i0.o(this.a, this.c, this.e, 0, this.d);
        }

        public String b() {
            return this.b;
        }

        public Context c() {
            return this.a;
        }

        public f d() {
            return this.d;
        }

        public Bundle e() {
            return this.e;
        }

        public d f(f fVar) {
            this.d = fVar;
            return this;
        }

        public d(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? f0.q(context) : str;
            h0.g(str, "applicationId");
            this.b = str;
            this.a = context;
            this.c = str2;
            if (bundle != null) {
                this.e = bundle;
            } else {
                this.e = new Bundle();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i0(android.content.Context r3, java.lang.String r4, android.os.Bundle r5, int r6, com.facebook.internal.i0.f r7) {
        /*
            r2 = this;
            if (r6 != 0) goto L_0x0007
            com.facebook.internal.h0.h()
            int r6 = com.facebook.internal.i0.v
        L_0x0007:
            r2.<init>(r3, r6)
            java.lang.String r6 = "fbconnect://success"
            r2.b = r6
            r0 = 0
            r2.r = r0
            r2.s = r0
            r2.t = r0
            if (r5 != 0) goto L_0x001c
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x001c:
            boolean r3 = com.facebook.internal.f0.y(r3)
            if (r3 == 0) goto L_0x0024
            java.lang.String r6 = "fbconnect://chrome_os_success"
        L_0x0024:
            r2.b = r6
            java.lang.String r3 = "redirect_uri"
            r5.putString(r3, r6)
            java.lang.String r3 = "display"
            java.lang.String r6 = "touch"
            r5.putString(r3, r6)
            java.lang.String r3 = com.facebook.k.e()
            java.lang.String r6 = "client_id"
            r5.putString(r6, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            boolean r1 = com.facebook.k.n
            java.lang.String r1 = "7.1.0"
            r6[r0] = r1
            java.lang.String r0 = "android-%s"
            java.lang.String r3 = java.lang.String.format(r3, r0, r6)
            java.lang.String r6 = "sdk"
            r5.putString(r6, r3)
            r2.c = r7
            java.lang.String r3 = "share"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = "media"
            boolean r3 = r5.containsKey(r3)
            if (r3 == 0) goto L_0x006b
            com.facebook.internal.i0$g r3 = new com.facebook.internal.i0$g
            r3.<init>(r4, r5)
            r2.q = r3
            goto L_0x0096
        L_0x006b:
            java.lang.String r3 = com.facebook.internal.d0.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.facebook.k.n()
            r6.append(r7)
            java.lang.String r7 = "/"
            r6.append(r7)
            java.lang.String r7 = "dialog/"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.net.Uri r3 = com.facebook.internal.f0.c(r3, r4, r5)
            java.lang.String r3 = r3.toString()
            r2.a = r3
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.i0.<init>(android.content.Context, java.lang.String, android.os.Bundle, int, com.facebook.internal.i0$f):void");
    }
}
