package com.spotify.music.libs.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ChangeDisplaynameRequest$ChangeDisplayNameRequest extends GeneratedMessageLite<ChangeDisplaynameRequest$ChangeDisplayNameRequest, a> implements Object {
    private static final ChangeDisplaynameRequest$ChangeDisplayNameRequest c;
    private static volatile x<ChangeDisplaynameRequest$ChangeDisplayNameRequest> f;
    private String a = "";
    private String b = "";

    public static final class a extends GeneratedMessageLite.b<ChangeDisplaynameRequest$ChangeDisplayNameRequest, a> implements Object {
        public a m(String str) {
            copyOnWrite();
            ChangeDisplaynameRequest$ChangeDisplayNameRequest.i((ChangeDisplaynameRequest$ChangeDisplayNameRequest) this.instance, str);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            ChangeDisplaynameRequest$ChangeDisplayNameRequest.h((ChangeDisplaynameRequest$ChangeDisplayNameRequest) this.instance, str);
            return this;
        }

        private a() {
            super(ChangeDisplaynameRequest$ChangeDisplayNameRequest.c);
        }
    }

    static {
        ChangeDisplaynameRequest$ChangeDisplayNameRequest changeDisplaynameRequest$ChangeDisplayNameRequest = new ChangeDisplaynameRequest$ChangeDisplayNameRequest();
        c = changeDisplaynameRequest$ChangeDisplayNameRequest;
        changeDisplaynameRequest$ChangeDisplayNameRequest.makeImmutable();
    }

    private ChangeDisplaynameRequest$ChangeDisplayNameRequest() {
    }

    static void h(ChangeDisplaynameRequest$ChangeDisplayNameRequest changeDisplaynameRequest$ChangeDisplayNameRequest, String str) {
        changeDisplaynameRequest$ChangeDisplayNameRequest.getClass();
        str.getClass();
        changeDisplaynameRequest$ChangeDisplayNameRequest.a = str;
    }

    static void i(ChangeDisplaynameRequest$ChangeDisplayNameRequest changeDisplaynameRequest$ChangeDisplayNameRequest, String str) {
        changeDisplaynameRequest$ChangeDisplayNameRequest.getClass();
        str.getClass();
        changeDisplaynameRequest$ChangeDisplayNameRequest.b = str;
    }

    public static a l() {
        return (a) c.toBuilder();
    }

    public static x<ChangeDisplaynameRequest$ChangeDisplayNameRequest> parser() {
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
                ChangeDisplaynameRequest$ChangeDisplayNameRequest changeDisplaynameRequest$ChangeDisplayNameRequest = (ChangeDisplaynameRequest$ChangeDisplayNameRequest) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !changeDisplaynameRequest$ChangeDisplayNameRequest.a.isEmpty(), changeDisplaynameRequest$ChangeDisplayNameRequest.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ changeDisplaynameRequest$ChangeDisplayNameRequest.b.isEmpty(), changeDisplaynameRequest$ChangeDisplayNameRequest.b);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
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
                return new ChangeDisplaynameRequest$ChangeDisplayNameRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ChangeDisplaynameRequest$ChangeDisplayNameRequest.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
    }
}
