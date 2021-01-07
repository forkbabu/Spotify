package com.google.android.exoplayer2.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class b extends SQLiteOpenHelper implements a {
    public b(Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        throw r9;
     */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDowngrade(android.database.sqlite.SQLiteDatabase r9, int r10, int r11) {
        /*
            r8 = this;
            r10 = 2
            java.lang.String[] r2 = new java.lang.String[r10]
            r10 = 0
            java.lang.String r11 = "type"
            r2[r10] = r11
            r11 = 1
            java.lang.String r0 = "name"
            r2[r11] = r0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r1 = "sqlite_master"
            r0 = r9
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)
        L_0x0019:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r0.getString(r10)     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = r0.getString(r11)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "sqlite_sequence"
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0019
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r3.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "DROP "
            r3.append(r4)     // Catch:{ all -> 0x0068 }
            r3.append(r1)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = " IF EXISTS "
            r3.append(r1)     // Catch:{ all -> 0x0068 }
            r3.append(r2)     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0068 }
            r9.execSQL(r1)     // Catch:{ SQLException -> 0x004c }
            goto L_0x0019
        L_0x004c:
            r2 = move-exception
            java.lang.String r3 = "ExoDatabaseProvider"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error executing "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1, r2)
            goto L_0x0019
        L_0x0064:
            r0.close()
            return
        L_0x0068:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x006a }
        L_0x006a:
            r9 = move-exception
            if (r0 == 0) goto L_0x0070
            r0.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            goto L_0x0072
        L_0x0071:
            throw r9
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.database.b.onDowngrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
