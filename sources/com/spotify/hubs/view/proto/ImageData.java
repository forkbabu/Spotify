package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ImageData extends GeneratedMessageLite<ImageData, b> implements Object {
    private static final ImageData n;
    private static volatile x<ImageData> o;
    private String a = "";
    private String b = "";
    private String c = "";
    private Struct f;

    public static final class b extends GeneratedMessageLite.b<ImageData, b> implements Object {
        private b() {
            super(ImageData.n);
        }
    }

    static {
        ImageData imageData = new ImageData();
        n = imageData;
        imageData.makeImmutable();
    }

    private ImageData() {
    }

    public static ImageData i() {
        return n;
    }

    public static x<ImageData> parser() {
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
                ImageData imageData = (ImageData) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !imageData.a.isEmpty(), imageData.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !imageData.b.isEmpty(), imageData.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ imageData.c.isEmpty(), imageData.c);
                this.f = (Struct) hVar.i(this.f, imageData.f);
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
                                Struct struct = this.f;
                                Struct.b bVar = struct != null ? (Struct.b) struct.toBuilder() : null;
                                Struct struct2 = (Struct) gVar.o(Struct.parser(), kVar);
                                this.f = struct2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Struct.b) struct2);
                                    this.f = (Struct) bVar.buildPartial();
                                }
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
                return new ImageData();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (ImageData.class) {
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
        if (this.f != null) {
            i2 += CodedOutputStream.n(4, h());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Struct h() {
        Struct struct = this.f;
        return struct == null ? Struct.h() : struct;
    }

    public String l() {
        return this.b;
    }

    public String m() {
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
        if (this.f != null) {
            codedOutputStream.M(4, h());
        }
    }
}
