package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import io.branch.referral.Branch;
import io.branch.referral.Defines$Jsonkey;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: xjf  reason: default package */
public class xjf {
    private static WeakReference<Activity> a;

    /* renamed from: xjf$a */
    static class a implements Runnable {
        final /* synthetic */ JSONObject a;

        a(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            xjf.b(xjf.a(this.a, ""));
        }
    }

    static String a(JSONObject jSONObject, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        try {
            try {
                str2 = jSONObject.getString("~" + Defines$Jsonkey.ReferringLink.d()).split("\\?")[0];
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str2 = "";
        }
        String x0 = je.x0(str2, "?validate=true");
        if (!TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(x0);
                if (jSONObject.getString("ct").equals("t1")) {
                    str3 = "&t1=" + str;
                } else {
                    str3 = "&t1=" + jSONObject.getString("t1");
                }
                sb.append(str3);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                if (jSONObject.getString("ct").equals("t2")) {
                    str4 = "&t2=" + str;
                } else {
                    str4 = "&t2=" + jSONObject.getString("t2");
                }
                sb3.append(str4);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                if (jSONObject.getString("ct").equals("t3")) {
                    str5 = "&t3=" + str;
                } else {
                    str5 = "&t3=" + jSONObject.getString("t3");
                }
                sb5.append(str5);
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                if (jSONObject.getString("ct").equals("t4")) {
                    str6 = "&t4=" + str;
                } else {
                    str6 = "&t4=" + jSONObject.getString("t4");
                }
                sb7.append(str6);
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb8);
                if (jSONObject.getString("ct").equals("t5")) {
                    str7 = "&t5=" + str;
                } else {
                    str7 = "&t5=" + jSONObject.getString("t5");
                }
                sb9.append(str7);
                x0 = sb9.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return je.x0(x0, "&os=android");
    }

    static void b(String str) {
        if (a.get() != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().appendQueryParameter("$uri_redirect_mode", "2").build());
            intent.addFlags(268435456);
            intent.setPackage("com.android.chrome");
            a.get().getPackageManager().queryIntentActivities(intent, 0);
            try {
                a.get().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.setPackage(null);
                a.get().startActivity(intent);
            }
        }
    }

    public static void c(WeakReference<Activity> weakReference) {
        String str;
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2;
        a = weakReference;
        if (Branch.F() != null) {
            Branch.F().G();
            JSONObject G = Branch.F().G();
            StringBuilder V0 = je.V0("~");
            V0.append(Defines$Jsonkey.ReferringLink.d());
            str = G.optString(V0.toString());
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && weakReference != null) {
            JSONObject G2 = Branch.F().G();
            if (G2.optInt("_branch_validate") == 60514) {
                if (G2.optBoolean(Defines$Jsonkey.Clicked_Branch_Link.d())) {
                    if (a.get() != null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            builder2 = new AlertDialog.Builder(a.get(), 16974374);
                        } else {
                            builder2 = new AlertDialog.Builder(a.get());
                        }
                        builder2.setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new akf(G2)).setNegativeButton("No", new zjf(G2)).setNeutralButton(17039360, new yjf()).setCancelable(false).setIcon(17301651).show();
                    }
                } else if (a.get() != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        builder = new AlertDialog.Builder(a.get(), 16974374);
                    } else {
                        builder = new AlertDialog.Builder(a.get());
                    }
                    builder.setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new bkf()).setCancelable(false).setIcon(17301651).show();
                }
            } else if (G2.optBoolean("bnc_validate")) {
                new Handler().postDelayed(new a(G2), 500);
            }
        }
    }
}
