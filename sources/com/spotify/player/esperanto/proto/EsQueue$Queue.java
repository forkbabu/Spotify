package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import java.io.IOException;
import java.util.List;

public final class EsQueue$Queue extends GeneratedMessageLite<EsQueue$Queue, a> implements Object {
    private static final EsQueue$Queue o;
    private static volatile x<EsQueue$Queue> p;
    private int a;
    private long b;
    private EsProvidedTrack$ProvidedTrack c;
    private o.i<EsProvidedTrack$ProvidedTrack> f = GeneratedMessageLite.emptyProtobufList();
    private o.i<EsProvidedTrack$ProvidedTrack> n = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<EsQueue$Queue, a> implements Object {
        private a() {
            super(EsQueue$Queue.o);
        }
    }

    static {
        EsQueue$Queue esQueue$Queue = new EsQueue$Queue();
        o = esQueue$Queue;
        esQueue$Queue.makeImmutable();
    }

    private EsQueue$Queue() {
    }

    public static x<EsQueue$Queue> parser() {
        return o.getParserForType();
    }

    public static EsQueue$Queue q(byte[] bArr) {
        return (EsQueue$Queue) GeneratedMessageLite.parseFrom(o, bArr);
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
                EsQueue$Queue esQueue$Queue = (EsQueue$Queue) obj2;
                long j = this.b;
                boolean z2 = j != 0;
                long j2 = esQueue$Queue.b;
                this.b = hVar.s(z2, j, j2 != 0, j2);
                this.c = (EsProvidedTrack$ProvidedTrack) hVar.i(this.c, esQueue$Queue.c);
                this.f = hVar.q(this.f, esQueue$Queue.f);
                this.n = hVar.q(this.n, esQueue$Queue.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= esQueue$Queue.a;
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
                                this.b = gVar.w();
                            } else if (B == 18) {
                                EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.c;
                                EsProvidedTrack$ProvidedTrack.a aVar = esProvidedTrack$ProvidedTrack != null ? (EsProvidedTrack$ProvidedTrack.a) esProvidedTrack$ProvidedTrack.toBuilder() : null;
                                EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack2 = (EsProvidedTrack$ProvidedTrack) gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar);
                                this.c = esProvidedTrack$ProvidedTrack2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsProvidedTrack$ProvidedTrack.a) esProvidedTrack$ProvidedTrack2);
                                    this.c = (EsProvidedTrack$ProvidedTrack) aVar.buildPartial();
                                }
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar));
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(EsProvidedTrack$ProvidedTrack.parser(), kVar));
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
                this.f.C();
                this.n.C();
                return null;
            case 4:
                return new EsQueue$Queue();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (EsQueue$Queue.class) {
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
        long j = this.b;
        int u = j != 0 ? CodedOutputStream.u(1, j) + 0 : 0;
        if (this.c != null) {
            u += CodedOutputStream.n(2, o());
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            u += CodedOutputStream.n(3, this.f.get(i2));
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            u += CodedOutputStream.n(4, this.n.get(i3));
        }
        this.memoizedSerializedSize = u;
        return u;
    }

    public int h() {
        return this.f.size();
    }

    public List<EsProvidedTrack$ProvidedTrack> i() {
        return this.f;
    }

    public int l() {
        return this.n.size();
    }

    public List<EsProvidedTrack$ProvidedTrack> m() {
        return this.n;
    }

    public long n() {
        return this.b;
    }

    public EsProvidedTrack$ProvidedTrack o() {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.c;
        return esProvidedTrack$ProvidedTrack == null ? EsProvidedTrack$ProvidedTrack.m() : esProvidedTrack$ProvidedTrack;
    }

    public boolean p() {
        return this.c != null;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        long j = this.b;
        if (j != 0) {
            codedOutputStream.U(1, j);
        }
        if (this.c != null) {
            codedOutputStream.M(2, o());
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            codedOutputStream.M(4, this.n.get(i2));
        }
    }
}
