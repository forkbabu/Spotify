package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

public class j extends ContentProvider {
    private static final String a = j.class.getName();
    public static final /* synthetic */ int b = 0;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair pair;
        try {
            String[] split = uri.getPath().substring(1).split("/");
            String str2 = split[0];
            String str3 = split[1];
            if ("..".contentEquals(str2) || "..".contentEquals(str3)) {
                throw new Exception();
            }
            pair = new Pair(UUID.fromString(str2), str3);
            if (pair != null) {
                try {
                    File h = z.h((UUID) pair.first, (String) pair.second);
                    if (h != null) {
                        return ParcelFileDescriptor.open(h, 268435456);
                    }
                    throw new FileNotFoundException();
                } catch (FileNotFoundException e) {
                    String str4 = a;
                    Log.e(str4, "Got unexpected exception:" + e);
                    throw e;
                }
            } else {
                throw new FileNotFoundException();
            }
        } catch (Exception unused) {
            pair = null;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
