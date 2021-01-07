package com.spotify.music.features.editplaylist.upload.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class RegisterPlaylistImageRequest extends GeneratedMessageLite<RegisterPlaylistImageRequest, b> implements Object {
    private static final RegisterPlaylistImageRequest c;
    private static volatile x<RegisterPlaylistImageRequest> f;
    private int a;
    private String b = "";

    public static final class b extends GeneratedMessageLite.b<RegisterPlaylistImageRequest, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            RegisterPlaylistImageRequest.h((RegisterPlaylistImageRequest) this.instance, str);
            return this;
        }

        private b() {
            super(RegisterPlaylistImageRequest.c);
        }
    }

    static {
        RegisterPlaylistImageRequest registerPlaylistImageRequest = new RegisterPlaylistImageRequest();
        c = registerPlaylistImageRequest;
        registerPlaylistImageRequest.makeImmutable();
    }

    private RegisterPlaylistImageRequest() {
    }

    static void h(RegisterPlaylistImageRequest registerPlaylistImageRequest, String str) {
        registerPlaylistImageRequest.getClass();
        str.getClass();
        registerPlaylistImageRequest.a |= 1;
        registerPlaylistImageRequest.b = str;
    }

    public static b i() {
        return (b) c.toBuilder();
    }

    public static x<RegisterPlaylistImageRequest> parser() {
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
                RegisterPlaylistImageRequest registerPlaylistImageRequest = (RegisterPlaylistImageRequest) obj2;
                boolean z2 = (this.a & 1) == 1;
                String str = this.b;
                if ((registerPlaylistImageRequest.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.n(z2, str, z, registerPlaylistImageRequest.b);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= registerPlaylistImageRequest.a;
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
                return new RegisterPlaylistImageRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (RegisterPlaylistImageRequest.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
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
        this.unknownFields.l(codedOutputStream);
    }
}
