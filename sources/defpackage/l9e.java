package defpackage;

import android.content.Context;
import android.os.Build;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l9e  reason: default package */
public class l9e {
    private final Context a;
    private final o9e b;

    public l9e(Context context, o9e o9e) {
        this.a = context;
        this.b = o9e;
    }

    public z<List<o8e>> a(String str, List<o8e> list) {
        return this.b.a(q9e.create(str, Build.VERSION.RELEASE, "android")).A(new k9e(this, list));
    }

    public List b(List list, u9e u9e) {
        List<t9e> destinations = u9e.destinations();
        ArrayList arrayList = new ArrayList();
        for (t9e t9e : destinations) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o8e o8e = (o8e) it.next();
                if (this.a.getString(o8e.a()).equals(t9e.id())) {
                    arrayList.add(o8e);
                    break;
                }
            }
        }
        return arrayList;
    }
}
