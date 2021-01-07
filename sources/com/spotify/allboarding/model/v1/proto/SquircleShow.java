package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.Logging;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.io.IOException;

public final class SquircleShow extends GeneratedMessageLite<SquircleShow, b> implements Object {
    private static final SquircleShow s;
    private static volatile x<SquircleShow> t;
    private int a;
    private String b = "";
    private String c = "";
    private boolean f;
    private o.i<SquircleShow> n = GeneratedMessageLite.emptyProtobufList();
    private NullableString o;
    private NullableString p;
    private Logging q;
    private int r;

    public static final class b extends GeneratedMessageLite.b<SquircleShow, b> implements Object {
        private b() {
            super(SquircleShow.s);
        }
    }

    static {
        SquircleShow squircleShow = new SquircleShow();
        s = squircleShow;
        squircleShow.makeImmutable();
    }

    private SquircleShow() {
    }

    public static SquircleShow h() {
        return s;
    }

    public static x<SquircleShow> parser() {
        return s.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                SquircleShow squircleShow = (SquircleShow) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !squircleShow.b.isEmpty(), squircleShow.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !squircleShow.c.isEmpty(), squircleShow.c);
                boolean z2 = this.f;
                boolean z3 = squircleShow.f;
                this.f = hVar.f(z2, z2, z3, z3);
                this.n = hVar.q(this.n, squircleShow.n);
                this.o = (NullableString) hVar.i(this.o, squircleShow.o);
                this.p = (NullableString) hVar.i(this.p, squircleShow.p);
                this.q = (Logging) hVar.i(this.q, squircleShow.q);
                int i = this.r;
                boolean z4 = i != 0;
                int i2 = squircleShow.r;
                if (i2 != 0) {
                    z = true;
                }
                this.r = hVar.m(z4, i, z, i2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= squircleShow.a;
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 24) {
                                this.f = gVar.h();
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(parser(), kVar));
                            } else if (B == 42) {
                                NullableString nullableString = this.o;
                                NullableString.b bVar = nullableString != null ? (NullableString.b) nullableString.toBuilder() : null;
                                NullableString nullableString2 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.o = nullableString2;
                                if (bVar != null) {
                                    bVar.mergeFrom((NullableString.b) nullableString2);
                                    this.o = (NullableString) bVar.buildPartial();
                                }
                            } else if (B == 50) {
                                NullableString nullableString3 = this.p;
                                NullableString.b bVar2 = nullableString3 != null ? (NullableString.b) nullableString3.toBuilder() : null;
                                NullableString nullableString4 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.p = nullableString4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((NullableString.b) nullableString4);
                                    this.p = (NullableString) bVar2.buildPartial();
                                }
                            } else if (B == 58) {
                                Logging logging = this.q;
                                Logging.b bVar3 = logging != null ? (Logging.b) logging.toBuilder() : null;
                                Logging logging2 = (Logging) gVar.o(Logging.parser(), kVar);
                                this.q = logging2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((Logging.b) logging2);
                                    this.q = (Logging) bVar3.buildPartial();
                                }
                            } else if (B == 64) {
                                this.r = gVar.u();
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
                this.n.C();
                return null;
            case 4:
                return new SquircleShow();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (SquircleShow.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        boolean z = this.f;
        if (z) {
            p2 += CodedOutputStream.d(3, z);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            p2 += CodedOutputStream.n(4, this.n.get(i2));
        }
        NullableString nullableString = this.o;
        if (nullableString != null) {
            p2 += CodedOutputStream.n(5, nullableString);
        }
        if (this.p != null) {
            p2 += CodedOutputStream.n(6, i());
        }
        if (this.q != null) {
            p2 += CodedOutputStream.n(7, l());
        }
        int i3 = this.r;
        if (i3 != 0) {
            p2 += CodedOutputStream.j(8, i3);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public NullableString i() {
        NullableString nullableString = this.p;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public Logging l() {
        Logging logging = this.q;
        return logging == null ? Logging.i() : logging;
    }

    public boolean m() {
        return this.f;
    }

    public String n() {
        return this.c;
    }

    public String o() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        boolean z = this.f;
        if (z) {
            codedOutputStream.A(3, z);
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.M(4, this.n.get(i));
        }
        NullableString nullableString = this.o;
        if (nullableString != null) {
            codedOutputStream.M(5, nullableString);
        }
        if (this.p != null) {
            codedOutputStream.M(6, i());
        }
        if (this.q != null) {
            codedOutputStream.M(7, l());
        }
        int i2 = this.r;
        if (i2 != 0) {
            codedOutputStream.K(8, i2);
        }
    }
}
