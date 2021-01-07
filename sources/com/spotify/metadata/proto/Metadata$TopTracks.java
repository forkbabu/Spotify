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

public final class Metadata$TopTracks extends GeneratedMessageLite<Metadata$TopTracks, a> implements Object {
    private static final Metadata$TopTracks f;
    private static volatile x<Metadata$TopTracks> n;
    private int a;
    private String b = "";
    private o.i<Metadata$Track> c = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<Metadata$TopTracks, a> implements Object {
        private a() {
            super(Metadata$TopTracks.f);
        }
    }

    static {
        Metadata$TopTracks metadata$TopTracks = new Metadata$TopTracks();
        f = metadata$TopTracks;
        metadata$TopTracks.makeImmutable();
    }

    private Metadata$TopTracks() {
    }

    public static x<Metadata$TopTracks> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Metadata$TopTracks metadata$TopTracks = (Metadata$TopTracks) obj2;
                boolean z2 = (this.a & 1) == 1;
                String str = this.b;
                if ((metadata$TopTracks.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.n(z2, str, z, metadata$TopTracks.b);
                this.c = hVar.q(this.c, metadata$TopTracks.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= metadata$TopTracks.a;
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
                                this.c.add(gVar.o(Metadata$Track.parser(), kVar));
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
                return null;
            case 4:
                return new Metadata$TopTracks();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Metadata$TopTracks.class) {
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
        int p = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p += CodedOutputStream.n(2, this.c.get(i2));
        }
        int c2 = this.unknownFields.c() + p;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<Metadata$Track> h() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
