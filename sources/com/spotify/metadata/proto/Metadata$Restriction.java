package com.spotify.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Metadata$Restriction extends GeneratedMessageLite<Metadata$Restriction, a> implements Object {
    private static final Metadata$Restriction p;
    private static volatile x<Metadata$Restriction> q;
    private int a;
    private o.f b = GeneratedMessageLite.emptyIntList();
    private String c = "";
    private String f = "";
    private int n;
    private o.i<String> o = GeneratedMessageLite.emptyProtobufList();

    public enum Catalogue implements o.c {
        AD(0),
        SUBSCRIPTION(1),
        CATALOGUE_ALL(2),
        SHUFFLE(3),
        COMMERCIAL(4);
        
        private final int value;

        private Catalogue(int i) {
            this.value = i;
        }

        public static Catalogue d(int i) {
            if (i == 0) {
                return AD;
            }
            if (i == 1) {
                return SUBSCRIPTION;
            }
            if (i == 2) {
                return CATALOGUE_ALL;
            }
            if (i == 3) {
                return SHUFFLE;
            }
            if (i != 4) {
                return null;
            }
            return COMMERCIAL;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Type implements o.c {
        STREAMING(0);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Metadata$Restriction, a> implements Object {
        private a() {
            super(Metadata$Restriction.p);
        }
    }

    static {
        Metadata$Restriction metadata$Restriction = new Metadata$Restriction();
        p = metadata$Restriction;
        metadata$Restriction.makeImmutable();
    }

    private Metadata$Restriction() {
    }

    public static x<Metadata$Restriction> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Type type;
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Restriction metadata$Restriction = (Metadata$Restriction) obj2;
                this.b = hVar.h(this.b, metadata$Restriction.b);
                this.c = hVar.n((this.a & 1) == 1, this.c, (metadata$Restriction.a & 1) == 1, metadata$Restriction.c);
                this.f = hVar.n((this.a & 2) == 2, this.f, (metadata$Restriction.a & 2) == 2, metadata$Restriction.f);
                boolean z2 = (this.a & 4) == 4;
                int i = this.n;
                if ((metadata$Restriction.a & 4) == 4) {
                    z = true;
                }
                this.n = hVar.m(z2, i, z, metadata$Restriction.n);
                this.o = hVar.q(this.o, metadata$Restriction.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Restriction.a;
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
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                int u = gVar.u();
                                if (Catalogue.d(u) == null) {
                                    super.mergeVarintField(1, u);
                                } else {
                                    this.b.i1(u);
                                }
                            } else if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                int g = gVar.g(gVar.u());
                                while (gVar.b() > 0) {
                                    int u2 = gVar.u();
                                    if (Catalogue.d(u2) == null) {
                                        super.mergeVarintField(1, u2);
                                    } else {
                                        this.b.i1(u2);
                                    }
                                }
                                gVar.f(g);
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.c = z3;
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.f = z4;
                            } else if (B == 32) {
                                int u3 = gVar.u();
                                if (u3 != 0) {
                                    type = null;
                                } else {
                                    type = Type.STREAMING;
                                }
                                if (type == null) {
                                    super.mergeVarintField(4, u3);
                                } else {
                                    this.a |= 4;
                                    this.n = u3;
                                }
                            } else if (B == 42) {
                                String z5 = gVar.z();
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(z5);
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
                this.b.C();
                this.o.C();
                return null;
            case 4:
                return new Metadata$Restriction();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (Metadata$Restriction.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.k(this.b.T1(i3));
        }
        int size = (this.b.size() * 1) + i2 + 0;
        if ((this.a & 1) == 1) {
            size += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 2) == 2) {
            size += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 4) == 4) {
            size += CodedOutputStream.h(4, this.n);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.o.size(); i5++) {
            i4 += CodedOutputStream.q(this.o.get(i5));
        }
        int c2 = this.unknownFields.c() + je.C0(this.o, 1, size + i4);
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.K(1, this.b.T1(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.K(4, this.n);
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            codedOutputStream.P(5, this.o.get(i2));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
