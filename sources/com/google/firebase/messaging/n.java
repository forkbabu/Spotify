package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.c;
import com.google.android.datatransport.e;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.a;
import com.google.firebase.messaging.k;

public class n {
    private static final a a;

    static {
        m10 m10 = new m10();
        m10.h(k.b.class, new k.c());
        m10.h(k.class, new k.a());
        a = m10.e();
    }

    static String a(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    public static void b(Intent intent, e<String> eVar) {
        c("_nr", intent);
        if (eVar != null) {
            try {
                eVar.b(c.f(a.b(new k.b(new k("MESSAGE_DELIVERED", intent)))));
            } catch (EncodingException unused) {
            }
        }
    }

    static void c(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String a2 = a(intent);
        if (a2 != null) {
            bundle.putString("_nt", a2);
        }
        String stringExtra5 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra5 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra5));
            } catch (NumberFormatException unused) {
            }
        }
        String stringExtra6 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException unused2) {
            }
        }
        String str2 = (intent.getExtras() == null || !o.g(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            str.length();
            valueOf.length();
        }
        oy oyVar = (oy) com.google.firebase.c.h().f(oy.class);
        if (oyVar != null) {
            oyVar.a("fcm", str, bundle);
        }
    }

    public static boolean d(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }
}
