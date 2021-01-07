package com.spotify.music.podcastinteractivity.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Poll extends GeneratedMessageLite<Poll, b> implements Object {
    private static final Poll u;
    private static volatile x<Poll> v;
    private int a;
    private int b;
    private String c = "";
    private String f = "";
    private int n;
    private String o = "";
    private String p = "";
    private String q = "";
    private int r;
    private o.i<PollOption> s = GeneratedMessageLite.emptyProtobufList();
    private int t;

    public static final class b extends GeneratedMessageLite.b<Poll, b> implements Object {
        private b() {
            super(Poll.u);
        }
    }

    static {
        Poll poll = new Poll();
        u = poll;
        poll.makeImmutable();
    }

    private Poll() {
    }

    public static Poll i() {
        return u;
    }

    public static x<Poll> parser() {
        return u.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return u;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Poll poll = (Poll) obj2;
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = poll.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !poll.c.isEmpty(), poll.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !poll.f.isEmpty(), poll.f);
                int i3 = this.n;
                boolean z3 = i3 != 0;
                int i4 = poll.n;
                this.n = hVar.m(z3, i3, i4 != 0, i4);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !poll.o.isEmpty(), poll.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !poll.p.isEmpty(), poll.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !poll.q.isEmpty(), poll.q);
                int i5 = this.r;
                boolean z4 = i5 != 0;
                int i6 = poll.r;
                this.r = hVar.m(z4, i5, i6 != 0, i6);
                this.s = hVar.q(this.s, poll.s);
                int i7 = this.t;
                boolean z5 = i7 != 0;
                int i8 = poll.t;
                if (i8 != 0) {
                    z = true;
                }
                this.t = hVar.m(z5, i7, z, i8);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= poll.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 8:
                                this.b = gVar.u();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                this.f = gVar.A();
                                continue;
                            case 32:
                                this.n = gVar.u();
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
                            case 64:
                                this.r = gVar.u();
                                continue;
                            case 74:
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(gVar.o(PollOption.parser(), kVar));
                                continue;
                            case 80:
                                this.t = gVar.u();
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                this.s.C();
                return null;
            case 4:
                return new Poll();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (v == null) {
                    synchronized (Poll.class) {
                        if (v == null) {
                            v = new GeneratedMessageLite.c(u);
                        }
                    }
                }
                return v;
            default:
                throw new UnsupportedOperationException();
        }
        return u;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.b;
        int j = i2 != 0 ? CodedOutputStream.j(1, i2) + 0 : 0;
        if (!this.c.isEmpty()) {
            j += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            j += CodedOutputStream.p(3, this.f);
        }
        int i3 = this.n;
        if (i3 != 0) {
            j += CodedOutputStream.j(4, i3);
        }
        if (!this.o.isEmpty()) {
            j += CodedOutputStream.p(5, this.o);
        }
        if (!this.p.isEmpty()) {
            j += CodedOutputStream.p(6, this.p);
        }
        if (!this.q.isEmpty()) {
            j += CodedOutputStream.p(7, this.q);
        }
        if (this.r != PollType.MULTIPLE_CHOICE.getNumber()) {
            j += CodedOutputStream.h(8, this.r);
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            j += CodedOutputStream.n(9, this.s.get(i4));
        }
        if (this.t != PollStatus.DRAFT.getNumber()) {
            j += CodedOutputStream.h(10, this.t);
        }
        this.memoizedSerializedSize = j;
        return j;
    }

    public String h() {
        return this.f;
    }

    public int l() {
        return this.b;
    }

    public List<PollOption> m() {
        return this.s;
    }

    public String n() {
        return this.q;
    }

    public PollStatus o() {
        PollStatus pollStatus;
        int i = this.t;
        if (i == 0) {
            pollStatus = PollStatus.DRAFT;
        } else if (i == 1) {
            pollStatus = PollStatus.SCHEDULED;
        } else if (i == 2) {
            pollStatus = PollStatus.LIVE;
        } else if (i != 3) {
            pollStatus = null;
        } else {
            pollStatus = PollStatus.CLOSED;
        }
        return pollStatus == null ? PollStatus.UNRECOGNIZED : pollStatus;
    }

    public PollType p() {
        PollType pollType;
        int i = this.r;
        if (i == 0) {
            pollType = PollType.MULTIPLE_CHOICE;
        } else if (i != 1) {
            pollType = null;
        } else {
            pollType = PollType.SINGLE_CHOICE;
        }
        return pollType == null ? PollType.UNRECOGNIZED : pollType;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(1, i);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        int i2 = this.n;
        if (i2 != 0) {
            codedOutputStream.K(4, i2);
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
        if (this.r != PollType.MULTIPLE_CHOICE.getNumber()) {
            codedOutputStream.K(8, this.r);
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            codedOutputStream.M(9, this.s.get(i3));
        }
        if (this.t != PollStatus.DRAFT.getNumber()) {
            codedOutputStream.K(10, this.t);
        }
    }
}
