package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.p81;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableComponentBundle implements p81, Parcelable {
    public static final Parcelable.Creator<HubsImmutableComponentBundle> CREATOR = new a();
    public static final b Companion = new b(null);
    private static final HubsImmutableComponentBundle EMPTY = new HubsImmutableComponentBundle();
    private final c impl;

    public static final class a implements Parcelable.Creator<HubsImmutableComponentBundle> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentBundle createFromParcel(Parcel parcel) {
            h.e(parcel, "source");
            Bundle readBundle = parcel.readBundle(p81.class.getClassLoader());
            if (readBundle != null) {
                Set<String> keySet = readBundle.keySet();
                h.d(keySet, "bundle.keySet()");
                if (!keySet.isEmpty()) {
                    return b.a(HubsImmutableComponentBundle.Companion, readBundle);
                }
            }
            return HubsImmutableComponentBundle.EMPTY;
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentBundle[] newArray(int i) {
            return new HubsImmutableComponentBundle[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public static final HubsImmutableComponentBundle a(b bVar, Bundle bundle) {
            bVar.getClass();
            return new HubsImmutableComponentBundle(bundle);
        }

        public final p81.a b() {
            return HubsImmutableComponentBundle.EMPTY.toBuilder();
        }

        public final HubsImmutableComponentBundle c(p81 p81) {
            if (p81 == null) {
                return new HubsImmutableComponentBundle();
            }
            if (p81 instanceof HubsImmutableComponentBundle) {
                return (HubsImmutableComponentBundle) p81;
            }
            p81 d = b().a(p81).d();
            if (d != null) {
                return (HubsImmutableComponentBundle) d;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle");
        }
    }

    /* access modifiers changed from: private */
    public final class c extends d {
        private final Bundle a;
        final /* synthetic */ HubsImmutableComponentBundle b;

        public c(HubsImmutableComponentBundle hubsImmutableComponentBundle, Bundle bundle) {
            h.e(bundle, "bundle");
            this.b = hubsImmutableComponentBundle;
            this.a = bundle;
        }

        @Override // defpackage.p81.a
        public p81.a b(String str, boolean z) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, Boolean.class), Boolean.valueOf(z))) {
                return this;
            }
            b bVar = new b(this);
            bVar.b(str, z);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a c(String str, boolean[] zArr) {
            h.e(str, "key");
            if (Arrays.equals((boolean[]) this.b.getTyped(str, boolean[].class), zArr)) {
                return this;
            }
            b bVar = new b(this);
            bVar.c(str, zArr);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81 d() {
            return this.b;
        }

        @Override // defpackage.p81.a
        public p81.a e(String str, p81 p81) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, p81.class), p81)) {
                return this;
            }
            b bVar = new b(this);
            bVar.e(str, p81);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a f(String str, p81[] p81Arr) {
            h.e(str, "key");
            if (Arrays.equals((Object[]) this.b.getTyped(str, p81[].class), p81Arr)) {
                return this;
            }
            b bVar = new b(this);
            bVar.f(str, p81Arr);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a g(String str, double[] dArr) {
            h.e(str, "key");
            if (Arrays.equals((double[]) this.b.getTyped(str, double[].class), dArr)) {
                return this;
            }
            b bVar = new b(this);
            bVar.g(str, dArr);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a h(String str, double d) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, Double.class), Double.valueOf(d))) {
                return this;
            }
            b bVar = new b(this);
            bVar.h(str, d);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a i(String str, float f) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, Float.class), Float.valueOf(f))) {
                return this;
            }
            b bVar = new b(this);
            bVar.i(str, f);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a j(String str, int i) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, Integer.class), Integer.valueOf(i))) {
                return this;
            }
            b bVar = new b(this);
            bVar.j(str, i);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a k(String str, int[] iArr) {
            h.e(str, "key");
            if (Arrays.equals((int[]) this.b.getTyped(str, int[].class), iArr)) {
                return this;
            }
            b bVar = new b(this);
            bVar.k(str, iArr);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a l(String str, long[] jArr) {
            h.e(str, "key");
            if (Arrays.equals((long[]) this.b.getTyped(str, long[].class), jArr)) {
                return this;
            }
            b bVar = new b(this);
            bVar.l(str, jArr);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a m(String str, long j) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, Long.class), Long.valueOf(j))) {
                return this;
            }
            b bVar = new b(this);
            bVar.m(str, j);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a n(String str, Parcelable parcelable) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, Parcelable.class), parcelable)) {
                return this;
            }
            b bVar = new b(this);
            bVar.n(str, parcelable);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a o(String str, Serializable serializable) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, Serializable.class), serializable)) {
                return this;
            }
            b bVar = new b(this);
            bVar.o(str, serializable);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a p(String str, String str2) {
            h.e(str, "key");
            if (rw.equal(this.b.getTyped(str, String.class), str2)) {
                return this;
            }
            b bVar = new b(this);
            bVar.p(str, str2);
            return bVar;
        }

        @Override // defpackage.p81.a
        public p81.a q(String str, String[] strArr) {
            h.e(str, "key");
            b bVar = new b(this);
            bVar.q(str, strArr);
            return bVar;
        }

        @Override // com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle.d
        public boolean r() {
            return this.b.keySet().isEmpty();
        }

        public final Bundle s() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public static abstract class d extends p81.a {
        @Override // defpackage.p81.a
        public p81.a a(p81 p81) {
            h.e(p81, "other");
            return r() ? p81.toBuilder() : super.a(p81);
        }

        public abstract boolean r();
    }

    protected HubsImmutableComponentBundle() {
        this(new Bundle());
    }

    public static final p81.a builder() {
        return Companion.b();
    }

    public static final HubsImmutableComponentBundle create() {
        Companion.getClass();
        return new HubsImmutableComponentBundle();
    }

    private static final HubsImmutableComponentBundle create(Bundle bundle) {
        return b.a(Companion, bundle);
    }

    public static final HubsImmutableComponentBundle fromNullable(p81 p81) {
        return Companion.c(p81);
    }

    private final <N extends Number> N getNumber(String str, nmf<? super Number, ? extends N> nmf) {
        Number number = (Number) getTyped(str, Number.class);
        if (number != null) {
            return (N) ((Number) nmf.invoke(number));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final <T> T getTyped(String str, Class<T> cls) {
        T t = (T) this.impl.s().get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public boolean[] boolArray(String str) {
        h.e(str, "key");
        return (boolean[]) getTyped(str, boolean[].class);
    }

    @Override // defpackage.p81
    public boolean boolValue(String str, boolean z) {
        h.e(str, "key");
        Boolean bool = (Boolean) getTyped(str, Boolean.class);
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // defpackage.p81
    public p81 bundle(String str) {
        h.e(str, "key");
        return (p81) getTyped(str, p81.class);
    }

    @Override // defpackage.p81
    public p81[] bundleArray(String str) {
        h.e(str, "key");
        return (p81[]) getTyped(str, p81[].class);
    }

    @Override // defpackage.p81
    public byte[] byteArray(String str) {
        h.e(str, "key");
        return (byte[]) getTyped(str, byte[].class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double[] doubleArray(String str) {
        h.e(str, "key");
        return (double[]) getTyped(str, double[].class);
    }

    public double doubleValue(String str, double d2) {
        h.e(str, "key");
        Double d3 = (Double) getNumber(str, HubsImmutableComponentBundle$doubleValue$1.a);
        return d3 != null ? d3.doubleValue() : d2;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        boolean z;
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HubsImmutableComponentBundle)) {
            return false;
        }
        Bundle s = this.impl.s();
        Bundle s2 = ((HubsImmutableComponentBundle) obj).impl.s();
        if (!h.a(s.keySet(), s2.keySet())) {
            return false;
        }
        for (String str : s.keySet()) {
            Object obj2 = s.get(str);
            if (obj2 == null) {
                if (s2.get(str) != null) {
                    return false;
                }
            } else if (obj2.getClass().isArray()) {
                b bVar = Companion;
                Object obj3 = s2.get(str);
                bVar.getClass();
                Class<?> componentType = obj2.getClass().getComponentType();
                if (!h.a(componentType, (obj3 == null || (cls = obj3.getClass()) == null) ? null : cls.getComponentType())) {
                    z = false;
                } else if (h.a(componentType, String.class)) {
                    z = Arrays.equals((String[]) obj2, (String[]) obj3);
                } else if (h.a(componentType, Long.TYPE)) {
                    z = Arrays.equals((long[]) obj2, (long[]) obj3);
                } else if (h.a(componentType, Double.TYPE)) {
                    z = Arrays.equals((double[]) obj2, (double[]) obj3);
                } else if (h.a(componentType, Boolean.TYPE)) {
                    z = Arrays.equals((boolean[]) obj2, (boolean[]) obj3);
                } else if (h.a(componentType, Integer.TYPE)) {
                    z = Arrays.equals((int[]) obj2, (int[]) obj3);
                } else if (h.a(componentType, Float.TYPE)) {
                    z = Arrays.equals((float[]) obj2, (float[]) obj3);
                } else if (h.a(componentType, Byte.TYPE)) {
                    z = Arrays.equals((byte[]) obj2, (byte[]) obj3);
                } else {
                    z = Arrays.equals((Object[]) obj2, (Object[]) obj3);
                }
                if (!z) {
                    return false;
                }
            } else if (!h.a(obj2, s2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public float[] floatArray(String str) {
        h.e(str, "key");
        return (float[]) getTyped(str, float[].class);
    }

    @Override // defpackage.p81
    public float floatValue(String str, float f) {
        h.e(str, "key");
        Float f2 = (Float) getNumber(str, HubsImmutableComponentBundle$floatValue$1.a);
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // defpackage.p81
    public Object get(String str) {
        h.e(str, "key");
        return this.impl.s().get(str);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i;
        int i2;
        int i3 = 1;
        for (String str : keySet()) {
            Object obj = get(str);
            if (obj == null) {
                i = 0;
            } else if (obj.getClass().isArray()) {
                Companion.getClass();
                Class<?> componentType = obj.getClass().getComponentType();
                if (h.a(componentType, String.class)) {
                    i2 = Arrays.hashCode((String[]) obj);
                } else if (h.a(componentType, Long.TYPE)) {
                    i2 = Arrays.hashCode((long[]) obj);
                } else if (h.a(componentType, Double.TYPE)) {
                    i2 = Arrays.hashCode((double[]) obj);
                } else if (h.a(componentType, Boolean.TYPE)) {
                    i2 = Arrays.hashCode((boolean[]) obj);
                } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof p81[])) {
                    i2 = Arrays.hashCode((p81[]) obj);
                } else if (h.a(componentType, Integer.TYPE)) {
                    i2 = Arrays.hashCode((int[]) obj);
                } else if (h.a(componentType, Float.TYPE)) {
                    i2 = Arrays.hashCode((float[]) obj);
                } else {
                    i2 = obj.hashCode();
                }
                i = i2 + 31;
            } else {
                i = obj.hashCode();
            }
            i3 = (i3 * 31) + i;
        }
        return i3;
    }

    public int[] intArray(String str) {
        h.e(str, "key");
        return (int[]) getTyped(str, int[].class);
    }

    @Override // defpackage.p81
    public int intValue(String str, int i) {
        h.e(str, "key");
        Integer num = (Integer) getNumber(str, HubsImmutableComponentBundle$intValue$1.a);
        return num != null ? num.intValue() : i;
    }

    @Override // defpackage.p81
    public Set<String> keySet() {
        Set<String> keySet = this.impl.s().keySet();
        h.d(keySet, "impl.bundle.keySet()");
        return keySet;
    }

    public long[] longArray(String str) {
        h.e(str, "key");
        return (long[]) getTyped(str, long[].class);
    }

    @Override // defpackage.p81
    public long longValue(String str, long j) {
        h.e(str, "key");
        Long l = (Long) getNumber(str, HubsImmutableComponentBundle$longValue$1.a);
        return l != null ? l.longValue() : j;
    }

    @Override // defpackage.p81
    public String string(String str) {
        h.e(str, "key");
        return (String) getTyped(str, String.class);
    }

    @Override // defpackage.p81
    public String[] stringArray(String str) {
        h.e(str, "key");
        return (String[]) getTyped(str, String[].class);
    }

    @Override // defpackage.p81
    public p81.a toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeBundle(this.impl.s());
    }

    protected HubsImmutableComponentBundle(Bundle bundle) {
        h.e(bundle, "bundle");
        this.impl = new c(this, bundle);
    }

    @Override // defpackage.p81
    public Boolean boolValue(String str) {
        h.e(str, "key");
        return (Boolean) getTyped(str, Boolean.class);
    }

    public Double doubleValue(String str) {
        h.e(str, "key");
        return (Double) getNumber(str, HubsImmutableComponentBundle$doubleValue$2.a);
    }

    public Float floatValue(String str) {
        h.e(str, "key");
        return (Float) getNumber(str, HubsImmutableComponentBundle$floatValue$2.a);
    }

    @Override // defpackage.p81
    public Integer intValue(String str) {
        h.e(str, "key");
        return (Integer) getNumber(str, HubsImmutableComponentBundle$intValue$2.a);
    }

    @Override // defpackage.p81
    public Long longValue(String str) {
        h.e(str, "key");
        return (Long) getNumber(str, HubsImmutableComponentBundle$longValue$2.a);
    }

    @Override // defpackage.p81
    public String string(String str, String str2) {
        h.e(str, "key");
        h.e(str2, "defaultValue");
        String str3 = (String) getTyped(str, String.class);
        return str3 != null ? str3 : str2;
    }

    protected HubsImmutableComponentBundle(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        h.e(hubsImmutableComponentBundle, "bundle");
        this.impl = hubsImmutableComponentBundle.impl;
    }
}
