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

public final class CanvasPreference extends GeneratedMessageLite<CanvasPreference, b> implements Object {
    private static final CanvasPreference o;
    private static volatile x<CanvasPreference> p;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private MapFieldLite<String, String> n = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<CanvasPreference, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            CanvasPreference.h((CanvasPreference) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            CanvasPreference.l((CanvasPreference) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            CanvasPreference.i((CanvasPreference) this.instance, str);
            return this;
        }

        private b() {
            super(CanvasPreference.o);
        }
    }

    private static final class c {
        static final t<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = t.b(fieldType, "", fieldType, "");
        }
    }

    static {
        CanvasPreference canvasPreference = new CanvasPreference();
        o = canvasPreference;
        canvasPreference.makeImmutable();
    }

    private CanvasPreference() {
    }

    static void h(CanvasPreference canvasPreference, String str) {
        canvasPreference.getClass();
        str.getClass();
        canvasPreference.a |= 1;
        canvasPreference.b = str;
    }

    static void i(CanvasPreference canvasPreference, String str) {
        canvasPreference.getClass();
        str.getClass();
        canvasPreference.a |= 2;
        canvasPreference.c = str;
    }

    static void l(CanvasPreference canvasPreference, String str) {
        canvasPreference.getClass();
        str.getClass();
        canvasPreference.a |= 4;
        canvasPreference.f = str;
    }

    public static b m() {
        return (b) o.toBuilder();
    }

    public static x<CanvasPreference> parser() {
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
                CanvasPreference canvasPreference = (CanvasPreference) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (canvasPreference.a & 1) == 1, canvasPreference.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (canvasPreference.a & 2) == 2, canvasPreference.c);
                boolean z2 = (this.a & 4) == 4;
                String str = this.f;
                if ((canvasPreference.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, canvasPreference.f);
                this.n = hVar.c(this.n, canvasPreference.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= canvasPreference.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 34) {
                                if (!this.n.f()) {
                                    this.n = this.n.k();
                                }
                                c.a.d(this.n, gVar, kVar);
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
                this.n.g();
                return null;
            case 4:
                return new CanvasPreference();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (CanvasPreference.class) {
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
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        for (Map.Entry<String, String> entry : this.n.entrySet()) {
            i2 = je.j1(entry, c.a, 4, entry.getKey(), i2);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        for (Map.Entry<String, String> entry : this.n.entrySet()) {
            c.a.e(codedOutputStream, 4, entry.getKey(), entry.getValue());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
