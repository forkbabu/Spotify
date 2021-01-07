package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: dd9  reason: default package */
public final class dd9 {
    public static String a(List<fb9> list, boolean z) {
        String str;
        int i = 0;
        StringBuilder sb = new StringBuilder(0);
        if (list != null && !list.isEmpty()) {
            Iterator<fb9> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    break;
                }
                fb9 next = it.next();
                if (next.c()) {
                    str = "objective:" + next.b().toLowerCase(Locale.getDefault()).replace(' ', '-') + ':' + i;
                    break;
                }
                i++;
            }
            sb.append(str);
        }
        if (z) {
            if (!sb.toString().isEmpty()) {
                sb.append(',');
            }
            sb.append("text-filter");
        }
        return sb.toString();
    }
}
