package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.ri;

/* renamed from: qi  reason: default package */
final /* synthetic */ class qi implements ri.a {
    private static final qi a = new qi();

    private qi() {
    }

    public static ri.a b() {
        return a;
    }

    @Override // defpackage.ri.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        int i = ri.q;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
