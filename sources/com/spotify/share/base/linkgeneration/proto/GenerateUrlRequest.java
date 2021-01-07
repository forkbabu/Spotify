package com.spotify.share.base.linkgeneration.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.share.base.linkgeneration.proto.UtmParameters;
import java.io.IOException;

public final class GenerateUrlRequest extends GeneratedMessageLite<GenerateUrlRequest, b> implements Object {
    private static final GenerateUrlRequest n;
    private static volatile x<GenerateUrlRequest> o;
    private int a;
    private String b = "";
    private UtmParameters c;
    private o.i<CustomData> f = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<GenerateUrlRequest, b> implements Object {
        public b m(CustomData customData) {
            copyOnWrite();
            GenerateUrlRequest.i((GenerateUrlRequest) this.instance, customData);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            GenerateUrlRequest.h((GenerateUrlRequest) this.instance, str);
            return this;
        }

        public b o(UtmParameters utmParameters) {
            copyOnWrite();
            GenerateUrlRequest.l((GenerateUrlRequest) this.instance, utmParameters);
            return this;
        }

        private b() {
            super(GenerateUrlRequest.n);
        }
    }

    static {
        GenerateUrlRequest generateUrlRequest = new GenerateUrlRequest();
        n = generateUrlRequest;
        generateUrlRequest.makeImmutable();
    }

    private GenerateUrlRequest() {
    }

    static void h(GenerateUrlRequest generateUrlRequest, String str) {
        generateUrlRequest.getClass();
        str.getClass();
        generateUrlRequest.b = str;
    }

    static void i(GenerateUrlRequest generateUrlRequest, CustomData customData) {
        generateUrlRequest.getClass();
        customData.getClass();
        if (!generateUrlRequest.f.R0()) {
            generateUrlRequest.f = GeneratedMessageLite.mutableCopy(generateUrlRequest.f);
        }
        generateUrlRequest.f.add(customData);
    }

    static void l(GenerateUrlRequest generateUrlRequest, UtmParameters utmParameters) {
        generateUrlRequest.getClass();
        utmParameters.getClass();
        generateUrlRequest.c = utmParameters;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<GenerateUrlRequest> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                GenerateUrlRequest generateUrlRequest = (GenerateUrlRequest) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ generateUrlRequest.b.isEmpty(), generateUrlRequest.b);
                this.c = (UtmParameters) hVar.i(this.c, generateUrlRequest.c);
                this.f = hVar.q(this.f, generateUrlRequest.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= generateUrlRequest.a;
                }
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                UtmParameters utmParameters = this.c;
                                UtmParameters.b bVar = utmParameters != null ? (UtmParameters.b) utmParameters.toBuilder() : null;
                                UtmParameters utmParameters2 = (UtmParameters) gVar.o(UtmParameters.parser(), kVar);
                                this.c = utmParameters2;
                                if (bVar != null) {
                                    bVar.mergeFrom((UtmParameters.b) utmParameters2);
                                    this.c = (UtmParameters) bVar.buildPartial();
                                }
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(CustomData.parser(), kVar));
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
                this.f.C();
                return null;
            case 4:
                return new GenerateUrlRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (GenerateUrlRequest.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        UtmParameters utmParameters = this.c;
        if (utmParameters != null) {
            p += CodedOutputStream.n(2, utmParameters);
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            p += CodedOutputStream.n(3, this.f.get(i2));
        }
        this.memoizedSerializedSize = p;
        return p;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        UtmParameters utmParameters = this.c;
        if (utmParameters != null) {
            codedOutputStream.M(2, utmParameters);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
    }
}
