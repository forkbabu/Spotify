package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.coremedia.iso.boxes.UserBox;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: tz  reason: default package */
public class tz {
    private final Context a;
    private final a b;

    /* access modifiers changed from: package-private */
    /* renamed from: tz$a */
    public interface a {
    }

    tz(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    /* access modifiers changed from: package-private */
    public byte[] a(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                vz a2 = wz.a(readLine);
                JSONObject jSONObject = null;
                if (a2 != null) {
                    if ((a2.c.indexOf(120) == -1 || a2.d.indexOf(47) == -1) ? false : true) {
                        File file = new File(a2.d);
                        if (!file.exists()) {
                            int i = Build.VERSION.SDK_INT;
                            if (file.getAbsolutePath().startsWith("/data")) {
                                try {
                                    file = new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).nativeLibraryDir, file.getName());
                                } catch (PackageManager.NameNotFoundException e) {
                                    ty.f().e("Error getting ApplicationInfo", e);
                                }
                            }
                        }
                        try {
                            String a3 = ((xz) this.b).a(file);
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("base_address", a2.a);
                                jSONObject2.put("size", a2.b);
                                jSONObject2.put("name", a2.d);
                                jSONObject2.put(UserBox.TYPE, a3);
                                jSONObject = jSONObject2;
                            } catch (JSONException e2) {
                                ty.f().c("Could not create a binary image json string", e2);
                            }
                        } catch (IOException e3) {
                            ty f = ty.f();
                            StringBuilder V0 = je.V0("Could not generate ID for file ");
                            V0.append(a2.d);
                            f.c(V0.toString(), e3);
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("binary_images", jSONArray);
                    return jSONObject3.toString().getBytes(Charset.forName(Constants.ENCODING));
                } catch (JSONException e4) {
                    ty.f().i("Binary images string is null", e4);
                    return new byte[0];
                }
            }
        }
    }
}
