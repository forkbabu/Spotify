package com.google.protobuf;

import com.google.protobuf.WireFormat;
import com.google.protobuf.a0;
import com.google.protobuf.l.a;
import com.google.protobuf.o;
import com.google.protobuf.p;
import com.google.protobuf.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class l<FieldDescriptorType extends a<FieldDescriptorType>> {
    public static final /* synthetic */ int d = 0;
    private final a0<FieldDescriptorType, Object> a;
    private boolean b;
    private boolean c = false;

    public interface a<T extends a<T>> extends Comparable<T> {
        u.a H(u.a aVar, u uVar);

        boolean Z();

        WireFormat.FieldType a0();

        WireFormat.JavaType w0();
    }

    static {
        int i = a0.o;
        new z(0).m();
    }

    private l() {
        int i = a0.o;
        this.a = new z(16);
    }

    private Object b(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int c(WireFormat.FieldType fieldType, int i, Object obj) {
        int r = CodedOutputStream.r(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            r *= 2;
        }
        int i2 = 1;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i3 = CodedOutputStream.d;
                i2 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                int i4 = CodedOutputStream.d;
                i2 = 4;
                break;
            case 2:
                i2 = CodedOutputStream.v(((Long) obj).longValue());
                break;
            case 3:
                i2 = CodedOutputStream.v(((Long) obj).longValue());
                break;
            case 4:
                i2 = CodedOutputStream.k(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                int i5 = CodedOutputStream.d;
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                int i6 = CodedOutputStream.d;
                i2 = 4;
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                int i7 = CodedOutputStream.d;
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    i2 = CodedOutputStream.q((String) obj);
                    break;
                } else {
                    i2 = CodedOutputStream.f((ByteString) obj);
                    break;
                }
            case 9:
                int i8 = CodedOutputStream.d;
                i2 = ((u) obj).getSerializedSize();
                break;
            case 10:
                if (!(obj instanceof p)) {
                    int i9 = CodedOutputStream.d;
                    i2 = CodedOutputStream.m(((u) obj).getSerializedSize());
                    break;
                } else {
                    int i10 = CodedOutputStream.d;
                    i2 = CodedOutputStream.m(((p) obj).a());
                    break;
                }
            case 11:
                if (!(obj instanceof ByteString)) {
                    int i11 = CodedOutputStream.d;
                    i2 = CodedOutputStream.m(((byte[]) obj).length);
                    break;
                } else {
                    i2 = CodedOutputStream.f((ByteString) obj);
                    break;
                }
            case 12:
                i2 = CodedOutputStream.t(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof o.c)) {
                    i2 = CodedOutputStream.k(((Integer) obj).intValue());
                    break;
                } else {
                    i2 = CodedOutputStream.k(((o.c) obj).getNumber());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                int i12 = CodedOutputStream.d;
                i2 = 4;
                break;
            case 15:
                ((Long) obj).longValue();
                int i13 = CodedOutputStream.d;
                i2 = 8;
                break;
            case 16:
                i2 = CodedOutputStream.t(CodedOutputStream.w(((Integer) obj).intValue()));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = CodedOutputStream.v((longValue >> 63) ^ (longValue << 1));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return r + i2;
    }

    private void h(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof p) {
            value = ((p) value).d();
        }
        if (key.Z()) {
            Object obj = this.a.get(key);
            if (obj instanceof p) {
                obj = ((p) obj).d();
            }
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                ((List) obj).add(b(obj2));
            }
            this.a.put(key, obj);
        } else if (key.w0() == WireFormat.JavaType.MESSAGE) {
            Object obj3 = this.a.get(key);
            if (obj3 instanceof p) {
                obj3 = ((p) obj3).d();
            }
            if (obj3 == null) {
                this.a.put(key, b(value));
                return;
            }
            this.a.put(key, key.H(((u) obj3).toBuilder(), (u) value).build());
        } else {
            this.a.put(key, b(value));
        }
    }

    public static <T extends a<T>> l<T> i() {
        return new l<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if ((r3 instanceof com.google.protobuf.p) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 instanceof com.google.protobuf.o.c) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void k(com.google.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            com.google.protobuf.WireFormat$JavaType r2 = r2.d()
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L_0x003e;
                case 1: goto L_0x003b;
                case 2: goto L_0x0038;
                case 3: goto L_0x0035;
                case 4: goto L_0x0032;
                case 5: goto L_0x002f;
                case 6: goto L_0x0023;
                case 7: goto L_0x001a;
                case 8: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0040
        L_0x0011:
            boolean r2 = r3 instanceof com.google.protobuf.u
            if (r2 != 0) goto L_0x002d
            boolean r2 = r3 instanceof com.google.protobuf.p
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x001a:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x002d
            boolean r2 = r3 instanceof com.google.protobuf.o.c
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x0023:
            boolean r2 = r3 instanceof com.google.protobuf.ByteString
            if (r2 != 0) goto L_0x002d
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r1 = r0
            goto L_0x0040
        L_0x002f:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0040
        L_0x0032:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0035:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0040
        L_0x0038:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0040
        L_0x003b:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0040
        L_0x003e:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
            switch-data {0->0x003e, 1->0x003b, 2->0x0038, 3->0x0035, 4->0x0032, 5->0x002f, 6->0x0023, 7->0x001a, 8->0x0011, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l.k(com.google.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    static void l(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.R(i, 3);
            ((u) obj).writeTo(codedOutputStream);
            codedOutputStream.R(i, 4);
            return;
        }
        codedOutputStream.R(i, fieldType.g());
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.I(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.G(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                codedOutputStream.V(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.V(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.L(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.I(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.G(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.z(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof ByteString) {
                    codedOutputStream.D((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.Q((String) obj);
                    return;
                }
            case 9:
                ((u) obj).writeTo(codedOutputStream);
                return;
            case 10:
                codedOutputStream.N((u) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.D((ByteString) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.B(bArr, 0, bArr.length);
                return;
            case 12:
                codedOutputStream.T(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof o.c) {
                    codedOutputStream.L(((o.c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.L(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.G(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.I(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.T(CodedOutputStream.w(((Integer) obj).intValue()));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.V((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public l<FieldDescriptorType> clone() {
        l<FieldDescriptorType> lVar = new l<>();
        for (int i = 0; i < this.a.i(); i++) {
            Map.Entry<FieldDescriptorType, Object> h = this.a.h(i);
            lVar.j(h.getKey(), h.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.a.j()) {
            lVar.j(entry.getKey(), entry.getValue());
        }
        lVar.c = this.c;
        return lVar;
    }

    public boolean d() {
        return this.b;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        if (this.c) {
            return new p.c(((a0.d) this.a.entrySet()).iterator());
        }
        return ((a0.d) this.a.entrySet()).iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.a.equals(((l) obj).a);
    }

    public void f() {
        if (!this.b) {
            this.a.m();
            this.b = true;
        }
    }

    public void g(l<FieldDescriptorType> lVar) {
        for (int i = 0; i < lVar.a.i(); i++) {
            h(lVar.a.h(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : lVar.a.j()) {
            h(entry);
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.Z()) {
            k(fielddescriptortype.a0(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k(fielddescriptortype.a0(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof p) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }
}
