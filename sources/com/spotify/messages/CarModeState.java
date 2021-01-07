package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class CarModeState extends GeneratedMessageLite<CarModeState, b> implements Object {
    private static final CarModeState o;
    private static volatile x<CarModeState> p;
    private int a;
    private boolean b;
    private String c = "";
    private MapFieldLite<String, String> f = MapFieldLite.d();
    private MapFieldLite<String, String> n = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<CarModeState, b> implements Object {
        public b m(String str, String str2) {
            str2.getClass();
            copyOnWrite();
            ((MapFieldLite) CarModeState.l((CarModeState) this.instance)).put(str, str2);
            return this;
        }

        public b n(String str, String str2) {
            str2.getClass();
            copyOnWrite();
            ((MapFieldLite) CarModeState.m((CarModeState) this.instance)).put(str, str2);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            CarModeState.i((CarModeState) this.instance, str);
            return this;
        }

        public b p(boolean z) {
            copyOnWrite();
            CarModeState.h((CarModeState) this.instance, z);
            return this;
        }

        private b() {
            super(CarModeState.o);
        }
    }

    private static final class c {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    private static final class d {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        CarModeState carModeState = new CarModeState();
        o = carModeState;
        carModeState.makeImmutable();
    }

    private CarModeState() {
    }

    static void h(CarModeState carModeState, boolean z) {
        carModeState.a |= 1;
        carModeState.b = z;
    }

    static void i(CarModeState carModeState, String str) {
        carModeState.getClass();
        str.getClass();
        carModeState.a |= 2;
        carModeState.c = str;
    }

    static Map l(CarModeState carModeState) {
        if (!carModeState.f.f()) {
            carModeState.f = carModeState.f.k();
        }
        return carModeState.f;
    }

    static Map m(CarModeState carModeState) {
        if (!carModeState.n.f()) {
            carModeState.n = carModeState.n.k();
        }
        return carModeState.n;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<CarModeState> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CarModeState carModeState = (CarModeState) obj2;
                this.b = hVar.f((this.a & 1) == 1, this.b, (carModeState.a & 1) == 1, carModeState.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((carModeState.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, carModeState.c);
                this.f = hVar.c(this.f, carModeState.f);
                this.n = hVar.c(this.n, carModeState.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= carModeState.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.h();
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                            } else if (B == 26) {
                                if (!this.f.f()) {
                                    this.f = this.f.k();
                                }
                                c.a.d(this.f, gVar, kVar);
                            } else if (B == 34) {
                                if (!this.n.f()) {
                                    this.n = this.n.k();
                                }
                                d.a.d(this.n, gVar, kVar);
                            } else if (!parseUnknownField(B, gVar)) {
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
                this.f.g();
                this.n.g();
                return null;
            case 4:
                return new CarModeState();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (CarModeState.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.d(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            i2 = je.j1(entry, c.a, 3, entry.getKey(), i2);
        }
        for (Map.Entry<String, String> entry2 : this.n.entrySet()) {
            i2 = je.j1(entry2, d.a, 4, entry2.getKey(), i2);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.A(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            c.a.e(codedOutputStream, 3, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.n.entrySet()) {
            d.a.e(codedOutputStream, 4, entry2.getKey(), entry2.getValue());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
