package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import java.io.IOException;

public final class TeaserStep extends GeneratedMessageLite<TeaserStep, b> implements Object {
    private static final TeaserStep c;
    private static volatile x<TeaserStep> f;
    private Paragraph a;
    private Paragraph b;

    public static final class b extends GeneratedMessageLite.b<TeaserStep, b> implements Object {
        private b() {
            super(TeaserStep.c);
        }
    }

    static {
        TeaserStep teaserStep = new TeaserStep();
        c = teaserStep;
        teaserStep.makeImmutable();
    }

    private TeaserStep() {
    }

    public static TeaserStep h() {
        return c;
    }

    public static x<TeaserStep> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TeaserStep teaserStep = (TeaserStep) obj2;
                this.a = (Paragraph) hVar.i(this.a, teaserStep.a);
                this.b = (Paragraph) hVar.i(this.b, teaserStep.b);
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
                                Paragraph paragraph = this.a;
                                Paragraph.b bVar = paragraph != null ? (Paragraph.b) paragraph.toBuilder() : null;
                                Paragraph paragraph2 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                this.a = paragraph2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Paragraph.b) paragraph2);
                                    this.a = (Paragraph) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                Paragraph paragraph3 = this.b;
                                Paragraph.b bVar2 = paragraph3 != null ? (Paragraph.b) paragraph3.toBuilder() : null;
                                Paragraph paragraph4 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                this.b = paragraph4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Paragraph.b) paragraph4);
                                    this.b = (Paragraph) bVar2.buildPartial();
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
                return new TeaserStep();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (TeaserStep.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
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
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, i());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Paragraph i() {
        Paragraph paragraph = this.b;
        return paragraph == null ? Paragraph.h() : paragraph;
    }

    public Paragraph l() {
        Paragraph paragraph = this.a;
        return paragraph == null ? Paragraph.h() : paragraph;
    }

    public boolean m() {
        return this.b != null;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, l());
        }
        if (this.b != null) {
            codedOutputStream.M(2, i());
        }
    }
}
