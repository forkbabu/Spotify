package defpackage;

import com.spotify.mobile.android.util.Assertion;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: n91  reason: default package */
public final class n91 {
    private static void a(StringBuilder sb, List<?> list) {
        boolean z = false;
        for (Object obj : list) {
            if (z) {
                sb.append(',');
            } else {
                z = true;
            }
            b(sb, obj);
        }
    }

    private static void b(StringBuilder sb, Object obj) {
        if (obj instanceof Long) {
            sb.append(obj);
        } else if (obj instanceof String) {
            sb.append(obj);
        } else if (obj instanceof Double) {
            sb.append(obj);
        } else if (obj instanceof Boolean) {
            sb.append(obj);
        } else if (obj instanceof byte[]) {
            lg0.b(sb, (byte[]) obj);
        } else if (obj instanceof List) {
            a(sb, (List) obj);
        } else if (obj instanceof Map) {
            boolean z = false;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (z) {
                    sb.append(',');
                } else {
                    z = true;
                }
                b(sb, entry.getKey());
                sb.append(':');
                b(sb, entry.getValue());
            }
        } else if (obj instanceof String[]) {
            a(sb, Arrays.asList((String[]) obj));
        } else if (obj != null) {
            Assertion.p("Invalid type for message field.");
        }
    }

    public static String c(Object... objArr) {
        StringBuilder sb = new StringBuilder(1024);
        for (Object obj : objArr) {
            b(sb, obj);
            sb.append('\t');
        }
        if (objArr.length != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
