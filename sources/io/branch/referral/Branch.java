package io.branch.referral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.branch.referral.ServerRequest;
import io.branch.referral.a;
import io.branch.referral.g0;
import io.branch.referral.h;
import io.branch.referral.i0;
import io.branch.referral.j;
import io.branch.referral.network.BranchRemoteInterface;
import io.branch.referral.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import org.json.JSONException;
import org.json.JSONObject;

public class Branch implements j.c, g0.a, o.c {
    static boolean s = false;
    static boolean t = false;
    private static Branch u = null;
    private static boolean v = false;
    private static boolean w = false;
    private static final String[] x = {"extra_launch_uri", "branch_intent"};
    private BranchRemoteInterface a;
    private r b;
    private final l c;
    private Context d;
    private Semaphore e;
    private final a0 f;
    private int g;
    private boolean h;
    private Map<Object, String> i;
    private INTENT_STATE j = INTENT_STATE.PENDING;
    private SESSION_STATE k = SESSION_STATE.UNINITIALISED;
    WeakReference<Activity> l;
    private final ConcurrentHashMap<String, String> m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private d q;
    private final h0 r;

    /* access modifiers changed from: package-private */
    public enum INTENT_STATE {
        PENDING,
        READY
    }

    /* access modifiers changed from: package-private */
    public enum SESSION_STATE {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    /* access modifiers changed from: package-private */
    public class a implements h.e {
        a() {
        }
    }

    /* access modifiers changed from: private */
    public class b extends e<Void, Void, f0> {
        ServerRequest a;

        public b(ServerRequest serverRequest) {
            this.a = serverRequest;
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            Branch branch = Branch.this;
            branch.s(this.a.k() + "-" + Defines$Jsonkey.Queue_Wait_Time.d(), String.valueOf(this.a.j()));
            this.a.c();
            if (Branch.this.Q() && !this.a.v()) {
                return new f0(this.a.k(), -117);
            }
            if (this.a.n()) {
                return Branch.this.a.e(this.a.l(), this.a.g(), this.a.k(), Branch.this.b.g());
            }
            return Branch.this.a.f(this.a.i(Branch.this.m), this.a.l(), this.a.k(), Branch.this.b.g());
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            boolean z;
            f0 f0Var = (f0) obj;
            SESSION_STATE session_state = SESSION_STATE.UNINITIALISED;
            super.onPostExecute(f0Var);
            if (f0Var != null) {
                try {
                    int c = f0Var.c();
                    boolean z2 = true;
                    Branch.this.h = true;
                    if (f0Var.c() == -117) {
                        this.a.m(-117, "");
                        Branch.this.f.o(this.a);
                    } else if (c != 200) {
                        if (this.a instanceof y) {
                            Branch.this.e0(session_state);
                        }
                        if (c != 400) {
                            if (c != 409) {
                                Branch.this.h = false;
                                ArrayList arrayList = new ArrayList();
                                for (int i = 0; i < Branch.this.f.j(); i++) {
                                    arrayList.add(Branch.this.f.m(i));
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ServerRequest serverRequest = (ServerRequest) it.next();
                                    if (serverRequest == null || !serverRequest.y()) {
                                        Branch.this.f.o(serverRequest);
                                    }
                                }
                                Branch.this.g = 0;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ServerRequest serverRequest2 = (ServerRequest) it2.next();
                                    if (serverRequest2 != null) {
                                        serverRequest2.m(c, f0Var.a());
                                        if (serverRequest2.y()) {
                                            serverRequest2.b();
                                        }
                                    }
                                }
                            }
                        }
                        Branch.this.f.o(this.a);
                        ServerRequest serverRequest3 = this.a;
                        if (serverRequest3 instanceof t) {
                            ((t) serverRequest3).getClass();
                        } else {
                            TextUtils.isEmpty("Branch API Error: Conflicting resource error code from API");
                            Branch.this.J(0, c);
                        }
                    } else {
                        Branch.this.h = true;
                        ServerRequest serverRequest4 = this.a;
                        if (serverRequest4 instanceof t) {
                            if (f0Var.b() != null) {
                                String string = f0Var.b().getString("url");
                                Map map = Branch.this.i;
                                ((t) this.a).getClass();
                                map.put(null, string);
                            }
                        } else if (serverRequest4 instanceof z) {
                            Branch.this.i.clear();
                            Branch.this.f.d();
                        }
                        Branch.this.f.g();
                        ServerRequest serverRequest5 = this.a;
                        if (!(serverRequest5 instanceof y)) {
                            if (!(serverRequest5 instanceof x)) {
                                serverRequest5.t(f0Var, Branch.u);
                            }
                        }
                        JSONObject b2 = f0Var.b();
                        if (b2 != null) {
                            if (!Branch.this.Q()) {
                                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.SessionID;
                                if (b2.has(defines$Jsonkey.d())) {
                                    Branch.this.b.O("bnc_session_id", b2.getString(defines$Jsonkey.d()));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.IdentityID;
                                if (b2.has(defines$Jsonkey2.d())) {
                                    if (!Branch.this.b.n().equals(b2.getString(defines$Jsonkey2.d()))) {
                                        Branch.this.i.clear();
                                        Branch.this.b.O("bnc_identity_id", b2.getString(defines$Jsonkey2.d()));
                                        z = true;
                                    }
                                }
                                Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.DeviceFingerprintID;
                                if (b2.has(defines$Jsonkey3.d())) {
                                    Branch.this.b.O("bnc_device_fingerprint_id", b2.getString(defines$Jsonkey3.d()));
                                } else {
                                    z2 = z;
                                }
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                Branch.b(Branch.this);
                            }
                            ServerRequest serverRequest6 = this.a;
                            if (serverRequest6 instanceof y) {
                                Branch.this.e0(SESSION_STATE.INITIALISED);
                                this.a.t(f0Var, Branch.u);
                                if (!((y) this.a).C(f0Var)) {
                                    Branch.this.t();
                                }
                                Branch.this.getClass();
                                Branch.this.getClass();
                            } else {
                                serverRequest6.t(f0Var, Branch.u);
                            }
                        }
                    }
                    Branch.this.g = 0;
                    if (Branch.this.h && Branch.this.k != session_state) {
                        Branch.this.Y();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.a.r();
            this.a.d();
        }
    }

    public interface c {
    }

    public interface d {
        boolean a();
    }

    public static class e {
        private c a;
        private Uri b;

        e(Activity activity, b bVar) {
            Branch F = Branch.F();
            if (activity == null) {
                return;
            }
            if (F.B() == null || !F.B().getLocalClassName().equals(activity.getLocalClassName())) {
                F.l = new WeakReference<>(activity);
            }
        }

        public void a() {
            Branch F = Branch.F();
            if (F == null) {
                TextUtils.isEmpty("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
                return;
            }
            Activity B = F.B();
            if (B != null) {
                B.getIntent();
            }
            Uri uri = this.b;
            if (uri != null) {
                F.Z(uri, B);
            }
            if (F.p) {
                F.p = false;
                c cVar = this.a;
                ((l3a) cVar).a.e(F.G(), null);
                F.s(Defines$Jsonkey.InstantDeepLinkSession.d(), "true");
                F.t();
                this.a = null;
            }
            Branch.i(F, this.a, 0);
        }

        public e b(c cVar) {
            this.a = cVar;
            return this;
        }

        public e c(Uri uri) {
            this.b = uri;
            return this;
        }
    }

    private Branch(Context context) {
        this.b = r.r(context);
        h0 h0Var = new h0(context);
        this.r = h0Var;
        this.a = BranchRemoteInterface.d(context);
        l h2 = l.h(context);
        this.c = h2;
        this.f = a0.i(context);
        this.e = new Semaphore(1);
        this.g = 0;
        this.h = true;
        this.i = new HashMap();
        this.m = new ConcurrentHashMap<>();
        if (!h0Var.a()) {
            this.n = h2.g().m(context, this);
        }
    }

    public static Branch A(Context context, String str) {
        boolean z;
        v = true;
        boolean z2 = !i.a(context);
        if (u == null) {
            u = new Branch(context.getApplicationContext());
            boolean a2 = i.a(context);
            if (z2) {
                a2 = false;
            }
            i.d(a2);
            String c2 = TextUtils.isEmpty(str) ? i.c(context) : str;
            if (TextUtils.isEmpty(c2)) {
                z = u.b.G("bnc_no_value");
            } else {
                z = u.b.G(c2);
            }
            if (z) {
                u.i.clear();
                u.f.d();
            }
            u.d = context.getApplicationContext();
            if (context instanceof Application) {
                v = true;
                Branch branch = u;
                Application application = (Application) context;
                branch.getClass();
                try {
                    d dVar = new d();
                    branch.q = dVar;
                    application.unregisterActivityLifecycleCallbacks(dVar);
                    application.registerActivityLifecycleCallbacks(branch.q);
                    w = true;
                } catch (NoClassDefFoundError | NoSuchMethodError unused) {
                    w = false;
                    v = false;
                }
            }
        }
        if (u.b.D(str) && u.b.G(str)) {
            u.i.clear();
            u.f.d();
        }
        Branch branch2 = u;
        if (branch2 != null) {
            String str2 = null;
            try {
                str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "io.branch.preinstall.apps.path");
            } catch (Exception unused2) {
            }
            if (!TextUtils.isEmpty(str2)) {
                new Thread(new g(str2, branch2, context)).start();
            }
        }
        return u;
    }

    public static Branch F() {
        Branch branch = u;
        if (branch != null && v) {
            boolean z = w;
        }
        return branch;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void J(int i2, int i3) {
        ServerRequest serverRequest;
        if (i2 >= this.f.j()) {
            a0 a0Var = this.f;
            serverRequest = a0Var.m(a0Var.j() - 1);
        } else {
            serverRequest = this.f.m(i2);
        }
        if (serverRequest != null) {
            serverRequest.m(i3, "");
        }
    }

    private boolean O(Activity activity) {
        if (activity == null || activity.getIntent() == null || !activity.getIntent().getBooleanExtra(Defines$IntentKeys.BranchLinkUsed.d(), false)) {
            return false;
        }
        return true;
    }

    private void X() {
        if (!this.r.a() && this.d != null) {
            this.f.p();
            h.j().i(this.d, "app.link", this.c, this.b, new a());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Y() {
        try {
            this.e.acquire();
            if (this.g != 0 || this.f.j() <= 0) {
                this.e.release();
                return;
            }
            this.g = 1;
            ServerRequest l2 = this.f.l();
            this.e.release();
            if (l2 == null) {
                this.f.o(null);
            } else if (l2.q()) {
                this.g = 0;
            } else if ((l2 instanceof d0) || (!this.b.n().equals("bnc_no_value"))) {
                if (!(l2 instanceof y) && !(l2 instanceof t)) {
                    if (!((this.b.B().equals("bnc_no_value") ^ true) && (this.b.k().equals("bnc_no_value") ^ true))) {
                        this.g = 0;
                        J(this.f.j() - 1, -101);
                        return;
                    }
                }
                new b(l2).a(new Void[0]);
            } else {
                this.g = 0;
                J(this.f.j() - 1, -101);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Z(android.net.Uri r11, android.app.Activity r12) {
        /*
        // Method dump skipped, instructions count: 487
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.Z(android.net.Uri, android.app.Activity):void");
    }

    static void b(Branch branch) {
        JSONObject h2;
        branch.getClass();
        for (int i2 = 0; i2 < branch.f.j(); i2++) {
            try {
                ServerRequest m2 = branch.f.m(i2);
                if (!(m2 == null || (h2 = m2.h()) == null)) {
                    Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.SessionID;
                    if (h2.has(defines$Jsonkey.d())) {
                        m2.h().put(defines$Jsonkey.d(), branch.b.B());
                    }
                    Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.IdentityID;
                    if (h2.has(defines$Jsonkey2.d())) {
                        m2.h().put(defines$Jsonkey2.d(), branch.b.n());
                    }
                    Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.DeviceFingerprintID;
                    if (h2.has(defines$Jsonkey3.d())) {
                        m2.h().put(defines$Jsonkey3.d(), branch.b.k());
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                return;
            }
        }
    }

    public static e b0(Activity activity) {
        return new e(activity, null);
    }

    static void i(Branch branch, c cVar, int i2) {
        ServerRequest serverRequest;
        SESSION_STATE session_state = SESSION_STATE.UNINITIALISED;
        if (branch.b.g() == null || branch.b.g().equalsIgnoreCase("bnc_no_value")) {
            branch.k = session_state;
            if (cVar != null) {
                ((l3a) cVar).a.e(null, new f("Trouble initializing Branch.", -114));
                return;
            }
            return;
        }
        if (!branch.b.n().equals("bnc_no_value")) {
            serverRequest = new e0(branch.d, cVar);
        } else {
            serverRequest = new d0(branch.d, cVar);
        }
        if (branch.k == session_state) {
            branch.b.l().equals("bnc_no_value");
        }
        if (i2 > 0) {
            serverRequest.a(ServerRequest.PROCESS_WAIT_LOCK.USER_SET_WAIT_LOCK);
            new Handler().postDelayed(new c(branch), (long) i2);
        }
        Intent intent = branch.B() != null ? branch.B().getIntent() : null;
        boolean P = branch.P(intent);
        if (branch.k == session_state || P) {
            if (P && intent != null) {
                intent.removeExtra(Defines$IntentKeys.ForceNewBranchSession.d());
            }
            branch.k = SESSION_STATE.INITIALISING;
            if (branch.j != INTENT_STATE.READY && (!s)) {
                serverRequest.a(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
            }
            if ((serverRequest instanceof d0) && !o.c) {
                ServerRequest.PROCESS_WAIT_LOCK process_wait_lock = ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK;
                serverRequest.a(process_wait_lock);
                new o().d(branch.d, 1500, branch);
                if (o.d) {
                    serverRequest.w(process_wait_lock);
                }
            }
            if (branch.n) {
                serverRequest.a(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
            }
            if (!branch.f.f()) {
                if (branch.g == 0) {
                    branch.f.k(serverRequest, 0);
                } else {
                    branch.f.k(serverRequest, 1);
                }
                branch.Y();
            }
        } else if (cVar != null) {
            ((l3a) cVar).a.e(null, new f("Warning.", -118));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void t() {
        String str;
        ActivityInfo activityInfo;
        Bundle bundle;
        JSONObject G = G();
        try {
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Clicked_Branch_Link;
            if (!G.has(defines$Jsonkey.d())) {
                return;
            }
            if (G.getBoolean(defines$Jsonkey.d())) {
                if (G.length() > 0) {
                    Bundle bundle2 = this.d.getPackageManager().getApplicationInfo(this.d.getPackageName(), 128).metaData;
                    int i2 = 0;
                    if (bundle2 == null || !bundle2.getBoolean("io.branch.sdk.auto_link_disable", false)) {
                        ActivityInfo[] activityInfoArr = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 129).activities;
                        int i3 = 1501;
                        if (activityInfoArr != null) {
                            int length = activityInfoArr.length;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                activityInfo = activityInfoArr[i2];
                                if (activityInfo == null || (bundle = activityInfo.metaData) == null || ((bundle.getString("io.branch.sdk.auto_link_keys") == null && activityInfo.metaData.getString("io.branch.sdk.auto_link_path") == null) || (!u(G, activityInfo) && !v(G, activityInfo)))) {
                                    i2++;
                                }
                            }
                            str = activityInfo.name;
                            i3 = activityInfo.metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
                            if (str != null && B() != null) {
                                Activity B = B();
                                Intent intent = new Intent(B, Class.forName(str));
                                intent.putExtra("io.branch.sdk.auto_linked", "true");
                                intent.putExtra(Defines$Jsonkey.ReferringData.d(), G.toString());
                                Iterator<String> keys = G.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    intent.putExtra(next, G.getString(next));
                                }
                                B.startActivityForResult(intent, i3);
                                return;
                            }
                        }
                        str = null;
                        if (str != null) {
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | Exception unused) {
        }
    }

    private boolean u(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String str : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e A[LOOP:0: B:13:0x0046->B:30:0x008e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean v(org.json.JSONObject r10, android.content.pm.ActivityInfo r11) {
        /*
            r9 = this;
            io.branch.referral.Defines$Jsonkey r0 = io.branch.referral.Defines$Jsonkey.AndroidDeepLinkPath     // Catch:{ JSONException -> 0x002a }
            java.lang.String r1 = r0.d()     // Catch:{ JSONException -> 0x002a }
            boolean r1 = r10.has(r1)     // Catch:{ JSONException -> 0x002a }
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = r0.d()     // Catch:{ JSONException -> 0x002a }
            java.lang.String r10 = r10.getString(r0)     // Catch:{ JSONException -> 0x002a }
            goto L_0x002b
        L_0x0015:
            io.branch.referral.Defines$Jsonkey r0 = io.branch.referral.Defines$Jsonkey.DeepLinkPath     // Catch:{ JSONException -> 0x002a }
            java.lang.String r1 = r0.d()     // Catch:{ JSONException -> 0x002a }
            boolean r1 = r10.has(r1)     // Catch:{ JSONException -> 0x002a }
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r0.d()     // Catch:{ JSONException -> 0x002a }
            java.lang.String r10 = r10.getString(r0)     // Catch:{ JSONException -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r10 = 0
        L_0x002b:
            android.os.Bundle r0 = r11.metaData
            java.lang.String r1 = "io.branch.sdk.auto_link_path"
            java.lang.String r0 = r0.getString(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0091
            if (r10 == 0) goto L_0x0091
            android.os.Bundle r11 = r11.metaData
            java.lang.String r11 = r11.getString(r1)
            java.lang.String r0 = ","
            java.lang.String[] r11 = r11.split(r0)
            int r0 = r11.length
            r1 = 0
        L_0x0046:
            if (r1 >= r0) goto L_0x0091
            r3 = r11[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "\\?"
            java.lang.String[] r3 = r3.split(r4)
            r3 = r3[r2]
            java.lang.String r5 = "/"
            java.lang.String[] r3 = r3.split(r5)
            java.lang.String[] r4 = r10.split(r4)
            r4 = r4[r2]
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r3.length
            int r6 = r4.length
            r7 = 1
            if (r5 == r6) goto L_0x006c
            goto L_0x0085
        L_0x006c:
            r5 = 0
        L_0x006d:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x008a
            int r6 = r4.length
            if (r5 >= r6) goto L_0x008a
            r6 = r3[r5]
            r8 = r4[r5]
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0087
            java.lang.String r8 = "*"
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x0087
        L_0x0085:
            r3 = 0
            goto L_0x008b
        L_0x0087:
            int r5 = r5 + 1
            goto L_0x006d
        L_0x008a:
            r3 = 1
        L_0x008b:
            if (r3 == 0) goto L_0x008e
            return r7
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0091:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.v(org.json.JSONObject, android.content.pm.ActivityInfo):boolean");
    }

    private JSONObject x(String str) {
        if (str.equals("bnc_no_value")) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            a.b bVar = new a.b(2, new byte[((length * 3) / 4)]);
            if (bVar.a(bytes, 0, length, true)) {
                int i2 = bVar.b;
                byte[] bArr = bVar.a;
                if (i2 != bArr.length) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    bArr = bArr2;
                }
                try {
                    return new JSONObject(new String(bArr));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return new JSONObject();
                }
            } else {
                throw new IllegalArgumentException("bad base-64");
            }
        }
    }

    public static void y(boolean z) {
        t = z;
    }

    /* access modifiers changed from: package-private */
    public Activity B() {
        WeakReference<Activity> weakReference = this.l;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public l C() {
        return this.c;
    }

    public JSONObject D() {
        return x(this.b.q());
    }

    /* access modifiers changed from: package-private */
    public SESSION_STATE E() {
        return this.k;
    }

    public JSONObject G() {
        return x(this.b.C("bnc_session_params"));
    }

    /* access modifiers changed from: package-private */
    public r H() {
        return this.b;
    }

    public h0 I() {
        return this.r;
    }

    public void K(ServerRequest serverRequest) {
        boolean z;
        if (!this.r.a() || serverRequest.v()) {
            if (this.k != SESSION_STATE.INITIALISED && !((z = serverRequest instanceof y))) {
                if (serverRequest instanceof z) {
                    serverRequest.m(-101, "");
                    return;
                } else if (!(serverRequest instanceof c0)) {
                    boolean z2 = false;
                    if (!z && !(serverRequest instanceof t)) {
                        z2 = true;
                    }
                    if (z2) {
                        serverRequest.a(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
                    }
                } else {
                    return;
                }
            }
            this.f.h(serverRequest);
            serverRequest.s();
            Y();
            return;
        }
        serverRequest.m(-117, "");
    }

    /* access modifiers changed from: package-private */
    public boolean L() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public boolean M() {
        return Boolean.parseBoolean(this.m.get(Defines$Jsonkey.InstantDeepLinkSession.d()));
    }

    public boolean N() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(android.content.Intent r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000e
            io.branch.referral.Defines$IntentKeys r1 = io.branch.referral.Defines$IntentKeys.ForceNewBranchSession
            java.lang.String r1 = r1.d()
            boolean r1 = r5.getBooleanExtra(r1, r0)
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            r2 = 1
            if (r1 != 0) goto L_0x0037
            if (r5 == 0) goto L_0x0034
            io.branch.referral.Defines$IntentKeys r1 = io.branch.referral.Defines$IntentKeys.BranchURI
            java.lang.String r1 = r1.d()
            java.lang.String r1 = r5.getStringExtra(r1)
            if (r1 == 0) goto L_0x0022
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            io.branch.referral.Defines$IntentKeys r3 = io.branch.referral.Defines$IntentKeys.BranchLinkUsed
            java.lang.String r3 = r3.d()
            boolean r5 = r5.getBooleanExtra(r3, r0)
            r5 = r5 ^ r2
            if (r1 == 0) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.P(android.content.Intent):boolean");
    }

    public boolean Q() {
        return this.r.a();
    }

    public void R() {
        this.n = false;
        this.f.q(ServerRequest.PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        if (this.o) {
            X();
            this.o = false;
            return;
        }
        Y();
    }

    public void S(String str, String str2) {
        if (y.D(str)) {
            t();
        }
    }

    public void T(String str, String str2) {
        if (y.D(str)) {
            t();
        }
    }

    public void U(int i2, String str, String str2) {
        if (y.D(str2)) {
            t();
        }
    }

    public void V() {
        this.f.q(ServerRequest.PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
        Y();
    }

    /* access modifiers changed from: package-private */
    public void W(Activity activity) {
        this.j = INTENT_STATE.READY;
        this.f.q(ServerRequest.PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        if ((activity.getIntent() == null || this.k == SESSION_STATE.INITIALISED) ? false : true) {
            Z(activity.getIntent().getData(), activity);
            if (!Q() && this.b.g() != null && !this.b.g().equalsIgnoreCase("bnc_no_value")) {
                if (this.n) {
                    this.o = true;
                } else {
                    X();
                }
            }
        }
        Y();
    }

    public void a0() {
        this.f.q(ServerRequest.PROCESS_WAIT_LOCK.USER_SET_WAIT_LOCK);
        Y();
    }

    /* access modifiers changed from: package-private */
    public void c0(boolean z) {
        this.n = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d0(java.lang.String r8) {
        /*
            r7 = this;
            io.branch.referral.x r0 = new io.branch.referral.x
            android.content.Context r1 = r7.d
            r2 = 0
            r0.<init>(r1, r2, r8)
            boolean r8 = r0.g
            r1 = 1
            r3 = 0
            if (r8 != 0) goto L_0x005e
            android.content.Context r8 = r7.d
            java.lang.String r4 = "android.permission.INTERNET"
            int r8 = r8.checkCallingOrSelfPermission(r4)
            if (r8 != 0) goto L_0x001a
            r8 = 1
            goto L_0x001b
        L_0x001a:
            r8 = 0
        L_0x001b:
            if (r8 != 0) goto L_0x0032
            io.branch.referral.Branch$c r8 = r0.i
            if (r8 == 0) goto L_0x0057
            io.branch.referral.f r4 = new io.branch.referral.f
            r5 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.String r6 = "Trouble setting the user alias."
            r4.<init>(r6, r5)
            l3a r8 = (defpackage.l3a) r8
            s3a r8 = r8.a
            r8.e(r2, r4)
            goto L_0x0057
        L_0x0032:
            org.json.JSONObject r8 = r0.h()     // Catch:{ JSONException -> 0x0057 }
            io.branch.referral.Defines$Jsonkey r4 = io.branch.referral.Defines$Jsonkey.Identity     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r4 = r4.d()     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r8 = r8.getString(r4)     // Catch:{ JSONException -> 0x0057 }
            if (r8 == 0) goto L_0x0057
            int r4 = r8.length()     // Catch:{ JSONException -> 0x0057 }
            if (r4 == 0) goto L_0x0057
            io.branch.referral.r r4 = r0.c     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r4 = r4.m()     // Catch:{ JSONException -> 0x0057 }
            boolean r8 = r8.equals(r4)     // Catch:{ JSONException -> 0x0057 }
            if (r8 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r8 = 0
            goto L_0x0058
        L_0x0057:
            r8 = 1
        L_0x0058:
            if (r8 != 0) goto L_0x005e
            r7.K(r0)
            goto L_0x0095
        L_0x005e:
            org.json.JSONObject r8 = r0.h()     // Catch:{ JSONException -> 0x007e }
            io.branch.referral.Defines$Jsonkey r4 = io.branch.referral.Defines$Jsonkey.Identity     // Catch:{ JSONException -> 0x007e }
            java.lang.String r4 = r4.d()     // Catch:{ JSONException -> 0x007e }
            java.lang.String r8 = r8.getString(r4)     // Catch:{ JSONException -> 0x007e }
            if (r8 == 0) goto L_0x007b
            io.branch.referral.r r4 = r0.c     // Catch:{ JSONException -> 0x007e }
            java.lang.String r4 = r4.m()     // Catch:{ JSONException -> 0x007e }
            boolean r8 = r8.equals(r4)     // Catch:{ JSONException -> 0x007e }
            if (r8 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            r3 = r1
            goto L_0x0082
        L_0x007e:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0082:
            if (r3 == 0) goto L_0x0095
            io.branch.referral.Branch r8 = io.branch.referral.Branch.u
            io.branch.referral.Branch$c r0 = r0.i
            if (r0 == 0) goto L_0x0095
            org.json.JSONObject r8 = r8.D()
            l3a r0 = (defpackage.l3a) r0
            s3a r0 = r0.a
            r0.e(r8, r2)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.d0(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public void e0(SESSION_STATE session_state) {
        this.k = session_state;
    }

    public void f0(boolean z) {
        this.p = z;
    }

    /* access modifiers changed from: package-private */
    public void g0(INTENT_STATE intent_state) {
        this.j = intent_state;
    }

    public Branch h0(String str) {
        this.b.b(Defines$PreinstallKey.campaign.d(), str);
        return this;
    }

    public Branch i0(String str) {
        this.b.b(Defines$PreinstallKey.partner.d(), str);
        return this;
    }

    public void j0(String str, String str2) {
        this.b.N(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void k0() {
        a0 a0Var = this.f;
        if (a0Var != null) {
            a0Var.q(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
            Y();
        }
    }

    /* access modifiers changed from: package-private */
    public void l0() {
        i0 c2 = i0.c(this.d);
        Context context = this.d;
        c2.getClass();
        try {
            new i0.b(context, null).a(new Void[0]);
        } catch (Throwable unused) {
        }
    }

    public void s(String str, String str2) {
        this.m.put(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        SESSION_STATE session_state = this.k;
        SESSION_STATE session_state2 = SESSION_STATE.UNINITIALISED;
        if (session_state != session_state2) {
            if (!this.h) {
                ServerRequest l2 = this.f.l();
                if ((l2 instanceof d0) || (l2 instanceof e0)) {
                    this.f.g();
                }
            } else if (!this.f.e()) {
                K(new c0(this.d));
            }
            this.k = session_state2;
        }
        this.b.O("bnc_external_intent_uri", null);
        this.r.b(this.d);
    }

    public Context z() {
        return this.d;
    }
}
