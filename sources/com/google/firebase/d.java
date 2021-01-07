package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.i;
import java.util.Arrays;

public final class d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        g.p(!i.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static d a(Context context) {
        q qVar = new q(context);
        String a2 = qVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new d(a2, qVar.a("google_api_key"), qVar.a("firebase_database_url"), qVar.a("ga_trackingId"), qVar.a("gcm_defaultSenderId"), qVar.a("google_storage_bucket"), qVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!m.a(this.b, dVar.b) || !m.a(this.a, dVar.a) || !m.a(this.c, dVar.c) || !m.a(this.d, dVar.d) || !m.a(this.e, dVar.e) || !m.a(this.f, dVar.f) || !m.a(this.g, dVar.g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public String toString() {
        m.a b2 = m.b(this);
        b2.a("applicationId", this.b);
        b2.a("apiKey", this.a);
        b2.a("databaseUrl", this.c);
        b2.a("gcmSenderId", this.e);
        b2.a("storageBucket", this.f);
        b2.a("projectId", this.g);
        return b2.toString();
    }
}
