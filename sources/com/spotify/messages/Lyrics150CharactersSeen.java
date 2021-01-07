package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Lyrics150CharactersSeen extends GeneratedMessageLite<Lyrics150CharactersSeen, b> implements Object {
    private static final Lyrics150CharactersSeen n;
    private static volatile x<Lyrics150CharactersSeen> o;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<Lyrics150CharactersSeen, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            Lyrics150CharactersSeen.i((Lyrics150CharactersSeen) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            Lyrics150CharactersSeen.l((Lyrics150CharactersSeen) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            Lyrics150CharactersSeen.h((Lyrics150CharactersSeen) this.instance, str);
            return this;
        }

        private b() {
            super(Lyrics150CharactersSeen.n);
        }
    }

    static {
        Lyrics150CharactersSeen lyrics150CharactersSeen = new Lyrics150CharactersSeen();
        n = lyrics150CharactersSeen;
        lyrics150CharactersSeen.makeImmutable();
    }

    private Lyrics150CharactersSeen() {
    }

    static void h(Lyrics150CharactersSeen lyrics150CharactersSeen, String str) {
        lyrics150CharactersSeen.getClass();
        str.getClass();
        lyrics150CharactersSeen.a |= 1;
        lyrics150CharactersSeen.b = str;
    }

    static void i(Lyrics150CharactersSeen lyrics150CharactersSeen, String str) {
        lyrics150CharactersSeen.getClass();
        str.getClass();
        lyrics150CharactersSeen.a |= 2;
        lyrics150CharactersSeen.c = str;
    }

    static void l(Lyrics150CharactersSeen lyrics150CharactersSeen, String str) {
        lyrics150CharactersSeen.getClass();
        str.getClass();
        lyrics150CharactersSeen.a |= 4;
        lyrics150CharactersSeen.f = str;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<Lyrics150CharactersSeen> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Lyrics150CharactersSeen lyrics150CharactersSeen = (Lyrics150CharactersSeen) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (lyrics150CharactersSeen.a & 1) == 1, lyrics150CharactersSeen.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (lyrics150CharactersSeen.a & 2) == 2, lyrics150CharactersSeen.c);
                boolean z2 = (this.a & 4) == 4;
                String str = this.f;
                if ((lyrics150CharactersSeen.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, lyrics150CharactersSeen.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= lyrics150CharactersSeen.a;
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
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
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
                return new Lyrics150CharactersSeen();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (Lyrics150CharactersSeen.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
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
            i2 += CodedOutputStream.p(3, this.f);
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
            codedOutputStream.P(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
