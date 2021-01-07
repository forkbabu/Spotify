package com.comscore;

import com.adjust.sdk.Constants;
import com.comscore.Configuration;
import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.setup.Setup;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Activation {
    private static final String a = "http://segment-data-us-east.zqtk.net/%s?url=%s&c2=%s&c12=%s&ns_ap_bi=%s&ns_ap_sv=%s&ns_ap_an=%s&ns_ap_ver=%s&ns_ap_pn=android";
    private static final String b = "\\{\\s*\".*\"\\s*:\\s*[^\\}]*\\s*\\}";

    public interface ActivationListener {
        void onReceivedCategories(List<String> list);
    }

    private Activation() {
    }

    static void a(final String str, final String str2, final String str3, final String str4, final ActivationListener activationListener) {
        if (Analytics.getConfiguration().a()) {
            CrossPublisherIdUtil.requestCrossPublisherId(new CrossPublisherIdUtil.Listener() {
                /* class com.comscore.Activation.AnonymousClass1 */

                @Override // com.comscore.util.CrossPublisherIdUtil.Listener
                public void onCrossPublisherIdRequested(final String str, boolean z) {
                    new Thread(new Runnable() {
                        /* class com.comscore.Activation.AnonymousClass1.AnonymousClass1 */

                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 r0 = AnonymousClass1.this;
                            activationListener.onReceivedCategories(Activation.b(str, str2, str3, str4, str));
                        }
                    }).start();
                }
            });
        } else {
            Analytics.getConfiguration().a(new Configuration.a() {
                /* class com.comscore.Activation.AnonymousClass2 */

                @Override // com.comscore.Configuration.a
                public void onConfigurationChanged(int i) {
                    if (i == 20307) {
                        Activation.a(str, str2, str3, str4, activationListener);
                        Analytics.getConfiguration().b(this);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static List<String> b(String str, String str2, String str3, String str4, String str5) {
        JSONArray jSONArray;
        if (!Setup.isSetUpFinished() || str3 == null || str4 == null) {
            return new ArrayList();
        }
        String applicationId = Setup.getJniComScoreHelper().getApplicationId();
        String version = Analytics.getVersion();
        String applicationName = Setup.getJniComScoreHelper().getApplicationName();
        String applicationVersion = Setup.getJniComScoreHelper().getApplicationVersion();
        if (applicationId == null || version == null || applicationName == null || applicationVersion == null || str3.isEmpty() || str4.isEmpty() || applicationId.isEmpty() || version.isEmpty() || applicationName.isEmpty() || applicationVersion.isEmpty()) {
            return new ArrayList();
        }
        try {
            String format = String.format(a, URLEncoder.encode(str, Constants.ENCODING), URLEncoder.encode(str2, Constants.ENCODING), URLEncoder.encode(str3, Constants.ENCODING), URLEncoder.encode(str4, Constants.ENCODING), URLEncoder.encode(applicationId, Constants.ENCODING), URLEncoder.encode(version, Constants.ENCODING), URLEncoder.encode(applicationName, Constants.ENCODING), URLEncoder.encode(applicationVersion, Constants.ENCODING));
            if (str5 != null && !str5.isEmpty()) {
                format = format + "&ns_ak=" + URLEncoder.encode(str5, Constants.ENCODING);
            }
            try {
                InputStream openStream = new URL(format).openStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                Matcher matcher = Pattern.compile(b).matcher(byteArrayOutputStream.toString(Constants.ENCODING));
                if (!matcher.find()) {
                    return new ArrayList();
                }
                try {
                    JSONObject jSONObject = new JSONObject(matcher.group(0));
                    try {
                        jSONArray = jSONObject.getJSONArray("data");
                    } catch (JSONException unused) {
                        jSONArray = jSONObject.getJSONArray("errors");
                    }
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    return arrayList;
                } catch (JSONException unused2) {
                    return new ArrayList();
                }
            } catch (IOException unused3) {
                return new ArrayList();
            }
        } catch (UnsupportedEncodingException unused4) {
            return new ArrayList();
        }
    }
}
