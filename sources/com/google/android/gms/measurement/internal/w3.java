package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

public final class w3 extends d5 {
    private final v3 c = new v3(this, super.i(), "google_app_measurement_local.db");
    private boolean d;

    w3(f5 f5Var) {
        super(f5Var);
    }

    private static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j = query.getLong(0);
                query.close();
                return j;
            }
            query.close();
            return -1;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean D(int r17, byte[] r18) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w3.D(int, byte[]):boolean");
    }

    private final SQLiteDatabase K() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    /* JADX WARN: Incorrect args count in method signature: (I)Ljava/util/List<Lcom/google/android/gms/common/internal/safeparcel/a;>; */
    /* JADX INFO: finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ab, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01af, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b4, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a5, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01aa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c1 A[SYNTHETIC, Splitter:B:114:0x01c1] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x020f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x020f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x020f A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List C() {
        /*
        // Method dump skipped, instructions count: 561
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w3.C():java.util.List");
    }

    public final boolean E(r rVar) {
        Parcel obtain = Parcel.obtain();
        rVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(0, marshall);
        }
        super.l().F().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean F(y9 y9Var) {
        Parcel obtain = Parcel.obtain();
        y9Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return D(1, marshall);
        }
        super.l().F().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean G(oa oaVar) {
        super.f();
        byte[] i0 = z9.i0(oaVar);
        if (i0.length <= 131072) {
            return D(2, i0);
        }
        super.l().F().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final void H() {
        super.b();
        try {
            int delete = K().delete("messages", null, null) + 0;
            if (delete > 0) {
                super.l().M().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            super.l().E().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    public final boolean J() {
        super.b();
        if (this.d || !super.i().getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase K = K();
                if (K == null) {
                    this.d = true;
                    if (K != null) {
                        K.close();
                    }
                    return false;
                }
                K.beginTransaction();
                K.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                K.setTransactionSuccessful();
                K.endTransaction();
                K.close();
                return true;
            } catch (SQLiteFullException e) {
                super.l().E().b("Error deleting app launch break from local database", e);
                this.d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteException e2) {
                if (0 != 0) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                super.l().E().b("Error deleting app launch break from local database", e2);
                this.d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        super.l().H().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.d5
    public final boolean z() {
        return false;
    }
}
