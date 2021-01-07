package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.ri;

/* renamed from: pi  reason: default package */
final /* synthetic */ class pi implements ri.a {
    private static final pi a = new pi();

    private pi() {
    }

    public static ri.a b() {
        return a;
    }

    @Override // defpackage.ri.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        int i = ri.q;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
