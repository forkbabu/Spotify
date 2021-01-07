package com.spotify.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Metadata$Biography extends GeneratedMessageLite<Metadata$Biography, a> implements Object {
    private static final Metadata$Biography o;
    private static volatile x<Metadata$Biography> p;
    private int a;
    private String b = "";
    private o.i<Metadata$Image> c = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$ImageGroup> f = GeneratedMessageLite.emptyProtobufList();
    private o.i<Metadata$LocalizedString> n = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<Metadata$Biography, a> implements Object {
        private a() {
            super(Metadata$Biography.o);
        }
    }

    static {
        Metadata$Biography metadata$Biography = new Metadata$Biography();
        o = metadata$Biography;
        metadata$Biography.makeImmutable();
    }

    private Metadata$Biography() {
    }

    public static x<Metadata$Biography> parser() {
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
                Metadata$Biography metadata$Biography = (Metadata$Biography) obj2;
                boolean z2 = (this.a & 1) == 1;
                String str = this.b;
                if ((metadata$Biography.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.n(z2, str, z, metadata$Biography.b);
                this.c = hVar.q(this.c, metadata$Biography.c);
                this.f = hVar.q(this.f, metadata$Biography.f);
                this.n = hVar.q(this.n, metadata$Biography.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Biography.a;
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
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Metadata$Image.parser(), kVar));
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(Metadata$ImageGroup.parser(), kVar));
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(Metadata$LocalizedString.parser(), kVar));
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
                this.c.C();
                this.f.C();
                this.n.C();
                return null;
            case 4:
                return new Metadata$Biography();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Metadata$Biography.class) {
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
        int p2 = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            p2 += CodedOutputStream.n(3, this.f.get(i3));
        }
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            p2 += CodedOutputStream.n(4, this.n.get(i4));
        }
        int c2 = this.unknownFields.c() + p2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.M(3, this.f.get(i2));
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            codedOutputStream.M(4, this.n.get(i3));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
