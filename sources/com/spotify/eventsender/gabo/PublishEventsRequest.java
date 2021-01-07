package com.spotify.eventsender.gabo;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class PublishEventsRequest extends GeneratedMessageLite<PublishEventsRequest, b> implements Object {
    private static final PublishEventsRequest f;
    private static volatile x<PublishEventsRequest> n;
    private int a;
    private o.i<EventEnvelope> b = GeneratedMessageLite.emptyProtobufList();
    private boolean c;

    public static final class b extends GeneratedMessageLite.b<PublishEventsRequest, b> implements Object {
        public b m(Iterable<? extends EventEnvelope> iterable) {
            copyOnWrite();
            PublishEventsRequest.h((PublishEventsRequest) this.instance, iterable);
            return this;
        }

        private b() {
            super(PublishEventsRequest.f);
        }
    }

    static {
        PublishEventsRequest publishEventsRequest = new PublishEventsRequest();
        f = publishEventsRequest;
        publishEventsRequest.makeImmutable();
    }

    private PublishEventsRequest() {
    }

    static void h(PublishEventsRequest publishEventsRequest, Iterable iterable) {
        if (!publishEventsRequest.b.R0()) {
            publishEventsRequest.b = GeneratedMessageLite.mutableCopy(publishEventsRequest.b);
        }
        com.google.protobuf.a.addAll(iterable, publishEventsRequest.b);
    }

    public static b i() {
        return (b) f.toBuilder();
    }

    public static x<PublishEventsRequest> parser() {
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
                PublishEventsRequest publishEventsRequest = (PublishEventsRequest) obj2;
                this.b = hVar.q(this.b, publishEventsRequest.b);
                boolean z = this.c;
                boolean z2 = publishEventsRequest.c;
                this.c = hVar.f(z, z, z2, z2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= publishEventsRequest.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(EventEnvelope.parser(), kVar));
                            } else if (B == 16) {
                                this.c = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                this.b.C();
                return null;
            case 4:
                return new PublishEventsRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PublishEventsRequest.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        boolean z = this.c;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        boolean z = this.c;
        if (z) {
            codedOutputStream.A(2, z);
        }
    }
}
