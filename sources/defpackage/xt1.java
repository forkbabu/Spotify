package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cards.a;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.b;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: xt1  reason: default package */
public class xt1 {
    private final b a;

    xt1(Context context) {
        this.a = b.a(context.getString(C0707R.string.bixby_home_card_cta_view_more), ViewUris.n0);
    }

    public n60 a(a aVar) {
        StreamingCardData b = aVar.b();
        n60 n60 = new n60(aVar.a());
        if (b != null && aVar.c()) {
            ContentItem mainContentItem = b.mainContentItem();
            mainContentItem.getClass();
            ContentItem listItem1 = b.listItem1();
            listItem1.getClass();
            ContentItem listItem2 = b.listItem2();
            listItem2.getClass();
            r60 f = new r60("MediaPlay").f(!b.isPaused());
            if (b.isPrevButtonDisabled()) {
                f.e(4);
            }
            if (b.isNextButtonDisabled()) {
                f.e(1);
            }
            n60.b("tag_data_1", new s60().g(mainContentItem.imageUrl()));
            n60.b("tag_data_2", new v60().g(mainContentItem.title()).e("FIELD_2"));
            n60.b("tag_data_3", new v60().g(mainContentItem.metadata1()).e("FIELD_3"));
            n60.b("tag_data_4", new v60().g(mainContentItem.metadata2() != null ? mainContentItem.metadata2() : "").e("FIELD_4"));
            n60.b("tag_data_6", new s60().g(mainContentItem.imageUrl()));
            ContentItem mainContentItem2 = b.mainContentItem();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(mainContentItem2.intentDataUriString()));
            n60.b("tag_data_7", ((t60) new t60().e("EVENT_MAIN_ITEM")).f(intent));
            n60.b("tag_data_5", f);
            n60.b("tag_data_8", new s60().g(listItem1.imageUrl()));
            n60.b("tag_data_9", new v60().g(listItem1.title()));
            n60.b("tag_data_10", new v60().g(listItem1.metadata1()));
            n60.b("tag_data_11", new t60().e("EVENT_LIST_1"));
            n60.b("tag_data_12", new s60().g(listItem2.imageUrl()));
            n60.b("tag_data_13", new v60().g(listItem2.title()));
            n60.b("tag_data_14", new v60().g(listItem2.metadata1()));
            n60.b("tag_data_15", new t60().e("EVENT_LIST_2"));
            n60.b("tag_data_16", ((v60) new v60().g(this.a.c()).e("EVENT_CTA")).f(this.a.b()));
        }
        return n60;
    }
}
