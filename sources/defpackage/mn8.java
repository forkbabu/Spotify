package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.features.tasteonboarding.model.d;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mn8  reason: default package */
public class mn8 {
    public static final /* synthetic */ int c = 0;
    private final jo8 a;
    private final sm8 b;

    public mn8(jo8 jo8, sm8 sm8) {
        this.a = jo8;
        this.b = sm8;
    }

    public List a(TasteOnboardingItem tasteOnboardingItem, RelatedArtistsResponse relatedArtistsResponse) {
        ArrayList<TasteOnboardingItem> newArrayList = Collections2.newArrayList(Collections2.filter((Iterable) relatedArtistsResponse.relatedArtists(), (Predicate) new fm8(FluentIterable.from(this.b.e()).transformAndConcat(em8.a).toList())));
        ArrayList arrayList = new ArrayList();
        for (TasteOnboardingItem tasteOnboardingItem2 : newArrayList) {
            d logging = tasteOnboardingItem2.logging();
            logging.getClass();
            d logging2 = tasteOnboardingItem.logging();
            logging2.getClass();
            arrayList.add(tasteOnboardingItem2.createWithLogging(logging.h(logging2.e()).g(tasteOnboardingItem.id())));
        }
        return arrayList.subList(0, Math.min(arrayList.size(), 6));
    }

    public z<List<TasteOnboardingItem>> b(TasteOnboardingItem tasteOnboardingItem) {
        jo8 jo8 = this.a;
        String moreUri = tasteOnboardingItem.moreUri();
        moreUri.getClass();
        return jo8.a(moreUri).A(new dm8(this, tasteOnboardingItem));
    }
}
