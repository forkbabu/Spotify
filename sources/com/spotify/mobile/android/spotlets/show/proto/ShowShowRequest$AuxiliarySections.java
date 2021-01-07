package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ContinueListeningSection;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$TrailerSection;
import com.spotify.podcastextensions.proto.Podcastextensions$PodcastHtmlDescription;
import com.spotify.podcastextensions.proto.Podcastextensions$PodcastTopics;
import java.io.IOException;

public final class ShowShowRequest$AuxiliarySections extends GeneratedMessageLite<ShowShowRequest$AuxiliarySections, a> implements Object {
    private static final ShowShowRequest$AuxiliarySections o;
    private static volatile x<ShowShowRequest$AuxiliarySections> p;
    private int a;
    private ShowShowRequest$ContinueListeningSection b;
    private Podcastextensions$PodcastTopics c;
    private ShowShowRequest$TrailerSection f;
    private Podcastextensions$PodcastHtmlDescription n;

    public static final class a extends GeneratedMessageLite.b<ShowShowRequest$AuxiliarySections, a> implements Object {
        private a() {
            super(ShowShowRequest$AuxiliarySections.o);
        }
    }

    static {
        ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = new ShowShowRequest$AuxiliarySections();
        o = showShowRequest$AuxiliarySections;
        showShowRequest$AuxiliarySections.makeImmutable();
    }

    private ShowShowRequest$AuxiliarySections() {
    }

    public static ShowShowRequest$AuxiliarySections i() {
        return o;
    }

    public static x<ShowShowRequest$AuxiliarySections> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = (ShowShowRequest$AuxiliarySections) obj2;
                this.b = (ShowShowRequest$ContinueListeningSection) hVar.i(this.b, showShowRequest$AuxiliarySections.b);
                this.c = (Podcastextensions$PodcastTopics) hVar.i(this.c, showShowRequest$AuxiliarySections.c);
                this.f = (ShowShowRequest$TrailerSection) hVar.i(this.f, showShowRequest$AuxiliarySections.f);
                this.n = (Podcastextensions$PodcastHtmlDescription) hVar.i(this.n, showShowRequest$AuxiliarySections.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showShowRequest$AuxiliarySections.a;
                }
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
                                ShowShowRequest$ContinueListeningSection.a aVar = (this.a & 1) == 1 ? (ShowShowRequest$ContinueListeningSection.a) this.b.toBuilder() : null;
                                ShowShowRequest$ContinueListeningSection showShowRequest$ContinueListeningSection = (ShowShowRequest$ContinueListeningSection) gVar.o(ShowShowRequest$ContinueListeningSection.parser(), kVar);
                                this.b = showShowRequest$ContinueListeningSection;
                                if (aVar != null) {
                                    aVar.mergeFrom((ShowShowRequest$ContinueListeningSection.a) showShowRequest$ContinueListeningSection);
                                    this.b = (ShowShowRequest$ContinueListeningSection) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                Podcastextensions$PodcastTopics.a aVar2 = (this.a & 2) == 2 ? (Podcastextensions$PodcastTopics.a) this.c.toBuilder() : null;
                                Podcastextensions$PodcastTopics podcastextensions$PodcastTopics = (Podcastextensions$PodcastTopics) gVar.o(Podcastextensions$PodcastTopics.parser(), kVar);
                                this.c = podcastextensions$PodcastTopics;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((Podcastextensions$PodcastTopics.a) podcastextensions$PodcastTopics);
                                    this.c = (Podcastextensions$PodcastTopics) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                ShowShowRequest$TrailerSection.a aVar3 = (this.a & 4) == 4 ? (ShowShowRequest$TrailerSection.a) this.f.toBuilder() : null;
                                ShowShowRequest$TrailerSection showShowRequest$TrailerSection = (ShowShowRequest$TrailerSection) gVar.o(ShowShowRequest$TrailerSection.parser(), kVar);
                                this.f = showShowRequest$TrailerSection;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((ShowShowRequest$TrailerSection.a) showShowRequest$TrailerSection);
                                    this.f = (ShowShowRequest$TrailerSection) aVar3.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 42) {
                                Podcastextensions$PodcastHtmlDescription.a aVar4 = (this.a & 8) == 8 ? (Podcastextensions$PodcastHtmlDescription.a) this.n.toBuilder() : null;
                                Podcastextensions$PodcastHtmlDescription podcastextensions$PodcastHtmlDescription = (Podcastextensions$PodcastHtmlDescription) gVar.o(Podcastextensions$PodcastHtmlDescription.parser(), kVar);
                                this.n = podcastextensions$PodcastHtmlDescription;
                                if (aVar4 != null) {
                                    aVar4.mergeFrom((Podcastextensions$PodcastHtmlDescription.a) podcastextensions$PodcastHtmlDescription);
                                    this.n = (Podcastextensions$PodcastHtmlDescription) aVar4.buildPartial();
                                }
                                this.a |= 8;
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
                return new ShowShowRequest$AuxiliarySections();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ShowShowRequest$AuxiliarySections.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, h());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, m());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, n());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(5, l());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ShowShowRequest$ContinueListeningSection h() {
        ShowShowRequest$ContinueListeningSection showShowRequest$ContinueListeningSection = this.b;
        return showShowRequest$ContinueListeningSection == null ? ShowShowRequest$ContinueListeningSection.h() : showShowRequest$ContinueListeningSection;
    }

    public Podcastextensions$PodcastHtmlDescription l() {
        Podcastextensions$PodcastHtmlDescription podcastextensions$PodcastHtmlDescription = this.n;
        return podcastextensions$PodcastHtmlDescription == null ? Podcastextensions$PodcastHtmlDescription.h() : podcastextensions$PodcastHtmlDescription;
    }

    public Podcastextensions$PodcastTopics m() {
        Podcastextensions$PodcastTopics podcastextensions$PodcastTopics = this.c;
        return podcastextensions$PodcastTopics == null ? Podcastextensions$PodcastTopics.h() : podcastextensions$PodcastTopics;
    }

    public ShowShowRequest$TrailerSection n() {
        ShowShowRequest$TrailerSection showShowRequest$TrailerSection = this.f;
        return showShowRequest$TrailerSection == null ? ShowShowRequest$TrailerSection.h() : showShowRequest$TrailerSection;
    }

    public boolean o() {
        return (this.a & 1) == 1;
    }

    public boolean p() {
        return (this.a & 8) == 8;
    }

    public boolean q() {
        return (this.a & 2) == 2;
    }

    public boolean r() {
        return (this.a & 4) == 4;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, h());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, m());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, n());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(5, l());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
