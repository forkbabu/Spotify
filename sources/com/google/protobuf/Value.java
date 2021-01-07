package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import com.google.protobuf.o;
import java.io.IOException;

public final class Value extends GeneratedMessageLite<Value, b> implements Object {
    private static final Value c;
    private static volatile x<Value> f;
    private int a = 0;
    private Object b;

    public enum KindCase implements o.c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        
        private final int value;

        private KindCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Value, b> implements Object {
        b(a aVar) {
            super(Value.c);
        }
    }

    static {
        Value value = new Value();
        c = value;
        value.makeImmutable();
    }

    private Value() {
    }

    public static Value i() {
        return c;
    }

    public static x<Value> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Value value = (Value) obj2;
                switch (value.l().ordinal()) {
                    case 0:
                        if (this.a != 1) {
                            z = false;
                        }
                        this.b = hVar.k(z, this.b, value.b);
                        break;
                    case 1:
                        if (this.a != 2) {
                            z = false;
                        }
                        this.b = hVar.j(z, this.b, value.b);
                        break;
                    case 2:
                        if (this.a != 3) {
                            z = false;
                        }
                        this.b = hVar.e(z, this.b, value.b);
                        break;
                    case 3:
                        if (this.a != 4) {
                            z = false;
                        }
                        this.b = hVar.p(z, this.b, value.b);
                        break;
                    case 4:
                        if (this.a != 5) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, value.b);
                        break;
                    case 5:
                        if (this.a != 6) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, value.b);
                        break;
                    case 6:
                        if (this.a == 0) {
                            z = false;
                        }
                        hVar.b(z);
                        break;
                }
                if (hVar == GeneratedMessageLite.g.a && (i = value.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                int u = gVar.u();
                                this.a = 1;
                                this.b = Integer.valueOf(u);
                            } else if (B == 17) {
                                this.a = 2;
                                this.b = Double.valueOf(gVar.j());
                            } else if (B == 26) {
                                String A = gVar.A();
                                this.a = 3;
                                this.b = A;
                            } else if (B == 32) {
                                this.a = 4;
                                this.b = Boolean.valueOf(gVar.h());
                            } else if (B == 42) {
                                Struct.b bVar = this.a == 5 ? (Struct.b) ((Struct) this.b).toBuilder() : null;
                                u o = gVar.o(Struct.parser(), kVar);
                                this.b = o;
                                if (bVar != null) {
                                    bVar.mergeFrom((Struct.b) ((Struct) o));
                                    this.b = bVar.buildPartial();
                                }
                                this.a = 5;
                            } else if (B == 50) {
                                ListValue.b bVar2 = this.a == 6 ? (ListValue.b) ((ListValue) this.b).toBuilder() : null;
                                u o2 = gVar.o(ListValue.parser(), kVar);
                                this.b = o2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ListValue.b) ((ListValue) o2));
                                    this.b = bVar2.buildPartial();
                                }
                                this.a = 6;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return null;
            case 4:
                return new Value();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Value.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a == 1) {
            i2 = 0 + CodedOutputStream.h(1, ((Integer) this.b).intValue());
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.g(2, ((Double) this.b).doubleValue());
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.p(3, o());
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.d(4, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (Struct) this.b);
        }
        if (this.a == 6) {
            i2 += CodedOutputStream.n(6, (ListValue) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean h() {
        if (this.a == 4) {
            return ((Boolean) this.b).booleanValue();
        }
        return false;
    }

    public KindCase l() {
        switch (this.a) {
            case 0:
                return KindCase.KIND_NOT_SET;
            case 1:
                return KindCase.NULL_VALUE;
            case 2:
                return KindCase.NUMBER_VALUE;
            case 3:
                return KindCase.STRING_VALUE;
            case 4:
                return KindCase.BOOL_VALUE;
            case 5:
                return KindCase.STRUCT_VALUE;
            case 6:
                return KindCase.LIST_VALUE;
            default:
                return null;
        }
    }

    public ListValue m() {
        if (this.a == 6) {
            return (ListValue) this.b;
        }
        return ListValue.h();
    }

    public double n() {
        if (this.a == 2) {
            return ((Double) this.b).doubleValue();
        }
        return 0.0d;
    }

    public String o() {
        return this.a == 3 ? (String) this.b : "";
    }

    public Struct p() {
        if (this.a == 5) {
            return (Struct) this.b;
        }
        return Struct.h();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.K(1, ((Integer) this.b).intValue());
        }
        if (this.a == 2) {
            codedOutputStream.E(2, ((Double) this.b).doubleValue());
        }
        if (this.a == 3) {
            codedOutputStream.P(3, o());
        }
        if (this.a == 4) {
            codedOutputStream.A(4, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (Struct) this.b);
        }
        if (this.a == 6) {
            codedOutputStream.M(6, (ListValue) this.b);
        }
    }
}
