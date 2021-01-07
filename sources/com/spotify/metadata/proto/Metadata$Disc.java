package com.spotify.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Metadata$Disc extends GeneratedMessageLite<Metadata$Disc, a> implements Object {
    private static final Metadata$Disc n;
    private static volatile x<Metadata$Disc> o;
    private int a;
    private int b;
    private String c = "";
    private o.i<Metadata$Track> f = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<Metadata$Disc, a> implements Object {
        private a() {
            super(Metadata$Disc.n);
        }
    }

    static {
        Metadata$Disc metadata$Disc = new Metadata$Disc();
        n = metadata$Disc;
        metadata$Disc.makeImmutable();
    }

    private Metadata$Disc() {
    }

    public static x<Metadata$Disc> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Disc metadata$Disc = (Metadata$Disc) obj2;
                this.b = hVar.m((this.a & 1) == 1, this.b, (metadata$Disc.a & 1) == 1, metadata$Disc.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((metadata$Disc.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, metadata$Disc.c);
                this.f = hVar.q(this.f, metadata$Disc.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Disc.a;
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
                                this.b = gVar.y();
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(Metadata$Track.parser(), kVar));
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
                this.f.C();
                return null;
            case 4:
                return new Metadata$Disc();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (Metadata$Disc.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int o2 = (this.a & 1) == 1 ? CodedOutputStream.o(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            o2 += CodedOutputStream.p(2, this.c);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            o2 += CodedOutputStream.n(3, this.f.get(i2));
        }
        int c2 = this.unknownFields.c() + o2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<Metadata$Track> h() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.O(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
