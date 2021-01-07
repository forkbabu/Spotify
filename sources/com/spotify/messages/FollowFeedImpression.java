package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class FollowFeedImpression extends GeneratedMessageLite<FollowFeedImpression, b> implements Object {
    private static final FollowFeedImpression p;
    private static volatile x<FollowFeedImpression> q;
    private int a;
    private String b = "";
    private String c = "";
    private long f;
    private String n = "";
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<FollowFeedImpression, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            FollowFeedImpression.n((FollowFeedImpression) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            FollowFeedImpression.i((FollowFeedImpression) this.instance, str);
            return this;
        }

        public b o(long j) {
            copyOnWrite();
            FollowFeedImpression.m((FollowFeedImpression) this.instance, j);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            FollowFeedImpression.h((FollowFeedImpression) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            FollowFeedImpression.l((FollowFeedImpression) this.instance, str);
            return this;
        }

        private b() {
            super(FollowFeedImpression.p);
        }
    }

    static {
        FollowFeedImpression followFeedImpression = new FollowFeedImpression();
        p = followFeedImpression;
        followFeedImpression.makeImmutable();
    }

    private FollowFeedImpression() {
    }

    static void h(FollowFeedImpression followFeedImpression, String str) {
        followFeedImpression.getClass();
        str.getClass();
        followFeedImpression.a |= 1;
        followFeedImpression.b = str;
    }

    static void i(FollowFeedImpression followFeedImpression, String str) {
        followFeedImpression.getClass();
        str.getClass();
        followFeedImpression.a |= 16;
        followFeedImpression.o = str;
    }

    static void l(FollowFeedImpression followFeedImpression, String str) {
        followFeedImpression.getClass();
        str.getClass();
        followFeedImpression.a |= 2;
        followFeedImpression.c = str;
    }

    static void m(FollowFeedImpression followFeedImpression, long j) {
        followFeedImpression.a |= 4;
        followFeedImpression.f = j;
    }

    static void n(FollowFeedImpression followFeedImpression, String str) {
        followFeedImpression.getClass();
        str.getClass();
        followFeedImpression.a |= 8;
        followFeedImpression.n = str;
    }

    public static b o() {
        return (b) p.toBuilder();
    }

    public static x<FollowFeedImpression> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                FollowFeedImpression followFeedImpression = (FollowFeedImpression) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (followFeedImpression.a & 1) == 1, followFeedImpression.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (followFeedImpression.a & 2) == 2, followFeedImpression.c);
                this.f = hVar.s((this.a & 4) == 4, this.f, (followFeedImpression.a & 4) == 4, followFeedImpression.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (followFeedImpression.a & 8) == 8, followFeedImpression.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((followFeedImpression.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, followFeedImpression.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= followFeedImpression.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.w();
                            } else if (B == 34) {
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.n = z5;
                            } else if (B == 42) {
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new FollowFeedImpression();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (FollowFeedImpression.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.l(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.U(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
