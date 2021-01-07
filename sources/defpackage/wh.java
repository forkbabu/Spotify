package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: wh  reason: default package */
final /* synthetic */ class wh implements li.b {
    private final long a;

    private wh(long j) {
        this.a = j;
    }

    public static li.b a(long j) {
        return new wh(j);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        long j = this.a;
        int i = li.o;
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(j)}));
    }
}
