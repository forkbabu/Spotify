package com.spotify.music.features.creatorartist;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.artist.uri.ArtistUri;
import com.spotify.music.features.creatorartist.model.Autobiography;
import com.spotify.music.features.creatorartist.model.CreatorAboutModel;
import com.spotify.music.features.creatorartist.model.Image;
import com.spotify.music.features.creatorartist.model.ImageModel;
import com.spotify.music.features.creatorartist.model.LinksModel;
import com.spotify.music.libs.common.presenter.f;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class h extends f<CreatorAboutModel> {
    private static final Pattern v = Pattern.compile("(\r\n|\n)");
    private final ArtistUri n;
    private final j o;
    private final k p;
    private final d q;
    private String r = "";
    private final boolean s;
    private int t;
    private List<ImageModel> u;

    public h(y yVar, s<CreatorAboutModel> sVar, s<SessionState> sVar2, ArtistUri artistUri, d dVar, j jVar, k kVar, boolean z) {
        super(yVar, sVar, sVar2);
        artistUri.getClass();
        this.n = artistUri;
        dVar.getClass();
        this.q = dVar;
        this.p = kVar;
        this.o = jVar;
        this.s = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.f
    public void e(CreatorAboutModel creatorAboutModel) {
        String str;
        CreatorAboutModel creatorAboutModel2 = creatorAboutModel;
        super.e(creatorAboutModel2);
        String name = creatorAboutModel2.name();
        if (!MoreObjects.isNullOrEmpty(name)) {
            this.r = name;
        }
        List<ImageModel> images = creatorAboutModel2.images();
        this.u = images;
        List<Image> unmodifiableList = Collections.unmodifiableList(Collections2.transform((List) images, (Function) a.a));
        if (!unmodifiableList.isEmpty()) {
            if (this.s) {
                ((BiographyFragment) this.o).c5(unmodifiableList.get(0));
                ((BiographyFragment) this.o).Y4(true);
                if (unmodifiableList.size() > 1) {
                    ((BiographyFragment) this.o).f5(unmodifiableList.get(1));
                }
            } else {
                ((BiographyFragment) this.o).e5(unmodifiableList);
            }
            BiographyFragment biographyFragment = (BiographyFragment) this.o;
            if (biographyFragment.B2() != null) {
                biographyFragment.B2().invalidateOptionsMenu();
            }
        }
        String biography = creatorAboutModel2.biography();
        Autobiography autobiography = creatorAboutModel2.autobiography();
        String mainImageUrl = creatorAboutModel2.mainImageUrl();
        LinksModel linksModel = null;
        if (autobiography == null) {
            str = null;
        } else {
            str = autobiography.body();
        }
        if (!MoreObjects.isNullOrEmpty(str)) {
            ((BiographyFragment) this.o).Z4(v.matcher(str).replaceAll("<br/>"), mainImageUrl, name);
        } else if (!MoreObjects.isNullOrEmpty(biography)) {
            ((BiographyFragment) this.o).a5(v.matcher(biography).replaceAll("<br/>"));
        }
        if (autobiography != null) {
            linksModel = autobiography.links();
        }
        if (linksModel != null) {
            String wikipediaLink = linksModel.getWikipediaLink();
            if (!MoreObjects.isNullOrEmpty(wikipediaLink)) {
                ((BiographyFragment) this.o).h5(wikipediaLink, true);
                this.q.f(this.n.toString(), "social-wikipedia-link");
            }
            String instagramLink = linksModel.getInstagramLink();
            if (!MoreObjects.isNullOrEmpty(instagramLink)) {
                ((BiographyFragment) this.o).d5(instagramLink, true);
                this.q.f(this.n.toString(), "social-instagram-link");
            }
            String facebookLink = linksModel.getFacebookLink();
            if (!MoreObjects.isNullOrEmpty(facebookLink)) {
                ((BiographyFragment) this.o).b5(facebookLink, true);
                this.q.f(this.n.toString(), "social-facebook-link");
            }
            String twitterLink = linksModel.getTwitterLink();
            if (!MoreObjects.isNullOrEmpty(twitterLink)) {
                ((BiographyFragment) this.o).g5(twitterLink, true);
                this.q.f(this.n.toString(), "social-twitter-link");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ImmutableList<String> k() {
        if (this.s || this.u.isEmpty()) {
            return ImmutableList.of();
        }
        ImageModel imageModel = this.u.get(this.t);
        if (imageModel.getModerationUri() == null) {
            return ImmutableList.of();
        }
        return ImmutableList.of(imageModel.getModerationUri());
    }

    public boolean l() {
        List<ImageModel> list = this.u;
        return list != null && !list.isEmpty();
    }

    public void m(int i) {
        this.t = i;
        this.q.d(this.n.toString(), i);
    }

    public void n() {
        this.p.stopWatching();
    }

    public void o() {
        this.p.startWatching();
    }

    public void p() {
        if (!MoreObjects.isNullOrEmpty(this.r) && !MoreObjects.isNullOrEmpty(this.n.toString())) {
            this.q.h(this.n.toString());
        }
    }
}
