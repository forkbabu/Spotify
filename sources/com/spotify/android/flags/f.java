package com.spotify.android.flags;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class f implements c {
    public static final Parcelable.Creator<f> CREATOR = new a();
    private static final Map<String, Serializable> n = Collections.synchronizedMap(new LinkedHashMap(64));
    private final SparseIntArray a;
    private final String[] b;
    private final SparseArray<Object> c;
    private final SparseArray<WeakReference<h>> f;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            SparseIntArray sparseIntArray;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                sparseIntArray = null;
            } else {
                SparseIntArray sparseIntArray2 = new SparseIntArray(readInt);
                while (readInt > 0) {
                    sparseIntArray2.append(parcel.readInt(), parcel.readInt());
                    readInt--;
                }
                sparseIntArray = sparseIntArray2;
            }
            sparseIntArray.getClass();
            return new f(sparseIntArray, parcel.createStringArray(), parcel.readSparseArray(a.class.getClassLoader()), new SparseArray(), null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    public static class b {
        private SparseIntArray a = new SparseIntArray();
        private Map<String, Integer> b = new HashMap(100);
        private int c;
        private SparseArray<Object> d = new SparseArray<>();
        private SparseArray<WeakReference<h>> e = new SparseArray<>();

        public f a() {
            String[] strArr = new String[this.b.size()];
            for (Map.Entry<String, Integer> entry : this.b.entrySet()) {
                strArr[entry.getValue().intValue()] = entry.getKey();
            }
            f fVar = new f(this.a, strArr, this.d, this.e, null);
            this.a = null;
            this.b = null;
            this.d = null;
            this.e = null;
            return fVar;
        }

        public b b(b<?> bVar, Serializable serializable) {
            this.d.put(bVar.c().intValue(), serializable);
            return this;
        }

        public b c(b<?> bVar, String str) {
            Integer num = this.b.get(str);
            if (num == null) {
                num = Integer.valueOf(this.c);
                this.c++;
                this.b.put(str, num);
            }
            this.a.put(bVar.c().intValue(), num.intValue());
            return this;
        }
    }

    f(SparseIntArray sparseIntArray, String[] strArr, SparseArray sparseArray, SparseArray sparseArray2, a aVar) {
        this.a = sparseIntArray;
        this.b = strArr;
        this.c = sparseArray;
        this.f = sparseArray2;
    }

    private <T extends Serializable> T a(b<T> bVar) {
        int i;
        String str = null;
        T t = (T) ((Serializable) this.c.get(bVar.c().intValue(), null));
        if (t == null && (i = this.a.get(bVar.c().intValue(), -1)) != -1) {
            str = this.b[i];
        }
        if (t == null && str == null) {
            StringBuilder V0 = je.V0("Value for ");
            V0.append(bVar.d());
            V0.append(" has not been set");
            throw new IllegalStateException(V0.toString());
        } else if (t != null) {
            return t;
        } else {
            try {
                return bVar.h(str);
            } catch (UnmappableValueException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static Map<String, Serializable> b() {
        return n;
    }

    @Override // com.spotify.android.flags.c
    public <T extends Serializable> T M0(b<T> bVar) {
        h hVar;
        String str = null;
        T t = (T) ((Serializable) this.c.get(bVar.c().intValue(), null));
        if (t == null) {
            int i = this.a.get(bVar.c().intValue(), -1);
            if (i != -1) {
                str = this.b[i];
            }
        } else {
            Map<String, Serializable> map = n;
            map.remove(bVar.d());
            map.put(bVar.d(), t);
        }
        if (t == null && str == null) {
            StringBuilder V0 = je.V0("Value for ");
            V0.append(bVar.d());
            V0.append(" has not been set. Don't panic and check if you have registered your FlagProvider in the FeatureFlags class.");
            throw new IllegalStateException(V0.toString());
        }
        if (t == null) {
            try {
                t = bVar.h(str);
                WeakReference<h> weakReference = this.f.get(bVar.c().intValue());
                if (!(weakReference == null || (hVar = weakReference.get()) == null)) {
                    hVar.a(bVar, str);
                }
                Map<String, Serializable> map2 = n;
                map2.remove(bVar.d());
                map2.put(bVar.d(), t);
            } catch (UnmappableValueException e) {
                throw new AssertionError(e);
            }
        }
        return t;
    }

    @Override // com.spotify.android.flags.c
    public boolean O0(c cVar, b<?> bVar) {
        if (cVar instanceof f) {
            return a(bVar).equals(((f) cVar).a(bVar));
        }
        return a(bVar).equals(cVar.M0(bVar));
    }

    @Override // com.spotify.android.flags.c
    public boolean d() {
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.spotify.android.flags.b<T extends java.io.Serializable> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.android.flags.c
    public <T extends Serializable> boolean j2(b<T> bVar) {
        return bVar.g(M0(bVar));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        SparseIntArray sparseIntArray = this.a;
        if (sparseIntArray == null) {
            parcel.writeInt(-1);
        } else {
            int size = sparseIntArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseIntArray.keyAt(i2));
                parcel.writeInt(sparseIntArray.valueAt(i2));
            }
        }
        parcel.writeStringArray(this.b);
        parcel.writeSparseArray(this.c);
    }
}
