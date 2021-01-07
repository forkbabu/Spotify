package com.spotify.music.artist.dac.proto;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class ArtistPageWithHeaderComponent extends GeneratedMessageLite<ArtistPageWithHeaderComponent, b> implements Object {
    private static final ArtistPageWithHeaderComponent f;
    private static volatile x<ArtistPageWithHeaderComponent> n;
    private int a;
    private Any b;
    private o.i<Any> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<ArtistPageWithHeaderComponent, b> implements Object {
        private b() {
            super(ArtistPageWithHeaderComponent.f);
        }
    }

    static {
        ArtistPageWithHeaderComponent artistPageWithHeaderComponent = new ArtistPageWithHeaderComponent();
        f = artistPageWithHeaderComponent;
        artistPageWithHeaderComponent.makeImmutable();
    }

    private ArtistPageWithHeaderComponent() {
    }

    public static ArtistPageWithHeaderComponent l(ByteString byteString) {
        return (ArtistPageWithHeaderComponent) GeneratedMessageLite.parseFrom(f, byteString);
    }

    public static x<ArtistPageWithHeaderComponent> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ArtistPageWithHeaderComponent artistPageWithHeaderComponent = (ArtistPageWithHeaderComponent) obj2;
                this.b = (Any) hVar.i(this.b, artistPageWithHeaderComponent.b);
                this.c = hVar.q(this.c, artistPageWithHeaderComponent.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= artistPageWithHeaderComponent.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                Any any = this.b;
                                Any.b bVar = any != null ? (Any.b) any.toBuilder() : null;
                                Any any2 = (Any) gVar.o(Any.parser(), kVar);
                                this.b = any2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Any.b) any2);
                                    this.b = (Any) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(Any.parser(), kVar));
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
                this.c.C();
                return null;
            case 4:
                return new ArtistPageWithHeaderComponent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ArtistPageWithHeaderComponent.class) {
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
        int n2 = this.b != null ? CodedOutputStream.n(1, i()) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public List<Any> h() {
        return this.c;
    }

    public Any i() {
        Any any = this.b;
        return any == null ? Any.h() : any;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != null) {
            codedOutputStream.M(1, i());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
