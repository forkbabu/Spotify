package com.spotify.rcs.resolver.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.rcs.admin.grpc.v0.BackendContext;
import com.spotify.rcs.resolver.grpc.v0.Context;
import com.spotify.rcs.resolver.grpc.v0.Fetch;
import java.io.IOException;

public final class ResolveRequest extends GeneratedMessageLite<ResolveRequest, b> implements Object {
    private static final ResolveRequest o;
    private static volatile x<ResolveRequest> p;
    private int a = 0;
    private Object b;
    private String c = "";
    private Fetch f;
    private Context n;

    public enum ResolutionContextCase implements o.c {
        BACKEND_CONTEXT(12),
        RESOLUTIONCONTEXT_NOT_SET(0);
        
        private final int value;

        private ResolutionContextCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<ResolveRequest, b> implements Object {
        public b m(Context.b bVar) {
            copyOnWrite();
            ResolveRequest.h((ResolveRequest) this.instance, bVar);
            return this;
        }

        public b n(Fetch fetch) {
            copyOnWrite();
            ResolveRequest.l((ResolveRequest) this.instance, fetch);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ResolveRequest.i((ResolveRequest) this.instance, str);
            return this;
        }

        private b() {
            super(ResolveRequest.o);
        }
    }

    static {
        ResolveRequest resolveRequest = new ResolveRequest();
        o = resolveRequest;
        resolveRequest.makeImmutable();
    }

    private ResolveRequest() {
    }

    static void h(ResolveRequest resolveRequest, Context.b bVar) {
        resolveRequest.getClass();
        resolveRequest.n = (Context) bVar.build();
    }

    static void i(ResolveRequest resolveRequest, String str) {
        resolveRequest.getClass();
        str.getClass();
        resolveRequest.c = str;
    }

    static void l(ResolveRequest resolveRequest, Fetch fetch) {
        resolveRequest.getClass();
        fetch.getClass();
        resolveRequest.f = fetch;
    }

    public static b m() {
        return (b) o.toBuilder();
    }

    public static x<ResolveRequest> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        ResolutionContextCase resolutionContextCase = null;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ResolveRequest resolveRequest = (ResolveRequest) obj2;
                this.c = hVar.n(!this.c.isEmpty(), this.c, !resolveRequest.c.isEmpty(), resolveRequest.c);
                this.f = (Fetch) hVar.i(this.f, resolveRequest.f);
                this.n = (Context) hVar.i(this.n, resolveRequest.n);
                int i2 = resolveRequest.a;
                if (i2 == 0) {
                    resolutionContextCase = ResolutionContextCase.RESOLUTIONCONTEXT_NOT_SET;
                } else if (i2 == 12) {
                    resolutionContextCase = ResolutionContextCase.BACKEND_CONTEXT;
                }
                int ordinal = resolutionContextCase.ordinal();
                if (ordinal == 0) {
                    if (this.a != 12) {
                        z = false;
                    }
                    this.b = hVar.u(z, this.b, resolveRequest.b);
                } else if (ordinal == 1) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = resolveRequest.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.c = gVar.A();
                            } else if (B == 18) {
                                Fetch fetch = this.f;
                                Fetch.b bVar = fetch != null ? (Fetch.b) fetch.toBuilder() : null;
                                Fetch fetch2 = (Fetch) gVar.o(Fetch.parser(), kVar);
                                this.f = fetch2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Fetch.b) fetch2);
                                    this.f = (Fetch) bVar.buildPartial();
                                }
                            } else if (B == 90) {
                                Context context = this.n;
                                Context.b bVar2 = context != null ? (Context.b) context.toBuilder() : null;
                                Context context2 = (Context) gVar.o(Context.parser(), kVar);
                                this.n = context2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Context.b) context2);
                                    this.n = (Context) bVar2.buildPartial();
                                }
                            } else if (B == 98) {
                                BackendContext.b bVar3 = this.a == 12 ? (BackendContext.b) ((BackendContext) this.b).toBuilder() : null;
                                u o2 = gVar.o(BackendContext.parser(), kVar);
                                this.b = o2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((BackendContext.b) ((BackendContext) o2));
                                    this.b = bVar3.buildPartial();
                                }
                                this.a = 12;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
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
                return new ResolveRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ResolveRequest.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.c.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.c);
        }
        Fetch fetch = this.f;
        if (fetch != null) {
            i2 += CodedOutputStream.n(2, fetch);
        }
        Context context = this.n;
        if (context != null) {
            i2 += CodedOutputStream.n(11, context);
        }
        if (this.a == 12) {
            i2 += CodedOutputStream.n(12, (BackendContext) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c.isEmpty()) {
            codedOutputStream.P(1, this.c);
        }
        Fetch fetch = this.f;
        if (fetch != null) {
            codedOutputStream.M(2, fetch);
        }
        Context context = this.n;
        if (context != null) {
            codedOutputStream.M(11, context);
        }
        if (this.a == 12) {
            codedOutputStream.M(12, (BackendContext) this.b);
        }
    }
}
