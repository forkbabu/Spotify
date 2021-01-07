package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: tqe  reason: default package */
public final class tqe {

    /* access modifiers changed from: private */
    /* renamed from: tqe$a */
    public static final class a {
        static final xpf a = ypf.d(tqe.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tqe$b */
    public interface b {
        List<String> a();
    }

    private tqe() {
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.x0("null not expected: ", str));
    }

    public static List<String> b(List<? extends b> list) {
        a(list, "validatables");
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            List<String> a2 = ((b) list.get(i)).a();
            if (!a2.isEmpty()) {
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                }
                Iterator<String> it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.format("[%d] %s", Integer.valueOf(i), it.next()));
                }
            }
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    public static <T> T c(T t, String str) {
        if (t == null) {
            xpf xpf = a.a;
            xpf.v("null not expected: " + str);
        }
        return t;
    }
}
