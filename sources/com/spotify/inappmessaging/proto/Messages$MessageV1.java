package com.spotify.inappmessaging.proto;

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
import java.util.Collections;
import java.util.Map;

public final class Messages$MessageV1 extends GeneratedMessageLite<Messages$MessageV1, a> implements Object {
    private static final Messages$MessageV1 r;
    private static volatile x<Messages$MessageV1> s;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private boolean o;
    private String p = "";
    private MapFieldLite<String, ClickActions$ClickActionV1> q = MapFieldLite.d();

    public static final class a extends GeneratedMessageLite.b<Messages$MessageV1, a> implements Object {
        private a() {
            super(Messages$MessageV1.r);
        }
    }

    private static final class b {
        static final t<String, ClickActions$ClickActionV1> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, ClickActions$ClickActionV1.i());
    }

    static {
        Messages$MessageV1 messages$MessageV1 = new Messages$MessageV1();
        r = messages$MessageV1;
        messages$MessageV1.makeImmutable();
    }

    private Messages$MessageV1() {
    }

    public static Messages$MessageV1 m() {
        return r;
    }

    public static x<Messages$MessageV1> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Messages$MessageV1 messages$MessageV1 = (Messages$MessageV1) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !messages$MessageV1.b.isEmpty(), messages$MessageV1.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !messages$MessageV1.c.isEmpty(), messages$MessageV1.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !messages$MessageV1.f.isEmpty(), messages$MessageV1.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !messages$MessageV1.n.isEmpty(), messages$MessageV1.n);
                boolean z = this.o;
                boolean z2 = messages$MessageV1.o;
                this.o = hVar.f(z, z, z2, z2);
                this.p = hVar.n(!this.p.isEmpty(), this.p, true ^ messages$MessageV1.p.isEmpty(), messages$MessageV1.p);
                this.q = hVar.c(this.q, messages$MessageV1.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= messages$MessageV1.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.b = gVar.A();
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 26) {
                                this.f = gVar.A();
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (B == 40) {
                                this.o = gVar.h();
                            } else if (B == 50) {
                                this.p = gVar.A();
                            } else if (B == 58) {
                                if (!this.q.f()) {
                                    this.q = this.q.k();
                                }
                                b.a.d(this.q, gVar, kVar);
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                this.q.g();
                return null;
            case 4:
                return new Messages$MessageV1();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (Messages$MessageV1.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.b.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        boolean z = this.o;
        if (z) {
            i2 += CodedOutputStream.d(5, z);
        }
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        for (Map.Entry<String, ClickActions$ClickActionV1> entry : this.q.entrySet()) {
            i2 = je.j1(entry, b.a, 7, entry.getKey(), i2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int h() {
        return this.q.size();
    }

    public Map<String, ClickActions$ClickActionV1> i() {
        return Collections.unmodifiableMap(this.q);
    }

    public String l() {
        return this.b;
    }

    public boolean n() {
        return this.o;
    }

    public String o() {
        return this.p;
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.n;
    }

    public String r() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        boolean z = this.o;
        if (z) {
            codedOutputStream.A(5, z);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(6, this.p);
        }
        for (Map.Entry<String, ClickActions$ClickActionV1> entry : this.q.entrySet()) {
            b.a.e(codedOutputStream, 7, entry.getKey(), entry.getValue());
        }
    }
}
