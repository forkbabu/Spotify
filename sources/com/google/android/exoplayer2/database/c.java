package com.google.android.exoplayer2.database;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class c {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r11 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.database.sqlite.SQLiteDatabase r11, int r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "ExoPlayerVersions"
            boolean r0 = d(r11, r0)     // Catch:{ SQLException -> 0x0047 }
            r1 = -1
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r3 = "ExoPlayerVersions"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLException -> 0x0047 }
            java.lang.String r2 = "version"
            r10 = 0
            r4[r10] = r2     // Catch:{ SQLException -> 0x0047 }
            java.lang.String r5 = "feature = ? AND instance_uid = ?"
            r2 = 2
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x0047 }
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ SQLException -> 0x0047 }
            r6[r10] = r12     // Catch:{ SQLException -> 0x0047 }
            r6[r0] = r13     // Catch:{ SQLException -> 0x0047 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x0047 }
            int r12 = r11.getCount()     // Catch:{ all -> 0x003e }
            if (r12 != 0) goto L_0x0033
            r11.close()
            return r1
        L_0x0033:
            r11.moveToNext()
            int r12 = r11.getInt(r10)
            r11.close()
            return r12
        L_0x003e:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r12 = move-exception
            if (r11 == 0) goto L_0x0046
            r11.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r12
        L_0x0047:
            r11 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r12 = new com.google.android.exoplayer2.database.DatabaseIOException
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.database.c.a(android.database.sqlite.SQLiteDatabase, int, java.lang.String):int");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            if (d(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str});
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    static boolean d(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }
}
