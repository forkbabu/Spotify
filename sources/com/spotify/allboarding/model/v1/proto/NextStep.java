package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.NextAction;
import com.spotify.allboarding.model.v1.proto.NextScreen;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.io.IOException;

public final class NextStep extends GeneratedMessageLite<NextStep, b> implements Object {
    private static final NextStep f;
    private static volatile x<NextStep> n;
    private NextAction a;
    private NextScreen b;
    private NullableString c;

    public static final class b extends GeneratedMessageLite.b<NextStep, b> implements Object {
        private b() {
            super(NextStep.f);
        }
    }

    static {
        NextStep nextStep = new NextStep();
        f = nextStep;
        nextStep.makeImmutable();
    }

    private NextStep() {
    }

    public static NextStep l() {
        return f;
    }

    public static x<NextStep> parser() {
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
                NextStep nextStep = (NextStep) obj2;
                this.a = (NextAction) hVar.i(this.a, nextStep.a);
                this.b = (NextScreen) hVar.i(this.b, nextStep.b);
                this.c = (NullableString) hVar.i(this.c, nextStep.c);
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
                                NextAction nextAction = this.a;
                                NextAction.b bVar = nextAction != null ? (NextAction.b) nextAction.toBuilder() : null;
                                NextAction nextAction2 = (NextAction) gVar.o(NextAction.parser(), kVar);
                                this.a = nextAction2;
                                if (bVar != null) {
                                    bVar.mergeFrom((NextAction.b) nextAction2);
                                    this.a = (NextAction) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                NextScreen nextScreen = this.b;
                                NextScreen.b bVar2 = nextScreen != null ? (NextScreen.b) nextScreen.toBuilder() : null;
                                NextScreen nextScreen2 = (NextScreen) gVar.o(NextScreen.parser(), kVar);
                                this.b = nextScreen2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((NextScreen.b) nextScreen2);
                                    this.b = (NextScreen) bVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                NullableString nullableString = this.c;
                                NullableString.b bVar3 = nullableString != null ? (NullableString.b) nullableString.toBuilder() : null;
                                NullableString nullableString2 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.c = nullableString2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((NullableString.b) nullableString2);
                                    this.c = (NullableString) bVar3.buildPartial();
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
                return new NextStep();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (NextStep.class) {
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
        int i2 = 0;
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, h());
        }
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, m());
        }
        if (this.c != null) {
            i2 += CodedOutputStream.n(3, i());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public NextAction h() {
        NextAction nextAction = this.a;
        return nextAction == null ? NextAction.h() : nextAction;
    }

    public NullableString i() {
        NullableString nullableString = this.c;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public NextScreen m() {
        NextScreen nextScreen = this.b;
        return nextScreen == null ? NextScreen.h() : nextScreen;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, h());
        }
        if (this.b != null) {
            codedOutputStream.M(2, m());
        }
        if (this.c != null) {
            codedOutputStream.M(3, i());
        }
    }
}
