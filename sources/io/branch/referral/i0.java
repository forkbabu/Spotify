package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class i0 {
    private static JSONObject c;
    private static i0 d;
    private final ArrayList<String> a;
    private final JSONObject b;

    /* access modifiers changed from: private */
    public static class b extends e<Void, Void, JSONObject> {
        private final r a;

        b(Context context, a aVar) {
            this.a = r.r(context);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
        @Override // android.os.AsyncTask
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r7) {
            /*
                r6 = this;
                java.lang.Void[] r7 = (java.lang.Void[]) r7
                r7 = 0
                android.net.TrafficStats.setThreadStatsTag(r7)
                org.json.JSONObject r7 = new org.json.JSONObject
                r7.<init>()
                r0 = 0
                java.lang.String r1 = "%sdk/uriskiplist_v#.json"
                java.lang.String r2 = "%"
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0073 }
                if (r3 != 0) goto L_0x0018
                r3 = r0
                goto L_0x001a
            L_0x0018:
                java.lang.String r3 = "https://cdn.branch.io/"
            L_0x001a:
                java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ all -> 0x0073 }
                java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0073 }
                java.lang.String r3 = "#"
                org.json.JSONObject r4 = io.branch.referral.i0.a()     // Catch:{ all -> 0x0073 }
                java.lang.String r5 = "version"
                int r4 = r4.optInt(r5)     // Catch:{ all -> 0x0073 }
                int r4 = r4 + 1
                java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.replace(r3, r4)     // Catch:{ all -> 0x0073 }
                r2.<init>(r1)     // Catch:{ all -> 0x0073 }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0073 }
                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0073 }
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.setConnectTimeout(r0)     // Catch:{ all -> 0x0071 }
                r1.setReadTimeout(r0)     // Catch:{ all -> 0x0071 }
                int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0071 }
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x006d
                java.io.InputStream r0 = r1.getInputStream()     // Catch:{ all -> 0x0071 }
                if (r0 == 0) goto L_0x006d
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0071 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0071 }
                java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x0071 }
                r2.<init>(r3)     // Catch:{ all -> 0x0071 }
                r0.<init>(r2)     // Catch:{ all -> 0x0071 }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0071 }
                java.lang.String r0 = r0.readLine()     // Catch:{ all -> 0x0071 }
                r2.<init>(r0)     // Catch:{ all -> 0x0071 }
                r7 = r2
            L_0x006d:
                r1.disconnect()
                goto L_0x0079
            L_0x0071:
                r0 = r1
                goto L_0x0074
            L_0x0073:
            L_0x0074:
                if (r0 == 0) goto L_0x0079
                r0.disconnect()
            L_0x0079:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.i0.b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            super.onPostExecute(jSONObject);
            if (jSONObject.optInt("version") > i0.c.optInt("version")) {
                JSONObject unused = i0.c = jSONObject;
                this.a.O("skip_url_format_key", i0.c.toString());
            }
        }
    }

    private i0(Context context) {
        JSONObject jSONObject = new JSONObject();
        this.b = jSONObject;
        try {
            jSONObject.putOpt("version", 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException unused) {
        }
        r r = r.r(context);
        JSONObject jSONObject2 = new JSONObject();
        String C = r.C("skip_url_format_key");
        if (TextUtils.isEmpty(C) || "bnc_no_value".equals(C)) {
            jSONObject2 = this.b;
        } else {
            try {
                jSONObject2 = new JSONObject(C);
            } catch (JSONException unused2) {
            }
        }
        c = jSONObject2;
        this.a = new ArrayList<>();
    }

    public static i0 c(Context context) {
        if (d == null) {
            d = new i0(context);
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    public String d(String str) {
        String str2;
        try {
            JSONArray optJSONArray = c.optJSONArray("uri_skip_list");
            if (optJSONArray != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    try {
                        str2 = optJSONArray.getString(i);
                        if (Pattern.compile(str2).matcher(str).find()) {
                            break;
                        }
                        i++;
                    } catch (JSONException unused) {
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                if (this.a.size() <= 0) {
                    return str;
                }
                Iterator<String> it = this.a.iterator();
                while (it.hasNext()) {
                    if (str.matches(it.next())) {
                        return str;
                    }
                }
            }
            return str2;
        } catch (Exception unused2) {
            return str;
        }
    }
}
