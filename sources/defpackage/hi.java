package defpackage;

import android.database.Cursor;
import defpackage.li;

/* access modifiers changed from: package-private */
/* renamed from: hi  reason: default package */
public final /* synthetic */ class hi implements li.b {
    private static final hi a = new hi();

    private hi() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        int i = li.o;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }
}
