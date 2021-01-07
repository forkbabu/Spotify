package com.spotify.music.behindthelyrics.presenter;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor;
import io.reactivex.disposables.b;
import io.reactivex.x;

public class h implements x<bq1<TrackAnnotation>> {
    private final f a;
    private final bl2 b;
    private bq1<TrackAnnotation> c;

    public h(bl2 bl2, f fVar) {
        this.b = bl2;
        this.a = fVar;
    }

    private void b(bq1<TrackAnnotation> bq1) {
        this.b.h((int) bq1.b(), (int) bq1.a(), bq1.d());
    }

    private boolean c(TrackAnnotation trackAnnotation) {
        bq1<TrackAnnotation> bq1 = this.c;
        return bq1 == null || !trackAnnotation.equals(bq1.c());
    }

    /* renamed from: a */
    public void onNext(bq1<TrackAnnotation> bq1) {
        CardType cardType;
        boolean z = true;
        Logger.b("New Annotation: %s", bq1.toString());
        TrackAnnotation c2 = bq1.c();
        String contentType = c2.getContentType();
        if ("intro".equals(contentType)) {
            cardType = CardType.INTRO;
        } else if ("verified".equals(contentType) || "iq".equals(contentType) || "iq_continuation".equals(contentType) || "annotation".equals(contentType)) {
            cardType = CardType.INFO;
        } else if ("lyrics".equals(contentType)) {
            cardType = CardType.LYRICS;
        } else if ("verified_annotation".equals(contentType)) {
            cardType = CardType.VERIFIED;
        } else if ("credits".equals(contentType)) {
            cardType = CardType.CREDITS;
        } else {
            throw new IllegalArgumentException(String.format("%s is not a known track annotation content type", contentType));
        }
        this.b.c(c2.getContentType(), c2.getContent());
        if (this.b.b() && c(c2)) {
            this.b.d();
        }
        int ordinal = cardType.ordinal();
        if (ordinal == 0) {
            this.b.g();
        } else if (ordinal == 1) {
            if (c(c2)) {
                this.b.e(c2.getContent());
            }
            b(bq1);
        } else if (ordinal == 2) {
            if (c(c2)) {
                this.b.j(c2.getContent());
            }
            b(bq1);
        } else if (ordinal == 3) {
            TrackAnnotationAuthor author = c2.getAuthor();
            if (author != null && c(c2)) {
                bq1<TrackAnnotation> bq12 = this.c;
                if (bq12 == null || !author.equals(bq12.c().getAuthor())) {
                    z = false;
                }
                if (z) {
                    this.b.f(c2.getContent());
                } else {
                    this.b.a(author.getDisplayName(), this.a.a(author.getAvatarUrl()), c2.getContent());
                }
            }
            b(bq1);
        } else if (ordinal == 4) {
            this.b.i();
        } else {
            throw new IllegalArgumentException("Unknown TrackAnnotation Content Type: %s" + bq1);
        }
        this.c = bq1;
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onComplete() {
        Logger.b("BTL Completed", new Object[0]);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onError(Throwable th) {
        Logger.c(th, "BTL Error", new Object[0]);
    }

    @Override // io.reactivex.x, io.reactivex.c
    public void onSubscribe(b bVar) {
    }
}
