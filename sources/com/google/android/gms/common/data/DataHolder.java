package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends a implements Closeable {
    @RecentlyNonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new e();
    private final int a;
    private final String[] b;
    private Bundle c;
    private final CursorWindow[] f;
    private final int n;
    private final Bundle o;
    private int[] p;
    private int q;
    private boolean r = false;
    private boolean s = true;

    public static class zaa extends RuntimeException {
    }

    static {
        new ArrayList();
        new HashMap();
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.f = cursorWindowArr;
        this.n = i2;
        this.o = bundle;
    }

    private final void s2(String str, int i) {
        boolean z;
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        }
        synchronized (this) {
            z = this.r;
        }
        if (z) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.q) {
            throw new CursorIndexOutOfBoundsException(i, this.q);
        }
    }

    @RecentlyNonNull
    public final byte[] I1(@RecentlyNonNull String str, int i, int i2) {
        s2(str, i);
        return this.f[i2].getBlob(i, this.c.getInt(str));
    }

    public final int Q1(@RecentlyNonNull String str, int i, int i2) {
        s2(str, i);
        return this.f[i2].getInt(i, this.c.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.r) {
                this.r = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        boolean z;
        try {
            if (this.s && this.f.length > 0) {
                synchronized (this) {
                    z = this.r;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
        } finally {
            super.finalize();
        }
    }

    public final int getCount() {
        return this.q;
    }

    public final int o2() {
        return this.n;
    }

    @RecentlyNonNull
    public final String p2(@RecentlyNonNull String str, int i, int i2) {
        s2(str, i);
        return this.f[i2].getString(i, this.c.getInt(str));
    }

    public final int q2(int i) {
        int[] iArr;
        int i2 = 0;
        g.o(i >= 0 && i < this.q);
        while (true) {
            iArr = this.p;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == iArr.length ? i2 - 1 : i2;
    }

    public final void r2() {
        this.c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i2 >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i2], i2);
            i2++;
        }
        this.p = new int[this.f.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f;
            if (i < cursorWindowArr.length) {
                this.p[i] = i3;
                i3 += this.f[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.q = i3;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.U(parcel, 1, this.b, false);
        SafeParcelReader.W(parcel, 2, this.f, i, false);
        SafeParcelReader.M(parcel, 3, this.n);
        SafeParcelReader.E(parcel, 4, this.o, false);
        SafeParcelReader.M(parcel, Constants.ONE_SECOND, this.a);
        SafeParcelReader.m(parcel, a2);
        if ((i & 1) != 0) {
            close();
        }
    }
}
