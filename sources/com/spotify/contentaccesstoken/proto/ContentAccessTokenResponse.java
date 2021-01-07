package com.spotify.contentaccesstoken.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.contentaccesstoken.proto.ContentAccessToken;
import com.spotify.contentaccesstoken.proto.Error;
import java.io.IOException;

public final class ContentAccessTokenResponse extends GeneratedMessageLite<ContentAccessTokenResponse, b> implements Object {
    private static final ContentAccessTokenResponse c;
    private static volatile x<ContentAccessTokenResponse> f;
    private Error a;
    private ContentAccessToken b;

    public static final class b extends GeneratedMessageLite.b<ContentAccessTokenResponse, b> implements Object {
        private b() {
            super(ContentAccessTokenResponse.c);
        }
    }

    static {
        ContentAccessTokenResponse contentAccessTokenResponse = new ContentAccessTokenResponse();
        c = contentAccessTokenResponse;
        contentAccessTokenResponse.makeImmutable();
    }

    private ContentAccessTokenResponse() {
    }

    public static x<ContentAccessTokenResponse> parser() {
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
                ContentAccessTokenResponse contentAccessTokenResponse = (ContentAccessTokenResponse) obj2;
                this.a = (Error) hVar.i(this.a, contentAccessTokenResponse.a);
                this.b = (ContentAccessToken) hVar.i(this.b, contentAccessTokenResponse.b);
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
                                Error error = this.a;
                                Error.b bVar = error != null ? (Error.b) error.toBuilder() : null;
                                Error error2 = (Error) gVar.o(Error.parser(), kVar);
                                this.a = error2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Error.b) error2);
                                    this.a = (Error) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                ContentAccessToken contentAccessToken = this.b;
                                ContentAccessToken.b bVar2 = contentAccessToken != null ? (ContentAccessToken.b) contentAccessToken.toBuilder() : null;
                                ContentAccessToken contentAccessToken2 = (ContentAccessToken) gVar.o(ContentAccessToken.parser(), kVar);
                                this.b = contentAccessToken2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ContentAccessToken.b) contentAccessToken2);
                                    this.b = (ContentAccessToken) bVar2.buildPartial();
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
                return new ContentAccessTokenResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ContentAccessTokenResponse.class) {
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
            i2 = 0 + CodedOutputStream.n(1, i());
        }
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, h());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public ContentAccessToken h() {
        ContentAccessToken contentAccessToken = this.b;
        return contentAccessToken == null ? ContentAccessToken.h() : contentAccessToken;
    }

    public Error i() {
        Error error = this.a;
        return error == null ? Error.h() : error;
    }

    public boolean l() {
        return this.a != null;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, i());
        }
        if (this.b != null) {
            codedOutputStream.M(2, h());
        }
    }
}
