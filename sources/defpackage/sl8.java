package defpackage;

import android.view.View;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: sl8  reason: default package */
public interface sl8 {

    /* renamed from: sl8$a */
    public interface a {
        void A1(int i, TasteOnboardingItem tasteOnboardingItem, String str);

        void E1(TasteOnboardingItem tasteOnboardingItem);
    }

    void c();

    void g(ln8 ln8);

    View getView();

    void h(ln8 ln8);

    void i();

    void setItemClickedFromSearch(TasteOnboardingItem tasteOnboardingItem);

    void setItems(List<TasteOnboardingItem> list);

    void setTastePickerAdapter(cl8 cl8);

    void z();
}
