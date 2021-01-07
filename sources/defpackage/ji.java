package defpackage;

import android.database.Cursor;
import defpackage.li;

/* renamed from: ji  reason: default package */
final /* synthetic */ class ji implements li.b {
    private static final ji a = new ji();

    private ji() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        int i = li.o;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }
}
