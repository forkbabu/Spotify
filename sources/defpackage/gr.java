package defpackage;

import com.google.android.gms.cast.internal.b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: gr  reason: default package */
public final class gr {
    private static final b a = new b("MetadataUtils");
    private static final String[] b;
    private static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        String valueOf = String.valueOf(strArr[0]);
        c = valueOf.length() != 0 ? "yyyyMMdd'T'HHmmss".concat(valueOf) : new String("yyyyMMdd'T'HHmmss");
    }

    public static void a(List<hr> list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new hr(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Calendar b(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr.b(java.lang.String):java.util.Calendar");
    }
}
