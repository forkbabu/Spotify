package androidx.room;

import android.database.Cursor;
import defpackage.q7;
import java.util.List;

public class i extends q7.a {
    private a b;
    private final a c;
    private final String d;
    private final String e;

    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        /* access modifiers changed from: protected */
        public abstract void a(p7 p7Var);

        /* access modifiers changed from: protected */
        public abstract void b(p7 p7Var);

        /* access modifiers changed from: protected */
        public abstract void c(p7 p7Var);

        /* access modifiers changed from: protected */
        public abstract void d(p7 p7Var);

        /* access modifiers changed from: protected */
        public abstract void e(p7 p7Var);

        /* access modifiers changed from: protected */
        public abstract void f(p7 p7Var);

        /* access modifiers changed from: protected */
        public abstract b g(p7 p7Var);
    }

    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public i(a aVar, a aVar2, String str, String str2) {
        super(aVar2.a);
        this.b = aVar;
        this.c = aVar2;
        this.d = str;
        this.e = str2;
    }

    private void f(p7 p7Var) {
        p7Var.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.d;
        p7Var.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.q7.a
    public void c(p7 p7Var) {
        Cursor D1 = p7Var.D1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (D1.moveToFirst() && D1.getInt(0) == 0) {
                z = true;
            }
            D1.close();
            this.c.a(p7Var);
            if (!z) {
                b g = this.c.g(p7Var);
                if (!g.a) {
                    StringBuilder V0 = je.V0("Pre-packaged database has an invalid schema: ");
                    V0.append(g.b);
                    throw new IllegalStateException(V0.toString());
                }
            }
            f(p7Var);
            this.c.c(p7Var);
        } catch (Throwable th) {
            D1.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.q7.a
    public void d(p7 p7Var) {
        Cursor D1 = p7Var.D1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = D1.moveToFirst() && D1.getInt(0) != 0;
            D1.close();
            if (z) {
                Cursor w0 = p7Var.w0(new o7("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = w0.moveToFirst() ? w0.getString(0) : null;
                    w0.close();
                    if (!this.d.equals(string) && !this.e.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    w0.close();
                    throw th;
                }
            } else {
                b g = this.c.g(p7Var);
                if (g.a) {
                    this.c.e(p7Var);
                    f(p7Var);
                } else {
                    StringBuilder V0 = je.V0("Pre-packaged database has an invalid schema: ");
                    V0.append(g.b);
                    throw new IllegalStateException(V0.toString());
                }
            }
            this.c.d(p7Var);
            this.b = null;
        } catch (Throwable th2) {
            D1.close();
            throw th2;
        }
    }

    @Override // defpackage.q7.a
    public void e(p7 p7Var, int i, int i2) {
        boolean z;
        List<j7> b2;
        a aVar = this.b;
        if (aVar == null || (b2 = aVar.d.b(i, i2)) == null) {
            z = false;
        } else {
            this.c.f(p7Var);
            for (j7 j7Var : b2) {
                j7Var.a(p7Var);
            }
            b g = this.c.g(p7Var);
            if (g.a) {
                this.c.e(p7Var);
                f(p7Var);
                z = true;
            } else {
                StringBuilder V0 = je.V0("Migration didn't properly handle: ");
                V0.append(g.b);
                throw new IllegalStateException(V0.toString());
            }
        }
        if (!z) {
            a aVar2 = this.b;
            if (aVar2 == null || aVar2.a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.c.b(p7Var);
            this.c.a(p7Var);
        }
    }
}
