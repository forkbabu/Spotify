package com.spotify.rcs.resolver.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class Fetch extends GeneratedMessageLite<Fetch, b> implements Object {
    private static final Fetch b;
    private static volatile x<Fetch> c;
    private int a;

    public enum Type implements o.c {
        BLOCKING(0),
        BACKGROUND_SYNC(1),
        DELAYED(2),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Fetch, b> implements Object {
        public b m(Type type) {
            copyOnWrite();
            Fetch.h((Fetch) this.instance, type);
            return this;
        }

        private b() {
            super(Fetch.b);
        }
    }

    static {
        Fetch fetch = new Fetch();
        b = fetch;
        fetch.makeImmutable();
    }

    private Fetch() {
    }

    static void h(Fetch fetch, Type type) {
        fetch.getClass();
        type.getClass();
        fetch.a = type.getNumber();
    }

    public static b i() {
        return (b) b.toBuilder();
    }

    public static x<Fetch> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Fetch fetch = (Fetch) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = fetch.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
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
                return new Fetch();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (Fetch.class) {
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
        if (this.a != Type.BLOCKING.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != Type.BLOCKING.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
    }
}
