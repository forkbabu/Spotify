package com.spotify.podcastinteractivity.qna.model.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.podcastinteractivity.qna.model.proto.Prompt;
import com.spotify.podcastinteractivity.qna.model.proto.Response;
import com.spotify.podcastinteractivity.qna.model.proto.Responses;
import com.spotify.podcastinteractivity.qna.model.proto.ShowMetadata;
import com.spotify.podcastinteractivity.qna.model.proto.UserStatus;
import java.io.IOException;

public final class QAndA extends GeneratedMessageLite<QAndA, b> implements Object {
    private static final QAndA p;
    private static volatile x<QAndA> q;
    private Prompt a;
    private Responses b;
    private Response c;
    private ShowMetadata f;
    private UserStatus n;
    private int o;

    public static final class b extends GeneratedMessageLite.b<QAndA, b> implements Object {
        public b m(UserStatus userStatus) {
            copyOnWrite();
            QAndA.h((QAndA) this.instance, userStatus);
            return this;
        }

        private b() {
            super(QAndA.p);
        }
    }

    static {
        QAndA qAndA = new QAndA();
        p = qAndA;
        qAndA.makeImmutable();
    }

    private QAndA() {
    }

    static void h(QAndA qAndA, UserStatus userStatus) {
        qAndA.getClass();
        userStatus.getClass();
        qAndA.n = userStatus;
    }

    public static x<QAndA> parser() {
        return p.getParserForType();
    }

    public static b t(QAndA qAndA) {
        return (b) ((b) p.toBuilder()).mergeFrom((b) qAndA);
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
                QAndA qAndA = (QAndA) obj2;
                this.a = (Prompt) hVar.i(this.a, qAndA.a);
                this.b = (Responses) hVar.i(this.b, qAndA.b);
                this.c = (Response) hVar.i(this.c, qAndA.c);
                this.f = (ShowMetadata) hVar.i(this.f, qAndA.f);
                this.n = (UserStatus) hVar.i(this.n, qAndA.n);
                int i = this.o;
                boolean z2 = i != 0;
                int i2 = qAndA.o;
                if (i2 != 0) {
                    z = true;
                }
                this.o = hVar.m(z2, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                Prompt prompt = this.a;
                                Prompt.b bVar = prompt != null ? (Prompt.b) prompt.toBuilder() : null;
                                Prompt prompt2 = (Prompt) gVar.o(Prompt.parser(), kVar);
                                this.a = prompt2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Prompt.b) prompt2);
                                    this.a = (Prompt) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                Responses responses = this.b;
                                Responses.b bVar2 = responses != null ? (Responses.b) responses.toBuilder() : null;
                                Responses responses2 = (Responses) gVar.o(Responses.parser(), kVar);
                                this.b = responses2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Responses.b) responses2);
                                    this.b = (Responses) bVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                Response response = this.c;
                                Response.b bVar3 = response != null ? (Response.b) response.toBuilder() : null;
                                Response response2 = (Response) gVar.o(Response.parser(), kVar);
                                this.c = response2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((Response.b) response2);
                                    this.c = (Response) bVar3.buildPartial();
                                }
                            } else if (B == 34) {
                                ShowMetadata showMetadata = this.f;
                                ShowMetadata.b bVar4 = showMetadata != null ? (ShowMetadata.b) showMetadata.toBuilder() : null;
                                ShowMetadata showMetadata2 = (ShowMetadata) gVar.o(ShowMetadata.parser(), kVar);
                                this.f = showMetadata2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((ShowMetadata.b) showMetadata2);
                                    this.f = (ShowMetadata) bVar4.buildPartial();
                                }
                            } else if (B == 42) {
                                UserStatus userStatus = this.n;
                                UserStatus.b bVar5 = userStatus != null ? (UserStatus.b) userStatus.toBuilder() : null;
                                UserStatus userStatus2 = (UserStatus) gVar.o(UserStatus.parser(), kVar);
                                this.n = userStatus2;
                                if (bVar5 != null) {
                                    bVar5.mergeFrom((UserStatus.b) userStatus2);
                                    this.n = (UserStatus) bVar5.buildPartial();
                                }
                            } else if (B == 48) {
                                this.o = gVar.u();
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
                return new QAndA();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (QAndA.class) {
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
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, i());
        }
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, l());
        }
        if (this.c != null) {
            i2 += CodedOutputStream.n(3, o());
        }
        if (this.f != null) {
            i2 += CodedOutputStream.n(4, m());
        }
        if (this.n != null) {
            i2 += CodedOutputStream.n(5, p());
        }
        int i3 = this.o;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(6, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Prompt i() {
        Prompt prompt = this.a;
        return prompt == null ? Prompt.h() : prompt;
    }

    public Responses l() {
        Responses responses = this.b;
        return responses == null ? Responses.h() : responses;
    }

    public ShowMetadata m() {
        ShowMetadata showMetadata = this.f;
        return showMetadata == null ? ShowMetadata.h() : showMetadata;
    }

    public int n() {
        return this.o;
    }

    public Response o() {
        Response response = this.c;
        return response == null ? Response.h() : response;
    }

    public UserStatus p() {
        UserStatus userStatus = this.n;
        return userStatus == null ? UserStatus.h() : userStatus;
    }

    public boolean q() {
        return this.a != null;
    }

    public boolean r() {
        return this.f != null;
    }

    public boolean s() {
        return this.c != null;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, i());
        }
        if (this.b != null) {
            codedOutputStream.M(2, l());
        }
        if (this.c != null) {
            codedOutputStream.M(3, o());
        }
        if (this.f != null) {
            codedOutputStream.M(4, m());
        }
        if (this.n != null) {
            codedOutputStream.M(5, p());
        }
        int i = this.o;
        if (i != 0) {
            codedOutputStream.K(6, i);
        }
    }
}
