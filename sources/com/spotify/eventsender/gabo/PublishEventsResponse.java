package com.spotify.eventsender.gabo;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class PublishEventsResponse extends GeneratedMessageLite<PublishEventsResponse, b> implements Object {
    private static final PublishEventsResponse b;
    private static volatile x<PublishEventsResponse> c;
    private o.i<EventError> a = GeneratedMessageLite.emptyProtobufList();

    public static final class EventError extends GeneratedMessageLite<EventError, a> implements Object {
        private static final EventError f;
        private static volatile x<EventError> n;
        private int a;
        private boolean b;
        private int c;

        public static final class a extends GeneratedMessageLite.b<EventError, a> implements Object {
            private a() {
                super(EventError.f);
            }
        }

        static {
            EventError eventError = new EventError();
            f = eventError;
            eventError.makeImmutable();
        }

        private EventError() {
        }

        public static x<EventError> parser() {
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
                    EventError eventError = (EventError) obj2;
                    int i = this.a;
                    boolean z2 = i != 0;
                    int i2 = eventError.a;
                    this.a = hVar.m(z2, i, i2 != 0, i2);
                    boolean z3 = this.b;
                    boolean z4 = eventError.b;
                    this.b = hVar.f(z3, z3, z4, z4);
                    int i3 = this.c;
                    boolean z5 = i3 != 0;
                    int i4 = eventError.c;
                    if (i4 != 0) {
                        z = true;
                    }
                    this.c = hVar.m(z5, i3, z, i4);
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
                                    this.b = gVar.h();
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
                    return new EventError();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (EventError.class) {
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
            int i3 = this.a;
            if (i3 != 0) {
                i2 = 0 + CodedOutputStream.j(1, i3);
            }
            boolean z = this.b;
            if (z) {
                i2 += CodedOutputStream.d(2, z);
            }
            int i4 = this.c;
            if (i4 != 0) {
                i2 += CodedOutputStream.j(3, i4);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public int h() {
            return this.a;
        }

        public boolean i() {
            return this.b;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i = this.a;
            if (i != 0) {
                codedOutputStream.K(1, i);
            }
            boolean z = this.b;
            if (z) {
                codedOutputStream.A(2, z);
            }
            int i2 = this.c;
            if (i2 != 0) {
                codedOutputStream.K(3, i2);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<PublishEventsResponse, b> implements Object {
        private b() {
            super(PublishEventsResponse.b);
        }
    }

    static {
        PublishEventsResponse publishEventsResponse = new PublishEventsResponse();
        b = publishEventsResponse;
        publishEventsResponse.makeImmutable();
    }

    private PublishEventsResponse() {
    }

    public static x<PublishEventsResponse> parser() {
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
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((PublishEventsResponse) obj2).a);
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
                                this.a.add(gVar.o(EventError.parser(), kVar));
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
                return new PublishEventsResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (PublishEventsResponse.class) {
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

    public List<EventError> h() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
