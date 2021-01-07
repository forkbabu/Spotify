package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardPendingEventData;
import com.spotify.music.C0707R;

/* renamed from: nt1  reason: default package */
public class nt1 {
    private final StreamingCardData a;
    private final String b;

    public nt1(lt1 lt1, Resources resources) {
        this.a = lt1.a();
        this.b = resources.getString(C0707R.string.bixby_home_card_loading);
    }

    public StreamingCardData a(String str) {
        StreamingCardData streamingCardData = this.a;
        if (streamingCardData == null) {
            return null;
        }
        return new StreamingCardPendingEventData(streamingCardData, str, this.b);
    }
}
