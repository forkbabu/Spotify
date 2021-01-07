package com.spotify.music.artist.dac.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ArtistAlbumRowComponent extends GeneratedMessageLite<ArtistAlbumRowComponent, b> implements Object {
    private static final ArtistAlbumRowComponent n;
    private static volatile x<ArtistAlbumRowComponent> o;
    private String a = "";
    private String b = "";
    private String c = "";
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<ArtistAlbumRowComponent, b> implements Object {
        private b() {
            super(ArtistAlbumRowComponent.n);
        }
    }

    static {
        ArtistAlbumRowComponent artistAlbumRowComponent = new ArtistAlbumRowComponent();
        n = artistAlbumRowComponent;
        artistAlbumRowComponent.makeImmutable();
    }

    private ArtistAlbumRowComponent() {
    }

    public static ArtistAlbumRowComponent m(ByteString byteString) {
        return (ArtistAlbumRowComponent) GeneratedMessageLite.parseFrom(n, byteString);
    }

    public static x<ArtistAlbumRowComponent> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ArtistAlbumRowComponent artistAlbumRowComponent = (ArtistAlbumRowComponent) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !artistAlbumRowComponent.a.isEmpty(), artistAlbumRowComponent.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !artistAlbumRowComponent.b.isEmpty(), artistAlbumRowComponent.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !artistAlbumRowComponent.c.isEmpty(), artistAlbumRowComponent.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ artistAlbumRowComponent.f.isEmpty(), artistAlbumRowComponent.f);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                this.f = gVar.A();
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
                return null;
            case 4:
                return new ArtistAlbumRowComponent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (ArtistAlbumRowComponent.class) {
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
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.b;
    }

    public String l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
    }
}
