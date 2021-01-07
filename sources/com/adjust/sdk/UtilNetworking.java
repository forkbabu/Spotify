package com.adjust.sdk;

import android.net.Uri;
import com.spotify.cosmos.router.Request;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class UtilNetworking {
    private static String userAgent;

    /* access modifiers changed from: package-private */
    public static class ConnectionOptions implements IConnectionOptions {
        ConnectionOptions() {
        }

        @Override // com.adjust.sdk.UtilNetworking.IConnectionOptions
        public void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            if (UtilNetworking.userAgent != null) {
                httpsURLConnection.setRequestProperty("User-Agent", UtilNetworking.userAgent);
            }
        }
    }

    public interface IConnectionOptions {
        void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str);
    }

    private static String buildAuthorizationHeader(Map<String, String> map, String str) {
        String extractSecretId = extractSecretId(map);
        String buildAuthorizationHeaderV2 = buildAuthorizationHeaderV2(extractSignature(map), extractSecretId, extractHeadersId(map), extractAlgorithm(map), extractNativeVersion(map));
        if (buildAuthorizationHeaderV2 != null) {
            return buildAuthorizationHeaderV2;
        }
        return buildAuthorizationHeaderV1(map, extractAppSecret(map), extractSecretId, str);
    }

    private static String buildAuthorizationHeaderV1(Map<String, String> map, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Map<String, String> signature = getSignature(map, str3, str);
        String formatString = Util.formatString("Signature %s,%s,%s,%s", Util.formatString("secret_id=\"%s\"", str2), Util.formatString("signature=\"%s\"", Util.sha256(signature.get("clear_signature"))), Util.formatString("algorithm=\"%s\"", "sha256"), Util.formatString("headers=\"%s\"", signature.get("fields")));
        getLogger().verbose("authorizationHeader: %s", formatString);
        return formatString;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002e: APUT  (r1v3 java.lang.Object[]), (0 ??[int, short, byte, char]), (r6v1 java.lang.String) */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x003d: APUT  (r1v4 java.lang.Object[]), (0 ??[int, short, byte, char]), (r7v1 java.lang.String) */
    private static String buildAuthorizationHeaderV2(String str, String str2, String str3, String str4, String str5) {
        if (str2 == null || str == null || str3 == null) {
            return null;
        }
        String formatString = Util.formatString("signature=\"%s\"", str);
        String formatString2 = Util.formatString("secret_id=\"%s\"", str2);
        String formatString3 = Util.formatString("headers_id=\"%s\"", str3);
        Object[] objArr = new Object[1];
        if (str4 == null) {
            str4 = "adj1";
        }
        objArr[0] = str4;
        String formatString4 = Util.formatString("algorithm=\"%s\"", objArr);
        Object[] objArr2 = new Object[1];
        if (str5 == null) {
            str5 = "";
        }
        objArr2[0] = str5;
        String formatString5 = Util.formatString("Signature %s,%s,%s,%s,%s", formatString, formatString2, formatString4, formatString3, Util.formatString("native_version=\"%s\"", objArr2));
        getLogger().verbose("authorizationHeader: %s", formatString5);
        return formatString5;
    }

    private static Uri buildUri(String str, Map<String, String> map, String str2, String str3) {
        String str4;
        Uri.Builder builder = new Uri.Builder();
        String str5 = Constants.SCHEME;
        String str6 = Constants.AUTHORITY;
        if (str2 != null) {
            try {
                str3 = str3 + str2;
            } catch (MalformedURLException e) {
                getLogger().error("Unable to parse endpoint (%s)", e.getMessage());
                str4 = "";
            }
        }
        URL url = new URL(str3);
        str5 = url.getProtocol();
        str6 = url.getAuthority();
        str4 = url.getPath();
        builder.scheme(str5);
        builder.encodedAuthority(str6);
        builder.path(str4);
        builder.appendPath(str);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        builder.appendQueryParameter("sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return builder.build();
    }

    public static ResponseData createGETHttpsURLConnection(ActivityPackage activityPackage, String str, String str2) {
        try {
            HashMap hashMap = new HashMap(activityPackage.getParameters());
            extractEventCallbackId(hashMap);
            HttpsURLConnection httpsURLConnection = AdjustFactory.getHttpsURLConnection(new URL(buildUri(activityPackage.getPath(), hashMap, str, str2).toString()));
            AdjustFactory.getConnectionOptions().applyConnectionOptions(httpsURLConnection, activityPackage.getClientSdk());
            String buildAuthorizationHeader = buildAuthorizationHeader(hashMap, activityPackage.getActivityKind().toString());
            if (buildAuthorizationHeader != null) {
                httpsURLConnection.setRequestProperty("Authorization", buildAuthorizationHeader);
            }
            httpsURLConnection.setRequestMethod(Request.GET);
            return readHttpResponse(httpsURLConnection, activityPackage);
        } catch (Exception e) {
            throw e;
        }
    }

    public static ResponseData createPOSTHttpsURLConnection(String str, ActivityPackage activityPackage, int i) {
        Throwable th;
        Exception e;
        DataOutputStream dataOutputStream = null;
        try {
            HttpsURLConnection httpsURLConnection = AdjustFactory.getHttpsURLConnection(new URL(str));
            HashMap hashMap = new HashMap(activityPackage.getParameters());
            AdjustFactory.getConnectionOptions().applyConnectionOptions(httpsURLConnection, activityPackage.getClientSdk());
            extractEventCallbackId(hashMap);
            String buildAuthorizationHeader = buildAuthorizationHeader(hashMap, activityPackage.getActivityKind().toString());
            if (buildAuthorizationHeader != null) {
                httpsURLConnection.setRequestProperty("Authorization", buildAuthorizationHeader);
            }
            httpsURLConnection.setRequestMethod(Request.POST);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream2 = new DataOutputStream(httpsURLConnection.getOutputStream());
            try {
                dataOutputStream2.writeBytes(getPostDataString(hashMap, i));
                ResponseData readHttpResponse = readHttpResponse(httpsURLConnection, activityPackage);
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (Exception unused) {
                }
                return readHttpResponse;
            } catch (Exception e2) {
                e = e2;
                dataOutputStream = dataOutputStream2;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            throw e;
        }
    }

    private static String extractAlgorithm(Map<String, String> map) {
        return map.remove("algorithm");
    }

    private static String extractAppSecret(Map<String, String> map) {
        return map.remove("app_secret");
    }

    private static void extractEventCallbackId(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    private static String extractHeadersId(Map<String, String> map) {
        return map.remove("headers_id");
    }

    private static String extractNativeVersion(Map<String, String> map) {
        return map.remove("native_version");
    }

    private static String extractSecretId(Map<String, String> map) {
        return map.remove("secret_id");
    }

    private static String extractSignature(Map<String, String> map) {
        return map.remove("signature");
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    private static String getPostDataString(Map<String, String> map, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String encode = URLEncoder.encode(next.getKey(), Constants.ENCODING);
            String value = next.getValue();
            if (value != null) {
                str = URLEncoder.encode(value, Constants.ENCODING);
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(encode);
            sb.append("=");
            sb.append(str);
        }
        String format = Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis()));
        sb.append("&");
        sb.append(URLEncoder.encode("sent_at", Constants.ENCODING));
        sb.append("=");
        sb.append(URLEncoder.encode(format, Constants.ENCODING));
        if (i > 0) {
            sb.append("&");
            sb.append(URLEncoder.encode("queue_size", Constants.ENCODING));
            sb.append("=");
            sb.append(URLEncoder.encode(str + i, Constants.ENCODING));
        }
        return sb.toString();
    }

    private static Map<String, String> getSignature(Map<String, String> map, String str, String str2) {
        String validIdentifier = getValidIdentifier(map);
        String str3 = map.get("source");
        String str4 = map.get("payload");
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put("created_at", map.get("created_at"));
        hashMap.put("activity_kind", str);
        hashMap.put(validIdentifier, map.get(validIdentifier));
        if (str3 != null) {
            hashMap.put("source", str3);
        }
        if (str4 != null) {
            hashMap.put("payload", str4);
        }
        String str5 = "";
        String str6 = str5;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                str5 = je.I0(je.V0(str5), (String) entry.getKey(), " ");
                StringBuilder V0 = je.V0(str6);
                V0.append((String) entry.getValue());
                str6 = V0.toString();
            }
        }
        String substring = str5.substring(0, str5.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str6);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    private static String getValidIdentifier(Map<String, String> map) {
        if (map.get("gps_adid") != null) {
            return "gps_adid";
        }
        if (map.get("fire_adid") != null) {
            return "fire_adid";
        }
        if (map.get("android_id") != null) {
            return "android_id";
        }
        if (map.get("mac_sha1") != null) {
            return "mac_sha1";
        }
        if (map.get("mac_md5") != null) {
            return "mac_md5";
        }
        if (map.get("android_uuid") != null) {
            return "android_uuid";
        }
        return null;
    }

    private static ResponseData readHttpResponse(HttpsURLConnection httpsURLConnection, ActivityPackage activityPackage) {
        InputStream inputStream;
        JSONObject jSONObject;
        StringBuffer stringBuffer = new StringBuffer();
        ILogger logger = getLogger();
        ResponseData buildResponseData = ResponseData.buildResponseData(activityPackage);
        try {
            httpsURLConnection.connect();
            Integer valueOf = Integer.valueOf(httpsURLConnection.getResponseCode());
            if (valueOf.intValue() >= 400) {
                inputStream = httpsURLConnection.getErrorStream();
            } else {
                inputStream = httpsURLConnection.getInputStream();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            httpsURLConnection.disconnect();
            String stringBuffer2 = stringBuffer.toString();
            logger.verbose("Response: %s", stringBuffer2);
            if (valueOf.intValue() == 429) {
                logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                return buildResponseData;
            }
            if (!(stringBuffer2 == null || stringBuffer2.length() == 0)) {
                try {
                    jSONObject = new JSONObject(stringBuffer2);
                } catch (JSONException e) {
                    String formatString = Util.formatString("Failed to parse json response. (%s)", e.getMessage());
                    logger.error(formatString, new Object[0]);
                    buildResponseData.message = formatString;
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return buildResponseData;
                }
                buildResponseData.jsonResponse = jSONObject;
                String optString = jSONObject.optString("message", null);
                buildResponseData.message = optString;
                buildResponseData.timestamp = jSONObject.optString("timestamp", null);
                buildResponseData.adid = jSONObject.optString("adid", null);
                String optString2 = jSONObject.optString("tracking_state", null);
                if (optString2 != null && optString2.equals("opted_out")) {
                    buildResponseData.trackingState = TrackingState.OPTED_OUT;
                }
                if (optString == null) {
                    optString = "No message found";
                }
                if (valueOf.intValue() == 200) {
                    logger.info("%s", optString);
                    buildResponseData.success = true;
                } else {
                    logger.error("%s", optString);
                }
            }
            return buildResponseData;
        } catch (Exception e2) {
            logger.error("Failed to read response. (%s)", e2.getMessage());
            throw e2;
        } catch (Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static void setUserAgent(String str) {
        userAgent = str;
    }
}
