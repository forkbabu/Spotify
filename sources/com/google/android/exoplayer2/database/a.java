package com.google.android.exoplayer2.database;

import android.database.sqlite.SQLiteDatabase;

public interface a {
    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
