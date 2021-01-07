package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: u8  reason: default package */
public final class u8 {
    private final List<m8> a;

    u8(List<m8> list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }

    public List<m8> a() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("WindowLayoutInfo{ DisplayFeatures[");
        for (int i = 0; i < this.a.size(); i++) {
            V0.append(this.a.get(i));
            if (i < this.a.size() - 1) {
                V0.append(", ");
            }
        }
        V0.append("] }");
        return V0.toString();
    }
}
