package io.branch.referral.network;

import android.content.Context;
import io.branch.referral.Branch;
import io.branch.referral.Defines$Jsonkey;
import io.branch.referral.f0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BranchRemoteInterface {

    public static class BranchRemoteException extends Exception {
        private int branchErrorCode = -113;

        public BranchRemoteException(int i) {
            this.branchErrorCode = i;
        }
    }

    public static class a {
        private final String a;
        private final int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    private boolean a(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(Defines$Jsonkey.UserData.d())) {
                jSONObject.put(Defines$Jsonkey.SDK.d(), "android5.0.2");
            }
            if (str.equals("bnc_no_value")) {
                return false;
            }
            jSONObject.put(Defines$Jsonkey.BranchKey.d(), str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final BranchRemoteInterface d(Context context) {
        return new a(context);
    }

    private f0 g(String str, int i, String str2) {
        f0 f0Var = new f0(str2, i);
        if (str != null) {
            try {
                f0Var.d(new JSONObject(str));
            } catch (JSONException unused) {
                try {
                    f0Var.d(new JSONArray(str));
                } catch (JSONException e) {
                    e.getMessage();
                }
            }
        }
        return f0Var;
    }

    public abstract a b(String str);

    public abstract a c(String str, JSONObject jSONObject);

    public final f0 e(String str, JSONObject jSONObject, String str2, String str3) {
        String str4;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!a(jSONObject, str3)) {
            return new f0(str2, -114);
        }
        StringBuilder V0 = je.V0(str);
        StringBuilder sb = new StringBuilder();
        JSONArray names = jSONObject.names();
        if (names != null) {
            int length = names.length();
            boolean z = true;
            for (int i = 0; i < length; i++) {
                try {
                    String string = names.getString(i);
                    if (z) {
                        sb.append("?");
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    String string2 = jSONObject.getString(string);
                    sb.append(string);
                    sb.append("=");
                    sb.append(string2);
                } catch (JSONException e) {
                    e.printStackTrace();
                    str4 = null;
                }
            }
        }
        str4 = sb.toString();
        V0.append(str4);
        String sb2 = V0.toString();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            a b = b(sb2);
            f0 g = g(b.a, b.b, str2);
            if (Branch.F() != null) {
                Branch F = Branch.F();
                StringBuilder Z0 = je.Z0(str2, "-");
                Z0.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                F.s(Z0.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return g;
        } catch (BranchRemoteException e2) {
            if (e2.branchErrorCode == -111) {
                f0 f0Var = new f0(str2, -111);
                if (Branch.F() != null) {
                    Branch F2 = Branch.F();
                    StringBuilder Z02 = je.Z0(str2, "-");
                    Z02.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                    F2.s(Z02.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                }
                return f0Var;
            }
            f0 f0Var2 = new f0(str2, -113);
            if (Branch.F() != null) {
                Branch F3 = Branch.F();
                StringBuilder Z03 = je.Z0(str2, "-");
                Z03.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                F3.s(Z03.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return f0Var2;
        } catch (Throwable th) {
            if (Branch.F() != null) {
                Branch F4 = Branch.F();
                StringBuilder Z04 = je.Z0(str2, "-");
                Z04.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                F4.s(Z04.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            throw th;
        }
    }

    public final f0 f(JSONObject jSONObject, String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!a(jSONObject, str3)) {
            return new f0(str2, -114);
        }
        jSONObject.toString();
        try {
            a c = c(str, jSONObject);
            f0 g = g(c.a, c.b, str2);
            if (Branch.F() != null) {
                Branch F = Branch.F();
                StringBuilder Z0 = je.Z0(str2, "-");
                Z0.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                F.s(Z0.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return g;
        } catch (BranchRemoteException e) {
            if (e.branchErrorCode == -111) {
                f0 f0Var = new f0(str2, -111);
                if (Branch.F() != null) {
                    Branch F2 = Branch.F();
                    StringBuilder Z02 = je.Z0(str2, "-");
                    Z02.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                    F2.s(Z02.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                }
                return f0Var;
            }
            f0 f0Var2 = new f0(str2, -113);
            if (Branch.F() != null) {
                Branch F3 = Branch.F();
                StringBuilder Z03 = je.Z0(str2, "-");
                Z03.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                F3.s(Z03.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return f0Var2;
        } catch (Throwable th) {
            if (Branch.F() != null) {
                Branch F4 = Branch.F();
                StringBuilder Z04 = je.Z0(str2, "-");
                Z04.append(Defines$Jsonkey.Branch_Round_Trip_Time.d());
                F4.s(Z04.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            throw th;
        }
    }
}
