package defpackage;

import defpackage.dq1;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yp1  reason: default package */
public class yp1<T extends dq1> implements l<List<bq1<T>>, s<bq1<T>>> {
    private final y a;

    public yp1(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.l
    public Object apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        bq1 bq1 = (bq1) list.get(0);
        arrayList.add(z.z(list.get(0)).P());
        long b = bq1.b() - bq1.a();
        for (int i = 1; i < list.size(); i++) {
            arrayList.add(z.z(list.get(i)).i(b, TimeUnit.MILLISECONDS, this.a, false).P());
            b = ((bq1) list.get(i)).b();
        }
        return s.t(arrayList);
    }
}
