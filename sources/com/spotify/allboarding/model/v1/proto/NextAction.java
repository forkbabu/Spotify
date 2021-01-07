package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.io.IOException;

public final class NextAction extends GeneratedMessageLite<NextAction, b> implements Object {
    private static final NextAction c;
    private static volatile x<NextAction> f;
    private int a;
    private NullableString b;

    public enum Type implements o.c {
        URI(0),
        SUBMIT(1),
        DISMISS(2),
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

    public static final class b extends GeneratedMessageLite.b<NextAction, b> implements Object {
        private b() {
            super(NextAction.c);
        }
    }

    static {
        NextAction nextAction = new NextAction();
        c = nextAction;
        nextAction.makeImmutable();
    }

    private NextAction() {
    }

    public static NextAction h() {
        return c;
    }

    public static x<NextAction> parser() {
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
                NextAction nextAction = (NextAction) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = nextAction.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                this.b = (NullableString) hVar.i(this.b, nextAction.b);
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
                return new NextAction();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (NextAction.class) {
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
        if (this.a != Type.URI.getNumber()) {
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

    public Type l() {
        Type type;
        int i = this.a;
        if (i == 0) {
            type = Type.URI;
        } else if (i == 1) {
            type = Type.SUBMIT;
        } else if (i != 2) {
            type = null;
        } else {
            type = Type.DISMISS;
        }
        return type == null ? Type.UNRECOGNIZED : type;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != Type.URI.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        if (this.b != null) {
            codedOutputStream.M(2, i());
        }
    }
}
