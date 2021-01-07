package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.k;
import com.facebook.login.DefaultAudience;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a0 {
    private static final String a = "com.facebook.internal.a0";
    private static final List<f> b;
    private static final List<f> c;
    private static final Map<String, List<f>> d;
    private static final AtomicBoolean e = new AtomicBoolean(false);
    private static final List<Integer> f = Arrays.asList(20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    for (f fVar : a0.b) {
                        fVar.b(true);
                    }
                    a0.e.set(false);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    private static class b extends f {
        b(a aVar) {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String d() {
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String e() {
            return "com.facebook.arstudio.player";
        }
    }

    private static class c extends f {
        c(a aVar) {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String d() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String e() {
            return "com.facebook.lite";
        }
    }

    private static class d extends f {
        d(a aVar) {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String d() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String e() {
            return "com.facebook.katana";
        }
    }

    private static class e extends f {
        e(a aVar) {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String d() {
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String e() {
            return "com.facebook.orca";
        }
    }

    /* access modifiers changed from: private */
    public static abstract class f {
        private TreeSet<Integer> a;

        private f() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            if (r1.isEmpty() == false) goto L_0x0013;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void b(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x000d
                java.util.TreeSet<java.lang.Integer> r1 = r0.a     // Catch:{ all -> 0x0015 }
                if (r1 == 0) goto L_0x000d
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0015 }
                if (r1 == 0) goto L_0x0013
            L_0x000d:
                java.util.TreeSet r1 = com.facebook.internal.a0.a(r0)     // Catch:{ all -> 0x0015 }
                r0.a = r1     // Catch:{ all -> 0x0015 }
            L_0x0013:
                monitor-exit(r0)
                return
            L_0x0015:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a0.f.b(boolean):void");
        }

        public TreeSet<Integer> c() {
            TreeSet<Integer> treeSet = this.a;
            if (treeSet == null || treeSet.isEmpty()) {
                b(false);
            }
            return this.a;
        }

        /* access modifiers changed from: protected */
        public abstract String d();

        /* access modifiers changed from: protected */
        public abstract String e();

        f(a aVar) {
        }
    }

    public static class g {
        private f a;
        private int b;

        private g() {
        }

        public static g c(f fVar, int i) {
            g gVar = new g();
            gVar.a = fVar;
            gVar.b = i;
            return gVar;
        }

        public static g d() {
            g gVar = new g();
            gVar.b = -1;
            return gVar;
        }

        public int e() {
            return this.b;
        }
    }

    private static class h extends f {
        h(a aVar) {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String d() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.a0.f
        public String e() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(null));
        arrayList.add(new h(null));
        b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new d(null));
        arrayList2.add(new h(null));
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.add(0, new b(null));
        c = arrayList3;
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new e(null));
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList4);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList4);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList3);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList);
        d = hashMap;
    }

    static TreeSet a(f fVar) {
        Object obj;
        TreeSet treeSet = new TreeSet();
        ContentResolver contentResolver = k.d().getContentResolver();
        String[] strArr = {"version"};
        StringBuilder V0 = je.V0("content://");
        V0.append(fVar.e());
        V0.append(".provider.PlatformProvider/versions");
        Uri parse = Uri.parse(V0.toString());
        Cursor cursor = null;
        try {
            PackageManager packageManager = k.d().getPackageManager();
            try {
                obj = packageManager.resolveContentProvider(fVar.e() + ".provider.PlatformProvider", 0);
            } catch (RuntimeException e2) {
                Log.e(a, "Failed to query content resolver.", e2);
                obj = cursor;
            }
            if (obj != null) {
                try {
                    cursor = contentResolver.query(parse, strArr, null, null, null);
                } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
                    Log.e(a, "Failed to query content resolver.");
                }
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("version"))));
                    }
                }
            }
            return treeSet;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static Bundle d(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    public static Intent e(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        return u(context, f(new c(null), str, collection, str2, z2, defaultAudience, str3, str4, false));
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/facebook/internal/a0$f;Ljava/lang/String;Ljava/util/Collection<Ljava/lang/String;>;Ljava/lang/String;ZZLcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;Z)Landroid/content/Intent; */
    private static Intent f(f fVar, String str, Collection collection, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4, boolean z2) {
        String d2 = fVar.d();
        if (d2 == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(fVar.e(), d2).putExtra("client_id", str);
        boolean z3 = k.n;
        putExtra.putExtra("facebook_sdk_version", "7.1.0");
        if (!f0.D(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!f0.C(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request,graph_domain");
        putExtra.putExtra("return_scopes", "true");
        if (z) {
            putExtra.putExtra("default_audience", defaultAudience.d());
        }
        putExtra.putExtra("legacy_override", k.n());
        putExtra.putExtra("auth_type", str4);
        if (z2) {
            putExtra.putExtra("fail_on_logged_out", true);
        }
        return putExtra;
    }

    public static Intent g(Context context) {
        Intent intent;
        ResolveInfo resolveService;
        Iterator<f> it = b.iterator();
        do {
            intent = null;
            if (!it.hasNext()) {
                break;
            }
            Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(it.next().e()).addCategory("android.intent.category.DEFAULT");
            if (!(addCategory == null || (resolveService = context.getPackageManager().resolveService(addCategory, 0)) == null || !k.a(context, resolveService.serviceInfo.packageName))) {
                intent = addCategory;
                continue;
            }
        } while (intent == null);
        return intent;
    }

    public static Intent h(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID k = k(intent);
        if (k == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", k.toString());
        if (facebookException != null) {
            bundle2.putBundle(AppProtocol.LogMessage.SEVERITY_ERROR, d(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    public static Intent i(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4, boolean z3) {
        for (f fVar : b) {
            Intent u = u(context, f(fVar, str, collection, str2, z2, defaultAudience, str3, str4, z3));
            if (u != null) {
                return u;
            }
        }
        return null;
    }

    public static Bundle j(Intent intent) {
        if (!r(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    public static UUID k(Intent intent) {
        String str;
        if (intent == null) {
            return null;
        }
        if (r(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str == null) {
            return null;
        }
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static FacebookException l(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new FacebookException(string2);
        }
        return new FacebookOperationCanceledException(string2);
    }

    public static g m(String str, int[] iArr) {
        return n(d.get(str), iArr);
    }

    private static g n(List<f> list, int[] iArr) {
        int i;
        t();
        if (list == null) {
            return g.d();
        }
        for (f fVar : list) {
            TreeSet<Integer> c2 = fVar.c();
            int p = p();
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = c2.descendingIterator();
            int i2 = -1;
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                int intValue = descendingIterator.next().intValue();
                i2 = Math.max(i2, intValue);
                while (length >= 0 && iArr[length] > intValue) {
                    length--;
                }
                if (length < 0) {
                    break;
                } else if (iArr[length] == intValue) {
                    if (length % 2 == 0) {
                        i = Math.min(i2, p);
                        continue;
                    }
                }
            }
            i = -1;
            continue;
            if (i != -1) {
                return g.c(fVar, i);
            }
        }
        return g.d();
    }

    public static int o(int i) {
        return n(b, new int[]{i}).e();
    }

    public static final int p() {
        return f.get(0).intValue();
    }

    public static Bundle q(Intent intent) {
        if (!r(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    public static boolean r(int i) {
        return f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    public static void s(Intent intent, String str, String str2, int i, Bundle bundle) {
        String e2 = k.e();
        String f2 = k.f();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", e2);
        if (r(i)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            f0.L(bundle2, "app_name", f2);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (!f0.C(f2)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", f2);
        }
        intent.putExtras(bundle);
    }

    public static void t() {
        if (e.compareAndSet(false, true)) {
            k.l().execute(new a());
        }
    }

    static Intent u(Context context, Intent intent) {
        ResolveInfo resolveActivity;
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null || !k.a(context, resolveActivity.activityInfo.packageName)) {
            return null;
        }
        return intent;
    }
}
