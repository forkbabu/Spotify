package defpackage;

import android.util.Base64;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.text.a;
import kotlin.text.e;
import org.json.JSONObject;

/* renamed from: nyc  reason: default package */
public final class nyc implements myc {
    private String a;
    private long b;
    private final cqe c;

    public nyc(cqe cqe) {
        h.e(cqe, "clock");
        this.c = cqe;
    }

    @Override // defpackage.myc
    public String a() {
        if (this.c.d() < this.b) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.myc
    public void b(String str) {
        h.e(str, "token");
        long d = this.c.d();
        List v = e.v(str, new char[]{'.'}, false, 0, 6, null);
        long j = 3600000;
        if (v.size() == 3) {
            byte[] decode = Base64.decode((String) v.get(1), 0);
            h.d(decode, "Base64.decode(payload, 0)");
            JSONObject jSONObject = new JSONObject(new String(decode, a.a));
            long optLong = jSONObject.optLong("exp");
            long optLong2 = jSONObject.optLong("iat");
            if (!(optLong == 0 || optLong2 == 0)) {
                j = 1000 * (optLong - optLong2);
            }
        }
        this.b = (d + j) - 60000;
        this.a = str;
    }
}
