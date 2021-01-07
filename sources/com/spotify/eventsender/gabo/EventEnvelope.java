package com.spotify.eventsender.gabo;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class EventEnvelope extends GeneratedMessageLite<EventEnvelope, b> implements Object {
    private static final EventEnvelope o;
    private static volatile x<EventEnvelope> p;
    private int a;
    private String b = "";
    private o.i<EventFragment> c = GeneratedMessageLite.emptyProtobufList();
    private ByteString f = ByteString.a;
    private long n;

    public static final class EventFragment extends GeneratedMessageLite<EventFragment, a> implements Object {
        private static final EventFragment c;
        private static volatile x<EventFragment> f;
        private String a = "";
        private ByteString b = ByteString.a;

        public static final class a extends GeneratedMessageLite.b<EventFragment, a> implements Object {
            public a m(ByteString byteString) {
                copyOnWrite();
                EventFragment.i((EventFragment) this.instance, byteString);
                return this;
            }

            public a n(String str) {
                copyOnWrite();
                EventFragment.h((EventFragment) this.instance, str);
                return this;
            }

            private a() {
                super(EventFragment.c);
            }
        }

        static {
            EventFragment eventFragment = new EventFragment();
            c = eventFragment;
            eventFragment.makeImmutable();
        }

        private EventFragment() {
        }

        static void h(EventFragment eventFragment, String str) {
            eventFragment.getClass();
            str.getClass();
            eventFragment.a = str;
        }

        static void i(EventFragment eventFragment, ByteString byteString) {
            eventFragment.getClass();
            byteString.getClass();
            eventFragment.b = byteString;
        }

        public static a l() {
            return (a) c.toBuilder();
        }

        public static x<EventFragment> parser() {
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
                    EventFragment eventFragment = (EventFragment) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !eventFragment.a.isEmpty(), eventFragment.a);
                    ByteString byteString = this.b;
                    ByteString byteString2 = ByteString.a;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = eventFragment.b;
                    if (byteString3 != byteString2) {
                        z = true;
                    }
                    this.b = hVar.r(z2, byteString, z, byteString3);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    this.a = gVar.A();
                                } else if (B == 18) {
                                    this.b = gVar.i();
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
                    return new EventFragment();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (EventFragment.class) {
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
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.a);
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.e(2, this.b);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.C(2, this.b);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<EventEnvelope, b> implements Object {
        public b m(Iterable<? extends EventFragment> iterable) {
            copyOnWrite();
            EventEnvelope.a((EventEnvelope) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            EventEnvelope.m((EventEnvelope) this.instance, str);
            return this;
        }

        public b o(ByteString byteString) {
            copyOnWrite();
            EventEnvelope.h((EventEnvelope) this.instance, byteString);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            EventEnvelope.i((EventEnvelope) this.instance, j);
            return this;
        }

        private b() {
            super(EventEnvelope.o);
        }
    }

    static {
        EventEnvelope eventEnvelope = new EventEnvelope();
        o = eventEnvelope;
        eventEnvelope.makeImmutable();
    }

    private EventEnvelope() {
    }

    static void a(EventEnvelope eventEnvelope, Iterable iterable) {
        if (!eventEnvelope.c.R0()) {
            eventEnvelope.c = GeneratedMessageLite.mutableCopy(eventEnvelope.c);
        }
        com.google.protobuf.a.addAll(iterable, eventEnvelope.c);
    }

    static void h(EventEnvelope eventEnvelope, ByteString byteString) {
        eventEnvelope.getClass();
        byteString.getClass();
        eventEnvelope.f = byteString;
    }

    static void i(EventEnvelope eventEnvelope, long j) {
        eventEnvelope.n = j;
    }

    static void m(EventEnvelope eventEnvelope, String str) {
        eventEnvelope.getClass();
        str.getClass();
        eventEnvelope.b = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<EventEnvelope> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EventEnvelope eventEnvelope = (EventEnvelope) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !eventEnvelope.b.isEmpty(), eventEnvelope.b);
                this.c = hVar.q(this.c, eventEnvelope.c);
                ByteString byteString = this.f;
                ByteString byteString2 = ByteString.a;
                boolean z2 = byteString != byteString2;
                ByteString byteString3 = eventEnvelope.f;
                this.f = hVar.r(z2, byteString, byteString3 != byteString2, byteString3);
                long j = this.n;
                boolean z3 = j != 0;
                long j2 = eventEnvelope.n;
                this.n = hVar.s(z3, j, j2 != 0, j2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= eventEnvelope.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(EventFragment.parser(), kVar));
                            } else if (B == 34) {
                                this.f = gVar.i();
                            } else if (B == 40) {
                                this.n = gVar.w();
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
                this.c.C();
                return null;
            case 4:
                return new EventEnvelope();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (EventEnvelope.class) {
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
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(2, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p2 += CodedOutputStream.n(3, this.c.get(i2));
        }
        if (!this.f.isEmpty()) {
            p2 += CodedOutputStream.e(4, this.f);
        }
        long j = this.n;
        if (j != 0) {
            p2 += CodedOutputStream.l(5, j);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(3, this.c.get(i));
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.C(4, this.f);
        }
        long j = this.n;
        if (j != 0) {
            codedOutputStream.U(5, j);
        }
    }
}
