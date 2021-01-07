package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: qf  reason: default package */
public class qf {
    private static volatile Integer a;

    private static int a(Context context) {
        long e = pf.e(context);
        if (e == -1) {
            ArrayList arrayList = new ArrayList();
            int d = pf.d();
            b(arrayList, d < 1 ? -1 : d == 1 ? 2008 : d <= 3 ? 2011 : 2012);
            long b = (long) pf.b();
            b(arrayList, b == -1 ? -1 : b <= 528000 ? 2008 : b <= 620000 ? 2009 : b <= 1020000 ? 2010 : b <= 1220000 ? 2011 : b <= 1520000 ? 2012 : b <= 2020000 ? 2013 : 2014);
            long e2 = pf.e(context);
            b(arrayList, e2 <= 0 ? -1 : e2 <= 201326592 ? 2008 : e2 <= 304087040 ? 2009 : e2 <= 536870912 ? 2010 : e2 <= 1073741824 ? 2011 : e2 <= 1610612736 ? 2012 : e2 <= 2147483648L ? 2013 : 2014);
            if (arrayList.isEmpty()) {
                return -1;
            }
            Collections.sort(arrayList);
            if ((arrayList.size() & 1) == 1) {
                return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
            }
            int size = (arrayList.size() / 2) - 1;
            return ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2) + ((Integer) arrayList.get(size)).intValue();
        } else if (e <= 805306368) {
            return pf.d() <= 1 ? 2009 : 2010;
        } else {
            if (e <= 1073741824) {
                if (pf.b() < 1300000) {
                    return 2011;
                }
                return 2012;
            } else if (e <= 1610612736) {
                if (pf.b() < 1800000) {
                    return 2012;
                }
                return 2013;
            } else if (e <= 2147483648L) {
                return 2013;
            } else {
                if (e <= 3221225472L) {
                    return 2014;
                }
                return e <= 5368709120L ? 2015 : 2016;
            }
        }
    }

    private static void b(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static int c(Context context) {
        if (a == null) {
            synchronized (qf.class) {
                if (a == null) {
                    a = Integer.valueOf(a(context));
                }
            }
        }
        return a.intValue();
    }
}
