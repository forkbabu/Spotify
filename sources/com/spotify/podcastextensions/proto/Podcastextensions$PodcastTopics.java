package com.spotify.podcastextensions.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class Podcastextensions$PodcastTopics extends GeneratedMessageLite<Podcastextensions$PodcastTopics, a> implements Object {
    private static final Podcastextensions$PodcastTopics b;
    private static volatile x<Podcastextensions$PodcastTopics> c;
    private o.i<Podcastextensions$PodcastTopic> a = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<Podcastextensions$PodcastTopics, a> implements Object {
        private a() {
            super(Podcastextensions$PodcastTopics.b);
        }
    }

    static {
        Podcastextensions$PodcastTopics podcastextensions$PodcastTopics = new Podcastextensions$PodcastTopics();
        b = podcastextensions$PodcastTopics;
        podcastextensions$PodcastTopics.makeImmutable();
    }

    private Podcastextensions$PodcastTopics() {
    }

    public static Podcastextensions$PodcastTopics h() {
        return b;
    }

    public static x<Podcastextensions$PodcastTopics> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((Podcastextensions$PodcastTopics) obj2).a);
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
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(Podcastextensions$PodcastTopic.parser(), kVar));
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
                this.a.C();
                return null;
            case 4:
                return new Podcastextensions$PodcastTopics();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (Podcastextensions$PodcastTopics.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int i() {
        return this.a.size();
    }

    public List<Podcastextensions$PodcastTopic> l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
