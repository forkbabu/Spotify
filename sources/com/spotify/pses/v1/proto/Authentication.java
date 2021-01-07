package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Authentication extends GeneratedMessageLite<Authentication, b> implements Object {
    private static final Authentication f;
    private static volatile x<Authentication> n;
    private int a;
    private o.i<AuthMethod> b = GeneratedMessageLite.emptyProtobufList();
    private String c = "";

    public static final class b extends GeneratedMessageLite.b<Authentication, b> implements Object {
        public b m(Iterable<? extends AuthMethod> iterable) {
            copyOnWrite();
            Authentication.h((Authentication) this.instance, iterable);
            return this;
        }

        private b() {
            super(Authentication.f);
        }
    }

    static {
        Authentication authentication = new Authentication();
        f = authentication;
        authentication.makeImmutable();
    }

    private Authentication() {
    }

    static void h(Authentication authentication, Iterable iterable) {
        if (!authentication.b.R0()) {
            authentication.b = GeneratedMessageLite.mutableCopy(authentication.b);
        }
        com.google.protobuf.a.addAll(iterable, authentication.b);
    }

    public static Authentication m() {
        return f;
    }

    public static b o() {
        return (b) f.toBuilder();
    }

    public static x<Authentication> parser() {
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
                Authentication authentication = (Authentication) obj2;
                this.b = hVar.q(this.b, authentication.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ authentication.c.isEmpty(), authentication.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= authentication.a;
                }
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
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(AuthMethod.parser(), kVar));
                            } else if (B == 18) {
                                this.c = gVar.A();
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
                this.b.C();
                return null;
            case 4:
                return new Authentication();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (Authentication.class) {
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
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int i() {
        return this.b.size();
    }

    public List<AuthMethod> l() {
        return this.b;
    }

    public String n() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
    }
}
