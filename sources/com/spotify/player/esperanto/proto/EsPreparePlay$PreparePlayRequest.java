package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import java.io.IOException;

public final class EsPreparePlay$PreparePlayRequest extends GeneratedMessageLite<EsPreparePlay$PreparePlayRequest, a> implements Object {
    private static final EsPreparePlay$PreparePlayRequest f;
    private static volatile x<EsPreparePlay$PreparePlayRequest> n;
    private EsContext$Context a;
    private EsPreparePlayOptions$PreparePlayOptions b;
    private EsPlayOrigin$PlayOrigin c;

    public static final class a extends GeneratedMessageLite.b<EsPreparePlay$PreparePlayRequest, a> implements Object {
        public a m(EsContext$Context esContext$Context) {
            copyOnWrite();
            EsPreparePlay$PreparePlayRequest.h((EsPreparePlay$PreparePlayRequest) this.instance, esContext$Context);
            return this;
        }

        public a n(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
            copyOnWrite();
            EsPreparePlay$PreparePlayRequest.i((EsPreparePlay$PreparePlayRequest) this.instance, esPreparePlayOptions$PreparePlayOptions);
            return this;
        }

        public a o(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin) {
            copyOnWrite();
            EsPreparePlay$PreparePlayRequest.l((EsPreparePlay$PreparePlayRequest) this.instance, esPlayOrigin$PlayOrigin);
            return this;
        }

        private a() {
            super(EsPreparePlay$PreparePlayRequest.f);
        }
    }

    static {
        EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest = new EsPreparePlay$PreparePlayRequest();
        f = esPreparePlay$PreparePlayRequest;
        esPreparePlay$PreparePlayRequest.makeImmutable();
    }

    private EsPreparePlay$PreparePlayRequest() {
    }

    static void h(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest, EsContext$Context esContext$Context) {
        esPreparePlay$PreparePlayRequest.getClass();
        esContext$Context.getClass();
        esPreparePlay$PreparePlayRequest.a = esContext$Context;
    }

    static void i(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest, EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
        esPreparePlay$PreparePlayRequest.getClass();
        esPreparePlayOptions$PreparePlayOptions.getClass();
        esPreparePlay$PreparePlayRequest.b = esPreparePlayOptions$PreparePlayOptions;
    }

    static void l(EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin) {
        esPreparePlay$PreparePlayRequest.getClass();
        esPlayOrigin$PlayOrigin.getClass();
        esPreparePlay$PreparePlayRequest.c = esPlayOrigin$PlayOrigin;
    }

    public static a m() {
        return (a) f.toBuilder();
    }

    public static x<EsPreparePlay$PreparePlayRequest> parser() {
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
                EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest = (EsPreparePlay$PreparePlayRequest) obj2;
                this.a = (EsContext$Context) hVar.i(this.a, esPreparePlay$PreparePlayRequest.a);
                this.b = (EsPreparePlayOptions$PreparePlayOptions) hVar.i(this.b, esPreparePlay$PreparePlayRequest.b);
                this.c = (EsPlayOrigin$PlayOrigin) hVar.i(this.c, esPreparePlay$PreparePlayRequest.c);
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
                                EsContext$Context esContext$Context = this.a;
                                EsContext$Context.a aVar = esContext$Context != null ? (EsContext$Context.a) esContext$Context.toBuilder() : null;
                                EsContext$Context esContext$Context2 = (EsContext$Context) gVar.o(EsContext$Context.parser(), kVar);
                                this.a = esContext$Context2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsContext$Context.a) esContext$Context2);
                                    this.a = (EsContext$Context) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = this.b;
                                EsPreparePlayOptions$PreparePlayOptions.a aVar2 = esPreparePlayOptions$PreparePlayOptions != null ? (EsPreparePlayOptions$PreparePlayOptions.a) esPreparePlayOptions$PreparePlayOptions.toBuilder() : null;
                                EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions2 = (EsPreparePlayOptions$PreparePlayOptions) gVar.o(EsPreparePlayOptions$PreparePlayOptions.parser(), kVar);
                                this.b = esPreparePlayOptions$PreparePlayOptions2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsPreparePlayOptions$PreparePlayOptions.a) esPreparePlayOptions$PreparePlayOptions2);
                                    this.b = (EsPreparePlayOptions$PreparePlayOptions) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = this.c;
                                EsPlayOrigin$PlayOrigin.a aVar3 = esPlayOrigin$PlayOrigin != null ? (EsPlayOrigin$PlayOrigin.a) esPlayOrigin$PlayOrigin.toBuilder() : null;
                                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin2 = (EsPlayOrigin$PlayOrigin) gVar.o(EsPlayOrigin$PlayOrigin.parser(), kVar);
                                this.c = esPlayOrigin$PlayOrigin2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsPlayOrigin$PlayOrigin.a) esPlayOrigin$PlayOrigin2);
                                    this.c = (EsPlayOrigin$PlayOrigin) aVar3.buildPartial();
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
                return new EsPreparePlay$PreparePlayRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsPreparePlay$PreparePlayRequest.class) {
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
        EsContext$Context esContext$Context = this.a;
        if (esContext$Context != null) {
            i2 = 0 + CodedOutputStream.n(1, esContext$Context);
        }
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = this.b;
        if (esPreparePlayOptions$PreparePlayOptions != null) {
            i2 += CodedOutputStream.n(2, esPreparePlayOptions$PreparePlayOptions);
        }
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = this.c;
        if (esPlayOrigin$PlayOrigin != null) {
            i2 += CodedOutputStream.n(3, esPlayOrigin$PlayOrigin);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsContext$Context esContext$Context = this.a;
        if (esContext$Context != null) {
            codedOutputStream.M(1, esContext$Context);
        }
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = this.b;
        if (esPreparePlayOptions$PreparePlayOptions != null) {
            codedOutputStream.M(2, esPreparePlayOptions$PreparePlayOptions);
        }
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = this.c;
        if (esPlayOrigin$PlayOrigin != null) {
            codedOutputStream.M(3, esPlayOrigin$PlayOrigin);
        }
    }
}
