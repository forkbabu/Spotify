package com.spotify.dac.api.components.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class NotFoundComponent extends GeneratedMessageLite<NotFoundComponent, b> implements Object {
    private static final NotFoundComponent b;
    private static volatile x<NotFoundComponent> c;
    private String a = "";

    public static final class b extends GeneratedMessageLite.b<NotFoundComponent, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            NotFoundComponent.h((NotFoundComponent) this.instance, str);
            return this;
        }

        private b() {
            super(NotFoundComponent.b);
        }
    }

    static {
        NotFoundComponent notFoundComponent = new NotFoundComponent();
        b = notFoundComponent;
        notFoundComponent.makeImmutable();
    }

    private NotFoundComponent() {
    }

    static void h(NotFoundComponent notFoundComponent, String str) {
        notFoundComponent.getClass();
        str.getClass();
        notFoundComponent.a = str;
    }

    public static b l() {
        return (b) b.toBuilder();
    }

    public static x<NotFoundComponent> parser() {
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
                NotFoundComponent notFoundComponent = (NotFoundComponent) obj2;
                this.a = ((GeneratedMessageLite.h) obj).n(!this.a.isEmpty(), this.a, true ^ notFoundComponent.a.isEmpty(), notFoundComponent.a);
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
                                this.a = gVar.A();
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
                return new NotFoundComponent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (NotFoundComponent.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
    }
}
