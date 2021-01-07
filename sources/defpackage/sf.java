package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.n;
import com.facebook.k;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sf  reason: default package */
public class sf {
    private static HashMap<String, NsdManager.RegistrationListener> a = new HashMap<>();
    public static final /* synthetic */ int b = 0;

    public static void a(String str) {
        NsdManager.RegistrationListener registrationListener = a.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) k.d().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException unused) {
                boolean z = k.n;
            }
            a.remove(str);
        }
    }

    public static String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static boolean c() {
        n j = FetchedAppSettingsManager.j(k.e());
        int i = Build.VERSION.SDK_INT;
        return j != null && j.n().contains(SmartLoginOption.Enabled);
    }

    public static boolean d(String str) {
        if (!c()) {
            return false;
        }
        if (!a.containsKey(str)) {
            boolean z = k.n;
            String format = String.format("%s_%s_%s", "fbsdk", String.format("%s-%s", "android", "7.1.0".replace('.', '|')), str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(format);
            nsdServiceInfo.setPort(80);
            rf rfVar = new rf(format, str);
            a.put(str, rfVar);
            ((NsdManager) k.d().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, rfVar);
        }
        return true;
    }
}
