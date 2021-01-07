package defpackage;

import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;

/* renamed from: u35  reason: default package */
public final class u35 implements l<k35, List<? extends p25>> {
    private final List<j25> b(List<g35> list) {
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (T t : list) {
            String c = t.c();
            String a = t.a();
            String b = t.b();
            if (b == null) {
                b = "";
            }
            arrayList.add(new j25(c, a, b));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [k25] */
    /* JADX WARN: Type inference failed for: r3v7, types: [w25] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.p25> apply(defpackage.k35 r26) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u35.apply(k35):java.util.List");
    }
}
