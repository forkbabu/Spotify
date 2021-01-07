package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.t;
import com.google.protobuf.x;
import com.spotify.hubs.view.proto.ImageData;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class Images extends GeneratedMessageLite<Images, b> implements Object {
    private static final Images o;
    private static volatile x<Images> p;
    private int a;
    private String b = "";
    private ImageData c;
    private ImageData f;
    private MapFieldLite<String, ImageData> n = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<Images, b> implements Object {
        private b() {
            super(Images.o);
        }
    }

    private static final class c {
        static final t<String, ImageData> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, ImageData.i());
    }

    static {
        Images images = new Images();
        o = images;
        images.makeImmutable();
    }

    private Images() {
    }

    public static Images l() {
        return o;
    }

    public static x<Images> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Images images = (Images) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ images.b.isEmpty(), images.b);
                this.c = (ImageData) hVar.i(this.c, images.c);
                this.f = (ImageData) hVar.i(this.f, images.f);
                this.n = hVar.c(this.n, images.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= images.a;
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
                                ImageData imageData = this.c;
                                ImageData.b bVar = imageData != null ? (ImageData.b) imageData.toBuilder() : null;
                                ImageData imageData2 = (ImageData) gVar.o(ImageData.parser(), kVar);
                                this.c = imageData2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ImageData.b) imageData2);
                                    this.c = (ImageData) bVar.buildPartial();
                                }
                            } else if (B == 26) {
                                ImageData imageData3 = this.f;
                                ImageData.b bVar2 = imageData3 != null ? (ImageData.b) imageData3.toBuilder() : null;
                                ImageData imageData4 = (ImageData) gVar.o(ImageData.parser(), kVar);
                                this.f = imageData4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ImageData.b) imageData4);
                                    this.f = (ImageData) bVar2.buildPartial();
                                }
                            } else if (B == 34) {
                                if (!this.n.f()) {
                                    this.n = this.n.k();
                                }
                                c.a.d(this.n, gVar, kVar);
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
                this.n.g();
                return null;
            case 4:
                return new Images();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Images.class) {
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
        int i2 = 0;
        if (!this.b.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if (this.c != null) {
            i2 += CodedOutputStream.n(2, n());
        }
        if (this.f != null) {
            i2 += CodedOutputStream.n(3, h());
        }
        for (Map.Entry<String, ImageData> entry : this.n.entrySet()) {
            i2 = je.j1(entry, c.a, 4, entry.getKey(), i2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ImageData h() {
        ImageData imageData = this.f;
        return imageData == null ? ImageData.i() : imageData;
    }

    public Map<String, ImageData> i() {
        return Collections.unmodifiableMap(this.n);
    }

    public String m() {
        return this.b;
    }

    public ImageData n() {
        ImageData imageData = this.c;
        return imageData == null ? ImageData.i() : imageData;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (this.c != null) {
            codedOutputStream.M(2, n());
        }
        if (this.f != null) {
            codedOutputStream.M(3, h());
        }
        for (Map.Entry<String, ImageData> entry : this.n.entrySet()) {
            c.a.e(codedOutputStream, 4, entry.getKey(), entry.getValue());
        }
    }
}
