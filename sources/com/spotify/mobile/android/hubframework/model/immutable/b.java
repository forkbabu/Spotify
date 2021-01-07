package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import defpackage.p81;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.h;

public final class b extends HubsImmutableComponentBundle.d {
    private final Bundle a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    b(HubsImmutableComponentBundle.c cVar) {
        this.a = new Bundle(cVar.s());
    }

    @Override // defpackage.p81.a
    public p81.a b(String str, boolean z) {
        h.e(str, "key");
        this.a.putBoolean(str, z);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a c(String str, boolean[] zArr) {
        h.e(str, "key");
        this.a.putBooleanArray(str, zArr);
        return this;
    }

    @Override // defpackage.p81.a
    public p81 d() {
        return HubsImmutableComponentBundle.b.a(HubsImmutableComponentBundle.Companion, new Bundle(this.a));
    }

    @Override // defpackage.p81.a
    public p81.a e(String str, p81 p81) {
        h.e(str, "key");
        this.a.putParcelable(str, HubsImmutableComponentBundle.Companion.c(p81));
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a f(String str, p81[] p81Arr) {
        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr;
        h.e(str, "key");
        if (p81Arr != null && (p81Arr instanceof HubsImmutableComponentBundle[])) {
            ArrayList arrayList = new ArrayList(p81Arr.length);
            for (p81 p81 : p81Arr) {
                if (p81 != null) {
                    arrayList.add((HubsImmutableComponentBundle) p81);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle");
                }
            }
            Object[] array = arrayList.toArray(new HubsImmutableComponentBundle[0]);
            if (array != null) {
                hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) array;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else if (p81Arr != null) {
            ArrayList arrayList2 = new ArrayList(p81Arr.length);
            for (p81 p812 : p81Arr) {
                arrayList2.add(HubsImmutableComponentBundle.Companion.c(p812));
            }
            Object[] array2 = arrayList2.toArray(new HubsImmutableComponentBundle[0]);
            if (array2 != null) {
                hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) array2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            hubsImmutableComponentBundleArr = null;
        }
        this.a.putParcelableArray(str, hubsImmutableComponentBundleArr);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a g(String str, double[] dArr) {
        h.e(str, "key");
        this.a.putDoubleArray(str, dArr);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a h(String str, double d) {
        h.e(str, "key");
        this.a.putDouble(str, d);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a i(String str, float f) {
        h.e(str, "key");
        this.a.putFloat(str, f);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a j(String str, int i) {
        h.e(str, "key");
        this.a.putInt(str, i);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a k(String str, int[] iArr) {
        h.e(str, "key");
        this.a.putIntArray(str, iArr);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a l(String str, long[] jArr) {
        h.e(str, "key");
        this.a.putLongArray(str, jArr);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a m(String str, long j) {
        h.e(str, "key");
        this.a.putLong(str, j);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a n(String str, Parcelable parcelable) {
        h.e(str, "key");
        this.a.putParcelable(str, parcelable);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a o(String str, Serializable serializable) {
        h.e(str, "key");
        this.a.putSerializable(str, serializable);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a p(String str, String str2) {
        h.e(str, "key");
        this.a.putString(str, str2);
        return this;
    }

    @Override // defpackage.p81.a
    public p81.a q(String str, String[] strArr) {
        h.e(str, "key");
        this.a.putStringArray(str, strArr);
        return this;
    }

    @Override // com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle.d
    public boolean r() {
        return this.a.isEmpty();
    }
}
