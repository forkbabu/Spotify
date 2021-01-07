package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jd3  reason: default package */
public class jd3 {
    private final od3 a;
    private final nd3 b;

    public jd3(od3 od3, nd3 nd3) {
        this.a = od3;
        this.b = nd3;
    }

    public b91 a(b91 b91, qd3 qd3) {
        if (b91.body().isEmpty()) {
            return b91;
        }
        List<? extends s81> body = b91.body();
        ArrayList arrayList = new ArrayList(body.size());
        for (s81 s81 : body) {
            od3 od3 = this.a;
            nd3 nd3 = this.b;
            if (((Boolean) od3.apply(s81)).booleanValue()) {
                s81 = (s81) nd3.apply(s81);
            }
            arrayList.add(s81);
        }
        return je.L(b91, arrayList);
    }
}
