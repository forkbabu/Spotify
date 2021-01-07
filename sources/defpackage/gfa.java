package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gfa  reason: default package */
public class gfa implements efa {
    private final Map<String, b91> a = new HashMap(30);
    private final List<String> b = new ArrayList(30);

    @Override // defpackage.efa
    public b91 a(String str) {
        z42.a("Not called on main looper");
        str.getClass();
        Iterator<String> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                it.remove();
            }
        }
        return this.a.remove(str);
    }

    @Override // defpackage.efa
    public void b(String str, b91 b91) {
        z42.a("Not called on main looper");
        b91.getClass();
        str.getClass();
        if (this.a.size() >= 30) {
            this.a.remove(this.b.remove(0));
        }
        this.a.put(str, b91);
        this.b.add(str);
    }
}
