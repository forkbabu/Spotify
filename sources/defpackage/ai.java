package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: ai  reason: default package */
final /* synthetic */ class ai implements li.d {
    private final SQLiteDatabase a;

    private ai(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public static li.d b(SQLiteDatabase sQLiteDatabase) {
        return new ai(sQLiteDatabase);
    }

    @Override // defpackage.li.d
    public Object a() {
        SQLiteDatabase sQLiteDatabase = this.a;
        int i = li.o;
        sQLiteDatabase.beginTransaction();
        return null;
    }
}
