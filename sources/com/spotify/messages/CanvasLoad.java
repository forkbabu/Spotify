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

public final class CanvasLoad extends GeneratedMessageLite<CanvasLoad, b> implements Object {
    private static final CanvasLoad p;
    private static volatile x<CanvasLoad> q;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private MapFieldLite<String, String> o = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<CanvasLoad, b> implements Object {
        public b m(String str, String str2) {
            str2.getClass();
            copyOnWrite();
            ((MapFieldLite) CanvasLoad.l((CanvasLoad) this.instance)).put(str, str2);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            CanvasLoad.h((CanvasLoad) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            CanvasLoad.m((CanvasLoad) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            CanvasLoad.n((CanvasLoad) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            CanvasLoad.i((CanvasLoad) this.instance, str);
            return this;
        }

        private b() {
            super(CanvasLoad.p);
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
        CanvasLoad canvasLoad = new CanvasLoad();
        p = canvasLoad;
        canvasLoad.makeImmutable();
    }

    private CanvasLoad() {
    }

    static void h(CanvasLoad canvasLoad, String str) {
        canvasLoad.getClass();
        str.getClass();
        canvasLoad.a |= 1;
        canvasLoad.b = str;
    }

    static void i(CanvasLoad canvasLoad, String str) {
        canvasLoad.getClass();
        str.getClass();
        canvasLoad.a |= 8;
        canvasLoad.n = str;
    }

    static Map l(CanvasLoad canvasLoad) {
        if (!canvasLoad.o.f()) {
            canvasLoad.o = canvasLoad.o.k();
        }
        return canvasLoad.o;
    }

    static void m(CanvasLoad canvasLoad, String str) {
        canvasLoad.getClass();
        str.getClass();
        canvasLoad.a |= 2;
        canvasLoad.c = str;
    }

    static void n(CanvasLoad canvasLoad, String str) {
        canvasLoad.getClass();
        str.getClass();
        canvasLoad.a |= 4;
        canvasLoad.f = str;
    }

    public static b o() {
        return (b) p.toBuilder();
    }

    public static x<CanvasLoad> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CanvasLoad canvasLoad = (CanvasLoad) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (canvasLoad.a & 1) == 1, canvasLoad.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (canvasLoad.a & 2) == 2, canvasLoad.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (canvasLoad.a & 4) == 4, canvasLoad.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((canvasLoad.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, canvasLoad.n);
                this.o = hVar.c(this.o, canvasLoad.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= canvasLoad.a;
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
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.n = z6;
                            } else if (B == 42) {
                                if (!this.o.f()) {
                                    this.o = this.o.k();
                                }
                                c.a.d(this.o, gVar, kVar);
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
                this.o.g();
                return null;
            case 4:
                return new CanvasLoad();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (CanvasLoad.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
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
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        for (Map.Entry<String, String> entry : this.o.entrySet()) {
            i2 = je.j1(entry, c.a, 5, entry.getKey(), i2);
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
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        for (Map.Entry<String, String> entry : this.o.entrySet()) {
            c.a.e(codedOutputStream, 5, entry.getKey(), entry.getValue());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
