package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cards.BixbyHomeCardType;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cards.a;
import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;

/* renamed from: du1  reason: default package */
public class du1 {
    private final Context a;
    private final bu1 b;
    private final Player c;
    private final StreamingCardEventLogger d;
    private final zt1 e;
    private final pu1 f;
    private final ru1 g;
    private final SparseArray<a> h;
    private final nt1 i;
    private final lt1 j;
    private final jt1 k;

    public du1(Context context, bu1 bu1, Player player, pu1 pu1, StreamingCardEventLogger streamingCardEventLogger, zt1 zt1, nt1 nt1, lt1 lt1, jt1 jt1, ru1 ru1) {
        SparseArray<a> sparseArray = new SparseArray<>();
        this.h = sparseArray;
        this.a = context;
        this.b = bu1;
        this.c = player;
        this.f = pu1;
        pu1.c(new st1(this));
        pu1.d(new tt1(this));
        this.d = streamingCardEventLogger;
        this.e = zt1;
        this.i = nt1;
        this.j = lt1;
        this.k = jt1;
        this.g = ru1;
        BixbyHomeCardType bixbyHomeCardType = BixbyHomeCardType.STREAMING;
        sparseArray.put(bixbyHomeCardType.d(context), new a(bixbyHomeCardType.d(context)));
        BixbyHomeCardType bixbyHomeCardType2 = BixbyHomeCardType.STREAMING_US;
        sparseArray.put(bixbyHomeCardType2.d(context), new a(bixbyHomeCardType2.d(context)));
    }

    public static void a(du1 du1) {
        du1.b.c(new ut1(du1));
    }

    public static void b(du1 du1) {
        du1.b.e();
        du1.d(null);
    }

    /* access modifiers changed from: private */
    public void d(StreamingCardData streamingCardData) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            a valueAt = this.h.valueAt(i2);
            valueAt.d(streamingCardData);
            if (valueAt.c()) {
                this.e.a(valueAt);
            }
        }
        if (streamingCardData != null) {
            this.j.b(streamingCardData);
        }
        Optional<String> b2 = this.k.b();
        if (b2.isPresent()) {
            i(b2.get(), this.k.a());
            this.k.d();
        }
    }

    public void e() {
        this.f.e();
    }

    public void f() {
        this.b.e();
        this.f.f();
        this.g.a();
    }

    public void g(int i2) {
        a aVar = this.h.get(i2);
        if (aVar != null) {
            aVar.e(false);
        }
    }

    public void h(int i2) {
        a aVar = this.h.get(i2);
        if (aVar != null && !aVar.c()) {
            aVar.e(true);
        }
    }

    public void i(String str, int i2) {
        a aVar = this.h.get(i2);
        if (aVar != null) {
            StreamingCardData b2 = aVar.b();
            if (b2 == null || b2.isCachedData()) {
                this.k.c(str, aVar.a());
                StreamingCardData a2 = this.i.a(str);
                aVar.e(true);
                aVar.d(a2);
                this.e.a(aVar);
                this.b.b();
                return;
            }
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1475681621:
                    if (str.equals("EVENT_CTA")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1124795464:
                    if (str.equals("SPAGE_ON_MEDIA_PAUSE")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -717095340:
                    if (str.equals("EVENT_MAIN_ITEM")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -174886703:
                    if (str.equals("SPAGE_ON_MEDIA_NEXT")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -174821102:
                    if (str.equals("SPAGE_ON_MEDIA_PLAY")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -174815215:
                    if (str.equals("SPAGE_ON_MEDIA_PREV")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1502194229:
                    if (str.equals("EVENT_LIST_1")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1502194230:
                    if (str.equals("EVENT_LIST_2")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.d.e(aVar);
                    return;
                case 1:
                    this.d.i(aVar);
                    this.c.pause();
                    return;
                case 2:
                    StreamingCardData b3 = aVar.b();
                    b3.getClass();
                    this.d.f(aVar, StreamingCardEventLogger.Element.MAIN_VIEW, b3.mainContentItem().contentUri());
                    return;
                case 3:
                    this.d.h(aVar);
                    this.c.skipToNextTrack();
                    return;
                case 4:
                    StreamingCardData b4 = aVar.b();
                    b4.getClass();
                    if (b4.isPlaying()) {
                        this.d.j(aVar);
                        this.c.resume();
                        return;
                    }
                    String contentUri = b4.mainContentItem().contentUri();
                    this.d.l(aVar, StreamingCardEventLogger.Element.PLAY_PAUSE, contentUri);
                    this.g.b(contentUri);
                    return;
                case 5:
                    this.d.k(aVar);
                    this.c.skipToPreviousTrack();
                    return;
                case 6:
                    StreamingCardData b5 = aVar.b();
                    b5.getClass();
                    ContentItem listItem1 = b5.listItem1();
                    String contentUri2 = listItem1.contentUri();
                    this.d.l(aVar, StreamingCardEventLogger.Element.LIST_ITEM_1, listItem1.contentUri());
                    this.g.b(contentUri2);
                    return;
                case 7:
                    StreamingCardData b6 = aVar.b();
                    b6.getClass();
                    ContentItem listItem2 = b6.listItem2();
                    String contentUri3 = listItem2.contentUri();
                    this.d.l(aVar, StreamingCardEventLogger.Element.LIST_ITEM_2, listItem2.contentUri());
                    this.g.b(contentUri3);
                    return;
                default:
                    Logger.d("invalid event: %s", str);
                    return;
            }
        }
    }

    public void j(int i2) {
        a aVar = this.h.get(i2);
        if (aVar != null) {
            aVar.e(true);
            if (aVar.b() != null) {
                this.e.a(aVar);
            }
        }
        if (this.f.a()) {
            this.b.b();
        }
    }
}
