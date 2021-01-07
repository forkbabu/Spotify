package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class a0 {
    private static final Class[] d;
    public static final /* synthetic */ int e = 0;
    final Map<String, Object> a;
    private final Map<String, b<?>> b;
    private final SavedStateRegistry.b c;

    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Set<String> keySet = a0.this.a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(a0.this.a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00a8: APUT  (r0v1 java.lang.Class[]), (27 ??[int, float, short, byte, char]), (r4v5 java.lang.Class) */
    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i = Build.VERSION.SDK_INT;
        clsArr[27] = i >= 21 ? Size.class : cls;
        if (i >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        d = clsArr;
    }

    public a0(Map<String, Object> map) {
        this.b = new HashMap();
        this.c = new a();
        this.a = new HashMap(map);
    }

    public <T> T a(String str) {
        return (T) this.a.get(str);
    }

    public <T> u<T> b(String str) {
        b<?> bVar = this.b.get(str);
        if (bVar == null) {
            if (this.a.containsKey(str)) {
                bVar = new b<>(this, str, this.a.get(str));
            } else {
                bVar = new b<>(this, str);
            }
            this.b.put(str, bVar);
        }
        return bVar;
    }

    public <T> T c(String str) {
        T t = (T) this.a.remove(str);
        b<?> remove = this.b.remove(str);
        if (remove != null) {
            remove.o();
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    public SavedStateRegistry.b d() {
        return this.c;
    }

    public <T> void e(String str, T t) {
        if (t != null) {
            for (Class cls : d) {
                if (!cls.isInstance(t)) {
                }
            }
            StringBuilder V0 = je.V0("Can't put value with type ");
            V0.append(t.getClass());
            V0.append(" into saved state");
            throw new IllegalArgumentException(V0.toString());
        }
        b<?> bVar = this.b.get(str);
        if (bVar != null) {
            bVar.n(t);
        } else {
            this.a.put(str, t);
        }
    }

    static class b<T> extends u<T> {
        private String k;
        private a0 l;

        b(a0 a0Var, String str, T t) {
            super(t);
            this.k = str;
            this.l = a0Var;
        }

        @Override // androidx.lifecycle.u, androidx.lifecycle.LiveData
        public void n(T t) {
            a0 a0Var = this.l;
            if (a0Var != null) {
                a0Var.a.put(this.k, t);
            }
            super.n(t);
        }

        /* access modifiers changed from: package-private */
        public void o() {
            this.l = null;
        }

        b(a0 a0Var, String str) {
            this.k = str;
            this.l = a0Var;
        }
    }

    public a0() {
        this.b = new HashMap();
        this.c = new a();
        this.a = new HashMap();
    }
}
