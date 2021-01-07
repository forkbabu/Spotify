package io.branch.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import java.net.URI;
import java.net.URISyntaxException;
import org.json.JSONObject;

public class j {
    private static j h;
    private boolean a;
    private boolean b;
    private b c = null;
    private boolean d = false;
    private String e;
    private boolean f;
    private Dialog g;

    /* access modifiers changed from: package-private */
    public class a extends WebViewClient {
        final /* synthetic */ b a;
        final /* synthetic */ c b;
        final /* synthetic */ WebView c;

        a(b bVar, c cVar, WebView webView) {
            this.a = bVar;
            this.b = cVar;
            this.c = webView;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            j.h(j.this, this.a, this.b, this.c);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            j.this.f = true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean d2 = j.d(j.this, str);
            if (!d2) {
                webView.loadUrl(str);
            } else if (j.this.g != null) {
                j.this.g.dismiss();
            }
            return d2;
        }
    }

    /* access modifiers changed from: private */
    public class b {
        private String a = "";
        private String b = "";
        private int c = 1;
        private String d = "";
        private String e = "";

        b(j jVar, JSONObject jSONObject, String str, a aVar) {
            try {
                this.b = str;
                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.BranchViewID;
                if (jSONObject.has(defines$Jsonkey.d())) {
                    this.a = jSONObject.getString(defines$Jsonkey.d());
                }
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.BranchViewNumOfUse;
                if (jSONObject.has(defines$Jsonkey2.d())) {
                    this.c = jSONObject.getInt(defines$Jsonkey2.d());
                }
                Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.BranchViewUrl;
                if (jSONObject.has(defines$Jsonkey3.d())) {
                    this.d = jSONObject.getString(defines$Jsonkey3.d());
                }
                Defines$Jsonkey defines$Jsonkey4 = Defines$Jsonkey.BranchViewHtml;
                if (jSONObject.has(defines$Jsonkey4.d())) {
                    this.e = jSONObject.getString(defines$Jsonkey4.d());
                }
            } catch (Exception unused) {
            }
        }

        static boolean c(b bVar, Context context) {
            bVar.getClass();
            int h = r.r(context).h(bVar.a);
            int i = bVar.c;
            return i > h || i == -1;
        }
    }

    public interface c {
    }

    /* access modifiers changed from: private */
    public class d extends AsyncTask<Void, Void, Boolean> {
        private final b a;
        private final Context b;
        private final c c;

        public d(b bVar, Context context, c cVar) {
            this.a = bVar;
            this.b = context;
            this.c = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
        @Override // android.os.AsyncTask
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Void[] r8) {
            /*
                r7 = this;
                java.lang.Void[] r8 = (java.lang.Void[]) r8
                r8 = 0
                r0 = 200(0xc8, float:2.8E-43)
                r1 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x004f }
                io.branch.referral.j$b r3 = r7.a     // Catch:{ Exception -> 0x004f }
                java.lang.String r3 = io.branch.referral.j.b.b(r3)     // Catch:{ Exception -> 0x004f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x004f }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x004f }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x004f }
                java.lang.String r3 = "GET"
                r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x004f }
                r2.connect()     // Catch:{ Exception -> 0x004f }
                int r3 = r2.getResponseCode()     // Catch:{ Exception -> 0x004f }
                if (r3 != r0) goto L_0x0050
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x004e }
                r4.<init>()     // Catch:{ Exception -> 0x004e }
                java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x004e }
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x004e }
            L_0x0032:
                int r6 = r2.read(r5)     // Catch:{ Exception -> 0x004e }
                if (r6 == r1) goto L_0x003c
                r4.write(r5, r8, r6)     // Catch:{ Exception -> 0x004e }
                goto L_0x0032
            L_0x003c:
                io.branch.referral.j$b r1 = r7.a     // Catch:{ Exception -> 0x004e }
                java.lang.String r5 = "UTF-8"
                java.lang.String r5 = r4.toString(r5)     // Catch:{ Exception -> 0x004e }
                io.branch.referral.j.b.e(r1, r5)     // Catch:{ Exception -> 0x004e }
                r4.close()     // Catch:{ Exception -> 0x004e }
                r2.close()     // Catch:{ Exception -> 0x004e }
                goto L_0x0050
            L_0x004e:
                r1 = r3
            L_0x004f:
                r3 = r1
            L_0x0050:
                if (r3 != r0) goto L_0x0053
                r8 = 1
            L_0x0053:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.j.d.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            super.onPostExecute(bool2);
            if (bool2.booleanValue()) {
                j.this.j(this.a, this.b, this.c);
            } else {
                c cVar = this.c;
                if (cVar != null) {
                    ((Branch) cVar).U(-202, "Unable to create a Branch view due to a temporary network error", this.a.b);
                }
            }
            j.this.d = false;
        }
    }

    private j() {
    }

    static boolean d(j jVar, String str) {
        jVar.getClass();
        try {
            URI uri = new URI(str);
            if (!uri.getScheme().equalsIgnoreCase("branch-cta")) {
                return false;
            }
            if (uri.getHost().equalsIgnoreCase("accept")) {
                jVar.b = true;
            } else if (!uri.getHost().equalsIgnoreCase("cancel")) {
                return false;
            } else {
                jVar.b = false;
            }
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    static void h(j jVar, b bVar, c cVar, WebView webView) {
        if (jVar.f || Branch.F() == null || Branch.F().l == null) {
            jVar.a = false;
            if (cVar != null) {
                ((Branch) cVar).U(-202, "Unable to create a Branch view due to a temporary network error", bVar.b);
                return;
            }
            return;
        }
        Activity activity = Branch.F().l.get();
        if (activity != null) {
            Context applicationContext = activity.getApplicationContext();
            String str = bVar.a;
            bVar.getClass();
            r r = r.r(applicationContext);
            r.getClass();
            r.J("bnc_branch_view_use_" + str, r.h(str) + 1);
            jVar.e = activity.getClass().getName();
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            relativeLayout.setVisibility(8);
            relativeLayout.addView(webView, new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.setBackgroundColor(0);
            Dialog dialog = jVar.g;
            if (dialog == null || !dialog.isShowing()) {
                Dialog dialog2 = new Dialog(activity, 16973834);
                jVar.g = dialog2;
                dialog2.setContentView(relativeLayout);
                relativeLayout.setVisibility(0);
                webView.setVisibility(0);
                jVar.g.show();
                jVar.r(relativeLayout);
                jVar.r(webView);
                jVar.a = true;
                if (cVar != null) {
                    String unused = bVar.b;
                    String unused2 = bVar.a;
                }
                jVar.g.setOnDismissListener(new k(jVar, cVar, bVar));
            } else if (cVar != null) {
                ((Branch) cVar).U(-200, "Unable to create a Branch view. A Branch view is already showing", bVar.b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void j(b bVar, Context context, c cVar) {
        if (context != null && bVar != null) {
            WebView webView = new WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            if (Build.VERSION.SDK_INT >= 19) {
                webView.setLayerType(2, null);
            }
            this.f = false;
            if (!TextUtils.isEmpty(bVar.e)) {
                webView.loadDataWithBaseURL(null, bVar.e, "text/html", "utf-8", null);
                webView.setWebViewClient(new a(bVar, cVar, webView));
            }
        }
    }

    public static j k() {
        if (h == null) {
            h = new j();
        }
        return h;
    }

    private boolean o(b bVar, Context context, c cVar) {
        if (this.a || this.d) {
            if (cVar != null) {
                ((Branch) cVar).U(-200, "Unable to create a Branch view. A Branch view is already showing", bVar.b);
            }
            return false;
        }
        this.a = false;
        this.b = false;
        if (!(context == null || bVar == null)) {
            if (b.c(bVar, context)) {
                if (!TextUtils.isEmpty(bVar.e)) {
                    j(bVar, context, cVar);
                } else {
                    this.d = true;
                    new d(bVar, context, cVar).execute(new Void[0]);
                }
                return true;
            } else if (cVar != null) {
                ((Branch) cVar).U(-203, "Unable to create this Branch view. Reached maximum usage limit ", bVar.b);
            }
        }
        return false;
    }

    private void r(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setStartOffset(10);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    public boolean l(Context context) {
        b bVar = this.c;
        return bVar != null && b.c(bVar, context);
    }

    public boolean m(JSONObject jSONObject, String str) {
        Activity activity;
        b bVar = new b(this, jSONObject, str, null);
        if (Branch.F().l == null || (activity = Branch.F().l.get()) == null || !b.c(bVar, activity)) {
            return false;
        }
        this.c = new b(this, jSONObject, str, null);
        return true;
    }

    public void n(Activity activity) {
        String str = this.e;
        if (str != null && str.equalsIgnoreCase(activity.getClass().getName())) {
            this.a = false;
        }
    }

    public boolean p(JSONObject jSONObject, String str, Context context, c cVar) {
        return o(new b(this, jSONObject, str, null), context, cVar);
    }

    public boolean q(Context context) {
        boolean o = o(this.c, context, null);
        if (o) {
            this.c = null;
        }
        return o;
    }
}
