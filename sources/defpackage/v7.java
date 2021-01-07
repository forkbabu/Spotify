package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import androidx.room.i;
import defpackage.q7;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: v7  reason: default package */
public class v7 implements q7 {
    private final Context a;
    private final String b;
    private final q7.a c;
    private final boolean f;
    private final Object n = new Object();
    private a o;
    private boolean p;

    /* access modifiers changed from: package-private */
    /* renamed from: v7$a */
    public static class a extends SQLiteOpenHelper {
        final u7[] a;
        final q7.a b;
        private boolean c;

        /* renamed from: v7$a$a  reason: collision with other inner class name */
        class C0690a implements DatabaseErrorHandler {
            final /* synthetic */ q7.a a;
            final /* synthetic */ u7[] b;

            C0690a(q7.a aVar, u7[] u7VarArr) {
                this.a = aVar;
                this.b = u7VarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.b(a.b(this.b, sQLiteDatabase));
            }
        }

        a(Context context, String str, u7[] u7VarArr, q7.a aVar) {
            super(context, str, null, aVar.a, new C0690a(aVar, u7VarArr));
            this.b = aVar;
            this.a = u7VarArr;
        }

        static u7 b(u7[] u7VarArr, SQLiteDatabase sQLiteDatabase) {
            u7 u7Var = u7VarArr[0];
            if (u7Var == null || !u7Var.a(sQLiteDatabase)) {
                u7VarArr[0] = new u7(sQLiteDatabase);
            }
            return u7VarArr[0];
        }

        /* access modifiers changed from: package-private */
        public u7 a(SQLiteDatabase sQLiteDatabase) {
            return b(this.a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.a[0] = null;
        }

        /* access modifiers changed from: package-private */
        public synchronized p7 d() {
            this.c = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.c) {
                close();
                return d();
            }
            return a(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            q7.a aVar = this.b;
            b(this.a, sQLiteDatabase);
            ((i) aVar).getClass();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.b.c(b(this.a, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            ((i) this.b).e(b(this.a, sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.c) {
                this.b.d(b(this.a, sQLiteDatabase));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.e(b(this.a, sQLiteDatabase), i, i2);
        }
    }

    v7(Context context, String str, q7.a aVar, boolean z) {
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.f = z;
    }

    private a a() {
        a aVar;
        synchronized (this.n) {
            if (this.o == null) {
                u7[] u7VarArr = new u7[1];
                if (Build.VERSION.SDK_INT < 23 || this.b == null || !this.f) {
                    this.o = new a(this.a, this.b, u7VarArr, this.c);
                } else {
                    this.o = new a(this.a, new File(this.a.getNoBackupFilesDir(), this.b).getAbsolutePath(), u7VarArr, this.c);
                }
                this.o.setWriteAheadLoggingEnabled(this.p);
            }
            aVar = this.o;
        }
        return aVar;
    }

    @Override // defpackage.q7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // defpackage.q7
    public String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.q7
    public p7 getWritableDatabase() {
        return a().d();
    }

    @Override // defpackage.q7
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.n) {
            a aVar = this.o;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.p = z;
        }
    }
}
