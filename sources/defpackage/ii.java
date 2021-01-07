package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: ii  reason: default package */
final /* synthetic */ class ii implements li.b {
    private final String a;

    private ii(String str) {
        this.a = str;
    }

    public static li.b a(String str) {
        return new ii(str);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        String str = this.a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = li.o;
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }
}
