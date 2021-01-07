package com.spotify.music.homecomponents.header.section.encore;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

public final class EncoreRecsplanationSectionHeadingComponent extends qk9<Holder> {
    private final ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration> a;
    private final vp9 b;

    public static final class Holder extends s51.c.a<View> {
        private final Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events> b;
        private final vp9 c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events> component, vp9 vp9) {
            super(component.getView());
            h.e(component, "header");
            h.e(vp9, "onClickEventHandler");
            this.b = component;
            this.c = vp9;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            Artwork.Model model;
            p81 data;
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events> component = this.b;
            String title = s81.text().title();
            String str = "";
            if (title == null) {
                title = str;
            }
            String subtitle = s81.text().subtitle();
            if (subtitle == null) {
                subtitle = str;
            }
            o81 o81 = (o81) s81.events().get("click");
            String valueOf = String.valueOf((o81 == null || (data = o81.data()) == null) ? null : data.get("uri"));
            x81 main = s81.images().main();
            String uri = main != null ? main.uri() : null;
            if (uri != null) {
                str = uri;
            }
            h.e(valueOf, "uri");
            h.e(str, "imageUri");
            if (l0.b(valueOf, LinkType.ALBUM)) {
                model = new Artwork.Model.Album(new Artwork.ImageData(str), false, 2, null);
            } else if (l0.b(valueOf, LinkType.ARTIST)) {
                model = new Artwork.Model.Artist(new Artwork.ImageData(str), false, 2, null);
            } else {
                LinkType linkType = LinkType.COLLECTION_ARTIST;
                if (l0.b(valueOf, linkType)) {
                    model = new Artwork.Model.ArtistCollection(new Artwork.ImageData(str), false, 2, null);
                } else if (l0.b(valueOf, LinkType.PLAYLIST_V2)) {
                    model = new Artwork.Model.Playlist(new Artwork.ImageData(str), false, 2, null);
                } else if (l0.b(valueOf, LinkType.SEARCH_QUERY)) {
                    model = new Artwork.Model.Search(new Artwork.ImageData(str), false, 2, null);
                } else if (l0.c(valueOf, LinkType.RADIO_ALBUM, LinkType.RADIO_ARTIST, LinkType.RADIO_GENRE, LinkType.RADIO_PLAYLIST, LinkType.RADIO_TRACK, LinkType.ALBUM_RADIO, LinkType.ARTIST_RADIO, LinkType.GENRE_RADIO, LinkType.PLAYLIST_RADIO, LinkType.TRACK_RADIO)) {
                    model = new Artwork.Model.Radio(new Artwork.ImageData(str), false, 2, null);
                } else if (l0.c(valueOf, LinkType.COLLECTION_ALBUM, linkType, LinkType.COLLECTION_ARTIST_OVERVIEW, LinkType.COLLECTION_LISTENLATER_EPISODES, LinkType.COLLECTION_NFT_MADE_FOR_YOU, LinkType.COLLECTION_OFFLINED_EPISODES, LinkType.COLLECTION_OFFLINE_EPISODES, LinkType.COLLECTION_OFFLINE_LIBRARY, LinkType.COLLECTION_OFFLINE_PODCASTS_EPISODES, LinkType.COLLECTION_PODCASTS, LinkType.COLLECTION_PODCASTS_DOWNLOADS, LinkType.COLLECTION_PODCASTS_EPISODES, LinkType.COLLECTION_PODCASTS_EPISODES_UNFINISHED, LinkType.COLLECTION_PODCASTS_FOLLOWING, LinkType.COLLECTION_RADIO, LinkType.COLLECTION_SEARCH, LinkType.COLLECTION_SHOWS, LinkType.COLLECTION_TRACKS, LinkType.COLLECTION_UNPLAYED_EPISODES, LinkType.COLLECTION_UNPLAYED_PODCASTS_EPISODES, LinkType.COLLECTION_UNPLAYED_VIDEOS, LinkType.COLLECTION_VIDEOS, LinkType.COLLECTION_YOUR_EPISODES, LinkType.COLLECTION_YOUR_EPISODES_CORE, LinkType.COLLECTION_ALBUM_OVERVIEW)) {
                    model = new Artwork.Model.Collection(new Artwork.ImageData(str), false, 2, null);
                } else if (l0.b(valueOf, LinkType.SHOW_EPISODE)) {
                    model = new Artwork.Model.Show(new Artwork.ImageData(str), false, 2, null);
                } else if (l0.b(valueOf, LinkType.PODCAST_EPISODE)) {
                    model = new Artwork.Model.Episode(new Artwork.ImageData(str), false, 2, null);
                } else if (l0.b(valueOf, LinkType.COLLECTION_PLAYLIST_FOLDER)) {
                    model = Artwork.Model.PlaylistFolder.INSTANCE;
                } else {
                    model = new Artwork.Model.Track(new Artwork.ImageData(str));
                }
            }
            component.render(new RecsplanationSectionHeading.Model(title, subtitle, model));
            this.b.onEvent(new EncoreRecsplanationSectionHeadingComponent$Holder$onBind$1(this, s81));
        }
    }

    public EncoreRecsplanationSectionHeadingComponent(ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration> componentFactory, vp9 vp9) {
        h.e(componentFactory, "headerFactory");
        h.e(vp9, "onClickEventHandler");
        this.a = componentFactory;
        this.b = vp9;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new Holder(this.a.make(), this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_recsplanation_section_heading;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.SPACED_VERTICALLY);
        h.d(of, "EnumSet.of(GlueLayoutTra….Trait.SPACED_VERTICALLY)");
        return of;
    }
}
