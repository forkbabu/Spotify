package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import java.io.IOException;
import java.util.List;

public final class QuizStoryResponse extends GeneratedMessageLite<QuizStoryResponse, b> implements Object {
    private static final QuizStoryResponse y;
    private static volatile x<QuizStoryResponse> z;
    private int a;
    private String b = "";
    private String c = "";
    private ShareConfiguration f;
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private o.i<Choice> t = GeneratedMessageLite.emptyProtobufList();
    private Result u;
    private int v;
    private String w = "";
    private SayThanks x;

    public static final class Choice extends GeneratedMessageLite<Choice, a> implements Object {
        private static final Choice f;
        private static volatile x<Choice> n;
        private String a = "";
        private String b = "";
        private boolean c;

        public static final class a extends GeneratedMessageLite.b<Choice, a> implements Object {
            private a() {
                super(Choice.f);
            }
        }

        static {
            Choice choice = new Choice();
            f = choice;
            choice.makeImmutable();
        }

        private Choice() {
        }

        public static x<Choice> parser() {
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
                    Choice choice = (Choice) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !choice.a.isEmpty(), choice.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ choice.b.isEmpty(), choice.b);
                    boolean z = this.c;
                    boolean z2 = choice.c;
                    this.c = hVar.f(z, z, z2, z2);
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
                                    this.a = gVar.A();
                                } else if (B == 18) {
                                    this.b = gVar.A();
                                } else if (B == 24) {
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
                    return null;
                case 4:
                    return new Choice();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (Choice.class) {
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
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.a);
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            boolean z = this.c;
            if (z) {
                i2 += CodedOutputStream.d(3, z);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String h() {
            return this.a;
        }

        public boolean i() {
            return this.c;
        }

        public String l() {
            return this.b;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.P(2, this.b);
            }
            boolean z = this.c;
            if (z) {
                codedOutputStream.A(3, z);
            }
        }
    }

    public static final class Result extends GeneratedMessageLite<Result, a> implements Object {
        private static final Result n;
        private static volatile x<Result> o;
        private String a = "";
        private String b = "";
        private String c = "";
        private Paragraph f;

        public static final class a extends GeneratedMessageLite.b<Result, a> implements Object {
            private a() {
                super(Result.n);
            }
        }

        static {
            Result result = new Result();
            n = result;
            result.makeImmutable();
        }

        private Result() {
        }

        public static Result i() {
            return n;
        }

        public static x<Result> parser() {
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
                    Result result = (Result) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !result.a.isEmpty(), result.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, !result.b.isEmpty(), result.b);
                    this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ result.c.isEmpty(), result.c);
                    this.f = (Paragraph) hVar.i(this.f, result.f);
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
                                    Paragraph paragraph = this.f;
                                    Paragraph.b bVar = paragraph != null ? (Paragraph.b) paragraph.toBuilder() : null;
                                    Paragraph paragraph2 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                    this.f = paragraph2;
                                    if (bVar != null) {
                                        bVar.mergeFrom((Paragraph.b) paragraph2);
                                        this.f = (Paragraph) bVar.buildPartial();
                                    }
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
                    return new Result();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (o == null) {
                        synchronized (Result.class) {
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
            if (this.f != null) {
                i2 += CodedOutputStream.n(4, m());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String h() {
            return this.a;
        }

        public String l() {
            return this.b;
        }

        public Paragraph m() {
            Paragraph paragraph = this.f;
            return paragraph == null ? Paragraph.h() : paragraph;
        }

        public String n() {
            return this.c;
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
            if (this.f != null) {
                codedOutputStream.M(4, m());
            }
        }
    }

    public static final class SayThanks extends GeneratedMessageLite<SayThanks, a> implements Object {
        private static final SayThanks f;
        private static volatile x<SayThanks> n;
        private Paragraph a;
        private String b = "";
        private String c = "";

        public static final class a extends GeneratedMessageLite.b<SayThanks, a> implements Object {
            private a() {
                super(SayThanks.f);
            }
        }

        static {
            SayThanks sayThanks = new SayThanks();
            f = sayThanks;
            sayThanks.makeImmutable();
        }

        private SayThanks() {
        }

        public static SayThanks i() {
            return f;
        }

        public static x<SayThanks> parser() {
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
                    SayThanks sayThanks = (SayThanks) obj2;
                    this.a = (Paragraph) hVar.i(this.a, sayThanks.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, !sayThanks.b.isEmpty(), sayThanks.b);
                    this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ sayThanks.c.isEmpty(), sayThanks.c);
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
                                    Paragraph paragraph = this.a;
                                    Paragraph.b bVar = paragraph != null ? (Paragraph.b) paragraph.toBuilder() : null;
                                    Paragraph paragraph2 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                    this.a = paragraph2;
                                    if (bVar != null) {
                                        bVar.mergeFrom((Paragraph.b) paragraph2);
                                        this.a = (Paragraph) bVar.buildPartial();
                                    }
                                } else if (B == 18) {
                                    this.b = gVar.A();
                                } else if (B == 26) {
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
                    return null;
                case 4:
                    return new SayThanks();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (SayThanks.class) {
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
            if (this.a != null) {
                i2 = 0 + CodedOutputStream.n(1, l());
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            if (!this.c.isEmpty()) {
                i2 += CodedOutputStream.p(3, this.c);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String h() {
            return this.c;
        }

        public Paragraph l() {
            Paragraph paragraph = this.a;
            return paragraph == null ? Paragraph.h() : paragraph;
        }

        public String m() {
            return this.b;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a != null) {
                codedOutputStream.M(1, l());
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.P(2, this.b);
            }
            if (!this.c.isEmpty()) {
                codedOutputStream.P(3, this.c);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<QuizStoryResponse, b> implements Object {
        private b() {
            super(QuizStoryResponse.y);
        }
    }

    static {
        QuizStoryResponse quizStoryResponse = new QuizStoryResponse();
        y = quizStoryResponse;
        quizStoryResponse.makeImmutable();
    }

    private QuizStoryResponse() {
    }

    public static QuizStoryResponse i() {
        return y;
    }

    public static x<QuizStoryResponse> parser() {
        return y.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return y;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                QuizStoryResponse quizStoryResponse = (QuizStoryResponse) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !quizStoryResponse.b.isEmpty(), quizStoryResponse.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !quizStoryResponse.c.isEmpty(), quizStoryResponse.c);
                this.f = (ShareConfiguration) hVar.i(this.f, quizStoryResponse.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !quizStoryResponse.n.isEmpty(), quizStoryResponse.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !quizStoryResponse.o.isEmpty(), quizStoryResponse.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !quizStoryResponse.p.isEmpty(), quizStoryResponse.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !quizStoryResponse.q.isEmpty(), quizStoryResponse.q);
                this.r = hVar.n(!this.r.isEmpty(), this.r, !quizStoryResponse.r.isEmpty(), quizStoryResponse.r);
                this.s = hVar.n(!this.s.isEmpty(), this.s, !quizStoryResponse.s.isEmpty(), quizStoryResponse.s);
                this.t = hVar.q(this.t, quizStoryResponse.t);
                this.u = (Result) hVar.i(this.u, quizStoryResponse.u);
                int i = this.v;
                boolean z3 = i != 0;
                int i2 = quizStoryResponse.v;
                if (i2 != 0) {
                    z2 = true;
                }
                this.v = hVar.m(z3, i, z2, i2);
                this.w = hVar.n(!this.w.isEmpty(), this.w, !quizStoryResponse.w.isEmpty(), quizStoryResponse.w);
                this.x = (SayThanks) hVar.i(this.x, quizStoryResponse.x);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= quizStoryResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.b = gVar.A();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                ShareConfiguration shareConfiguration = this.f;
                                ShareConfiguration.b bVar = shareConfiguration != null ? (ShareConfiguration.b) shareConfiguration.toBuilder() : null;
                                ShareConfiguration shareConfiguration2 = (ShareConfiguration) gVar.o(ShareConfiguration.parser(), kVar);
                                this.f = shareConfiguration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ShareConfiguration.b) shareConfiguration2);
                                    this.f = (ShareConfiguration) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 34:
                                this.n = gVar.A();
                                continue;
                            case 42:
                                this.o = gVar.A();
                                continue;
                            case 50:
                                this.p = gVar.A();
                                continue;
                            case 58:
                                this.q = gVar.A();
                                continue;
                            case 66:
                                this.r = gVar.A();
                                continue;
                            case 74:
                                this.s = gVar.A();
                                continue;
                            case 82:
                                if (!this.t.R0()) {
                                    this.t = GeneratedMessageLite.mutableCopy(this.t);
                                }
                                this.t.add(gVar.o(Choice.parser(), kVar));
                                continue;
                            case 90:
                                Result result = this.u;
                                Result.a aVar = result != null ? (Result.a) result.toBuilder() : null;
                                Result result2 = (Result) gVar.o(Result.parser(), kVar);
                                this.u = result2;
                                if (aVar != null) {
                                    aVar.mergeFrom((Result.a) result2);
                                    this.u = (Result) aVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 96:
                                this.v = gVar.u();
                                continue;
                            case 106:
                                this.w = gVar.A();
                                continue;
                            case 114:
                                SayThanks sayThanks = this.x;
                                SayThanks.a aVar2 = sayThanks != null ? (SayThanks.a) sayThanks.toBuilder() : null;
                                SayThanks sayThanks2 = (SayThanks) gVar.o(SayThanks.parser(), kVar);
                                this.x = sayThanks2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((SayThanks.a) sayThanks2);
                                    this.x = (SayThanks) aVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                this.t.C();
                return null;
            case 4:
                return new QuizStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (z == null) {
                    synchronized (QuizStoryResponse.class) {
                        if (z == null) {
                            z = new GeneratedMessageLite.c(y);
                        }
                    }
                }
                return z;
            default:
                throw new UnsupportedOperationException();
        }
        return y;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if (this.f != null) {
            p2 += CodedOutputStream.n(3, w());
        }
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        if (!this.p.isEmpty()) {
            p2 += CodedOutputStream.p(6, this.p);
        }
        if (!this.q.isEmpty()) {
            p2 += CodedOutputStream.p(7, this.q);
        }
        if (!this.r.isEmpty()) {
            p2 += CodedOutputStream.p(8, this.r);
        }
        if (!this.s.isEmpty()) {
            p2 += CodedOutputStream.p(9, this.s);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            p2 += CodedOutputStream.n(10, this.t.get(i2));
        }
        if (this.u != null) {
            p2 += CodedOutputStream.n(11, s());
        }
        if (this.v != Gradient.VERSION_1.getNumber()) {
            p2 += CodedOutputStream.h(12, this.v);
        }
        if (!this.w.isEmpty()) {
            p2 += CodedOutputStream.p(13, this.w);
        }
        if (this.x != null) {
            p2 += CodedOutputStream.n(14, t());
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<Choice> h() {
        return this.t;
    }

    public String l() {
        return this.b;
    }

    public Gradient m() {
        Gradient d = Gradient.d(this.v);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public String n() {
        return this.r;
    }

    public String o() {
        return this.q;
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.n;
    }

    public String r() {
        return this.s;
    }

    public Result s() {
        Result result = this.u;
        return result == null ? Result.i() : result;
    }

    public SayThanks t() {
        SayThanks sayThanks = this.x;
        return sayThanks == null ? SayThanks.i() : sayThanks;
    }

    public String u() {
        return this.o;
    }

    public String v() {
        return this.w;
    }

    public ShareConfiguration w() {
        ShareConfiguration shareConfiguration = this.f;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (this.f != null) {
            codedOutputStream.M(3, w());
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(6, this.p);
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(7, this.q);
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.P(8, this.r);
        }
        if (!this.s.isEmpty()) {
            codedOutputStream.P(9, this.s);
        }
        for (int i = 0; i < this.t.size(); i++) {
            codedOutputStream.M(10, this.t.get(i));
        }
        if (this.u != null) {
            codedOutputStream.M(11, s());
        }
        if (this.v != Gradient.VERSION_1.getNumber()) {
            codedOutputStream.K(12, this.v);
        }
        if (!this.w.isEmpty()) {
            codedOutputStream.P(13, this.w);
        }
        if (this.x != null) {
            codedOutputStream.M(14, t());
        }
    }

    public String x() {
        return this.p;
    }
}
