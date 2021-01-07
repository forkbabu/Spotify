package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collections;

public class l {
    private final ArrayList<Object> a;

    public l(int i) {
        this.a = new ArrayList<>(i);
    }

    public void a(Object obj) {
        this.a.add(obj);
    }

    public void b(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length > 0) {
            ArrayList<Object> arrayList = this.a;
            arrayList.ensureCapacity(arrayList.size() + objArr.length);
            Collections.addAll(this.a, objArr);
        }
    }

    public int c() {
        return this.a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.a.toArray(objArr);
    }
}
