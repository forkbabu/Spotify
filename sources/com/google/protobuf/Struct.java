package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class Struct extends GeneratedMessageLite<Struct, b> implements Object {
    private static final Struct b;
    private static volatile x<Struct> c;
    private MapFieldLite<String, Value> a = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<Struct, b> implements Object {
        private b() {
            super(Struct.b);
        }

        b(a aVar) {
            super(Struct.b);
        }
    }

    private static final class c {
        static final t<String, Value> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.i());
    }

    static {
        Struct struct = new Struct();
        b = struct;
        struct.makeImmutable();
    }

    private Struct() {
    }

    public static Struct h() {
        return b;
    }

    public static x<Struct> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).c(this.a, ((Struct) obj2).a);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.a.f()) {
                                    this.a = this.a.k();
                                }
                                c.a.d(this.a, gVar, kVar);
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                this.a.g();
                return null;
            case 4:
                return new Struct();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (Struct.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (Map.Entry<String, Value> entry : this.a.entrySet()) {
            i2 = je.j1(entry, c.a, 1, entry.getKey(), i2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Map<String, Value> i() {
        return Collections.unmodifiableMap(this.a);
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (Map.Entry<String, Value> entry : this.a.entrySet()) {
            c.a.e(codedOutputStream, 1, entry.getKey(), entry.getValue());
        }
    }
}
