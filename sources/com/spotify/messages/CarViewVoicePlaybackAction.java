package com.spotify.messages;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class CarViewVoicePlaybackAction extends GeneratedMessageLite<CarViewVoicePlaybackAction, b> implements Object {
    private static final CarViewVoicePlaybackAction f;
    private static volatile x<CarViewVoicePlaybackAction> n;
    private int a;
    private String b = "";
    private ByteString c = ByteString.a;

    public static final class b extends GeneratedMessageLite.b<CarViewVoicePlaybackAction, b> implements Object {
        public b m(ByteString byteString) {
            copyOnWrite();
            CarViewVoicePlaybackAction.i((CarViewVoicePlaybackAction) this.instance, byteString);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            CarViewVoicePlaybackAction.h((CarViewVoicePlaybackAction) this.instance, str);
            return this;
        }

        private b() {
            super(CarViewVoicePlaybackAction.f);
        }
    }

    static {
        CarViewVoicePlaybackAction carViewVoicePlaybackAction = new CarViewVoicePlaybackAction();
        f = carViewVoicePlaybackAction;
        carViewVoicePlaybackAction.makeImmutable();
    }

    private CarViewVoicePlaybackAction() {
    }

    static void h(CarViewVoicePlaybackAction carViewVoicePlaybackAction, String str) {
        carViewVoicePlaybackAction.getClass();
        str.getClass();
        carViewVoicePlaybackAction.a |= 1;
        carViewVoicePlaybackAction.b = str;
    }

    static void i(CarViewVoicePlaybackAction carViewVoicePlaybackAction, ByteString byteString) {
        carViewVoicePlaybackAction.getClass();
        byteString.getClass();
        carViewVoicePlaybackAction.a |= 2;
        carViewVoicePlaybackAction.c = byteString;
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<CarViewVoicePlaybackAction> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CarViewVoicePlaybackAction carViewVoicePlaybackAction = (CarViewVoicePlaybackAction) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (carViewVoicePlaybackAction.a & 1) == 1, carViewVoicePlaybackAction.b);
                boolean z2 = (this.a & 2) == 2;
                ByteString byteString = this.c;
                if ((carViewVoicePlaybackAction.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.r(z2, byteString, z, carViewVoicePlaybackAction.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= carViewVoicePlaybackAction.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                this.a |= 2;
                                this.c = gVar.i();
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new CarViewVoicePlaybackAction();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (CarViewVoicePlaybackAction.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.e(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.C(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
