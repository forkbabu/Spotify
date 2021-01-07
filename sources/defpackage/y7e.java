package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y7e  reason: default package */
public final class y7e implements fjf<List<String>> {
    private final wlf<Context> a;

    public y7e(wlf<Context> wlf) {
        this.a = wlf;
    }

    public static List<String> a(Context context) {
        List<Integer> list = v7e.a;
        ArrayList arrayList = new ArrayList(list.size());
        for (Integer num : list) {
            arrayList.add(context.getString(num.intValue()));
        }
        return arrayList;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
