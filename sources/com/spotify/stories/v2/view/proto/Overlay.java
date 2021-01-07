package com.spotify.stories.v2.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Overlay extends GeneratedMessageLite<Overlay, b> implements Object {
    private static final Overlay r;
    private static volatile x<Overlay> s;
    private String a = "";
    private String b = "";
    private String c = "";
    private int f;
    private String n = "";
    private String o = "";
    private String p = "";
    private int q;

    public enum ImageStyle implements o.c {
        NONE(0),
        SQUARE(1),
        CIRCULAR(2),
        ROUNDED(3),
        UNRECOGNIZED(-1);
        
        private final int value;

        private ImageStyle(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Type implements o.c {
        UNKNOWN(0),
        TRACK(1),
        ALBUM(2),
        ARTIST(3),
        PLAYLIST(4),
        EPISODE(5),
        SHOW(6),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Overlay, b> implements Object {
        private b() {
            super(Overlay.r);
        }
    }

    static {
        Overlay overlay = new Overlay();
        r = overlay;
        overlay.makeImmutable();
    }

    private Overlay() {
    }

    public static Overlay l() {
        return r;
    }

    public static x<Overlay> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Overlay overlay = (Overlay) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !overlay.a.isEmpty(), overlay.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !overlay.b.isEmpty(), overlay.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !overlay.c.isEmpty(), overlay.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = overlay.f;
                this.f = hVar.m(z2, i, i2 != 0, i2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !overlay.n.isEmpty(), overlay.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !overlay.o.isEmpty(), overlay.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !overlay.p.isEmpty(), overlay.p);
                int i3 = this.q;
                boolean z3 = i3 != 0;
                int i4 = overlay.q;
                if (i4 != 0) {
                    z = true;
                }
                this.q = hVar.m(z3, i3, z, i4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
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
                            } else if (B == 32) {
                                this.f = gVar.u();
                            } else if (B == 42) {
                                this.n = gVar.A();
                            } else if (B == 50) {
                                this.o = gVar.A();
                            } else if (B == 58) {
                                this.p = gVar.A();
                            } else if (B == 64) {
                                this.q = gVar.u();
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
                return new Overlay();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (Overlay.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
        if (this.f != ImageStyle.NONE.getNumber()) {
            i2 += CodedOutputStream.h(4, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        if (this.q != Type.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.h(8, this.q);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.n;
    }

    public String i() {
        return this.p;
    }

    public String m() {
        return this.o;
    }

    public ImageStyle n() {
        ImageStyle imageStyle;
        int i = this.f;
        if (i == 0) {
            imageStyle = ImageStyle.NONE;
        } else if (i == 1) {
            imageStyle = ImageStyle.SQUARE;
        } else if (i == 2) {
            imageStyle = ImageStyle.CIRCULAR;
        } else if (i != 3) {
            imageStyle = null;
        } else {
            imageStyle = ImageStyle.ROUNDED;
        }
        return imageStyle == null ? ImageStyle.UNRECOGNIZED : imageStyle;
    }

    public String o() {
        return this.c;
    }

    public String p() {
        return this.b;
    }

    public String q() {
        return this.a;
    }

    public Type r() {
        Type type;
        switch (this.q) {
            case 0:
                type = Type.UNKNOWN;
                break;
            case 1:
                type = Type.TRACK;
                break;
            case 2:
                type = Type.ALBUM;
                break;
            case 3:
                type = Type.ARTIST;
                break;
            case 4:
                type = Type.PLAYLIST;
                break;
            case 5:
                type = Type.EPISODE;
                break;
            case 6:
                type = Type.SHOW;
                break;
            default:
                type = null;
                break;
        }
        return type == null ? Type.UNRECOGNIZED : type;
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
        if (this.f != ImageStyle.NONE.getNumber()) {
            codedOutputStream.K(4, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
        if (this.q != Type.UNKNOWN.getNumber()) {
            codedOutputStream.K(8, this.q);
        }
    }
}
