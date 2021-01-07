package com.google.protobuf;

import com.google.protobuf.WireFormat;
import com.google.protobuf.u;

public class t<K, V> {
    private final a<K, V> a;
    private final K b;
    private final V c;

    /* access modifiers changed from: package-private */
    public static class a<K, V> {
        public final WireFormat.FieldType a;
        public final K b;
        public final WireFormat.FieldType c;
        public final V d;

        public a(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.a = fieldType;
            this.b = k;
            this.c = fieldType2;
            this.d = v;
        }
    }

    private t(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.a = new a<>(fieldType, k, fieldType2, v);
        this.b = k;
        this.c = v;
    }

    public static <K, V> t<K, V> b(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new t<>(fieldType, k, fieldType2, v);
    }

    static <T> T c(g gVar, k kVar, WireFormat.FieldType fieldType, T t) {
        int ordinal = fieldType.ordinal();
        if (ordinal == 9) {
            throw new RuntimeException("Groups are not allowed in maps.");
        } else if (ordinal == 10) {
            u.a builder = t.toBuilder();
            gVar.p(builder, kVar);
            return (T) builder.buildPartial();
        } else if (ordinal == 13) {
            return (T) Integer.valueOf(gVar.u());
        } else {
            int i = l.d;
            return (T) WireFormat.a(gVar, fieldType, WireFormat.Utf8Validation.STRICT);
        }
    }

    public int a(int i, K k, V v) {
        int r = CodedOutputStream.r(i);
        a<K, V> aVar = this.a;
        return r + CodedOutputStream.m(l.c(aVar.a, 1, k) + l.c(aVar.c, 2, v));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.protobuf.MapFieldLite<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public void d(MapFieldLite<K, V> mapFieldLite, g gVar, k kVar) {
        int g = gVar.g(gVar.u());
        a<K, V> aVar = this.a;
        Object obj = aVar.b;
        Object obj2 = aVar.d;
        while (true) {
            int B = gVar.B();
            if (B == 0) {
                break;
            } else if (B == (this.a.a.g() | 8)) {
                obj = c(gVar, kVar, this.a.a, obj);
            } else if (B == (this.a.c.g() | 16)) {
                obj2 = c(gVar, kVar, this.a.c, obj2);
            } else if (!gVar.F(B)) {
                break;
            }
        }
        gVar.a(0);
        gVar.f(g);
        mapFieldLite.put(obj, obj2);
    }

    public void e(CodedOutputStream codedOutputStream, int i, K k, V v) {
        codedOutputStream.R(i, 2);
        a<K, V> aVar = this.a;
        codedOutputStream.T(l.c(aVar.a, 1, k) + l.c(aVar.c, 2, v));
        a<K, V> aVar2 = this.a;
        l.l(codedOutputStream, aVar2.a, 1, k);
        l.l(codedOutputStream, aVar2.c, 2, v);
    }
}
