package com.spotify.podcastinteractivity.qna.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class UserStatus extends GeneratedMessageLite<UserStatus, b> implements Object {
    private static final UserStatus c;
    private static volatile x<UserStatus> f;
    private int a;
    private boolean b;

    public static final class b extends GeneratedMessageLite.b<UserStatus, b> implements Object {
        private b() {
            super(UserStatus.c);
        }
    }

    static {
        UserStatus userStatus = new UserStatus();
        c = userStatus;
        userStatus.makeImmutable();
    }

    private UserStatus() {
    }

    public static UserStatus h() {
        return c;
    }

    public static x<UserStatus> parser() {
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
                UserStatus userStatus = (UserStatus) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = userStatus.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                boolean z3 = this.b;
                boolean z4 = userStatus.b;
                this.b = hVar.f(z3, z3, z4, z4);
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
                return new UserStatus();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (UserStatus.class) {
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
        if (this.a != EducationStatus.DEFAULT.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public EducationStatus i() {
        EducationStatus educationStatus;
        int i = this.a;
        if (i == 0) {
            educationStatus = EducationStatus.DEFAULT;
        } else if (i == 1) {
            educationStatus = EducationStatus.INCOMPLETE;
        } else if (i != 2) {
            educationStatus = null;
        } else {
            educationStatus = EducationStatus.COMPLETE;
        }
        return educationStatus == null ? EducationStatus.UNRECOGNIZED : educationStatus;
    }

    public boolean l() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != EducationStatus.DEFAULT.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
    }
}
