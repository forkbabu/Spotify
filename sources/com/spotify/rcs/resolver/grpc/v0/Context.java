package com.spotify.rcs.resolver.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.rcs.admin.grpc.v0.DynamicContext;
import java.io.IOException;

public final class Context extends GeneratedMessageLite<Context, b> implements Object {
    private static final Context b;
    private static volatile x<Context> c;
    private o.i<ContextEntry> a = GeneratedMessageLite.emptyProtobufList();

    public static final class ContextEntry extends GeneratedMessageLite<ContextEntry, a> implements Object {
        private static final ContextEntry f;
        private static volatile x<ContextEntry> n;
        private int a = 0;
        private Object b;
        private String c = "";

        public enum ContextCase implements o.c {
            KNOWN_CONTEXT(1),
            CONTEXT_NOT_SET(0);
            
            private final int value;

            private ContextCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<ContextEntry, a> implements Object {
            public a m(DynamicContext.KnownContext knownContext) {
                copyOnWrite();
                ContextEntry.h((ContextEntry) this.instance, knownContext);
                return this;
            }

            public a n(String str) {
                copyOnWrite();
                ContextEntry.i((ContextEntry) this.instance, str);
                return this;
            }

            private a() {
                super(ContextEntry.f);
            }
        }

        static {
            ContextEntry contextEntry = new ContextEntry();
            f = contextEntry;
            contextEntry.makeImmutable();
        }

        private ContextEntry() {
        }

        static void h(ContextEntry contextEntry, DynamicContext.KnownContext knownContext) {
            contextEntry.getClass();
            knownContext.getClass();
            contextEntry.a = 1;
            contextEntry.b = Integer.valueOf(knownContext.getNumber());
        }

        static void i(ContextEntry contextEntry, String str) {
            contextEntry.getClass();
            str.getClass();
            contextEntry.c = str;
        }

        public static a l() {
            return (a) f.toBuilder();
        }

        public static x<ContextEntry> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            boolean z = true;
            boolean z2 = false;
            ContextCase contextCase = null;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    ContextEntry contextEntry = (ContextEntry) obj2;
                    this.c = hVar.n(!this.c.isEmpty(), this.c, !contextEntry.c.isEmpty(), contextEntry.c);
                    int i2 = contextEntry.a;
                    if (i2 == 0) {
                        contextCase = ContextCase.CONTEXT_NOT_SET;
                    } else if (i2 == 1) {
                        contextCase = ContextCase.KNOWN_CONTEXT;
                    }
                    int ordinal = contextCase.ordinal();
                    if (ordinal == 0) {
                        if (this.a != 1) {
                            z = false;
                        }
                        this.b = hVar.k(z, this.b, contextEntry.b);
                    } else if (ordinal == 1) {
                        if (this.a == 0) {
                            z = false;
                        }
                        hVar.b(z);
                    }
                    if (hVar == GeneratedMessageLite.g.a && (i = contextEntry.a) != 0) {
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
                                if (B == 8) {
                                    int u = gVar.u();
                                    this.a = 1;
                                    this.b = Integer.valueOf(u);
                                } else if (B == 82) {
                                    this.c = gVar.A();
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
                    return new ContextEntry();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (ContextEntry.class) {
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
            if (this.a == 1) {
                i2 = 0 + CodedOutputStream.h(1, ((Integer) this.b).intValue());
            }
            if (!this.c.isEmpty()) {
                i2 += CodedOutputStream.p(10, this.c);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a == 1) {
                codedOutputStream.K(1, ((Integer) this.b).intValue());
            }
            if (!this.c.isEmpty()) {
                codedOutputStream.P(10, this.c);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<Context, b> implements Object {
        public b m(ContextEntry.a aVar) {
            copyOnWrite();
            Context.a((Context) this.instance, aVar);
            return this;
        }

        private b() {
            super(Context.b);
        }
    }

    static {
        Context context = new Context();
        b = context;
        context.makeImmutable();
    }

    private Context() {
    }

    static void a(Context context, ContextEntry.a aVar) {
        if (!context.a.R0()) {
            context.a = GeneratedMessageLite.mutableCopy(context.a);
        }
        context.a.add(aVar.build());
    }

    public static b i() {
        return (b) b.toBuilder();
    }

    public static x<Context> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((Context) obj2).a);
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
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(ContextEntry.parser(), kVar));
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
                this.a.C();
                return null;
            case 4:
                return new Context();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (Context.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
