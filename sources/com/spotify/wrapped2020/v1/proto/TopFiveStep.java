package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import java.io.IOException;
import java.util.List;

public final class TopFiveStep extends GeneratedMessageLite<TopFiveStep, b> implements Object {
    private static final TopFiveStep f;
    private static volatile x<TopFiveStep> n;
    private int a;
    private ColoredText b;
    private o.i<TopFiveRow> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<TopFiveStep, b> implements Object {
        private b() {
            super(TopFiveStep.f);
        }
    }

    static {
        TopFiveStep topFiveStep = new TopFiveStep();
        f = topFiveStep;
        topFiveStep.makeImmutable();
    }

    private TopFiveStep() {
    }

    public static TopFiveStep h() {
        return f;
    }

    public static x<TopFiveStep> parser() {
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
                TopFiveStep topFiveStep = (TopFiveStep) obj2;
                this.b = (ColoredText) hVar.i(this.b, topFiveStep.b);
                this.c = hVar.q(this.c, topFiveStep.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= topFiveStep.a;
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
                                ColoredText coloredText = this.b;
                                ColoredText.b bVar = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.b = coloredText2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ColoredText.b) coloredText2);
                                    this.b = (ColoredText) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(TopFiveRow.parser(), kVar));
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
                return new TopFiveStep();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (TopFiveStep.class) {
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
        int n2 = this.b != null ? CodedOutputStream.n(1, l()) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public List<TopFiveRow> i() {
        return this.c;
    }

    public ColoredText l() {
        ColoredText coloredText = this.b;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.b != null) {
            codedOutputStream.M(1, l());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
