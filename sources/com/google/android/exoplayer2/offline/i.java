package com.google.android.exoplayer2.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.c;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.ArrayList;
import java.util.List;

public final class i implements y {
    private static final String c = g(3, 4);
    private static final String[] d = {"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"};
    private final com.google.android.exoplayer2.database.a a;
    private boolean b;

    /* access modifiers changed from: private */
    public static final class b implements m {
        private final Cursor a;

        b(Cursor cursor, a aVar) {
            this.a = cursor;
        }

        @Override // com.google.android.exoplayer2.offline.m
        public k D0() {
            return i.e(this.a);
        }

        @Override // com.google.android.exoplayer2.offline.m
        public /* synthetic */ boolean V1() {
            return l.a(this);
        }

        public int a() {
            return this.a.getPosition();
        }

        public boolean b(int i) {
            return this.a.moveToPosition(i);
        }

        @Override // com.google.android.exoplayer2.offline.m, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }
    }

    public i(com.google.android.exoplayer2.database.a aVar) {
        this.a = aVar;
    }

    private void b() {
        if (!this.b) {
            try {
                if (c.a(this.a.getReadableDatabase(), 0, "") != 2) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        c.c(writableDatabase, 0, "", 2);
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,title TEXT NOT NULL,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                this.b = true;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }
    }

    private Cursor c(String str, String[] strArr) {
        try {
            return this.a.getReadableDatabase().query("ExoPlayerDownloads", d, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* access modifiers changed from: private */
    public static k e(Cursor cursor) {
        String string = cursor.getString(0);
        char c2 = 1;
        String string2 = cursor.getString(1);
        Uri parse = Uri.parse(cursor.getString(2));
        String string3 = cursor.getString(3);
        ArrayList arrayList = new ArrayList();
        if (!string3.isEmpty()) {
            int i = f0.a;
            String[] split = string3.split(",", -1);
            int length = split.length;
            int i2 = 0;
            while (i2 < length) {
                String[] M = f0.M(split[i2], "\\.");
                g.m(M.length == 3);
                arrayList.add(new x(Integer.parseInt(M[0]), Integer.parseInt(M[c2]), Integer.parseInt(M[2])));
                i2++;
                c2 = 1;
            }
        }
        DownloadRequest downloadRequest = new DownloadRequest(string, string2, parse, arrayList, cursor.getString(4), cursor.getBlob(5));
        p pVar = new p();
        pVar.a = cursor.getLong(13);
        pVar.b = cursor.getFloat(12);
        int i3 = cursor.getInt(6);
        return new k(downloadRequest, i3, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i3 == 4 ? cursor.getInt(11) : 0, pVar);
    }

    private static String g(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder Z0 = je.Z0("state", " IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                Z0.append(',');
            }
            Z0.append(iArr[i]);
        }
        Z0.append(')');
        return Z0.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r4 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.offline.k d(java.lang.String r4) {
        /*
            r3 = this;
            r3.b()
            java.lang.String r0 = "id = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x002e }
            r2 = 0
            r1[r2] = r4     // Catch:{ SQLiteException -> 0x002e }
            android.database.Cursor r4 = r3.c(r0, r1)     // Catch:{ SQLiteException -> 0x002e }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001a
            r0 = 0
            r4.close()
            return r0
        L_0x001a:
            r4.moveToNext()
            com.google.android.exoplayer2.offline.k r0 = e(r4)
            r4.close()
            return r0
        L_0x0025:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            if (r4 == 0) goto L_0x002d
            r4.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0
        L_0x002e:
            r4 = move-exception
            com.google.android.exoplayer2.database.DatabaseIOException r0 = new com.google.android.exoplayer2.database.DatabaseIOException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.i.d(java.lang.String):com.google.android.exoplayer2.offline.k");
    }

    public m f(int... iArr) {
        b();
        return new b(c(g(iArr), null), null);
    }

    public void h(k kVar) {
        b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kVar.a.a);
        contentValues.put("title", kVar.a.b);
        contentValues.put("uri", kVar.a.c.toString());
        List<x> list = kVar.a.f;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            x xVar = list.get(i);
            sb.append(xVar.a);
            sb.append('.');
            sb.append(xVar.b);
            sb.append('.');
            sb.append(xVar.c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", kVar.a.n);
        contentValues.put("data", kVar.a.o);
        contentValues.put("state", Integer.valueOf(kVar.b));
        contentValues.put("start_time_ms", Long.valueOf(kVar.c));
        contentValues.put("update_time_ms", Long.valueOf(kVar.d));
        contentValues.put("content_length", Long.valueOf(kVar.e));
        contentValues.put("stop_reason", Integer.valueOf(kVar.f));
        contentValues.put("failure_reason", Integer.valueOf(kVar.g));
        contentValues.put("percent_downloaded", Float.valueOf(kVar.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(kVar.h.a));
        try {
            this.a.getWritableDatabase().replaceOrThrow("ExoPlayerDownloads", null, contentValues);
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void i(String str) {
        b();
        try {
            this.a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void j() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void k() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void l(int i) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, c, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void m(String str, int i) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.update("ExoPlayerDownloads", contentValues, c + " AND id = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
