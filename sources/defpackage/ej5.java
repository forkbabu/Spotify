package defpackage;

import com.google.common.base.MoreObjects;
import defpackage.p81;
import java.util.List;

/* renamed from: ej5  reason: default package */
public final class ej5 {
    public static p81 a(String str, int i, String str2, String str3) {
        p81.a a = z81.a();
        if (!MoreObjects.isNullOrEmpty(str)) {
            a = a.p("ui:group", str);
        }
        if (i >= 0) {
            a = a.j("ui:index_in_block", i);
        }
        if (!MoreObjects.isNullOrEmpty(str2)) {
            a = a.p("ui:source", str2);
        }
        if (!MoreObjects.isNullOrEmpty(str3)) {
            a = a.p("ui:uri", str3);
        }
        return a.d();
    }

    public static boolean b(p81 p81, List<? extends s81> list) {
        if (p81.boolValue("cached", false)) {
            return true;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                i = -1;
                break;
            } else if (!MoreObjects.isNullOrEmpty(((s81) list.get(i)).logging().string("ui:source", ""))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 || !((s81) list.get(i)).logging().string("ui:source", "").contains("-cached")) {
            return false;
        }
        return true;
    }

    public static fj5 c(hha hha) {
        return new fj5(hha);
    }
}
