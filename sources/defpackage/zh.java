package defpackage;

import android.database.Cursor;
import defpackage.li;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: zh  reason: default package */
public final /* synthetic */ class zh implements li.b {
    private final Map a;

    private zh(Map map) {
        this.a = map;
    }

    public static li.b a(Map map) {
        return new zh(map);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        Map map = this.a;
        Cursor cursor = (Cursor) obj;
        int i = li.o;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new li.c(cursor.getString(1), cursor.getString(2), null));
        }
        return null;
    }
}
