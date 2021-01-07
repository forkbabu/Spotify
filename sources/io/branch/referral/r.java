package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class r {
    private static String f;
    private static r g;
    private SharedPreferences a;
    private SharedPreferences.Editor b;
    private final JSONObject c = new JSONObject();
    private final JSONObject d = new JSONObject();
    private final JSONObject e = new JSONObject();

    private r(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    private String E(ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            str = je.y0(str, it.next(), ",");
        }
        return str.substring(0, str.length() - 1);
    }

    private void F(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            O("bnc_actions", "bnc_no_value");
        } else {
            O("bnc_actions", E(arrayList));
        }
    }

    private void H(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            O("bnc_buckets", "bnc_no_value");
        } else {
            O("bnc_buckets", E(arrayList));
        }
    }

    public static void a(String str, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            Log.e("BranchSDK", str, th);
        }
    }

    private ArrayList<String> d() {
        String C = C("bnc_actions");
        if (C.equals("bnc_no_value")) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, C.split(","));
        return arrayList;
    }

    private ArrayList<String> i() {
        String C = C("bnc_buckets");
        if (C.equals("bnc_no_value")) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, C.split(","));
        return arrayList;
    }

    public static r r(Context context) {
        if (g == null) {
            g = new r(context);
        }
        return g;
    }

    /* access modifiers changed from: package-private */
    public String A(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.e.get(str).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public String B() {
        return C("bnc_session_id");
    }

    public String C(String str) {
        return g.a.getString(str, "bnc_no_value");
    }

    /* access modifiers changed from: package-private */
    public boolean D(String str) {
        if (str != null) {
            if (str.startsWith(i.b() ? "key_test_" : "key_")) {
                return true;
            }
        }
        return false;
    }

    public boolean G(String str) {
        f = str;
        if (C("bnc_branch_key").equals(str)) {
            return false;
        }
        String u = u();
        String C = C("bnc_link_click_identifier");
        String e2 = e();
        String w = w();
        this.b.clear();
        O("bnc_link_click_id", u);
        O("bnc_link_click_identifier", C);
        O("bnc_app_link", e2);
        O("bnc_push_identifier", w);
        g.b.apply();
        O("bnc_branch_key", str);
        return true;
    }

    public void I(String str, int i) {
        ArrayList<String> i2 = i();
        if (!i2.contains(str)) {
            i2.add(str);
            H(i2);
        }
        J("bnc_credit_base_" + str, i);
    }

    public void J(String str, int i) {
        g.b.putInt(str, i);
        g.b.apply();
    }

    public void K(Boolean bool) {
        g.b.putBoolean("bnc_triggered_by_fb_app_link", bool.booleanValue());
        g.b.apply();
    }

    public void L(boolean z) {
        g.b.putBoolean("bnc_is_full_app_conversion", Boolean.valueOf(z).booleanValue());
        g.b.apply();
    }

    public void M(String str, long j) {
        g.b.putLong(str, j);
        g.b.apply();
    }

    public void N(String str, String str2) {
        if (str != null) {
            if (this.c.has(str) && str2 == null) {
                this.c.remove(str);
            }
            try {
                this.c.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }

    public void O(String str, String str2) {
        g.b.putString(str, str2);
        g.b.apply();
    }

    /* access modifiers changed from: package-private */
    public boolean P() {
        try {
            return this.e.length() != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if (str != null) {
            try {
                this.d.putOpt(str, str2);
            } catch (JSONException unused) {
            }
        }
    }

    public void c() {
        Iterator<String> it = i().iterator();
        while (it.hasNext()) {
            I(it.next(), 0);
        }
        H(new ArrayList<>());
        Iterator<String> it2 = d().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            ArrayList<String> d2 = d();
            if (!d2.contains(next)) {
                d2.add(next);
                F(d2);
            }
            J("bnc_total_base_" + next, 0);
            J("bnc_balance_base_" + next, 0);
        }
        F(new ArrayList<>());
    }

    public String e() {
        return C("bnc_app_link");
    }

    public boolean f(String str) {
        return g.a.getBoolean(str, false);
    }

    public String g() {
        if (f == null) {
            f = C("bnc_branch_key");
        }
        return f;
    }

    public int h(String str) {
        return s("bnc_branch_view_use_" + str, 0);
    }

    public int j(String str) {
        return s("bnc_credit_base_" + str, 0);
    }

    public String k() {
        return C("bnc_device_fingerprint_id");
    }

    public String l() {
        return C("bnc_external_intent_uri");
    }

    public String m() {
        return C("bnc_identity");
    }

    public String n() {
        return C("bnc_identity_id");
    }

    /* access modifiers changed from: package-private */
    public String o(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.d.get(str).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject p() {
        return this.d;
    }

    public String q() {
        return C("bnc_install_params");
    }

    public int s(String str, int i) {
        return g.a.getInt(str, i);
    }

    public int t() {
        return s("bnc_is_referrable", 0);
    }

    public String u() {
        return C("bnc_link_click_id");
    }

    public long v(String str) {
        return g.a.getLong(str, 0);
    }

    public String w() {
        return C("bnc_push_identifier");
    }

    public JSONObject x() {
        return this.c;
    }

    public int y() {
        return s("bnc_retry_count", 3);
    }

    public int z() {
        return s("bnc_retry_interval", Constants.ONE_SECOND);
    }
}
