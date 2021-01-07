package com.spotify.stories.v2.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class TrackChapter extends GeneratedMessageLite<TrackChapter, b> implements Object {
    private static final TrackChapter n;
    private static volatile x<TrackChapter> o;
    private String a = "";
    private String b = "";
    private String c = "";
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<TrackChapter, b> implements Object {
        private b() {
            super(TrackChapter.n);
        }
    }

    static {
        TrackChapter trackChapter = new TrackChapter();
        n = trackChapter;
        trackChapter.makeImmutable();
    }

    private TrackChapter() {
    }

    public static TrackChapter i() {
        return n;
    }

    public static x<TrackChapter> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TrackChapter trackChapter = (TrackChapter) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !trackChapter.a.isEmpty(), trackChapter.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !trackChapter.b.isEmpty(), trackChapter.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !trackChapter.c.isEmpty(), trackChapter.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ trackChapter.f.isEmpty(), trackChapter.f);
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
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                this.f = gVar.A();
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
                return new TrackChapter();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (TrackChapter.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.f;
    }

    public String l() {
        return this.c;
    }

    public String m() {
        return this.b;
    }

    public String n() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
    }
}
