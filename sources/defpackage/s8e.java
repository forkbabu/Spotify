package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: s8e  reason: default package */
public class s8e implements u8e {
    private final HashMap<String, List<Integer>> a = new HashMap<>();

    @Override // defpackage.u8e
    public boolean a(String str, o8e o8e) {
        if (!this.a.containsKey(str) || this.a.get(str) == null) {
            return true;
        }
        List<Integer> list = this.a.get(str);
        list.getClass();
        return list.contains(Integer.valueOf(o8e.id()));
    }

    @Override // defpackage.u8e
    public void b(String str, List<o8e> list) {
        ArrayList arrayList = new ArrayList();
        for (o8e o8e : list) {
            arrayList.add(Integer.valueOf(o8e.id()));
        }
        this.a.put(str, arrayList);
    }
}
