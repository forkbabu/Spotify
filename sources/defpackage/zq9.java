package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: zq9  reason: default package */
public final class zq9 {
    public static final String a(s81 s81) {
        p81 data;
        String string;
        h.e(s81, "model");
        String string2 = s81.metadata().string("uri");
        boolean z = true;
        if (string2 != null) {
            if (string2.length() > 0) {
                return string2;
            }
        }
        String string3 = s81.logging().string("ui:uri");
        if (string3 != null) {
            if (string3.length() > 0) {
                return string3;
            }
        }
        o81 o81 = (o81) s81.events().get("click");
        if (o81 == null || (data = o81.data()) == null || (string = data.string("uri")) == null) {
            return "";
        }
        if (string.length() <= 0) {
            z = false;
        }
        return z ? string : "";
    }
}
