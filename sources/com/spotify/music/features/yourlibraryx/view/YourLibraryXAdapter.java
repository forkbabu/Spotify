package com.spotify.music.features.yourlibraryx.view;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerAlbumCardLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerAlbumRowLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerArtistCardLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerArtistRowLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerFolderCardLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerFolderRowLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerLikedSongsCardLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerLikedSongsRowLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerPlaylistCardLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerPlaylistRowLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerPodcastCardLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerPodcastRowLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerSortRowLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerYourEpisodesCardLibraryExtensions;
import com.spotify.encore.consumer.components.yourlibrary.entrypoint.EncoreConsumerYourEpisodesRowLibraryExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibraryx.domain.SubscriptionType;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.view.EntityType;
import com.spotify.music.features.yourlibraryx.view.entities.cards.YourLibraryAlbumCardComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.cards.YourLibraryArtistCardComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.cards.YourLibraryFolderCardComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.cards.YourLibraryLikedSongsCardComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.cards.YourLibraryPlaylistCardComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.cards.YourLibraryPodcastCardComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.cards.YourLibraryYourEpisodesCardComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.components.YourLibraryXSkeletonComponents;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibraryAlbumRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibraryArtistRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibraryFolderRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibraryLikedSongsRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibraryPlaylistRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibraryPodcastRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibrarySortRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.entities.rows.YourLibraryYourEpisodesRowComponentViewHolder;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.music.yourlibrary.quickscroll.z;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;

public final class YourLibraryXAdapter extends v<y, qh9<?>> implements g<f, YourLibraryXEvent>, com.spotify.music.features.yourlibraryx.quickscroll.f, z, e {
    private boolean n;
    private cmf<kotlin.f> o = YourLibraryXAdapter$restoredStateCallback$1.a;
    private com.spotify.music.features.yourlibraryx.domain.a p;
    private RecyclerView q;
    private YourLibraryXViewMode r = YourLibraryXViewMode.a;
    private jnf s;
    private final io.reactivex.subjects.c<YourLibraryXEvent> t;
    private final io.reactivex.subjects.c<j> u;
    private final r v;
    private final EncoreConsumerEntryPoint w;
    private final g x;
    private final eh9 y;

    public static final class a implements h<f> {
        final /* synthetic */ YourLibraryXAdapter a;
        final /* synthetic */ io.reactivex.disposables.a b;
        final /* synthetic */ h c;

        a(YourLibraryXAdapter yourLibraryXAdapter, io.reactivex.disposables.a aVar, h hVar) {
            this.a = yourLibraryXAdapter;
            this.b = aVar;
            this.c = hVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f fVar = (f) obj;
            kotlin.jvm.internal.h.e(fVar, "value");
            this.c.accept(fVar);
            boolean z = fVar.e().e() == SubscriptionType.RECENT_SEARCHES;
            io.reactivex.subjects.c cVar = this.a.u;
            com.spotify.music.features.yourlibraryx.domain.a e = fVar.e();
            List<y> a2 = this.a.x.a(fVar);
            int g = fVar.f().g();
            jnf f = fVar.f().f();
            List<YourLibraryResponseProto$YourLibraryResponseEntity> c2 = fVar.f().c();
            ArrayList arrayList = new ArrayList(d.e(c2, 10));
            Iterator<T> it = c2.iterator();
            while (it.hasNext()) {
                arrayList.add(new y.a(it.next(), z));
            }
            cVar.onNext(new j(e, a2, new m(g, f, arrayList, y.b.a), fVar.k()));
            if (this.a.r != fVar.o()) {
                this.a.r = fVar.o();
                this.a.z();
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
            this.c.dispose();
        }
    }

    static final class b<T> implements io.reactivex.functions.g<YourLibraryXEvent> {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(YourLibraryXEvent yourLibraryXEvent) {
            this.a.accept(yourLibraryXEvent);
        }
    }

    static final class c<T> implements io.reactivex.functions.g<j> {
        final /* synthetic */ YourLibraryXAdapter a;

        c(YourLibraryXAdapter yourLibraryXAdapter) {
            this.a = yourLibraryXAdapter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.spotify.music.features.yourlibraryx.view.YourLibraryXAdapter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(j jVar) {
            j jVar2 = jVar;
            if (!kotlin.jvm.internal.h.a(this.a.p, jVar2.d())) {
                SubscriptionType e = jVar2.d().e();
                com.spotify.music.features.yourlibraryx.domain.a aVar = this.a.p;
                boolean z = e == (aVar != null ? aVar.e() : null);
                if (jVar2.d().b() || !z) {
                    this.a.c0(jVar2.a(), new p(this, jVar2, z));
                } else {
                    this.a.c0(new f(jVar2.a(), jVar2.c()), new a(0, this, jVar2));
                }
            } else {
                this.a.c0(new f(jVar2.a(), jVar2.c()), new a(1, this, jVar2));
            }
            this.a.s = jVar2.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YourLibraryXAdapter(r rVar, EncoreConsumerEntryPoint encoreConsumerEntryPoint, g gVar, eh9 eh9) {
        super(new z());
        kotlin.jvm.internal.h.e(rVar, "decorator");
        kotlin.jvm.internal.h.e(encoreConsumerEntryPoint, "endpoint");
        kotlin.jvm.internal.h.e(gVar, "sectionHeader");
        kotlin.jvm.internal.h.e(eh9, "logger");
        this.v = rVar;
        this.w = encoreConsumerEntryPoint;
        this.x = gVar;
        this.y = eh9;
        jnf jnf = jnf.n;
        this.s = jnf.f;
        PublishSubject h1 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h1, "PublishSubject.create()");
        this.t = h1;
        PublishSubject h12 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h12, "PublishSubject.create()");
        this.u = h12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void J(RecyclerView recyclerView) {
        kotlin.jvm.internal.h.e(recyclerView, "view");
        this.q = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        RecyclerView.b0 b0Var;
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        EntityType.a aVar = EntityType.F;
        switch (EntityType.d()[i].ordinal()) {
            case 0:
                return new YourLibraryAlbumCardComponentViewHolder(EncoreConsumerAlbumCardLibraryExtensions.albumCardLibraryFactory(this.w.getCards()).make(), this.v, this.y);
            case 1:
                return new YourLibraryArtistCardComponentViewHolder(EncoreConsumerArtistCardLibraryExtensions.artistCardLibraryFactory(this.w.getCards()).make(), this.v, this.y);
            case 2:
                b0Var = new ph9(com.spotify.music.features.yourlibraryx.view.entities.components.c.a(YourLibraryXSkeletonComponents.b, viewGroup));
                break;
            case 3:
                return new YourLibraryFolderCardComponentViewHolder(EncoreConsumerFolderCardLibraryExtensions.folderCardLibraryFactory(this.w.getCards()).make(), this.v, this.y);
            case 4:
                return new YourLibraryLikedSongsCardComponentViewHolder(EncoreConsumerLikedSongsCardLibraryExtensions.likedSongsCardLibraryFactory(this.w.getCards()).make(), this.v, this.y);
            case 5:
                b0Var = new ph9(com.spotify.music.features.yourlibraryx.view.entities.components.c.a(YourLibraryXSkeletonComponents.a, viewGroup));
                break;
            case 6:
                return new YourLibraryPlaylistCardComponentViewHolder(EncoreConsumerPlaylistCardLibraryExtensions.playlistCardLibraryFactory(this.w.getCards()).make(), this.v, this.y);
            case 7:
                return new YourLibraryPodcastCardComponentViewHolder(EncoreConsumerPodcastCardLibraryExtensions.podcastCardLibraryFactory(this.w.getCards()).make(), this.v, this.y);
            case 8:
                return new YourLibraryYourEpisodesCardComponentViewHolder(EncoreConsumerYourEpisodesCardLibraryExtensions.yourEpisodesCardLibraryFactory(this.w.getCards()).make(), this.v, this.y);
            case 9:
                return new YourLibraryAlbumRowComponentViewHolder(EncoreConsumerAlbumRowLibraryExtensions.albumRowLibraryFactory(this.w.getRows()).make(), this.v, this.y);
            case 10:
                return new YourLibraryArtistRowComponentViewHolder(EncoreConsumerArtistRowLibraryExtensions.artistRowLibraryFactory(this.w.getRows()).make(), this.v, this.y);
            case 11:
                b0Var = new ph9(com.spotify.music.features.yourlibraryx.view.entities.components.c.a(YourLibraryXSkeletonComponents.f, viewGroup));
                break;
            case 12:
                return new YourLibraryFolderRowComponentViewHolder(EncoreConsumerFolderRowLibraryExtensions.folderRowLibraryFactory(this.w.getRows()).make(), this.v, this.y);
            case 13:
                return new YourLibraryLikedSongsRowComponentViewHolder(EncoreConsumerLikedSongsRowLibraryExtensions.likedSongsRowLibraryFactory(this.w.getRows()).make(), this.v, this.y);
            case 14:
                b0Var = new ph9(com.spotify.music.features.yourlibraryx.view.entities.components.c.a(YourLibraryXSkeletonComponents.c, viewGroup));
                break;
            case 15:
                return new YourLibraryPlaylistRowComponentViewHolder(EncoreConsumerPlaylistRowLibraryExtensions.playlistRowLibraryFactory(this.w.getRows()).make(), this.v, this.y);
            case 16:
                return new YourLibraryPodcastRowComponentViewHolder(EncoreConsumerPodcastRowLibraryExtensions.podcastRowLibraryFactory(this.w.getRows()).make(), this.v, this.y);
            case 17:
                b0Var = new com.spotify.music.features.yourlibraryx.view.entities.rows.a(new com.spotify.music.features.yourlibraryx.view.entities.components.a(viewGroup));
                break;
            case 18:
                return new YourLibrarySortRowComponentViewHolder(EncoreConsumerSortRowLibraryExtensions.sortRowLibraryFactory(this.w.getRows()).make(), this.y);
            case 19:
                return new YourLibraryYourEpisodesRowComponentViewHolder(EncoreConsumerYourEpisodesRowLibraryExtensions.yourEpisodesRowLibraryFactory(this.w.getRows()).make(), this.v, this.y);
            default:
                throw new NoWhenBranchMatchedException();
        }
        return b0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void N(RecyclerView recyclerView) {
        kotlin.jvm.internal.h.e(recyclerView, "view");
        if (kotlin.jvm.internal.h.a(this.q, recyclerView)) {
            this.q = null;
        }
    }

    @Override // androidx.recyclerview.widget.v
    public void Z(List<y> list, List<y> list2) {
        kotlin.jvm.internal.h.e(list, "previousList");
        kotlin.jvm.internal.h.e(list2, "currentList");
        if (!this.n) {
            this.o.invoke();
            this.n = true;
        }
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public boolean h(int i) {
        return this.s.i(i);
    }

    @Override // com.spotify.music.features.yourlibraryx.view.e
    public int l(int i, int i2) {
        EntityType.a aVar = EntityType.F;
        int ordinal = EntityType.d()[w(i)].g().ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return i2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public int m() {
        if (this.s.isEmpty()) {
            return 0;
        }
        return this.s.e() + 1;
    }

    /* renamed from: p0 */
    public void K(qh9<?> qh9, int i) {
        kotlin.jvm.internal.h.e(qh9, "holder");
        y yVar = (y) Y(i);
        if (yVar instanceof y.a) {
            qh9.h0((y.a) yVar, new YourLibraryXAdapter$bindEntity$1(this.t));
        } else if (yVar instanceof y.d) {
            qh9.h0((y.d) yVar, new YourLibraryXAdapter$bindSortOptions$1(this.t));
        } else if (yVar instanceof y.c) {
            qh9.h0((y.c) yVar, new YourLibraryXAdapter$bindSectionHeader$1(this.t));
        } else if (!kotlin.jvm.internal.h.a(yVar, y.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.spotify.music.features.yourlibraryx.quickscroll.f
    public String q(int i) {
        List X = X();
        kotlin.jvm.internal.h.d(X, "currentList");
        y yVar = (y) d.n(X, i);
        if (!(yVar instanceof y.a)) {
            return null;
        }
        YourLibraryResponseProto$YourLibraryEntityInfo m = ((y.a) yVar).b().m();
        kotlin.jvm.internal.h.d(m, "item.entity.entityInfo");
        return m.i();
    }

    public final void q0(cmf<kotlin.f> cmf) {
        kotlin.jvm.internal.h.e(cmf, "callback");
        if (this.n) {
            cmf.invoke();
        } else {
            this.o = cmf;
        }
    }

    @Override // com.spotify.mobius.g
    public h<f> t(da2<YourLibraryXEvent> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        io.reactivex.disposables.a aVar = new io.reactivex.disposables.a(this.t.subscribe(new b(da2)), this.u.E().subscribe(new c(this)));
        h t2 = this.v.t(da2);
        kotlin.jvm.internal.h.d(t2, "decorator.connect(output)");
        return new a(this, aVar, t2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        EntityType entityType;
        y yVar = (y) Y(i);
        if (yVar instanceof y.a) {
            YourLibraryResponseProto$YourLibraryResponseEntity b2 = ((y.a) yVar).b();
            int ordinal = this.r.ordinal();
            if (ordinal == 0) {
                YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase l = b2.l();
                kotlin.jvm.internal.h.c(l);
                switch (l.ordinal()) {
                    case 0:
                        entityType = EntityType.ROW_ALBUM;
                        break;
                    case 1:
                        entityType = EntityType.ROW_ARTIST;
                        break;
                    case 2:
                        entityType = EntityType.ROW_PLAYLIST;
                        break;
                    case 3:
                        entityType = EntityType.ROW_PODCAST;
                        break;
                    case 4:
                        entityType = EntityType.ROW_FOLDER;
                        break;
                    case 5:
                        YourLibraryResponseProto$YourLibraryEntityInfo m = b2.m();
                        kotlin.jvm.internal.h.d(m, "item.entityInfo");
                        l0 z = l0.z(m.p());
                        kotlin.jvm.internal.h.d(z, "SpotifyLink.of(item.entityInfo.uri)");
                        LinkType q2 = z.q();
                        if (q2 != null) {
                            int ordinal2 = q2.ordinal();
                            if (ordinal2 != 75) {
                                if (ordinal2 != 80) {
                                    if (ordinal2 == 81) {
                                        entityType = EntityType.ROW_YOUR_EPISODES;
                                        break;
                                    }
                                } else {
                                    entityType = EntityType.ROW_YOUR_EPISODES;
                                    break;
                                }
                            } else {
                                entityType = EntityType.ROW_LIKED_SONGS;
                                break;
                            }
                        }
                        throw new IllegalArgumentException("Unrecognized entity type for item: " + b2);
                    case 6:
                        throw new IllegalArgumentException("entityCase not set.");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else if (ordinal == 1) {
                YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase l2 = b2.l();
                kotlin.jvm.internal.h.c(l2);
                switch (l2.ordinal()) {
                    case 0:
                        entityType = EntityType.CARD_ALBUM;
                        break;
                    case 1:
                        entityType = EntityType.CARD_ARTIST;
                        break;
                    case 2:
                        entityType = EntityType.CARD_PLAYLIST;
                        break;
                    case 3:
                        entityType = EntityType.CARD_PODCAST;
                        break;
                    case 4:
                        entityType = EntityType.CARD_FOLDER;
                        break;
                    case 5:
                        YourLibraryResponseProto$YourLibraryEntityInfo m2 = b2.m();
                        kotlin.jvm.internal.h.d(m2, "item.entityInfo");
                        l0 z2 = l0.z(m2.p());
                        kotlin.jvm.internal.h.d(z2, "SpotifyLink.of(item.entityInfo.uri)");
                        LinkType q3 = z2.q();
                        if (q3 != null) {
                            int ordinal3 = q3.ordinal();
                            if (ordinal3 != 75) {
                                if (ordinal3 != 80) {
                                    if (ordinal3 == 81) {
                                        entityType = EntityType.CARD_YOUR_EPISODES;
                                        break;
                                    }
                                } else {
                                    entityType = EntityType.CARD_YOUR_EPISODES;
                                    break;
                                }
                            } else {
                                entityType = EntityType.CARD_LIKED_SONGS;
                                break;
                            }
                        }
                        throw new IllegalArgumentException("Unrecognized entity type for item: " + b2);
                    case 6:
                        throw new IllegalArgumentException("entityCase not set.");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (yVar instanceof y.d) {
            entityType = EntityType.ROW_SORT_OPTIONS;
        } else if (yVar instanceof y.c) {
            entityType = EntityType.ROW_SECTION_HEADER;
        } else if (yVar instanceof y.b) {
            int ordinal4 = this.r.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.v.X1()) {
                    entityType = EntityType.CARD_CIRCULAR_PLACEHOLDER;
                } else {
                    entityType = EntityType.CARD_PLACEHOLDER;
                }
            } else if (this.v.X1()) {
                entityType = EntityType.ROW_CIRCULAR_PLACEHOLDER;
            } else {
                entityType = EntityType.ROW_PLACEHOLDER;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return entityType.ordinal();
    }
}
