package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import java.io.IOException;

public final class EsContextPlayerOptions$ContextPlayerOptionOverrides extends GeneratedMessageLite<EsContextPlayerOptions$ContextPlayerOptionOverrides, a> implements Object {
    private static final EsContextPlayerOptions$ContextPlayerOptionOverrides f;
    private static volatile x<EsContextPlayerOptions$ContextPlayerOptionOverrides> n;
    private EsOptional$OptionalBoolean a;
    private EsOptional$OptionalBoolean b;
    private EsOptional$OptionalBoolean c;

    public static final class a extends GeneratedMessageLite.b<EsContextPlayerOptions$ContextPlayerOptionOverrides, a> implements Object {
        public a m(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
            copyOnWrite();
            EsContextPlayerOptions$ContextPlayerOptionOverrides.a((EsContextPlayerOptions$ContextPlayerOptionOverrides) this.instance, esOptional$OptionalBoolean);
            return this;
        }

        public a n(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
            copyOnWrite();
            EsContextPlayerOptions$ContextPlayerOptionOverrides.h((EsContextPlayerOptions$ContextPlayerOptionOverrides) this.instance, esOptional$OptionalBoolean);
            return this;
        }

        public a o(EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
            copyOnWrite();
            EsContextPlayerOptions$ContextPlayerOptionOverrides.l((EsContextPlayerOptions$ContextPlayerOptionOverrides) this.instance, esOptional$OptionalBoolean);
            return this;
        }

        private a() {
            super(EsContextPlayerOptions$ContextPlayerOptionOverrides.f);
        }
    }

    static {
        EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides = new EsContextPlayerOptions$ContextPlayerOptionOverrides();
        f = esContextPlayerOptions$ContextPlayerOptionOverrides;
        esContextPlayerOptions$ContextPlayerOptionOverrides.makeImmutable();
    }

    private EsContextPlayerOptions$ContextPlayerOptionOverrides() {
    }

    static void a(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esOptional$OptionalBoolean.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.b = esOptional$OptionalBoolean;
    }

    static void h(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esOptional$OptionalBoolean.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.c = esOptional$OptionalBoolean;
    }

    static void l(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        esOptional$OptionalBoolean.getClass();
        esContextPlayerOptions$ContextPlayerOptionOverrides.a = esOptional$OptionalBoolean;
    }

    public static a m() {
        return (a) f.toBuilder();
    }

    public static x<EsContextPlayerOptions$ContextPlayerOptionOverrides> parser() {
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
                EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides = (EsContextPlayerOptions$ContextPlayerOptionOverrides) obj2;
                this.a = (EsOptional$OptionalBoolean) hVar.i(this.a, esContextPlayerOptions$ContextPlayerOptionOverrides.a);
                this.b = (EsOptional$OptionalBoolean) hVar.i(this.b, esContextPlayerOptions$ContextPlayerOptionOverrides.b);
                this.c = (EsOptional$OptionalBoolean) hVar.i(this.c, esContextPlayerOptions$ContextPlayerOptionOverrides.c);
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
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean = this.a;
                                EsOptional$OptionalBoolean.a aVar = esOptional$OptionalBoolean != null ? (EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean.toBuilder() : null;
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean2 = (EsOptional$OptionalBoolean) gVar.o(EsOptional$OptionalBoolean.parser(), kVar);
                                this.a = esOptional$OptionalBoolean2;
                                if (aVar != null) {
                                    aVar.mergeFrom((EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean2);
                                    this.a = (EsOptional$OptionalBoolean) aVar.buildPartial();
                                }
                            } else if (B == 18) {
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean3 = this.b;
                                EsOptional$OptionalBoolean.a aVar2 = esOptional$OptionalBoolean3 != null ? (EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean3.toBuilder() : null;
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean4 = (EsOptional$OptionalBoolean) gVar.o(EsOptional$OptionalBoolean.parser(), kVar);
                                this.b = esOptional$OptionalBoolean4;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean4);
                                    this.b = (EsOptional$OptionalBoolean) aVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean5 = this.c;
                                EsOptional$OptionalBoolean.a aVar3 = esOptional$OptionalBoolean5 != null ? (EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean5.toBuilder() : null;
                                EsOptional$OptionalBoolean esOptional$OptionalBoolean6 = (EsOptional$OptionalBoolean) gVar.o(EsOptional$OptionalBoolean.parser(), kVar);
                                this.c = esOptional$OptionalBoolean6;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((EsOptional$OptionalBoolean.a) esOptional$OptionalBoolean6);
                                    this.c = (EsOptional$OptionalBoolean) aVar3.buildPartial();
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
                return new EsContextPlayerOptions$ContextPlayerOptionOverrides();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsContextPlayerOptions$ContextPlayerOptionOverrides.class) {
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
        EsOptional$OptionalBoolean esOptional$OptionalBoolean = this.a;
        if (esOptional$OptionalBoolean != null) {
            i2 = 0 + CodedOutputStream.n(1, esOptional$OptionalBoolean);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean2 = this.b;
        if (esOptional$OptionalBoolean2 != null) {
            i2 += CodedOutputStream.n(2, esOptional$OptionalBoolean2);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean3 = this.c;
        if (esOptional$OptionalBoolean3 != null) {
            i2 += CodedOutputStream.n(3, esOptional$OptionalBoolean3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        EsOptional$OptionalBoolean esOptional$OptionalBoolean = this.a;
        if (esOptional$OptionalBoolean != null) {
            codedOutputStream.M(1, esOptional$OptionalBoolean);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean2 = this.b;
        if (esOptional$OptionalBoolean2 != null) {
            codedOutputStream.M(2, esOptional$OptionalBoolean2);
        }
        EsOptional$OptionalBoolean esOptional$OptionalBoolean3 = this.c;
        if (esOptional$OptionalBoolean3 != null) {
            codedOutputStream.M(3, esOptional$OptionalBoolean3);
        }
    }
}
