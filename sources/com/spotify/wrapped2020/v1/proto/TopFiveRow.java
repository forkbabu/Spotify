package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import java.io.IOException;

public final class TopFiveRow extends GeneratedMessageLite<TopFiveRow, b> implements Object {
    private static final TopFiveRow o;
    private static volatile x<TopFiveRow> p;
    private ColoredText a;
    private String b = "";
    private int c;
    private ColoredText f;
    private ColoredText n;

    public static final class b extends GeneratedMessageLite.b<TopFiveRow, b> implements Object {
        private b() {
            super(TopFiveRow.o);
        }
    }

    static {
        TopFiveRow topFiveRow = new TopFiveRow();
        o = topFiveRow;
        topFiveRow.makeImmutable();
    }

    private TopFiveRow() {
    }

    public static x<TopFiveRow> parser() {
        return o.getParserForType();
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
                TopFiveRow topFiveRow = (TopFiveRow) obj2;
                this.a = (ColoredText) hVar.i(this.a, topFiveRow.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !topFiveRow.b.isEmpty(), topFiveRow.b);
                int i = this.c;
                boolean z2 = i != 0;
                int i2 = topFiveRow.c;
                if (i2 != 0) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, i2);
                this.f = (ColoredText) hVar.i(this.f, topFiveRow.f);
                this.n = (ColoredText) hVar.i(this.n, topFiveRow.n);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                ColoredText coloredText = this.a;
                                ColoredText.b bVar = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.a = coloredText2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ColoredText.b) coloredText2);
                                    this.a = (ColoredText) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 24) {
                                this.c = gVar.u();
                            } else if (B == 34) {
                                ColoredText coloredText3 = this.f;
                                ColoredText.b bVar2 = coloredText3 != null ? (ColoredText.b) coloredText3.toBuilder() : null;
                                ColoredText coloredText4 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.f = coloredText4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ColoredText.b) coloredText4);
                                    this.f = (ColoredText) bVar2.buildPartial();
                                }
                            } else if (B == 42) {
                                ColoredText coloredText5 = this.n;
                                ColoredText.b bVar3 = coloredText5 != null ? (ColoredText.b) coloredText5.toBuilder() : null;
                                ColoredText coloredText6 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.n = coloredText6;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((ColoredText.b) coloredText6);
                                    this.n = (ColoredText) bVar3.buildPartial();
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
                return new TopFiveRow();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (TopFiveRow.class) {
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
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, l());
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (this.c != Gradient.VERSION_1.getNumber()) {
            i2 += CodedOutputStream.h(3, this.c);
        }
        if (this.f != null) {
            i2 += CodedOutputStream.n(4, n());
        }
        if (this.n != null) {
            i2 += CodedOutputStream.n(5, m());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Gradient h() {
        Gradient d = Gradient.d(this.c);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public String i() {
        return this.b;
    }

    public ColoredText l() {
        ColoredText coloredText = this.a;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public ColoredText m() {
        ColoredText coloredText = this.n;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public ColoredText n() {
        ColoredText coloredText = this.f;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public boolean o() {
        return this.n != null;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, l());
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (this.c != Gradient.VERSION_1.getNumber()) {
            codedOutputStream.K(3, this.c);
        }
        if (this.f != null) {
            codedOutputStream.M(4, n());
        }
        if (this.n != null) {
            codedOutputStream.M(5, m());
        }
    }
}
