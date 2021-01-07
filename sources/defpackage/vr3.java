package defpackage;

import com.spotify.music.features.ads.model.AdProduct;
import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

/* renamed from: vr3  reason: default package */
public class vr3 implements l<AdSlotEvent, AdProduct> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public AdProduct apply(AdSlotEvent adSlotEvent) {
        String formatString = adSlotEvent.getFormatString();
        if ("video".equals(formatString)) {
            return AdProduct.VIDEO_AD;
        }
        if ("audio".equals(formatString)) {
            return AdProduct.AUDIO_AD;
        }
        return AdProduct.UNKNOWN;
    }
}
