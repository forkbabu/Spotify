package com.facebook;

import android.util.Log;
import com.facebook.internal.f0;
import com.facebook.internal.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class q {
    private static final String d = "q";
    private final HttpURLConnection a;
    private final JSONObject b;
    private final FacebookRequestError c;

    public q(m mVar, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this.a = httpURLConnection;
        this.b = null;
        this.c = facebookRequestError;
    }

    static List<q> a(List<m> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new q(list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
        }
        return arrayList;
    }

    private static q b(m mVar, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a2 = FacebookRequestError.a(jSONObject, obj2, httpURLConnection);
            if (a2 != null) {
                Log.e(d, a2.toString());
                if (a2.b() == 190) {
                    a k = mVar.k();
                    if (k != null && k.equals(a.e())) {
                        if (a2.i() != 493) {
                            a.r(null);
                        } else if (!a.e().q()) {
                            a.b();
                        }
                    }
                }
                return new q(mVar, httpURLConnection, a2);
            }
            Object s = f0.s(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (s instanceof JSONObject) {
                return new q(mVar, httpURLConnection, s.toString(), (JSONObject) s);
            }
            if (s instanceof JSONArray) {
                return new q(mVar, httpURLConnection, s.toString(), (JSONArray) s);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new q(mVar, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        StringBuilder V0 = je.V0("Got unexpected object type in response, class: ");
        V0.append(obj.getClass().getSimpleName());
        throw new FacebookException(V0.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<com.facebook.q> c(java.io.InputStream r8, java.net.HttpURLConnection r9, com.facebook.p r10) {
        /*
            java.lang.String r8 = com.facebook.internal.f0.N(r8)
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.INCLUDE_RAW_RESPONSES
            r8.length()
            int r1 = com.facebook.internal.y.e
            com.facebook.k.v(r0)
            org.json.JSONTokener r0 = new org.json.JSONTokener
            r0.<init>(r8)
            java.lang.Object r0 = r0.nextValue()
            int r1 = r10.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0063
            java.lang.Object r3 = r10.get(r4)
            com.facebook.m r3 = (com.facebook.m) r3
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            r5.<init>()     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            java.lang.String r6 = "body"
            r5.put(r6, r0)     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            int r6 = r9.getResponseCode()     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            java.lang.String r7 = "code"
            r5.put(r7, r6)     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            r6.<init>()     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            r6.put(r5)     // Catch:{ JSONException -> 0x0055, IOException -> 0x0046 }
            goto L_0x0064
        L_0x0046:
            r5 = move-exception
            com.facebook.q r6 = new com.facebook.q
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r5)
            r6.<init>(r3, r9, r7)
            r2.add(r6)
            goto L_0x0063
        L_0x0055:
            r5 = move-exception
            com.facebook.q r6 = new com.facebook.q
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r5)
            r6.<init>(r3, r9, r7)
            r2.add(r6)
        L_0x0063:
            r6 = r0
        L_0x0064:
            boolean r3 = r6 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x00b3
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r3 = r6.length()
            if (r3 != r1) goto L_0x00b3
        L_0x0070:
            int r1 = r6.length()
            if (r4 >= r1) goto L_0x00a8
            java.lang.Object r1 = r10.get(r4)
            com.facebook.m r1 = (com.facebook.m) r1
            java.lang.Object r3 = r6.get(r4)     // Catch:{ JSONException -> 0x0097, FacebookException -> 0x0088 }
            com.facebook.q r3 = b(r1, r9, r3, r0)     // Catch:{ JSONException -> 0x0097, FacebookException -> 0x0088 }
            r2.add(r3)     // Catch:{ JSONException -> 0x0097, FacebookException -> 0x0088 }
            goto L_0x00a5
        L_0x0088:
            r3 = move-exception
            com.facebook.q r5 = new com.facebook.q
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r3)
            r5.<init>(r1, r9, r7)
            r2.add(r5)
            goto L_0x00a5
        L_0x0097:
            r3 = move-exception
            com.facebook.q r5 = new com.facebook.q
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r9, r3)
            r5.<init>(r1, r9, r7)
            r2.add(r5)
        L_0x00a5:
            int r4 = r4 + 1
            goto L_0x0070
        L_0x00a8:
            com.facebook.LoggingBehavior r9 = com.facebook.LoggingBehavior.REQUESTS
            r8.length()
            int r8 = com.facebook.internal.y.e
            com.facebook.k.v(r9)
            return r2
        L_0x00b3:
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r9 = "Unexpected number of results"
            r8.<init>(r9)
            goto L_0x00bc
        L_0x00bb:
            throw r8
        L_0x00bc:
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.q.c(java.io.InputStream, java.net.HttpURLConnection, com.facebook.p):java.util.List");
    }

    static List<q> d(HttpURLConnection httpURLConnection, p pVar) {
        InputStream inputStream;
        LoggingBehavior loggingBehavior = LoggingBehavior.REQUESTS;
        Closeable closeable = null;
        try {
            if (k.t()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                List<q> c2 = c(inputStream, httpURLConnection, pVar);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return c2;
            }
            Log.e(d, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        } catch (FacebookException e) {
            int i = y.e;
            k.v(loggingBehavior);
            List<q> a2 = a(pVar, httpURLConnection, e);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused2) {
                }
            }
            return a2;
        } catch (Exception e2) {
            int i2 = y.e;
            k.v(loggingBehavior);
            List<q> a3 = a(pVar, httpURLConnection, new FacebookException(e2));
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused3) {
                }
            }
            return a3;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public final FacebookRequestError e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.b;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0017: APUT  
      (r2v3 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Integer : 0x0013: INVOKE  (r4v2 java.lang.Integer) = (r4v1 int) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer)
     */
    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.a;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.b + ", error: " + this.c + "}";
    }

    public q(m mVar, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this.a = httpURLConnection;
        this.b = null;
        this.c = null;
    }

    public q(m mVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = null;
    }
}
