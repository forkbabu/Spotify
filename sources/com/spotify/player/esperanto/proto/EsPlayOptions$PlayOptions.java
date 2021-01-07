package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsPlayOptions$PlayOptions extends GeneratedMessageLite<EsPlayOptions$PlayOptions, a> implements Object {
    private static final EsPlayOptions$PlayOptions f;
    private static volatile x<EsPlayOptions$PlayOptions> n;
    private int a;
    private int b;
    private int c;

    public enum Operation implements o.c {
        REPLACE(0),
        ENQUEUE(1),
        PUSH(2),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Operation(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Reason implements o.c {
        INTERACTIVE(0),
        REMOTE_TRANSFER(1),
        LICENSE_CHANGE(2),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Reason(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public enum Trigger implements o.c {
        IMMEDIATELY(0),
        ADVANCED_PAST_TRACK(1),
        ADVANCED_PAST_CONTEXT(2),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Trigger(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<EsPlayOptions$PlayOptions, a> implements Object {
        public a m(Operation operation) {
            copyOnWrite();
            EsPlayOptions$PlayOptions.h((EsPlayOptions$PlayOptions) this.instance, operation);
            return this;
        }

        public a n(Trigger trigger) {
            copyOnWrite();
            EsPlayOptions$PlayOptions.i((EsPlayOptions$PlayOptions) this.instance, trigger);
            return this;
        }

        private a() {
            super(EsPlayOptions$PlayOptions.f);
        }
    }

    static {
        EsPlayOptions$PlayOptions esPlayOptions$PlayOptions = new EsPlayOptions$PlayOptions();
        f = esPlayOptions$PlayOptions;
        esPlayOptions$PlayOptions.makeImmutable();
    }

    private EsPlayOptions$PlayOptions() {
    }

    static void h(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions, Operation operation) {
        esPlayOptions$PlayOptions.getClass();
        operation.getClass();
        esPlayOptions$PlayOptions.b = operation.getNumber();
    }

    static void i(EsPlayOptions$PlayOptions esPlayOptions$PlayOptions, Trigger trigger) {
        esPlayOptions$PlayOptions.getClass();
        trigger.getClass();
        esPlayOptions$PlayOptions.c = trigger.getNumber();
    }

    public static a l() {
        return (a) f.toBuilder();
    }

    public static x<EsPlayOptions$PlayOptions> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsPlayOptions$PlayOptions esPlayOptions$PlayOptions = (EsPlayOptions$PlayOptions) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = esPlayOptions$PlayOptions.a;
                this.a = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.b;
                boolean z3 = i3 != 0;
                int i4 = esPlayOptions$PlayOptions.b;
                this.b = hVar.m(z3, i3, i4 != 0, i4);
                int i5 = this.c;
                boolean z4 = i5 != 0;
                int i6 = esPlayOptions$PlayOptions.c;
                if (i6 != 0) {
                    z = true;
                }
                this.c = hVar.m(z4, i5, z, i6);
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
                            } else if (B == 16) {
                                this.b = gVar.u();
                            } else if (B == 24) {
                                this.c = gVar.u();
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
                return new EsPlayOptions$PlayOptions();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsPlayOptions$PlayOptions.class) {
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
        if (this.a != Reason.INTERACTIVE.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        if (this.b != Operation.REPLACE.getNumber()) {
            i2 += CodedOutputStream.h(2, this.b);
        }
        if (this.c != Trigger.IMMEDIATELY.getNumber()) {
            i2 += CodedOutputStream.h(3, this.c);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != Reason.INTERACTIVE.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        if (this.b != Operation.REPLACE.getNumber()) {
            codedOutputStream.K(2, this.b);
        }
        if (this.c != Trigger.IMMEDIATELY.getNumber()) {
            codedOutputStream.K(3, this.c);
        }
    }
}
