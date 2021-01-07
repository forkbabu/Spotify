package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.ri;

/* renamed from: oi  reason: default package */
final /* synthetic */ class oi implements ri.a {
    private static final oi a = new oi();

    private oi() {
    }

    public static ri.a b() {
        return a;
    }

    @Override // defpackage.ri.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        int i = ri.q;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
