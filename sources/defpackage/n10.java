package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.b;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: n10  reason: default package */
public final class n10 implements c, e {
    private boolean a = true;
    private final JsonWriter b;
    private final Map<Class<?>, b<?>> c;
    private final Map<Class<?>, d<?>> d;
    private final b<Object> e;
    private final boolean f;

    n10(Writer writer, Map<Class<?>, b<?>> map, Map<Class<?>, d<?>> map2, b<Object> bVar, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = bVar;
        this.f = z;
    }

    private void j() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // com.google.firebase.encoders.e
    public e a(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.c
    public c b(String str, boolean z) {
        j();
        this.b.name(str);
        j();
        this.b.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.c
    public c c(String str, long j) {
        j();
        this.b.name(str);
        j();
        this.b.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.c
    public c d(String str, int i) {
        j();
        this.b.name(str);
        j();
        this.b.value((long) i);
        return this;
    }

    @Override // com.google.firebase.encoders.e
    public e e(boolean z) {
        j();
        this.b.value(z);
        return this;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0032: APUT  (r1v15 java.lang.Object[]), (0 ??[int, short, byte, char]), (r6v24 java.lang.Class<?>) */
    /* access modifiers changed from: package-private */
    public n10 g(Object obj, boolean z) {
        Class<?> cls;
        int i = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                if (obj == null) {
                    cls = null;
                } else {
                    cls = obj.getClass();
                }
                objArr[0] = cls;
                throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                this.b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.b.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.b.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    j();
                    this.b.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.b.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.b.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    g(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    g(obj2, false);
                }
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.b.beginArray();
            for (Object obj3 : (Collection) obj) {
                g(obj3, false);
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    f((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                }
            }
            this.b.endObject();
            return this;
        } else {
            b<?> bVar = this.c.get(obj.getClass());
            if (bVar != null) {
                if (!z) {
                    this.b.beginObject();
                }
                bVar.a(obj, this);
                if (!z) {
                    this.b.endObject();
                }
                return this;
            }
            d<?> dVar = this.d.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                j();
                this.b.value(name);
                return this;
            } else {
                b<Object> bVar2 = this.e;
                if (!z) {
                    this.b.beginObject();
                }
                bVar2.a(obj, this);
                if (!z) {
                    this.b.endObject();
                }
                return this;
            }
        }
    }

    /* renamed from: h */
    public n10 f(String str, Object obj) {
        if (!this.f) {
            j();
            this.b.name(str);
            if (obj != null) {
                return g(obj, false);
            }
            this.b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            j();
            this.b.name(str);
            return g(obj, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        j();
        this.b.flush();
    }
}
