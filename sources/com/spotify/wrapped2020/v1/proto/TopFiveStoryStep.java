package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.TeaserStep;
import com.spotify.wrapped2020.v1.proto.TopFiveStep;
import java.io.IOException;

public final class TopFiveStoryStep extends GeneratedMessageLite<TopFiveStoryStep, b> implements Object {
    private static final TopFiveStoryStep c;
    private static volatile x<TopFiveStoryStep> f;
    private int a = 0;
    private Object b;

    public enum StepOneofCase implements o.c {
        TEASER(1),
        TOP_FIVE(2),
        STEPONEOF_NOT_SET(0);
        
        private final int value;

        private StepOneofCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<TopFiveStoryStep, b> implements Object {
        private b() {
            super(TopFiveStoryStep.c);
        }
    }

    static {
        TopFiveStoryStep topFiveStoryStep = new TopFiveStoryStep();
        c = topFiveStoryStep;
        topFiveStoryStep.makeImmutable();
    }

    private TopFiveStoryStep() {
    }

    public static x<TopFiveStoryStep> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TopFiveStoryStep topFiveStoryStep = (TopFiveStoryStep) obj2;
                int ordinal = topFiveStoryStep.h().ordinal();
                if (ordinal == 0) {
                    if (this.a != 1) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, topFiveStoryStep.b);
                } else if (ordinal == 1) {
                    if (this.a != 2) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, topFiveStoryStep.b);
                } else if (ordinal == 2) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = topFiveStoryStep.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                TeaserStep.b bVar = this.a == 1 ? (TeaserStep.b) ((TeaserStep) this.b).toBuilder() : null;
                                u o = gVar.o(TeaserStep.parser(), kVar);
                                this.b = o;
                                if (bVar != null) {
                                    bVar.mergeFrom((TeaserStep.b) ((TeaserStep) o));
                                    this.b = bVar.buildPartial();
                                }
                                this.a = 1;
                            } else if (B == 18) {
                                TopFiveStep.b bVar2 = this.a == 2 ? (TopFiveStep.b) ((TopFiveStep) this.b).toBuilder() : null;
                                u o2 = gVar.o(TopFiveStep.parser(), kVar);
                                this.b = o2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((TopFiveStep.b) ((TopFiveStep) o2));
                                    this.b = bVar2.buildPartial();
                                }
                                this.a = 2;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return new TopFiveStoryStep();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (TopFiveStoryStep.class) {
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
        if (this.a == 1) {
            i2 = 0 + CodedOutputStream.n(1, (TeaserStep) this.b);
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (TopFiveStep) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public StepOneofCase h() {
        int i = this.a;
        if (i == 0) {
            return StepOneofCase.STEPONEOF_NOT_SET;
        }
        if (i == 1) {
            return StepOneofCase.TEASER;
        }
        if (i != 2) {
            return null;
        }
        return StepOneofCase.TOP_FIVE;
    }

    public TeaserStep i() {
        if (this.a == 1) {
            return (TeaserStep) this.b;
        }
        return TeaserStep.h();
    }

    public TopFiveStep l() {
        if (this.a == 2) {
            return (TopFiveStep) this.b;
        }
        return TopFiveStep.h();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.M(1, (TeaserStep) this.b);
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (TopFiveStep) this.b);
        }
    }
}
