package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.f0;
import com.facebook.internal.m0;
import com.facebook.internal.o;
import com.facebook.internal.y;
import com.facebook.m;
import com.facebook.p;
import com.facebook.q;
import com.facebook.share.widget.LikeView;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class e {
    private static final String o = "e";
    private static com.facebook.internal.o p;
    private static final ConcurrentHashMap<String, e> q = new ConcurrentHashMap<>();
    private static m0 r = new m0(1);
    private static m0 s = new m0(1);
    private static Handler t;
    private static String u;
    private static boolean v;
    private static volatile int w;
    private String a;
    private LikeView.ObjectType b;
    private boolean c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Bundle m;
    private com.facebook.appevents.i n;

    /* access modifiers changed from: package-private */
    public class a implements p.a {
        final /* synthetic */ g a;
        final /* synthetic */ i b;
        final /* synthetic */ o c;

        a(g gVar, i iVar, o oVar) {
            this.a = gVar;
            this.b = iVar;
            this.c = oVar;
        }

        @Override // com.facebook.p.a
        public void a(com.facebook.p pVar) {
            e.this.i = this.a.e;
            if (f0.C(e.this.i)) {
                e.this.i = this.b.e;
                e.this.j = this.b.f;
            }
            if (f0.C(e.this.i)) {
                LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                String unused = e.o;
                String unused2 = e.this.a;
                int i = y.e;
                com.facebook.k.v(loggingBehavior);
                e eVar = e.this;
                FacebookRequestError facebookRequestError = this.b.d;
                if (facebookRequestError == null) {
                    facebookRequestError = this.a.d;
                }
                e.t(eVar, "get_verified_id", facebookRequestError);
            }
            o oVar = this.c;
            if (oVar != null) {
                oVar.onComplete();
            }
        }
    }

    static class b implements AbstractC0076e {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ Intent c;

        b(int i, int i2, Intent intent) {
            this.a = i;
            this.b = i2;
            this.c = intent;
        }

        @Override // com.facebook.share.internal.e.AbstractC0076e
        public void a(e eVar, FacebookException facebookException) {
            if (facebookException == null) {
                e.a(eVar, this.a, this.b, this.c);
                return;
            }
            String unused = e.o;
            boolean z = com.facebook.k.n;
        }
    }

    /* access modifiers changed from: private */
    public abstract class c {
        private com.facebook.m a;
        protected String b;
        protected LikeView.ObjectType c;
        protected FacebookRequestError d;

        /* access modifiers changed from: package-private */
        public class a implements m.c {
            a() {
            }

            @Override // com.facebook.m.c
            public void b(q qVar) {
                c.this.d = qVar.e();
                c cVar = c.this;
                FacebookRequestError facebookRequestError = cVar.d;
                if (facebookRequestError != null) {
                    cVar.d(facebookRequestError);
                } else {
                    cVar.e(qVar);
                }
            }
        }

        protected c(e eVar, String str, LikeView.ObjectType objectType) {
            this.b = str;
            this.c = objectType;
        }

        public void c(com.facebook.p pVar) {
            pVar.c(this.a);
        }

        /* access modifiers changed from: protected */
        public abstract void d(FacebookRequestError facebookRequestError);

        /* access modifiers changed from: protected */
        public abstract void e(q qVar);

        /* access modifiers changed from: protected */
        public void f(com.facebook.m mVar) {
            this.a = mVar;
            mVar.F(com.facebook.k.n());
            mVar.A(new a());
        }
    }

    /* access modifiers changed from: private */
    public static class d implements Runnable {
        private String a;
        private LikeView.ObjectType b;
        private AbstractC0076e c;

        d(String str, LikeView.ObjectType objectType, AbstractC0076e eVar) {
            this.a = str;
            this.b = objectType;
            this.c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    e.w(this.a, this.b, this.c);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.e$e  reason: collision with other inner class name */
    public interface AbstractC0076e {
        void a(e eVar, FacebookException facebookException);
    }

    /* access modifiers changed from: private */
    public class f extends c {
        String e;
        String f;
        String g;
        String h;

        f(String str, LikeView.ObjectType objectType) {
            super(e.this, str, objectType);
            this.e = e.this.d;
            this.f = e.this.e;
            this.g = e.this.f;
            this.h = e.this.g;
            Bundle E = je.E("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            E.putString("locale", Locale.getDefault().toString());
            f(new com.facebook.m(com.facebook.a.e(), str, E, HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void d(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            int i2 = y.e;
            com.facebook.k.v(loggingBehavior);
            e.t(e.this, "get_engagement", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void e(q qVar) {
            JSONObject T = f0.T(qVar.f(), "engagement");
            if (T != null) {
                this.e = T.optString("count_string_with_like", this.e);
                this.f = T.optString("count_string_without_like", this.f);
                this.g = T.optString("social_sentence_with_like", this.g);
                this.h = T.optString("social_sentence_without_like", this.h);
            }
        }
    }

    /* access modifiers changed from: private */
    public class g extends c {
        String e;

        g(e eVar, String str, LikeView.ObjectType objectType) {
            super(eVar, str, objectType);
            f(new com.facebook.m(com.facebook.a.e(), "", je.F("fields", "og_object.fields(id)", "ids", str), HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.c().contains("og_object")) {
                this.d = null;
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            int i = y.e;
            com.facebook.k.v(loggingBehavior);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void e(q qVar) {
            JSONObject optJSONObject;
            JSONObject T = f0.T(qVar.f(), this.b);
            if (T != null && (optJSONObject = T.optJSONObject("og_object")) != null) {
                this.e = optJSONObject.optString("id");
            }
        }
    }

    /* access modifiers changed from: private */
    public class h extends c implements k {
        private boolean e;
        private String f;
        private final String g;
        private final LikeView.ObjectType h;

        h(String str, LikeView.ObjectType objectType) {
            super(e.this, str, objectType);
            this.e = e.this.c;
            this.g = str;
            this.h = objectType;
            f(new com.facebook.m(com.facebook.a.e(), "me/og.likes", je.F("fields", "id,application", "object", str), HttpMethod.GET));
        }

        @Override // com.facebook.share.internal.e.k
        public boolean a() {
            return this.e;
        }

        @Override // com.facebook.share.internal.e.k
        public String b() {
            return this.f;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void d(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            int i2 = y.e;
            com.facebook.k.v(loggingBehavior);
            e.t(e.this, "get_og_object_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void e(q qVar) {
            JSONObject f2 = qVar.f();
            JSONArray optJSONArray = f2 != null ? f2.optJSONArray("data") : null;
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        this.e = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        com.facebook.a e2 = com.facebook.a.e();
                        if (optJSONObject2 != null && com.facebook.a.p() && f0.b(e2.c(), optJSONObject2.optString("id"))) {
                            this.f = optJSONObject.optString("id");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class i extends c {
        String e;
        boolean f;

        i(e eVar, String str, LikeView.ObjectType objectType) {
            super(eVar, str, objectType);
            f(new com.facebook.m(com.facebook.a.e(), "", je.F("fields", "id", "ids", str), HttpMethod.GET));
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void d(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            int i = y.e;
            com.facebook.k.v(loggingBehavior);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void e(q qVar) {
            JSONObject T = f0.T(qVar.f(), this.b);
            if (T != null) {
                String optString = T.optString("id");
                this.e = optString;
                this.f = !f0.C(optString);
            }
        }
    }

    /* access modifiers changed from: private */
    public class j extends c implements k {
        private boolean e;
        private String f;

        j(String str) {
            super(e.this, str, LikeView.ObjectType.PAGE);
            this.e = e.this.c;
            this.f = str;
            f(new com.facebook.m(com.facebook.a.e(), je.x0("me/likes/", str), je.E("fields", "id"), HttpMethod.GET));
        }

        @Override // com.facebook.share.internal.e.k
        public boolean a() {
            return this.e;
        }

        @Override // com.facebook.share.internal.e.k
        public String b() {
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void d(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            int i = y.e;
            com.facebook.k.v(loggingBehavior);
            e.t(e.this, "get_page_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void e(q qVar) {
            JSONObject f2 = qVar.f();
            JSONArray optJSONArray = f2 != null ? f2.optJSONArray("data") : null;
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.e = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public interface k {
        boolean a();

        String b();
    }

    /* access modifiers changed from: private */
    public static class l implements Runnable {
        private static ArrayList<String> c = new ArrayList<>();
        private String a;
        private boolean b;

        l(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    String str = this.a;
                    if (str != null) {
                        c.remove(str);
                        c.add(0, this.a);
                    }
                    if (this.b && c.size() >= 128) {
                        while (64 < c.size()) {
                            ArrayList<String> arrayList = c;
                            e.q.remove(arrayList.remove(arrayList.size() - 1));
                        }
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class m extends c {
        String e;

        m(String str, LikeView.ObjectType objectType) {
            super(e.this, str, objectType);
            f(new com.facebook.m(com.facebook.a.e(), "me/og.likes", je.E("object", str), HttpMethod.POST));
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.b() == 3501) {
                this.d = null;
                return;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            int i = y.e;
            com.facebook.k.v(loggingBehavior);
            e.t(e.this, "publish_like", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void e(q qVar) {
            JSONObject f2 = qVar.f();
            String str = "";
            if (f2 != null) {
                str = f2.optString("id", str);
            }
            this.e = str;
        }
    }

    /* access modifiers changed from: private */
    public class n extends c {
        private String e;

        n(String str) {
            super(e.this, null, null);
            this.e = str;
            f(new com.facebook.m(com.facebook.a.e(), str, null, HttpMethod.DELETE));
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void d(FacebookRequestError facebookRequestError) {
            LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
            String unused = e.o;
            int i = y.e;
            com.facebook.k.v(loggingBehavior);
            e.t(e.this, "publish_unlike", facebookRequestError);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.share.internal.e.c
        public void e(q qVar) {
        }
    }

    /* access modifiers changed from: private */
    public interface o {
        void onComplete();
    }

    /* access modifiers changed from: private */
    public static class p implements Runnable {
        private String a;
        private String b;

        p(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    e.v(this.a, this.b);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    private e(String str, LikeView.ObjectType objectType) {
        this.a = str;
        this.b = objectType;
    }

    static void B(e eVar, String str) {
        F(null, str, null);
    }

    /* access modifiers changed from: private */
    public static void F(e eVar, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (eVar != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", eVar.a);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        e6.b(com.facebook.k.d()).d(intent);
    }

    private boolean G() {
        com.facebook.a e2 = com.facebook.a.e();
        return !this.j && this.i != null && com.facebook.a.p() && e2.l() != null && e2.l().contains("publish_actions");
    }

    private static e H(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            e eVar = new e(jSONObject.getString("object_id"), LikeView.ObjectType.d(jSONObject.optInt("object_type", LikeView.ObjectType.UNKNOWN.g())));
            eVar.d = jSONObject.optString("like_count_string_with_like", null);
            eVar.e = jSONObject.optString("like_count_string_without_like", null);
            eVar.f = jSONObject.optString("social_sentence_with_like", null);
            eVar.g = jSONObject.optString("social_sentence_without_like", null);
            eVar.c = jSONObject.optBoolean("is_object_liked");
            eVar.h = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                eVar.m = com.facebook.internal.d.a(optJSONObject);
            }
            return eVar;
        } catch (JSONException e2) {
            Log.e(o, "Unable to deserialize controller from JSON", e2);
            return null;
        }
    }

    private void I(o oVar) {
        if (!f0.C(this.i)) {
            oVar.onComplete();
            return;
        }
        g gVar = new g(this, this.a, this.b);
        i iVar = new i(this, this.a, this.b);
        com.facebook.p pVar = new com.facebook.p();
        gVar.c(pVar);
        iVar.c(pVar);
        pVar.d(new a(gVar, iVar, oVar));
        pVar.e();
    }

    /* access modifiers changed from: private */
    public com.facebook.appevents.i J() {
        if (this.n == null) {
            this.n = new com.facebook.appevents.i(com.facebook.k.d());
        }
        return this.n;
    }

    private static String K(String str) {
        String n2 = com.facebook.a.p() ? com.facebook.a.e().n() : null;
        if (n2 != null) {
            n2 = f0.I(n2);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", str, f0.f(n2, ""), Integer.valueOf(w));
    }

    @Deprecated
    public static void L(String str, LikeView.ObjectType objectType, AbstractC0076e eVar) {
        if (!v) {
            synchronized (e.class) {
                if (!v) {
                    t = new Handler(Looper.getMainLooper());
                    w = com.facebook.k.d().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                    p = new com.facebook.internal.o(o, new o.f());
                    new i();
                    CallbackManagerImpl.c(CallbackManagerImpl.RequestCodeOffset.Like.d(), new g());
                    v = true;
                }
            }
        }
        e M = M(str);
        if (M != null) {
            Y(M, objectType, eVar);
        } else {
            s.e(new d(str, objectType, eVar));
        }
    }

    private static e M(String str) {
        String K = K(str);
        e eVar = q.get(K);
        if (eVar != null) {
            r.e(new l(K, false));
        }
        return eVar;
    }

    @Deprecated
    public static boolean P(int i2, int i3, Intent intent) {
        if (f0.C(u)) {
            u = com.facebook.k.d().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (f0.C(u)) {
            return false;
        }
        L(u, LikeView.ObjectType.UNKNOWN, new b(i2, i3, intent));
        return true;
    }

    /* access modifiers changed from: private */
    public void R(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.a);
        bundle2.putString("object_type", this.b.toString());
        bundle2.putString("current_action", str);
        J().h("fb_like_control_error", null, bundle2);
    }

    private boolean S(boolean z, Bundle bundle) {
        if (G()) {
            if (z) {
                this.l = true;
                I(new k(this, bundle));
                return true;
            } else if (!f0.C(this.h)) {
                this.l = true;
                com.facebook.p pVar = new com.facebook.p();
                n nVar = new n(this.h);
                nVar.c(pVar);
                pVar.d(new l(this, nVar, bundle));
                pVar.e();
                return true;
            }
        }
        return false;
    }

    private static void T(e eVar) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", eVar.a);
            jSONObject.put("object_type", eVar.b.g());
            jSONObject.put("like_count_string_with_like", eVar.d);
            jSONObject.put("like_count_string_without_like", eVar.e);
            jSONObject.put("social_sentence_with_like", eVar.f);
            jSONObject.put("social_sentence_without_like", eVar.g);
            jSONObject.put("is_object_liked", eVar.c);
            jSONObject.put("unlike_token", eVar.h);
            Bundle bundle = eVar.m;
            if (bundle != null) {
                jSONObject.put("facebook_dialog_analytics_bundle", com.facebook.internal.d.b(bundle));
            }
            str = jSONObject.toString();
        } catch (JSONException e2) {
            Log.e(o, "Unable to serialize controller to JSON", e2);
            str = null;
        }
        String K = K(eVar.a);
        if (!f0.C(str) && !f0.C(K)) {
            s.e(new p(K, str));
        }
    }

    private static void U(String str) {
        u = str;
        com.facebook.k.d().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", u).apply();
    }

    private void W(boolean z) {
        X(z, this.d, this.e, this.f, this.g, this.h);
    }

    /* access modifiers changed from: private */
    public void X(boolean z, String str, String str2, String str3, String str4, String str5) {
        String f2 = f0.f(str, null);
        String f3 = f0.f(str2, null);
        String f4 = f0.f(str3, null);
        String f5 = f0.f(str4, null);
        String f6 = f0.f(str5, null);
        if (z != this.c || !f0.b(f2, this.d) || !f0.b(f3, this.e) || !f0.b(f4, this.f) || !f0.b(f5, this.g) || !f0.b(f6, this.h)) {
            this.c = z;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
            T(this);
            F(this, "com.facebook.sdk.LikeActionController.UPDATED", null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void Y(com.facebook.share.internal.e r5, com.facebook.share.widget.LikeView.ObjectType r6, com.facebook.share.internal.e.AbstractC0076e r7) {
        /*
            com.facebook.share.widget.LikeView$ObjectType r0 = r5.b
            r1 = 0
            if (r6 != r0) goto L_0x0006
            goto L_0x000d
        L_0x0006:
            com.facebook.share.widget.LikeView$ObjectType r2 = com.facebook.share.widget.LikeView.ObjectType.UNKNOWN
            if (r6 != r2) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            if (r0 != r2) goto L_0x000f
        L_0x000d:
            r0 = r6
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 != 0) goto L_0x0034
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r5.a
            r2[r3] = r4
            r3 = 1
            com.facebook.share.widget.LikeView$ObjectType r5 = r5.b
            java.lang.String r5 = r5.toString()
            r2[r3] = r5
            r5 = 2
            java.lang.String r6 = r6.toString()
            r2[r5] = r6
            java.lang.String r5 = "Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\""
            r0.<init>(r5, r2)
            r5 = r1
            r1 = r0
            goto L_0x0036
        L_0x0034:
            r5.b = r0
        L_0x0036:
            if (r7 != 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            android.os.Handler r6 = com.facebook.share.internal.e.t
            com.facebook.share.internal.h r0 = new com.facebook.share.internal.h
            r0.<init>(r7, r5, r1)
            r6.post(r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.e.Y(com.facebook.share.internal.e, com.facebook.share.widget.LikeView$ObjectType, com.facebook.share.internal.e$e):void");
    }

    static void a(e eVar, int i2, int i3, Intent intent) {
        c.t(i2, i3, intent, new j(eVar, null, eVar.m));
        eVar.m = null;
        U(null);
    }

    static void n(e eVar, boolean z) {
        eVar.W(z);
        F(eVar, "com.facebook.sdk.LikeActionController.DID_ERROR", je.E("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action"));
    }

    static void o(e eVar) {
        eVar.getClass();
        if (!com.facebook.a.p()) {
            p pVar = new p(com.facebook.k.d(), com.facebook.k.e(), eVar.a);
            if (pVar.f()) {
                pVar.e(new d(eVar));
                return;
            }
            return;
        }
        eVar.I(new m(eVar));
    }

    static void q(e eVar, Bundle bundle) {
        boolean z = eVar.c;
        if (z != eVar.k && !eVar.S(z, bundle)) {
            eVar.W(!eVar.c);
            F(eVar, "com.facebook.sdk.LikeActionController.DID_ERROR", je.E("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action"));
        }
    }

    static void t(e eVar, String str, FacebookRequestError facebookRequestError) {
        JSONObject g2;
        eVar.getClass();
        Bundle bundle = new Bundle();
        if (!(facebookRequestError == null || (g2 = facebookRequestError.g()) == null)) {
            bundle.putString(AppProtocol.LogMessage.SEVERITY_ERROR, g2.toString());
        }
        eVar.R(str, bundle);
    }

    static void v(String str, String str2) {
        OutputStream outputStream = null;
        try {
            outputStream = p.g(str, null);
            outputStream.write(str2.getBytes());
        } catch (IOException e2) {
            Log.e(o, "Unable to serialize controller to disk", e2);
            if (outputStream == null) {
                return;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
        try {
            outputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b A[SYNTHETIC, Splitter:B:32:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void w(java.lang.String r5, com.facebook.share.widget.LikeView.ObjectType r6, com.facebook.share.internal.e.AbstractC0076e r7) {
        /*
            com.facebook.share.internal.e r0 = M(r5)
            if (r0 == 0) goto L_0x000b
            Y(r0, r6, r7)
            goto L_0x0076
        L_0x000b:
            r0 = 0
            java.lang.String r1 = K(r5)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            com.facebook.internal.o r2 = com.facebook.share.internal.e.p     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            java.io.InputStream r1 = r2.f(r1, r0)     // Catch:{ IOException -> 0x002f, all -> 0x002d }
            if (r1 == 0) goto L_0x0029
            java.lang.String r2 = com.facebook.internal.f0.N(r1)     // Catch:{ IOException -> 0x0027 }
            boolean r3 = com.facebook.internal.f0.C(r2)     // Catch:{ IOException -> 0x0027 }
            if (r3 != 0) goto L_0x0029
            com.facebook.share.internal.e r2 = H(r2)     // Catch:{ IOException -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r2 = move-exception
            goto L_0x0032
        L_0x0029:
            r2 = r0
        L_0x002a:
            if (r1 == 0) goto L_0x0041
            goto L_0x003c
        L_0x002d:
            r5 = move-exception
            goto L_0x0079
        L_0x002f:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x0032:
            java.lang.String r3 = com.facebook.share.internal.e.o     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "Unable to deserialize controller from disk"
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0077 }
            r2 = r0
            if (r1 == 0) goto L_0x0041
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            if (r2 != 0) goto L_0x004b
            com.facebook.share.internal.e r2 = new com.facebook.share.internal.e
            r2.<init>(r5, r6)
            T(r2)
        L_0x004b:
            java.lang.String r5 = K(r5)
            com.facebook.internal.m0 r6 = com.facebook.share.internal.e.r
            com.facebook.share.internal.e$l r1 = new com.facebook.share.internal.e$l
            r3 = 1
            r1.<init>(r5, r3)
            r6.e(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.share.internal.e> r6 = com.facebook.share.internal.e.q
            r6.put(r5, r2)
            android.os.Handler r5 = com.facebook.share.internal.e.t
            com.facebook.share.internal.f r6 = new com.facebook.share.internal.f
            r6.<init>(r2)
            r5.post(r6)
            if (r7 != 0) goto L_0x006c
            goto L_0x0076
        L_0x006c:
            android.os.Handler r5 = com.facebook.share.internal.e.t
            com.facebook.share.internal.h r6 = new com.facebook.share.internal.h
            r6.<init>(r7, r2, r0)
            r5.post(r6)
        L_0x0076:
            return
        L_0x0077:
            r5 = move-exception
            r0 = r1
        L_0x0079:
            if (r0 == 0) goto L_0x007e
            r0.close()     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.e.w(java.lang.String, com.facebook.share.widget.LikeView$ObjectType, com.facebook.share.internal.e$e):void");
    }

    @Deprecated
    public String N() {
        return this.c ? this.d : this.e;
    }

    @Deprecated
    public String O() {
        return this.c ? this.f : this.g;
    }

    @Deprecated
    public boolean Q() {
        return this.c;
    }

    @Deprecated
    public void V(Activity activity, com.facebook.internal.q qVar, Bundle bundle) {
        boolean z = !this.c;
        if (G()) {
            W(z);
            if (this.l) {
                J().g("fb_like_control_did_undo_quickly", bundle);
            } else if (!S(z, bundle)) {
                W(!z);
                int i2 = o.g;
                R("present_dialog", bundle);
                boolean z2 = com.facebook.k.n;
                F(null, "com.facebook.sdk.LikeActionController.UPDATED", null);
            }
        } else {
            int i3 = o.g;
            R("present_dialog", bundle);
            boolean z3 = com.facebook.k.n;
            F(null, "com.facebook.sdk.LikeActionController.UPDATED", null);
        }
    }
}
