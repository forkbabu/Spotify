package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.f;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.a;
import com.spotify.cosmos.router.Request;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static final Pattern d = Pattern.compile("[0-9]+s");
    private static final Charset e = Charset.forName(Constants.ENCODING);
    private final Context a;
    private final b20 b;
    private final HeartBeatInfo c;

    public c(Context context, b20 b20, HeartBeatInfo heartBeatInfo) {
        this.a = context;
        this.b = b20;
        this.c = heartBeatInfo;
    }

    private URL c(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x006d: APUT  (r10v2 java.lang.Object[]), (2 ??[int, float, short, byte, char]), (r11v1 java.lang.String) */
    private static void d(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str3;
            objArr[2] = TextUtils.isEmpty(str) ? "" : je.x0(", ", str);
            String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
        }
    }

    private HttpURLConnection e(URL url, String str) {
        MessageDigest a2;
        HeartBeatInfo.HeartBeat a3;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            HeartBeatInfo heartBeatInfo = this.c;
            if (!(heartBeatInfo == null || this.b == null || (a3 = heartBeatInfo.a("fire-installations-id")) == HeartBeatInfo.HeartBeat.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.b.a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a3.d()));
            }
            String str2 = null;
            try {
                Context context = this.a;
                PackageInfo e2 = xr.a(context).e(context.getPackageName(), 64);
                Signature[] signatureArr = e2.signatures;
                byte[] digest = (signatureArr == null || signatureArr.length != 1 || (a2 = a.a("SHA1")) == null) ? null : a2.digest(e2.signatures[0].toByteArray());
                if (digest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.a.getPackageName());
                } else {
                    str2 = f.b(digest, false);
                }
            } catch (PackageManager.NameNotFoundException e3) {
                StringBuilder V0 = je.V0("No such package: ");
                V0.append(this.a.getPackageName());
                Log.e("ContentValues", V0.toString(), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    static long f(String str) {
        g.d(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private InstallationResponse g(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        TokenResult.a a2 = TokenResult.a();
        a.b bVar = new a.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                bVar.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                bVar.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                bVar.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a2.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a2.d(f(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                bVar.b(a2.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        bVar.e(InstallationResponse.ResponseCode.OK);
        return bVar.a();
    }

    private TokenResult h(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        TokenResult.a a2 = TokenResult.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a2.d(f(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.b(TokenResult.ResponseCode.OK);
        return a2.a();
    }

    private void i(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.3");
            k(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private void j(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            k(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static void k(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public InstallationResponse a(String str, String str2, String str3, String str4, String str5) {
        int i = 0;
        URL c2 = c(String.format("projects/%s/installations", str3));
        while (i <= 1) {
            HttpURLConnection e2 = e(c2, str);
            try {
                e2.setRequestMethod(Request.POST);
                e2.setDoOutput(true);
                if (str5 != null) {
                    e2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                i(e2, str2, str4);
                int responseCode = e2.getResponseCode();
                if (responseCode == 200) {
                    InstallationResponse g = g(e2);
                    e2.disconnect();
                    return g;
                }
                d(e2, str4, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    a.b bVar = new a.b();
                    bVar.e(InstallationResponse.ResponseCode.BAD_CONFIG);
                    InstallationResponse a2 = bVar.a();
                    e2.disconnect();
                    return a2;
                }
                i++;
                e2.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th) {
                e2.disconnect();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public TokenResult b(String str, String str2, String str3, String str4) {
        int i = 0;
        URL c2 = c(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        while (i <= 1) {
            HttpURLConnection e2 = e(c2, str);
            try {
                e2.setRequestMethod(Request.POST);
                e2.addRequestProperty("Authorization", "FIS_v2 " + str4);
                j(e2);
                int responseCode = e2.getResponseCode();
                if (responseCode == 200) {
                    TokenResult h = h(e2);
                    e2.disconnect();
                    return h;
                }
                d(e2, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    TokenResult.a a2 = TokenResult.a();
                    a2.b(TokenResult.ResponseCode.AUTH_ERROR);
                    TokenResult a3 = a2.a();
                    e2.disconnect();
                    return a3;
                }
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    TokenResult.a a4 = TokenResult.a();
                    a4.b(TokenResult.ResponseCode.BAD_CONFIG);
                    TokenResult a5 = a4.a();
                    e2.disconnect();
                    return a5;
                }
                i++;
                e2.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th) {
                e2.disconnect();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
