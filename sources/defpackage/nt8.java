package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.h;
import org.apache.commons.lang3.b;

/* renamed from: nt8  reason: default package */
public final class nt8 implements mt8 {
    private final DateFormat a;
    private final String b;

    public nt8(String str) {
        Locale locale;
        Locale locale2;
        h.e(str, "locale");
        this.b = str;
        int i = b.a;
        if (str.isEmpty()) {
            locale = new Locale("", "");
        } else if (!str.contains("#")) {
            int length = str.length();
            if (length >= 2) {
                if (str.charAt(0) != '_') {
                    String[] split = str.split("_", -1);
                    int length2 = split.length - 1;
                    if (length2 != 0) {
                        if (length2 != 1) {
                            if (length2 != 2 || !yif.v(split[0]) || (!(split[0].length() == 2 || split[0].length() == 3) || ((split[1].length() != 0 && (split[1].length() != 2 || !yif.w(split[1]))) || split[2].length() <= 0))) {
                                throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
                            }
                            locale = new Locale(split[0], split[1], split[2]);
                        } else if (!yif.v(split[0]) || !((split[0].length() == 2 || split[0].length() == 3) && split[1].length() == 2 && yif.w(split[1]))) {
                            throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
                        } else {
                            locale = new Locale(split[0], split[1]);
                        }
                    } else if (!yif.v(str) || !(length == 2 || length == 3)) {
                        throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
                    } else {
                        locale2 = new Locale(str);
                    }
                } else if (length >= 3) {
                    char charAt = str.charAt(1);
                    char charAt2 = str.charAt(2);
                    if (!Character.isUpperCase(charAt) || !Character.isUpperCase(charAt2)) {
                        throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
                    } else if (length == 3) {
                        locale2 = new Locale("", str.substring(1, 3));
                    } else if (length < 5) {
                        throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
                    } else if (str.charAt(3) == '_') {
                        locale2 = new Locale("", str.substring(1, 3), str.substring(4));
                    } else {
                        throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
                    }
                } else {
                    throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
                }
                locale = locale2;
            } else {
                throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
            }
        } else {
            throw new IllegalArgumentException(je.x0("Invalid locale format: ", str));
        }
        this.a = DateFormat.getDateInstance(2, locale);
    }

    @Override // defpackage.mt8
    public String a(int i) {
        String format = this.a.format(new Date(((long) i) * 1000));
        h.d(format, "formatter.format(Date(to…DS_TO_MILLIS_MULTIPLIER))");
        return format;
    }
}
