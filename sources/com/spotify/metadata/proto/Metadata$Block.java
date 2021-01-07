package com.spotify.metadata.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Metadata$Block extends GeneratedMessageLite<Metadata$Block, a> implements Object {
    private static final Metadata$Block f;
    private static volatile x<Metadata$Block> n;
    private int a;
    private String b = "";
    private int c;

    public enum Type implements o.c {
        TOTAL(0),
        COVERARTCP(1);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<Metadata$Block, a> implements Object {
        private a() {
            super(Metadata$Block.f);
        }
    }

    static {
        Metadata$Block metadata$Block = new Metadata$Block();
        f = metadata$Block;
        metadata$Block.makeImmutable();
    }

    private Metadata$Block() {
    }

    public static x<Metadata$Block> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Type type;
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$Block metadata$Block = (Metadata$Block) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (metadata$Block.a & 1) == 1, metadata$Block.b);
                boolean z2 = (this.a & 2) == 2;
                int i = this.c;
                if ((metadata$Block.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, metadata$Block.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$Block.a;
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
                            } else if (B == 16) {
                                int u = gVar.u();
                                if (u == 0) {
                                    type = Type.TOTAL;
                                } else if (u != 1) {
                                    type = null;
                                } else {
                                    type = Type.COVERARTCP;
                                }
                                if (type == null) {
                                    super.mergeVarintField(2, u);
                                } else {
                                    this.a |= 2;
                                    this.c = u;
                                }
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
                return null;
            case 4:
                return new Metadata$Block();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Metadata$Block.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
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
            i2 += CodedOutputStream.h(2, this.c);
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
            codedOutputStream.K(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
