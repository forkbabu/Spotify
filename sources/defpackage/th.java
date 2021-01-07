package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: th  reason: default package */
final /* synthetic */ class th implements li.b {
    private final long a;
    private final tg b;

    private th(long j, tg tgVar) {
        this.a = j;
        this.b = tgVar;
    }

    public static li.b a(long j, tg tgVar) {
        return new th(j, tgVar);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        long j = this.a;
        tg tgVar = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = li.o;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{tgVar.b(), String.valueOf(yi.a(tgVar.d()))}) < 1) {
            contentValues.put("backend_name", tgVar.b());
            contentValues.put("priority", Integer.valueOf(yi.a(tgVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
