package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: tf5  reason: default package */
public class tf5 {
    private static int a(s81 s81) {
        if (s81 != null) {
            return Arrays.hashCode(new Object[]{s81.componentId(), s81.text(), s81.images(), s81.metadata(), s81.logging(), s81.custom(), s81.id(), s81.events(), Integer.valueOf(b(s81.children()))});
        }
        return 0;
    }

    private static int b(List<? extends s81> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (s81 s81 : list) {
            arrayList.add(Integer.valueOf(a(s81)));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }

    public int c(b91 b91) {
        if (b91 != null) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(a(b91.header())), Integer.valueOf(b(b91.body())), Integer.valueOf(b(b91.overlays())), Integer.valueOf(Arrays.hashCode(new Object[]{b91.custom()}))});
        }
        return 0;
    }
}
