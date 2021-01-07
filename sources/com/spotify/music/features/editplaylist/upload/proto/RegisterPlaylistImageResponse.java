package com.spotify.music.features.editplaylist.upload.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class RegisterPlaylistImageResponse extends GeneratedMessageLite<RegisterPlaylistImageResponse, b> implements Object {
    private static final RegisterPlaylistImageResponse c;
    private static volatile x<RegisterPlaylistImageResponse> f;
    private int a;
    private ByteString b = ByteString.a;

    public static final class b extends GeneratedMessageLite.b<RegisterPlaylistImageResponse, b> implements Object {
        private b() {
            super(RegisterPlaylistImageResponse.c);
        }
    }

    static {
        RegisterPlaylistImageResponse registerPlaylistImageResponse = new RegisterPlaylistImageResponse();
        c = registerPlaylistImageResponse;
        registerPlaylistImageResponse.makeImmutable();
    }

    private RegisterPlaylistImageResponse() {
    }

    public static x<RegisterPlaylistImageResponse> parser() {
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
                RegisterPlaylistImageResponse registerPlaylistImageResponse = (RegisterPlaylistImageResponse) obj2;
                boolean z2 = (this.a & 1) == 1;
                ByteString byteString = this.b;
                if ((registerPlaylistImageResponse.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.r(z2, byteString, z, registerPlaylistImageResponse.b);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= registerPlaylistImageResponse.a;
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
                                this.a |= 1;
                                this.b = gVar.i();
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
                return new RegisterPlaylistImageResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (RegisterPlaylistImageResponse.class) {
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
            i2 = 0 + CodedOutputStream.e(1, this.b);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ByteString h() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.C(1, this.b);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
