package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sm8  reason: default package */
public class sm8 {
    private List<TasteOnboardingItem> a = new ArrayList();
    private PickerViewType b = PickerViewType.DEFAULT;

    /* renamed from: sm8$a */
    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void b1(Bundle bundle) {
            if (bundle != null) {
                sm8 sm8 = sm8.this;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("key_items");
                parcelableArrayList.getClass();
                sm8.a = parcelableArrayList;
                sm8.this.b = PickerViewType.valueOf(bundle.getString("key_picker_view_type", PickerViewType.DEFAULT.toString()));
            }
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            bundle.putParcelableArrayList("key_items", new ArrayList<>(sm8.this.a));
            bundle.putString("key_picker_view_type", sm8.this.b.toString());
        }
    }

    public sm8(k kVar) {
        kVar.y0(new a());
    }

    public List<TasteOnboardingItem> e() {
        return this.a;
    }

    public PickerViewType f() {
        return this.b;
    }

    public boolean g() {
        return !this.a.isEmpty();
    }

    public void h(List<TasteOnboardingItem> list) {
        this.a = new ArrayList(list);
    }

    public void i(PickerViewType pickerViewType) {
        this.b = pickerViewType;
    }
}
