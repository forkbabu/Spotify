package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: ri  reason: default package */
public final class ri extends SQLiteOpenHelper {
    private static final a c;
    private static final a f;
    private static final a n;
    private static final a o;
    private static final List<a> p;
    public static final /* synthetic */ int q = 0;
    private final int a;
    private boolean b = false;

    /* renamed from: ri$a */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a b2 = ni.b();
        c = b2;
        a b3 = oi.b();
        f = b3;
        a b4 = pi.b();
        n = b4;
        a b5 = qi.b();
        o = b5;
        p = Arrays.asList(b2, b3, b4, b5);
    }

    ri(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.a = i;
    }

    private void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<a> list = p;
        if (i2 <= list.size()) {
            while (i < i2) {
                p.get(i).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder X0 = je.X0("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        X0.append(list.size());
        X0.append(" migrations are provided");
        throw new IllegalArgumentException(X0.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        int i = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i, i2);
    }
}
