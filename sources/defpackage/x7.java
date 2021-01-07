package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: x7  reason: default package */
class x7 implements r7 {
    private final SQLiteProgram a;

    x7(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.r7
    public void H(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.r7
    public void O1(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.r7
    public void a1(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.r7
    public void t1(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.r7
    public void y1(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}
