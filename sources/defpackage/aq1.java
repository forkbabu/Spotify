package defpackage;

import com.spotify.base.java.logging.Logger;
import defpackage.dq1;
import io.reactivex.functions.c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aq1  reason: default package */
public class aq1<T extends dq1> implements c<cq1, List<T>, List<bq1<T>>> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public Object a(cq1 cq1, Object obj) {
        long j;
        long j2;
        cq1 cq12 = cq1;
        List list = (List) obj;
        boolean z = cq12.a() && !cq12.c() && cq12.b() == 1.0d;
        int e = (int) cq12.e();
        int i = 0;
        while (true) {
            if (i < list.size()) {
                if (((dq1) list.get(i)).getTimestampMillis() == e) {
                    break;
                } else if (((dq1) list.get(i)).getTimestampMillis() > e) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = list.size();
                break;
            }
        }
        i--;
        int size = z ? list.size() : i + 1;
        Logger.b("Annotations Player: Target annotation for position(%s) is at index: %s", Integer.valueOf(e), Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(size - i);
        if (e == 0) {
            j = 0;
        } else {
            j = (long) (e - ((dq1) list.get(i)).getTimestampMillis());
        }
        long j3 = j;
        while (i < size) {
            long timestampMillis = (long) ((dq1) list.get(i)).getTimestampMillis();
            int i2 = i + 1;
            if (i2 < list.size()) {
                j2 = (long) ((dq1) list.get(i2)).getTimestampMillis();
            } else {
                j2 = cq12.d();
            }
            arrayList.add(new bq1((dq1) list.get(i), j3, j2 - timestampMillis, z));
            i = i2;
            j3 = 0;
        }
        return arrayList;
    }
}
