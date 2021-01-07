package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.j;
import com.google.firebase.c;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.g;
import com.google.firebase.installations.k;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

public class s {
    private final c a;
    private final e0 b;
    private final o0 c;
    private final b20 d;
    private final HeartBeatInfo e;
    private final g f;

    public s(c cVar, e0 e0Var, b20 b20, HeartBeatInfo heartBeatInfo, g gVar) {
        o0 o0Var = new o0(cVar.g(), e0Var);
        this.a = cVar;
        this.b = e0Var;
        this.c = o0Var;
        this.d = b20;
        this.e = heartBeatInfo;
        this.f = gVar;
    }

    private com.google.android.gms.tasks.g<String> a(com.google.android.gms.tasks.g<Bundle> gVar) {
        int i = h.b;
        return gVar.k(g.a, new r(this));
    }

    private com.google.android.gms.tasks.g<Bundle> c(String str, String str2, String str3, Bundle bundle) {
        String str4;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.j().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance(Constants.SHA1).digest(this.a.i().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String a2 = ((k) j.a(this.f.a(false))).a();
            if (!TextUtils.isEmpty(a2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a2);
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "fiid-".concat("20.2.4"));
        HeartBeatInfo.HeartBeat a3 = this.e.a("fire-iid");
        if (a3 != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a3.d()));
            bundle.putString("Firebase-Client", this.d.a());
        }
        return this.c.d(bundle);
    }

    public com.google.android.gms.tasks.g<String> b(String str, String str2, String str3) {
        return a(c(str, str2, str3, new Bundle()));
    }

    public com.google.android.gms.tasks.g<?> d(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return a(c(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    public com.google.android.gms.tasks.g<?> e(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return a(c(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
