package com.spotify.music.artist.dac.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ArtistTrackRowComponent extends GeneratedMessageLite<ArtistTrackRowComponent, b> implements Object {
    private static final ArtistTrackRowComponent q;
    private static volatile x<ArtistTrackRowComponent> r;
    private String a = "";
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private boolean o;
    private boolean p;

    public static final class b extends GeneratedMessageLite.b<ArtistTrackRowComponent, b> implements Object {
        private b() {
            super(ArtistTrackRowComponent.q);
        }
    }

    static {
        ArtistTrackRowComponent artistTrackRowComponent = new ArtistTrackRowComponent();
        q = artistTrackRowComponent;
        artistTrackRowComponent.makeImmutable();
    }

    private ArtistTrackRowComponent() {
    }

    public static ArtistTrackRowComponent p(ByteString byteString) {
        return (ArtistTrackRowComponent) GeneratedMessageLite.parseFrom(q, byteString);
    }

    public static x<ArtistTrackRowComponent> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ArtistTrackRowComponent artistTrackRowComponent = (ArtistTrackRowComponent) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !artistTrackRowComponent.a.isEmpty(), artistTrackRowComponent.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !artistTrackRowComponent.b.isEmpty(), artistTrackRowComponent.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !artistTrackRowComponent.c.isEmpty(), artistTrackRowComponent.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !artistTrackRowComponent.f.isEmpty(), artistTrackRowComponent.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ artistTrackRowComponent.n.isEmpty(), artistTrackRowComponent.n);
                boolean z = this.o;
                boolean z2 = artistTrackRowComponent.o;
                this.o = hVar.f(z, z, z2, z2);
                boolean z3 = this.p;
                boolean z4 = artistTrackRowComponent.p;
                this.p = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z5 = false;
                while (!z5) {
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
                            } else if (B == 42) {
                                this.n = gVar.A();
                            } else if (B == 48) {
                                this.o = gVar.h();
                            } else if (B == 56) {
                                this.p = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z5 = true;
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
                return new ArtistTrackRowComponent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (ArtistTrackRowComponent.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
    }

    public boolean getIsExplicit() {
        return this.o;
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
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        boolean z = this.o;
        if (z) {
            i2 += CodedOutputStream.d(6, z);
        }
        boolean z2 = this.p;
        if (z2) {
            i2 += CodedOutputStream.d(7, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.c;
    }

    public boolean i() {
        return this.p;
    }

    public String l() {
        return this.n;
    }

    public String m() {
        return this.f;
    }

    public String n() {
        return this.b;
    }

    public String o() {
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
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        boolean z = this.o;
        if (z) {
            codedOutputStream.A(6, z);
        }
        boolean z2 = this.p;
        if (z2) {
            codedOutputStream.A(7, z2);
        }
    }
}
