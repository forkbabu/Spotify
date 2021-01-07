package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: y7  reason: default package */
class y7 extends x7 implements t7 {
    private final SQLiteStatement b;

    y7(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    @Override // defpackage.t7
    public int E() {
        return this.b.executeUpdateDelete();
    }

    @Override // defpackage.t7
    public long P0() {
        return this.b.executeInsert();
    }
}
