package io.branch.referral;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ServerRequest {
    private static final String[] h = {Defines$RequestPath.RegisterInstall.d(), Defines$RequestPath.RegisterOpen.d(), Defines$RequestPath.CompletedAction.d(), Defines$RequestPath.ContentEvent.d(), Defines$RequestPath.TrackStandardEvent.d(), Defines$RequestPath.TrackCustomEvent.d()};
    private JSONObject a;
    private String b;
    protected final r c;
    private long d = 0;
    private final Context e;
    private final Set<PROCESS_WAIT_LOCK> f;
    public boolean g = false;

    public enum BRANCH_API_VERSION {
        V1,
        V1_CPID,
        V1_LATD,
        V2
    }

    enum PROCESS_WAIT_LOCK {
        SDK_INIT_WAIT_LOCK,
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK,
        USER_SET_WAIT_LOCK
    }

    public ServerRequest(Context context, String str) {
        this.e = context;
        this.b = str;
        this.c = r.r(context);
        this.a = new JSONObject();
        this.f = new HashSet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ JSONException -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static io.branch.referral.ServerRequest e(org.json.JSONObject r5, android.content.Context r6) {
        /*
            java.lang.String r0 = "REQ_POST_PATH"
            java.lang.String r1 = "REQ_POST"
            java.lang.String r2 = ""
            r3 = 0
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x0012 }
            if (r4 == 0) goto L_0x0012
            org.json.JSONObject r1 = r5.getJSONObject(r1)     // Catch:{ JSONException -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x001f }
            if (r4 == 0) goto L_0x0020
            java.lang.String r5 = r5.getString(r0)     // Catch:{ JSONException -> 0x001f }
            r2 = r5
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x00dc
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.CompletedAction
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0039
            io.branch.referral.s r3 = new io.branch.referral.s
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x0039:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.GetURL
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x004c
            io.branch.referral.t r3 = new io.branch.referral.t
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x004c:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.GetCreditHistory
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x005f
            io.branch.referral.v r3 = new io.branch.referral.v
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x005f:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.GetCredits
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0071
            io.branch.referral.w r3 = new io.branch.referral.w
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x0071:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.IdentifyUser
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0083
            io.branch.referral.x r3 = new io.branch.referral.x
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x0083:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.Logout
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0095
            io.branch.referral.z r3 = new io.branch.referral.z
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x0095:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.RedeemRewards
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00a7
            io.branch.referral.b0 r3 = new io.branch.referral.b0
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x00a7:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.RegisterClose
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00b9
            io.branch.referral.c0 r3 = new io.branch.referral.c0
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x00b9:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.RegisterInstall
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00cb
            io.branch.referral.d0 r3 = new io.branch.referral.d0
            r3.<init>(r2, r1, r6)
            goto L_0x00dc
        L_0x00cb:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines$RequestPath.RegisterOpen
            java.lang.String r5 = r5.d()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00dc
            io.branch.referral.e0 r3 = new io.branch.referral.e0
            r3.<init>(r2, r1, r6)
        L_0x00dc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.e(org.json.JSONObject, android.content.Context):io.branch.referral.ServerRequest");
    }

    private boolean u(JSONObject jSONObject) {
        return jSONObject.has(Defines$Jsonkey.AndroidID.d()) || jSONObject.has(Defines$Jsonkey.DeviceFingerprintID.d()) || jSONObject.has(Defines$ModuleNameKeys.imei.d());
    }

    public JSONObject A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("REQ_POST", this.a);
            jSONObject.put("REQ_POST_PATH", this.b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void a(PROCESS_WAIT_LOCK process_wait_lock) {
        this.f.add(process_wait_lock);
    }

    public abstract void b();

    /* access modifiers changed from: package-private */
    public void c() {
        String str;
        boolean f2;
        JSONObject optJSONObject;
        BRANCH_API_VERSION branch_api_version = BRANCH_API_VERSION.V1;
        if (this instanceof y) {
            y yVar = (y) this;
            String C = yVar.c.C("bnc_link_click_identifier");
            if (!C.equals("bnc_no_value")) {
                try {
                    yVar.h().put(Defines$Jsonkey.LinkIdentifier.d(), C);
                    yVar.h().put(Defines$Jsonkey.FaceBookAppLinkChecked.d(), yVar.c.f("bnc_triggered_by_fb_app_link"));
                } catch (JSONException unused) {
                }
            }
            String C2 = yVar.c.C("bnc_google_search_install_identifier");
            if (!C2.equals("bnc_no_value")) {
                try {
                    yVar.h().put(Defines$Jsonkey.GoogleSearchInstallReferrer.d(), C2);
                } catch (JSONException unused2) {
                }
            }
            String C3 = yVar.c.C("bnc_google_play_install_referrer_extras");
            if (!C3.equals("bnc_no_value")) {
                try {
                    yVar.h().put(Defines$Jsonkey.GooglePlayInstallReferrer.d(), C3);
                } catch (JSONException unused3) {
                }
            }
            if (yVar.c.f("bnc_is_full_app_conversion")) {
                try {
                    yVar.h().put(Defines$Jsonkey.AndroidAppLinkURL.d(), yVar.c.e());
                    yVar.h().put(Defines$Jsonkey.IsFullAppConv.d(), true);
                } catch (JSONException unused4) {
                }
            }
        }
        if (f() == BRANCH_API_VERSION.V2 && (optJSONObject = this.a.optJSONObject(Defines$Jsonkey.UserData.d())) != null) {
            try {
                optJSONObject.put(Defines$Jsonkey.DeveloperIdentity.d(), this.c.m());
                optJSONObject.put(Defines$Jsonkey.DeviceFingerprintID.d(), this.c.k());
            } catch (JSONException unused5) {
            }
        }
        JSONObject optJSONObject2 = f() == branch_api_version ? this.a : this.a.optJSONObject(Defines$Jsonkey.UserData.d());
        if (optJSONObject2 != null && (f2 = this.c.f("bnc_ad_network_callouts_disabled"))) {
            try {
                optJSONObject2.putOpt(Defines$Jsonkey.DisableAdNetworkCallouts.d(), Boolean.valueOf(f2));
            } catch (JSONException unused6) {
            }
        }
        BRANCH_API_VERSION f3 = f();
        int e2 = l.d().g().e();
        String a2 = l.d().g().a();
        if (!TextUtils.isEmpty(a2)) {
            try {
                if (g0.k()) {
                    str = Defines$Jsonkey.FireAdId.d();
                } else if (g0.l(Branch.F().z())) {
                    str = Defines$Jsonkey.OpenAdvertisingID.d();
                } else {
                    str = Defines$Jsonkey.AAID.d();
                }
                this.a.put(Defines$Jsonkey.AdvertisingIDs.d(), new JSONObject().put(str, a2));
            } catch (JSONException unused7) {
            }
        }
        if (f3 == branch_api_version) {
            try {
                this.a.put(Defines$Jsonkey.LATVal.d(), e2);
                if (!TextUtils.isEmpty(a2)) {
                    if (!g0.l(this.e)) {
                        this.a.put(Defines$Jsonkey.GoogleAdvertisingID.d(), a2);
                    }
                    this.a.remove(Defines$Jsonkey.UnidentifiedDevice.d());
                } else if (!u(this.a)) {
                    JSONObject jSONObject = this.a;
                    Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.UnidentifiedDevice;
                    if (!jSONObject.optBoolean(defines$Jsonkey.d())) {
                        this.a.put(defines$Jsonkey.d(), true);
                    }
                }
            } catch (JSONException unused8) {
            }
        } else {
            JSONObject optJSONObject3 = this.a.optJSONObject(Defines$Jsonkey.UserData.d());
            if (optJSONObject3 != null) {
                optJSONObject3.put(Defines$Jsonkey.LimitedAdTracking.d(), e2);
                if (!TextUtils.isEmpty(a2)) {
                    if (!g0.l(this.e)) {
                        optJSONObject3.put(Defines$Jsonkey.AAID.d(), a2);
                    }
                    optJSONObject3.remove(Defines$Jsonkey.UnidentifiedDevice.d());
                } else if (!u(optJSONObject3)) {
                    Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.UnidentifiedDevice;
                    if (!optJSONObject3.optBoolean(defines$Jsonkey2.d())) {
                        optJSONObject3.put(defines$Jsonkey2.d(), true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        boolean f2;
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = this.c.x().keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, this.c.x().get(next));
            }
            JSONObject optJSONObject = this.a.optJSONObject(Defines$Jsonkey.Metadata.d());
            if (optJSONObject != null) {
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject.put(next2, optJSONObject.get(next2));
                }
            }
            if ((this instanceof d0) && this.c.p().length() > 0) {
                Iterator<String> keys3 = this.c.p().keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    this.a.putOpt(next3, this.c.p().get(next3));
                }
            }
            this.a.put(Defines$Jsonkey.Metadata.d(), jSONObject);
        } catch (JSONException unused) {
        }
        if (z()) {
            JSONObject optJSONObject2 = f() == BRANCH_API_VERSION.V1 ? this.a : this.a.optJSONObject(Defines$Jsonkey.UserData.d());
            if (optJSONObject2 != null && (f2 = this.c.f("bnc_limit_facebook_tracking"))) {
                try {
                    optJSONObject2.putOpt(Defines$Jsonkey.limitFacebookTracking.d(), Boolean.valueOf(f2));
                } catch (JSONException unused2) {
                }
            }
        }
    }

    public BRANCH_API_VERSION f() {
        return BRANCH_API_VERSION.V1;
    }

    public JSONObject g() {
        return this.a;
    }

    public JSONObject h() {
        return this.a;
    }

    public JSONObject i(ConcurrentHashMap<String, String> concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject(this.a.toString());
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            if (concurrentHashMap.size() <= 0) {
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            for (String str : concurrentHashMap.keySet()) {
                jSONObject3.put(str, concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
            jSONObject.put(Defines$Jsonkey.Branch_Instrumentation.d(), jSONObject3);
            return jSONObject;
        } catch (JSONException unused) {
            return jSONObject;
        } catch (ConcurrentModificationException unused2) {
            return this.a;
        }
    }

    public long j() {
        if (this.d > 0) {
            return System.currentTimeMillis() - this.d;
        }
        return 0;
    }

    public final String k() {
        return this.b;
    }

    public String l() {
        StringBuilder sb = new StringBuilder();
        this.c.getClass();
        String str = null;
        if (!URLUtil.isHttpsUrl(null)) {
            str = Build.VERSION.SDK_INT >= 20 ? "https://api2.branch.io/" : "https://api.branch.io/";
        }
        sb.append(str);
        sb.append(this.b);
        return sb.toString();
    }

    public abstract void m(int i, String str);

    public abstract boolean n();

    /* access modifiers changed from: package-private */
    public boolean o() {
        for (String str : h) {
            if (str.equals(this.b)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return true;
    }

    public boolean q() {
        return this.f.size() > 0;
    }

    public void r() {
    }

    public void s() {
        this.d = System.currentTimeMillis();
    }

    public abstract void t(f0 f0Var, Branch branch);

    /* access modifiers changed from: protected */
    public boolean v() {
        return false;
    }

    public void w(PROCESS_WAIT_LOCK process_wait_lock) {
        this.f.remove(process_wait_lock);
    }

    /* access modifiers changed from: protected */
    public void x(JSONObject jSONObject) {
        this.a = jSONObject;
        if (f() == BRANCH_API_VERSION.V1) {
            l.d().l(this, this.a);
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            this.a.put(Defines$Jsonkey.UserData.d(), jSONObject2);
            l.d().m(this, this.e, this.c, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public boolean y() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        return false;
    }

    protected ServerRequest(String str, JSONObject jSONObject, Context context) {
        this.e = context;
        this.b = str;
        this.a = jSONObject;
        this.c = r.r(context);
        this.f = new HashSet();
    }
}
