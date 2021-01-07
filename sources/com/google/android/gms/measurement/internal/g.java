package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class g {
    static pa a;

    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(je.j0(je.N0(str, 22), "SELECT * FROM ", str, " LIMIT 0"), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    static void b(a4 a4Var, SQLiteDatabase sQLiteDatabase) {
        if (a4Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                a4Var.H().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                a4Var.H().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                a4Var.H().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                a4Var.H().a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    static void c(a4 a4Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean z;
        if (a4Var != null) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                z = cursor.moveToFirst();
                cursor.close();
            } catch (SQLiteException e) {
                a4Var.H().c("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                z = false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (!z) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> a2 = a(sQLiteDatabase, str);
                String[] split = str3.split(",");
                for (String str4 : split) {
                    if (!((HashSet) a2).remove(str4)) {
                        StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb.append("Table ");
                        sb.append(str);
                        sb.append(" is missing required column: ");
                        sb.append(str4);
                        throw new SQLiteException(sb.toString());
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!((HashSet) a2).remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (!((HashSet) a2).isEmpty()) {
                    a4Var.H().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a2));
                }
            } catch (SQLiteException e2) {
                a4Var.E().b("Failed to verify columns on table that was just created", str);
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }
}
