package com.spotify.mobile.android.service.media.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.image.provider.c;
import com.spotify.remoteconfig.z4;
import dagger.android.a;
import dagger.android.e;
import defpackage.trd;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MediaProvider extends e {
    private urd a;
    private Executor b;
    ov9 c;
    ajf<urd> f;
    c n;
    z4 o;

    private boolean a(Context context) {
        if (this.a == null) {
            this.a = this.f.get();
        }
        int callingUid = Binder.getCallingUid();
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            String name = getClass().getName();
            for (String str : packagesForUid) {
                urd urd = this.a;
                trd.a a2 = trd.a();
                a2.b(str);
                a2.c(callingUid);
                a2.d(name);
                if (urd.a(context, a2.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String[] getStreamTypes(Uri uri, String str) {
        this.n.getClass();
        return new String[]{"image/png"};
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
        a.d(this);
        MoreObjects.checkArgument(true);
        this.c.a();
        this.b = Executors.newFixedThreadPool(5);
        return true;
    }

    @Override // android.content.ContentProvider
    public synchronized ParcelFileDescriptor openFile(Uri uri, String str) {
        Logger.g("MediaProvider opening file.", new Object[0]);
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (!a(context)) {
            return super.openFile(uri, str);
        }
        boolean a2 = this.o.a();
        Optional<Executor> absent = a2 ? Optional.absent() : Optional.of(this.b);
        if (!a2 || Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return this.n.b(uri, context.getCacheDir(), absent);
        }
        throw new IllegalStateException("Image loading should not happen on the main thread.");
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
