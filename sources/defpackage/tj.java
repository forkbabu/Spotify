package defpackage;

import defpackage.um;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: tj  reason: default package */
public final class tj {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean b(um umVar) {
        for (int i = 0; i < umVar.e(); i++) {
            um.b c2 = umVar.c(i);
            if (c2 instanceof ln) {
                ln lnVar = (ln) c2;
                if ("iTunSMPB".equals(lnVar.c) && a(lnVar.f)) {
                    return true;
                }
            } else if (c2 instanceof pn) {
                pn pnVar = (pn) c2;
                if ("com.apple.iTunes".equals(pnVar.b) && "iTunSMPB".equals(pnVar.c) && a(pnVar.f)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
