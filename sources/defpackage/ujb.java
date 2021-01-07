package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.marquee.trigger.h0;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* renamed from: ujb  reason: default package */
public class ujb implements f0 {
    private final PublishSubject<h0> a = PublishSubject.h1();
    private final ajf<Picasso> b;
    private final qjb c;
    private boolean f;
    private Ad n;

    public ujb(ajf<Picasso> ajf, qjb qjb) {
        this.b = ajf;
        this.c = qjb;
    }

    public void a() {
        this.f = true;
        this.b.get().d("marquee_album_art_tag");
    }

    public void b(AdSlotEvent adSlotEvent) {
        String str;
        Ad ad = adSlotEvent.getAd();
        this.n = ad;
        if (ad != null) {
            this.c.getClass();
            str = "2".equals(ad.extractMetadata("version")) ? ad.extractMetadata("coverImageUrl") : ad.extractMetadata("albumImageUri");
        } else {
            str = "";
        }
        this.f = false;
        z m = this.b.get().m(str);
        m.w("marquee_album_art_tag");
        m.o(this);
    }

    public s<h0> c() {
        return this.a;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.a.onNext(h0.c("failed to pre fetch album image"));
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        Ad ad;
        hjb hjb;
        MoreObjects.checkArgument(!bitmap.isRecycled());
        if (!this.f && (ad = this.n) != null) {
            this.c.getClass();
            if ("2".equals(ad.extractMetadata("version"))) {
                hjb = new hjb(ad.id(), ad.extractMetadata("header"), ad.extractMetadata("coverImageUrl"), ad.extractMetadata("title"), ad.extractMetadata(ContextTrack.Metadata.KEY_SUBTITLE), ad.extractMetadata("primaryArtistUri"), ad.extractMetadata("ctaText"), ad.extractMetadata("footer"), ad.extractMetadata("footerCta"), ad.extractMetadata("promotionUri"), ad.extractMetadata("lineitem_id"), new ijb(ad.extractMetadata("optoutText"), ad.extractMetadata("optoutTextCta"), ad.extractMetadata("primaryArtistUri"), ad.extractMetadata("optoutArtistCta"), ad.extractMetadata("optoutMarqueeCta")));
            } else {
                hjb = new hjb(ad.id(), null, ad.extractMetadata("albumImageUri"), ad.extractMetadata("albumName"), ad.extractMetadata("artistName"), ad.extractMetadata("artistUri"), null, null, null, ad.extractMetadata("albumUri"), ad.extractMetadata("lineitem_id"), null);
            }
            this.a.onNext(h0.d(hjb));
        }
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
    }
}
