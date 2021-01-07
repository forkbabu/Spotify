package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.BasicStoryResponse;
import com.spotify.wrapped2020.v1.proto.IntroStoryResponse;
import com.spotify.wrapped2020.v1.proto.QuizStoryResponse;
import com.spotify.wrapped2020.v1.proto.StoryOfYourSongStoryResponse;
import com.spotify.wrapped2020.v1.proto.SummaryIntroStoryResponse;
import com.spotify.wrapped2020.v1.proto.SummaryShareStoryResponse;
import com.spotify.wrapped2020.v1.proto.Top100PlaylistStoryResponse;
import com.spotify.wrapped2020.v1.proto.TopFiveStoryResponse;
import com.spotify.wrapped2020.v1.proto.TopGenresStoryResponse;
import java.io.IOException;

public final class Story extends GeneratedMessageLite<Story, b> implements Object {
    private static final Story c;
    private static volatile x<Story> f;
    private int a = 0;
    private Object b;

    public enum StoryOneofCase implements o.c {
        INTRO(1),
        START_OFF_WITH_A_WIN(2),
        TOP_GENRES(3),
        TOP_SONG(4),
        STORY_OF_YOUR_SONG(5),
        TOP_FIVE_SONGS(6),
        TOP_100_PLAYLIST(7),
        TOP_PODCAST(8),
        TOP_FIVE_PODCASTS(9),
        BINGE_LISTEN(10),
        PREMIUM_BADGE(11),
        TOP_DECADE(12),
        TOP_ARTIST(13),
        TOP_FIVE_ARTISTS(14),
        SUMMARY(15),
        SUMMARY_SHARE(16),
        STORYONEOF_NOT_SET(0);
        
        private final int value;

        private StoryOneofCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Story, b> implements Object {
        private b() {
            super(Story.c);
        }
    }

    static {
        Story story = new Story();
        c = story;
        story.makeImmutable();
    }

    private Story() {
    }

    public static x<Story> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Story story = (Story) obj2;
                switch (story.o().ordinal()) {
                    case 0:
                        this.b = hVar.u(this.a == 1, this.b, story.b);
                        break;
                    case 1:
                        this.b = hVar.u(this.a == 2, this.b, story.b);
                        break;
                    case 2:
                        this.b = hVar.u(this.a == 3, this.b, story.b);
                        break;
                    case 3:
                        this.b = hVar.u(this.a == 4, this.b, story.b);
                        break;
                    case 4:
                        this.b = hVar.u(this.a == 5, this.b, story.b);
                        break;
                    case 5:
                        this.b = hVar.u(this.a == 6, this.b, story.b);
                        break;
                    case 6:
                        this.b = hVar.u(this.a == 7, this.b, story.b);
                        break;
                    case 7:
                        this.b = hVar.u(this.a == 8, this.b, story.b);
                        break;
                    case 8:
                        this.b = hVar.u(this.a == 9, this.b, story.b);
                        break;
                    case 9:
                        this.b = hVar.u(this.a == 10, this.b, story.b);
                        break;
                    case 10:
                        this.b = hVar.u(this.a == 11, this.b, story.b);
                        break;
                    case 11:
                        this.b = hVar.u(this.a == 12, this.b, story.b);
                        break;
                    case 12:
                        this.b = hVar.u(this.a == 13, this.b, story.b);
                        break;
                    case 13:
                        this.b = hVar.u(this.a == 14, this.b, story.b);
                        break;
                    case 14:
                        this.b = hVar.u(this.a == 15, this.b, story.b);
                        break;
                    case 15:
                        this.b = hVar.u(this.a == 16, this.b, story.b);
                        break;
                    case 16:
                        hVar.b(this.a != 0);
                        break;
                }
                if (hVar == GeneratedMessageLite.g.a && (i = story.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                IntroStoryResponse.b bVar = this.a == 1 ? (IntroStoryResponse.b) ((IntroStoryResponse) this.b).toBuilder() : null;
                                u o = gVar.o(IntroStoryResponse.parser(), kVar);
                                this.b = o;
                                if (bVar != null) {
                                    bVar.mergeFrom((IntroStoryResponse.b) ((IntroStoryResponse) o));
                                    this.b = bVar.buildPartial();
                                }
                                this.a = 1;
                                continue;
                            case 18:
                                BasicStoryResponse.b bVar2 = this.a == 2 ? (BasicStoryResponse.b) ((BasicStoryResponse) this.b).toBuilder() : null;
                                u o2 = gVar.o(BasicStoryResponse.parser(), kVar);
                                this.b = o2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((BasicStoryResponse.b) ((BasicStoryResponse) o2));
                                    this.b = bVar2.buildPartial();
                                }
                                this.a = 2;
                                continue;
                            case 26:
                                TopGenresStoryResponse.b bVar3 = this.a == 3 ? (TopGenresStoryResponse.b) ((TopGenresStoryResponse) this.b).toBuilder() : null;
                                u o3 = gVar.o(TopGenresStoryResponse.parser(), kVar);
                                this.b = o3;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((TopGenresStoryResponse.b) ((TopGenresStoryResponse) o3));
                                    this.b = bVar3.buildPartial();
                                }
                                this.a = 3;
                                continue;
                            case 34:
                                BasicStoryResponse.b bVar4 = this.a == 4 ? (BasicStoryResponse.b) ((BasicStoryResponse) this.b).toBuilder() : null;
                                u o4 = gVar.o(BasicStoryResponse.parser(), kVar);
                                this.b = o4;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((BasicStoryResponse.b) ((BasicStoryResponse) o4));
                                    this.b = bVar4.buildPartial();
                                }
                                this.a = 4;
                                continue;
                            case 42:
                                StoryOfYourSongStoryResponse.b bVar5 = this.a == 5 ? (StoryOfYourSongStoryResponse.b) ((StoryOfYourSongStoryResponse) this.b).toBuilder() : null;
                                u o5 = gVar.o(StoryOfYourSongStoryResponse.parser(), kVar);
                                this.b = o5;
                                if (bVar5 != null) {
                                    bVar5.mergeFrom((StoryOfYourSongStoryResponse.b) ((StoryOfYourSongStoryResponse) o5));
                                    this.b = bVar5.buildPartial();
                                }
                                this.a = 5;
                                continue;
                            case 50:
                                TopFiveStoryResponse.b bVar6 = this.a == 6 ? (TopFiveStoryResponse.b) ((TopFiveStoryResponse) this.b).toBuilder() : null;
                                u o6 = gVar.o(TopFiveStoryResponse.parser(), kVar);
                                this.b = o6;
                                if (bVar6 != null) {
                                    bVar6.mergeFrom((TopFiveStoryResponse.b) ((TopFiveStoryResponse) o6));
                                    this.b = bVar6.buildPartial();
                                }
                                this.a = 6;
                                continue;
                            case 58:
                                Top100PlaylistStoryResponse.b bVar7 = this.a == 7 ? (Top100PlaylistStoryResponse.b) ((Top100PlaylistStoryResponse) this.b).toBuilder() : null;
                                u o7 = gVar.o(Top100PlaylistStoryResponse.parser(), kVar);
                                this.b = o7;
                                if (bVar7 != null) {
                                    bVar7.mergeFrom((Top100PlaylistStoryResponse.b) ((Top100PlaylistStoryResponse) o7));
                                    this.b = bVar7.buildPartial();
                                }
                                this.a = 7;
                                continue;
                            case 66:
                                QuizStoryResponse.b bVar8 = this.a == 8 ? (QuizStoryResponse.b) ((QuizStoryResponse) this.b).toBuilder() : null;
                                u o8 = gVar.o(QuizStoryResponse.parser(), kVar);
                                this.b = o8;
                                if (bVar8 != null) {
                                    bVar8.mergeFrom((QuizStoryResponse.b) ((QuizStoryResponse) o8));
                                    this.b = bVar8.buildPartial();
                                }
                                this.a = 8;
                                continue;
                            case 74:
                                TopFiveStoryResponse.b bVar9 = this.a == 9 ? (TopFiveStoryResponse.b) ((TopFiveStoryResponse) this.b).toBuilder() : null;
                                u o9 = gVar.o(TopFiveStoryResponse.parser(), kVar);
                                this.b = o9;
                                if (bVar9 != null) {
                                    bVar9.mergeFrom((TopFiveStoryResponse.b) ((TopFiveStoryResponse) o9));
                                    this.b = bVar9.buildPartial();
                                }
                                this.a = 9;
                                continue;
                            case 82:
                                BasicStoryResponse.b bVar10 = this.a == 10 ? (BasicStoryResponse.b) ((BasicStoryResponse) this.b).toBuilder() : null;
                                u o10 = gVar.o(BasicStoryResponse.parser(), kVar);
                                this.b = o10;
                                if (bVar10 != null) {
                                    bVar10.mergeFrom((BasicStoryResponse.b) ((BasicStoryResponse) o10));
                                    this.b = bVar10.buildPartial();
                                }
                                this.a = 10;
                                continue;
                            case 90:
                                BasicStoryResponse.b bVar11 = this.a == 11 ? (BasicStoryResponse.b) ((BasicStoryResponse) this.b).toBuilder() : null;
                                u o11 = gVar.o(BasicStoryResponse.parser(), kVar);
                                this.b = o11;
                                if (bVar11 != null) {
                                    bVar11.mergeFrom((BasicStoryResponse.b) ((BasicStoryResponse) o11));
                                    this.b = bVar11.buildPartial();
                                }
                                this.a = 11;
                                continue;
                            case 98:
                                QuizStoryResponse.b bVar12 = this.a == 12 ? (QuizStoryResponse.b) ((QuizStoryResponse) this.b).toBuilder() : null;
                                u o12 = gVar.o(QuizStoryResponse.parser(), kVar);
                                this.b = o12;
                                if (bVar12 != null) {
                                    bVar12.mergeFrom((QuizStoryResponse.b) ((QuizStoryResponse) o12));
                                    this.b = bVar12.buildPartial();
                                }
                                this.a = 12;
                                continue;
                            case 106:
                                QuizStoryResponse.b bVar13 = this.a == 13 ? (QuizStoryResponse.b) ((QuizStoryResponse) this.b).toBuilder() : null;
                                u o13 = gVar.o(QuizStoryResponse.parser(), kVar);
                                this.b = o13;
                                if (bVar13 != null) {
                                    bVar13.mergeFrom((QuizStoryResponse.b) ((QuizStoryResponse) o13));
                                    this.b = bVar13.buildPartial();
                                }
                                this.a = 13;
                                continue;
                            case 114:
                                TopFiveStoryResponse.b bVar14 = this.a == 14 ? (TopFiveStoryResponse.b) ((TopFiveStoryResponse) this.b).toBuilder() : null;
                                u o14 = gVar.o(TopFiveStoryResponse.parser(), kVar);
                                this.b = o14;
                                if (bVar14 != null) {
                                    bVar14.mergeFrom((TopFiveStoryResponse.b) ((TopFiveStoryResponse) o14));
                                    this.b = bVar14.buildPartial();
                                }
                                this.a = 14;
                                continue;
                            case 122:
                                SummaryIntroStoryResponse.b bVar15 = this.a == 15 ? (SummaryIntroStoryResponse.b) ((SummaryIntroStoryResponse) this.b).toBuilder() : null;
                                u o15 = gVar.o(SummaryIntroStoryResponse.parser(), kVar);
                                this.b = o15;
                                if (bVar15 != null) {
                                    bVar15.mergeFrom((SummaryIntroStoryResponse.b) ((SummaryIntroStoryResponse) o15));
                                    this.b = bVar15.buildPartial();
                                }
                                this.a = 15;
                                continue;
                            case 130:
                                SummaryShareStoryResponse.b bVar16 = this.a == 16 ? (SummaryShareStoryResponse.b) ((SummaryShareStoryResponse) this.b).toBuilder() : null;
                                u o16 = gVar.o(SummaryShareStoryResponse.parser(), kVar);
                                this.b = o16;
                                if (bVar16 != null) {
                                    bVar16.mergeFrom((SummaryShareStoryResponse.b) ((SummaryShareStoryResponse) o16));
                                    this.b = bVar16.buildPartial();
                                }
                                this.a = 16;
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
                return null;
            case 4:
                return new Story();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Story.class) {
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
        if (this.a == 1) {
            i2 = 0 + CodedOutputStream.n(1, (IntroStoryResponse) this.b);
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (BasicStoryResponse) this.b);
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.n(3, (TopGenresStoryResponse) this.b);
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.n(4, (BasicStoryResponse) this.b);
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (StoryOfYourSongStoryResponse) this.b);
        }
        if (this.a == 6) {
            i2 += CodedOutputStream.n(6, (TopFiveStoryResponse) this.b);
        }
        if (this.a == 7) {
            i2 += CodedOutputStream.n(7, (Top100PlaylistStoryResponse) this.b);
        }
        if (this.a == 8) {
            i2 += CodedOutputStream.n(8, (QuizStoryResponse) this.b);
        }
        if (this.a == 9) {
            i2 += CodedOutputStream.n(9, (TopFiveStoryResponse) this.b);
        }
        if (this.a == 10) {
            i2 += CodedOutputStream.n(10, (BasicStoryResponse) this.b);
        }
        if (this.a == 11) {
            i2 += CodedOutputStream.n(11, (BasicStoryResponse) this.b);
        }
        if (this.a == 12) {
            i2 += CodedOutputStream.n(12, (QuizStoryResponse) this.b);
        }
        if (this.a == 13) {
            i2 += CodedOutputStream.n(13, (QuizStoryResponse) this.b);
        }
        if (this.a == 14) {
            i2 += CodedOutputStream.n(14, (TopFiveStoryResponse) this.b);
        }
        if (this.a == 15) {
            i2 += CodedOutputStream.n(15, (SummaryIntroStoryResponse) this.b);
        }
        if (this.a == 16) {
            i2 += CodedOutputStream.n(16, (SummaryShareStoryResponse) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public BasicStoryResponse h() {
        if (this.a == 10) {
            return (BasicStoryResponse) this.b;
        }
        return BasicStoryResponse.n();
    }

    public IntroStoryResponse i() {
        if (this.a == 1) {
            return (IntroStoryResponse) this.b;
        }
        return IntroStoryResponse.n();
    }

    public BasicStoryResponse l() {
        if (this.a == 11) {
            return (BasicStoryResponse) this.b;
        }
        return BasicStoryResponse.n();
    }

    public BasicStoryResponse m() {
        if (this.a == 2) {
            return (BasicStoryResponse) this.b;
        }
        return BasicStoryResponse.n();
    }

    public StoryOfYourSongStoryResponse n() {
        if (this.a == 5) {
            return (StoryOfYourSongStoryResponse) this.b;
        }
        return StoryOfYourSongStoryResponse.l();
    }

    public StoryOneofCase o() {
        switch (this.a) {
            case 0:
                return StoryOneofCase.STORYONEOF_NOT_SET;
            case 1:
                return StoryOneofCase.INTRO;
            case 2:
                return StoryOneofCase.START_OFF_WITH_A_WIN;
            case 3:
                return StoryOneofCase.TOP_GENRES;
            case 4:
                return StoryOneofCase.TOP_SONG;
            case 5:
                return StoryOneofCase.STORY_OF_YOUR_SONG;
            case 6:
                return StoryOneofCase.TOP_FIVE_SONGS;
            case 7:
                return StoryOneofCase.TOP_100_PLAYLIST;
            case 8:
                return StoryOneofCase.TOP_PODCAST;
            case 9:
                return StoryOneofCase.TOP_FIVE_PODCASTS;
            case 10:
                return StoryOneofCase.BINGE_LISTEN;
            case 11:
                return StoryOneofCase.PREMIUM_BADGE;
            case 12:
                return StoryOneofCase.TOP_DECADE;
            case 13:
                return StoryOneofCase.TOP_ARTIST;
            case 14:
                return StoryOneofCase.TOP_FIVE_ARTISTS;
            case 15:
                return StoryOneofCase.SUMMARY;
            case 16:
                return StoryOneofCase.SUMMARY_SHARE;
            default:
                return null;
        }
    }

    public SummaryIntroStoryResponse p() {
        if (this.a == 15) {
            return (SummaryIntroStoryResponse) this.b;
        }
        return SummaryIntroStoryResponse.q();
    }

    public SummaryShareStoryResponse q() {
        if (this.a == 16) {
            return (SummaryShareStoryResponse) this.b;
        }
        return SummaryShareStoryResponse.l();
    }

    public Top100PlaylistStoryResponse r() {
        if (this.a == 7) {
            return (Top100PlaylistStoryResponse) this.b;
        }
        return Top100PlaylistStoryResponse.n();
    }

    public QuizStoryResponse s() {
        if (this.a == 13) {
            return (QuizStoryResponse) this.b;
        }
        return QuizStoryResponse.i();
    }

    public QuizStoryResponse t() {
        if (this.a == 12) {
            return (QuizStoryResponse) this.b;
        }
        return QuizStoryResponse.i();
    }

    public TopFiveStoryResponse u() {
        if (this.a == 14) {
            return (TopFiveStoryResponse) this.b;
        }
        return TopFiveStoryResponse.i();
    }

    public TopFiveStoryResponse v() {
        if (this.a == 9) {
            return (TopFiveStoryResponse) this.b;
        }
        return TopFiveStoryResponse.i();
    }

    public TopFiveStoryResponse w() {
        if (this.a == 6) {
            return (TopFiveStoryResponse) this.b;
        }
        return TopFiveStoryResponse.i();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.M(1, (IntroStoryResponse) this.b);
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (BasicStoryResponse) this.b);
        }
        if (this.a == 3) {
            codedOutputStream.M(3, (TopGenresStoryResponse) this.b);
        }
        if (this.a == 4) {
            codedOutputStream.M(4, (BasicStoryResponse) this.b);
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (StoryOfYourSongStoryResponse) this.b);
        }
        if (this.a == 6) {
            codedOutputStream.M(6, (TopFiveStoryResponse) this.b);
        }
        if (this.a == 7) {
            codedOutputStream.M(7, (Top100PlaylistStoryResponse) this.b);
        }
        if (this.a == 8) {
            codedOutputStream.M(8, (QuizStoryResponse) this.b);
        }
        if (this.a == 9) {
            codedOutputStream.M(9, (TopFiveStoryResponse) this.b);
        }
        if (this.a == 10) {
            codedOutputStream.M(10, (BasicStoryResponse) this.b);
        }
        if (this.a == 11) {
            codedOutputStream.M(11, (BasicStoryResponse) this.b);
        }
        if (this.a == 12) {
            codedOutputStream.M(12, (QuizStoryResponse) this.b);
        }
        if (this.a == 13) {
            codedOutputStream.M(13, (QuizStoryResponse) this.b);
        }
        if (this.a == 14) {
            codedOutputStream.M(14, (TopFiveStoryResponse) this.b);
        }
        if (this.a == 15) {
            codedOutputStream.M(15, (SummaryIntroStoryResponse) this.b);
        }
        if (this.a == 16) {
            codedOutputStream.M(16, (SummaryShareStoryResponse) this.b);
        }
    }

    public TopGenresStoryResponse x() {
        if (this.a == 3) {
            return (TopGenresStoryResponse) this.b;
        }
        return TopGenresStoryResponse.i();
    }

    public QuizStoryResponse y() {
        if (this.a == 8) {
            return (QuizStoryResponse) this.b;
        }
        return QuizStoryResponse.i();
    }

    public BasicStoryResponse z() {
        if (this.a == 4) {
            return (BasicStoryResponse) this.b;
        }
        return BasicStoryResponse.n();
    }
}
