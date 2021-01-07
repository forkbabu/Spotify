package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.a;
import com.google.android.exoplayer2.database.c;
import java.util.Iterator;
import java.util.Set;

final class h {
    private static final String[] c = {"name", "length", "last_touch_timestamp"};
    private final a a;
    private String b;

    public h(a aVar) {
        this.a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r0 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, com.google.android.exoplayer2.upstream.cache.g> a() {
        /*
            r9 = this;
            java.lang.String r0 = r9.b     // Catch:{ SQLException -> 0x004c }
            r0.getClass()     // Catch:{ SQLException -> 0x004c }
            com.google.android.exoplayer2.database.a r0 = r9.a     // Catch:{ SQLException -> 0x004c }
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()     // Catch:{ SQLException -> 0x004c }
            java.lang.String r2 = r9.b     // Catch:{ SQLException -> 0x004c }
            java.lang.String[] r3 = com.google.android.exoplayer2.upstream.cache.h.c     // Catch:{ SQLException -> 0x004c }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLException -> 0x004c }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0043 }
            int r2 = r0.getCount()     // Catch:{ all -> 0x0043 }
            r1.<init>(r2)     // Catch:{ all -> 0x0043 }
        L_0x0021:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x003f
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0043 }
            r3 = 1
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0043 }
            r5 = 2
            long r5 = r0.getLong(r5)     // Catch:{ all -> 0x0043 }
            com.google.android.exoplayer2.upstream.cache.g r7 = new com.google.android.exoplayer2.upstream.cache.g     // Catch:{ all -> 0x0043 }
            r7.<init>(r3, r5)     // Catch:{ all -> 0x0043 }
            r1.put(r2, r7)     // Catch:{ all -> 0x0043 }
            goto L_0x0021
        L_0x003f:
            r0.close()
            return r1
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r1
        L_0x004c:
            r0 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r1 = new com.google.android.exoplayer2.database.DatabaseIOException
            r1.<init>(r0)
            goto L_0x0054
        L_0x0053:
            throw r1
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.h.a():java.util.Map");
    }

    public void b(long j) {
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (c.a(this.a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    c.c(writableDatabase, 2, hexString, 1);
                    String str = this.b;
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    writableDatabase.execSQL("CREATE TABLE " + this.b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void c(String str) {
        this.b.getClass();
        try {
            this.a.getWritableDatabase().delete(this.b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void d(Set<String> set) {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void e(String str, long j, long j2) {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.b, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
