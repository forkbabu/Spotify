package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: q60  reason: default package */
public abstract class q60 extends ContentProvider {
    /* access modifiers changed from: protected */
    public abstract void a(Context context, int[] iArr);

    /* access modifiers changed from: protected */
    public abstract void b(Context context, int[] iArr);

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ((r10.flags & 129) != 0) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    @Override // android.content.ContentProvider
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(@android.support.annotation.NonNull java.lang.String r9, @android.support.annotation.Nullable java.lang.String r10, @android.support.annotation.Nullable android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /* access modifiers changed from: protected */
    public abstract void e(Context context, o60 o60, int i, y60 y60);

    /* access modifiers changed from: protected */
    public abstract void f(Context context, o60 o60, int[] iArr);

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
