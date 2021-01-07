package com.spotify.pses.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class AuthMethod extends GeneratedMessageLite<AuthMethod, b> implements Object {
    private static final AuthMethod f;
    private static volatile x<AuthMethod> n;
    private int a;
    private String b = "";
    private int c;

    public static final class b extends GeneratedMessageLite.b<AuthMethod, b> implements Object {
        public b m(AuthProvider authProvider) {
            copyOnWrite();
            AuthMethod.h((AuthMethod) this.instance, authProvider);
            return this;
        }

        public b n(AuthProviderState authProviderState) {
            copyOnWrite();
            AuthMethod.i((AuthMethod) this.instance, authProviderState);
            return this;
        }

        private b() {
            super(AuthMethod.f);
        }
    }

    static {
        AuthMethod authMethod = new AuthMethod();
        f = authMethod;
        authMethod.makeImmutable();
    }

    private AuthMethod() {
    }

    static void h(AuthMethod authMethod, AuthProvider authProvider) {
        authMethod.getClass();
        authProvider.getClass();
        authMethod.a = authProvider.getNumber();
    }

    static void i(AuthMethod authMethod, AuthProviderState authProviderState) {
        authMethod.getClass();
        authProviderState.getClass();
        authMethod.c = authProviderState.getNumber();
    }

    public static b o() {
        return (b) f.toBuilder();
    }

    public static x<AuthMethod> parser() {
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
                AuthMethod authMethod = (AuthMethod) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = authMethod.a;
                this.a = hVar.m(z2, i, i2 != 0, i2);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !authMethod.b.isEmpty(), authMethod.b);
                int i3 = this.c;
                boolean z3 = i3 != 0;
                int i4 = authMethod.c;
                if (i4 != 0) {
                    z = true;
                }
                this.c = hVar.m(z3, i3, z, i4);
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
                            } else if (B == 18) {
                                this.b = gVar.A();
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
                return new AuthMethod();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (AuthMethod.class) {
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
        if (this.a != AuthProvider.AUTH_PROVIDER_UNSPECIFIED.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (this.c != AuthProviderState.AUTH_PROVIDER_STATE_UNSPECIFIED.getNumber()) {
            i2 += CodedOutputStream.h(3, this.c);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public AuthProvider l() {
        AuthProvider authProvider;
        int i = this.a;
        if (i == 0) {
            authProvider = AuthProvider.AUTH_PROVIDER_UNSPECIFIED;
        } else if (i == 1) {
            authProvider = AuthProvider.AUTH_PROVIDER_EMAIL;
        } else if (i == 2) {
            authProvider = AuthProvider.AUTH_PROVIDER_FACEBOOK;
        } else if (i == 3) {
            authProvider = AuthProvider.AUTH_PROVIDER_APPLE;
        } else if (i == 4) {
            authProvider = AuthProvider.AUTH_PROVIDER_PHONE_NUMBER;
        } else if (i != 5) {
            authProvider = null;
        } else {
            authProvider = AuthProvider.AUTH_PROVIDER_GOOGLE;
        }
        return authProvider == null ? AuthProvider.UNRECOGNIZED : authProvider;
    }

    public String m() {
        return this.b;
    }

    public AuthProviderState n() {
        AuthProviderState authProviderState;
        int i = this.c;
        if (i == 0) {
            authProviderState = AuthProviderState.AUTH_PROVIDER_STATE_UNSPECIFIED;
        } else if (i == 1) {
            authProviderState = AuthProviderState.AUTH_PROVIDER_STATE_LOGIN_ONLY;
        } else if (i != 2) {
            authProviderState = null;
        } else {
            authProviderState = AuthProviderState.AUTH_PROVIDER_STATE_LOGIN_SIGNUP;
        }
        return authProviderState == null ? AuthProviderState.UNRECOGNIZED : authProviderState;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != AuthProvider.AUTH_PROVIDER_UNSPECIFIED.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (this.c != AuthProviderState.AUTH_PROVIDER_STATE_UNSPECIFIED.getNumber()) {
            codedOutputStream.K(3, this.c);
        }
    }
}
