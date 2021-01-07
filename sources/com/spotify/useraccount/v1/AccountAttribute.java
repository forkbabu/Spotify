package com.spotify.useraccount.v1;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class AccountAttribute extends GeneratedMessageLite<AccountAttribute, b> implements Object {
    private static final AccountAttribute c;
    private static volatile x<AccountAttribute> f;
    private int a = 0;
    private Object b;

    public enum ValueCase implements o.c {
        BOOL_VALUE(2),
        LONG_VALUE(3),
        STRING_VALUE(4),
        VALUE_NOT_SET(0);
        
        private final int value;

        private ValueCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<AccountAttribute, b> implements Object {
        private b() {
            super(AccountAttribute.c);
        }
    }

    static {
        AccountAttribute accountAttribute = new AccountAttribute();
        c = accountAttribute;
        accountAttribute.makeImmutable();
    }

    private AccountAttribute() {
    }

    public static AccountAttribute h() {
        return c;
    }

    public static x<AccountAttribute> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        ValueCase valueCase = null;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                AccountAttribute accountAttribute = (AccountAttribute) obj2;
                int i2 = accountAttribute.a;
                if (i2 == 0) {
                    valueCase = ValueCase.VALUE_NOT_SET;
                } else if (i2 == 2) {
                    valueCase = ValueCase.BOOL_VALUE;
                } else if (i2 == 3) {
                    valueCase = ValueCase.LONG_VALUE;
                } else if (i2 == 4) {
                    valueCase = ValueCase.STRING_VALUE;
                }
                int ordinal = valueCase.ordinal();
                if (ordinal == 0) {
                    if (this.a != 2) {
                        z = false;
                    }
                    this.b = hVar.p(z, this.b, accountAttribute.b);
                } else if (ordinal == 1) {
                    if (this.a != 3) {
                        z = false;
                    }
                    this.b = hVar.g(z, this.b, accountAttribute.b);
                } else if (ordinal == 2) {
                    if (this.a != 4) {
                        z = false;
                    }
                    this.b = hVar.e(z, this.b, accountAttribute.b);
                } else if (ordinal == 3) {
                    if (this.a == 0) {
                        z = false;
                    }
                    hVar.b(z);
                }
                if (hVar == GeneratedMessageLite.g.a && (i = accountAttribute.a) != 0) {
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
                            if (B == 16) {
                                this.a = 2;
                                this.b = Boolean.valueOf(gVar.h());
                            } else if (B == 24) {
                                this.a = 3;
                                this.b = Long.valueOf(gVar.w());
                            } else if (B == 34) {
                                String A = gVar.A();
                                this.a = 4;
                                this.b = A;
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
                return new AccountAttribute();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (AccountAttribute.class) {
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
        if (this.a == 2) {
            i2 = 0 + CodedOutputStream.d(2, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.l(3, ((Long) this.b).longValue());
        }
        int i3 = this.a;
        if (i3 == 4) {
            i2 += CodedOutputStream.p(4, i3 == 4 ? (String) this.b : "");
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 2) {
            codedOutputStream.A(2, ((Boolean) this.b).booleanValue());
        }
        if (this.a == 3) {
            codedOutputStream.U(3, ((Long) this.b).longValue());
        }
        int i = this.a;
        if (i == 4) {
            codedOutputStream.P(4, i == 4 ? (String) this.b : "");
        }
    }
}
