package com.google.firebase.messaging;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public class o {
    private final Bundle a;

    public o(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static boolean g(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    private static String j(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String f = f(str);
        return "1".equals(f) || Boolean.parseBoolean(f);
    }

    public Integer b(String str) {
        String f = f(str);
        if (TextUtils.isEmpty(f)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(f));
        } catch (NumberFormatException unused) {
            String.valueOf(j(str)).length();
            String.valueOf(f).length();
            return null;
        }
    }

    public JSONArray c(String str) {
        String f = f(str);
        if (TextUtils.isEmpty(f)) {
            return null;
        }
        try {
            return new JSONArray(f);
        } catch (JSONException unused) {
            String.valueOf(j(str)).length();
            String.valueOf(f).length();
            return null;
        }
    }

    public Long d(String str) {
        String f = f(str);
        if (TextUtils.isEmpty(f)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(f));
        } catch (NumberFormatException unused) {
            String.valueOf(j(str)).length();
            String.valueOf(f).length();
            return null;
        }
    }

    public String e(Resources resources, String str, String str2) {
        String[] strArr;
        String f = f(str2);
        if (!TextUtils.isEmpty(f)) {
            return f;
        }
        String f2 = f(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(f2)) {
            return null;
        }
        int identifier = resources.getIdentifier(f2, "string", str);
        if (identifier == 0) {
            String.valueOf(j(str2.concat("_loc_key"))).length();
            str2.length();
            return null;
        }
        JSONArray c = c(str2.concat("_loc_args"));
        if (c == null) {
            strArr = null;
        } else {
            int length = c.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = c.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            String j = j(str2);
            String arrays = Arrays.toString(strArr);
            String.valueOf(j).length();
            String.valueOf(arrays).length();
            return null;
        }
    }

    public String f(String str) {
        String str2;
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public Bundle h() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle i() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
