package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: kzd  reason: default package */
class kzd implements mzd {
    private final long a;
    private final String b;
    private final List<Pattern> c;

    kzd(String str, List<Pattern> list, long j) {
        this.b = str;
        this.c = list;
        this.a = j;
    }

    @Override // defpackage.mzd
    public boolean a(String str, String str2) {
        boolean z;
        if (!this.b.equals(str2.toUpperCase(Locale.US))) {
            return false;
        }
        Iterator<Pattern> it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().matcher(str).matches()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mzd
    public boolean b(String str, long j) {
        return this.b.equals(str.toUpperCase(Locale.US)) && j > this.a;
    }
}
