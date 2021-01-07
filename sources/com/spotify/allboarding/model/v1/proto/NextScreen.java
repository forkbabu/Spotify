package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.io.IOException;

public final class NextScreen extends GeneratedMessageLite<NextScreen, b> implements Object {
    private static final NextScreen c;
    private static volatile x<NextScreen> f;
    private int a;
    private NullableString b;

    public static final class b extends GeneratedMessageLite.b<NextScreen, b> implements Object {
        private b() {
            super(NextScreen.c);
        }
    }

    static {
        NextScreen nextScreen = new NextScreen();
        c = nextScreen;
        nextScreen.makeImmutable();
    }

    private NextScreen() {
    }

    public static NextScreen h() {
        return c;
    }

    public static x<NextScreen> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                NextScreen nextScreen = (NextScreen) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = nextScreen.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                this.b = (NullableString) hVar.i(this.b, nextScreen.b);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 18) {
                                NullableString nullableString = this.b;
                                NullableString.b bVar = nullableString != null ? (NullableString.b) nullableString.toBuilder() : null;
                                NullableString nullableString2 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.b = nullableString2;
                                if (bVar != null) {
                                    bVar.mergeFrom((NullableString.b) nullableString2);
                                    this.b = (NullableString) bVar.buildPartial();
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
                return new NextScreen();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (NextScreen.class) {
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
        if (this.a != ScreenType.LOADING.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, i());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public NullableString i() {
        NullableString nullableString = this.b;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public ScreenType l() {
        ScreenType screenType;
        int i = this.a;
        if (i == 0) {
            screenType = ScreenType.LOADING;
        } else if (i != 1) {
            screenType = null;
        } else {
            screenType = ScreenType.PICKER;
        }
        return screenType == null ? ScreenType.UNRECOGNIZED : screenType;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != ScreenType.LOADING.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        if (this.b != null) {
            codedOutputStream.M(2, i());
        }
    }
}
