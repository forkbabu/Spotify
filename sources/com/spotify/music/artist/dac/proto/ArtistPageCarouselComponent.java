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

public final class ArtistPageCarouselComponent extends GeneratedMessageLite<ArtistPageCarouselComponent, b> implements Object {
    private static final ArtistPageCarouselComponent f;
    private static volatile x<ArtistPageCarouselComponent> n;
    private int a;
    private String b = "";
    private o.i<Any> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<ArtistPageCarouselComponent, b> implements Object {
        private b() {
            super(ArtistPageCarouselComponent.f);
        }
    }

    static {
        ArtistPageCarouselComponent artistPageCarouselComponent = new ArtistPageCarouselComponent();
        f = artistPageCarouselComponent;
        artistPageCarouselComponent.makeImmutable();
    }

    private ArtistPageCarouselComponent() {
    }

    public static ArtistPageCarouselComponent l(ByteString byteString) {
        return (ArtistPageCarouselComponent) GeneratedMessageLite.parseFrom(f, byteString);
    }

    public static x<ArtistPageCarouselComponent> parser() {
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
                ArtistPageCarouselComponent artistPageCarouselComponent = (ArtistPageCarouselComponent) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ artistPageCarouselComponent.b.isEmpty(), artistPageCarouselComponent.b);
                this.c = hVar.q(this.c, artistPageCarouselComponent.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= artistPageCarouselComponent.a;
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
                                this.b = gVar.A();
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
                return new ArtistPageCarouselComponent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ArtistPageCarouselComponent.class) {
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
        int p = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = p;
        return p;
    }

    public List<Any> h() {
        return this.c;
    }

    public String i() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
