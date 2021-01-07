package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;

/* renamed from: u7  reason: default package */
class u7 implements p7 {
    private static final String[] b = new String[0];
    private final SQLiteDatabase a;

    /* access modifiers changed from: package-private */
    /* renamed from: u7$a */
    public class a implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ s7 a;

        a(u7 u7Var, s7 s7Var) {
            this.a = s7Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new x7(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: u7$b */
    class b implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ s7 a;

        b(u7 u7Var, s7 s7Var) {
            this.a = s7Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new x7(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    u7(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.p7
    public void A(String str) {
        this.a.execSQL(str);
    }

    @Override // defpackage.p7
    public Cursor D1(String str) {
        return w0(new o7(str));
    }

    @Override // defpackage.p7
    public Cursor N(s7 s7Var, CancellationSignal cancellationSignal) {
        return this.a.rawQueryWithFactory(new b(this, s7Var), s7Var.a(), b, null, cancellationSignal);
    }

    @Override // defpackage.p7
    public boolean S1() {
        return this.a.inTransaction();
    }

    @Override // defpackage.p7
    public void Y() {
        this.a.setTransactionSuccessful();
    }

    /* access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.a == sQLiteDatabase;
    }

    @Override // defpackage.p7
    public void a0(String str, Object[] objArr) {
        this.a.execSQL(str, objArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.p7
    public t7 e1(String str) {
        return new y7(this.a.compileStatement(str));
    }

    @Override // defpackage.p7
    public void i0() {
        this.a.endTransaction();
    }

    @Override // defpackage.p7
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.p7
    public String o() {
        return this.a.getPath();
    }

    @Override // defpackage.p7
    public void t() {
        this.a.beginTransaction();
    }

    @Override // defpackage.p7
    public Cursor w0(s7 s7Var) {
        return this.a.rawQueryWithFactory(new a(this, s7Var), s7Var.a(), b, null);
    }

    @Override // defpackage.p7
    public List<Pair<String, String>> z() {
        return this.a.getAttachedDbs();
    }
}
