package defpackage;

import com.google.common.collect.ImmutableList;
import java.sql.Date;
import java.util.List;

/* renamed from: izd  reason: default package */
public class izd implements mzd {
    private static final long b = Date.valueOf("2020-03-06").getTime();
    private static final long c = Date.valueOf("2020-03-13").getTime();
    private static final long d = Date.valueOf("2020-03-13").getTime();
    private final List<mzd> a = ImmutableList.of(new kzd("US", lzd.c, b), new kzd("DE", lzd.a, c), new kzd("IT", lzd.b, d));

    izd() {
    }

    @Override // defpackage.mzd
    public boolean a(String str, String str2) {
        for (mzd mzd : this.a) {
            if (mzd.a(str2, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mzd
    public boolean b(String str, long j) {
        for (mzd mzd : this.a) {
            if (mzd.b(str, j)) {
                return true;
            }
        }
        return false;
    }
}
