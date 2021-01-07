package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.LinearRecyclerView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import defpackage.sl8;
import java.util.List;

/* renamed from: vo8  reason: default package */
public class vo8 extends ConstraintLayout implements sl8 {
    private final sl8.a a;
    private final rl8 b;
    private LinearRecyclerView c = ((LinearRecyclerView) findViewById(C0707R.id.recycler_view));
    private cl8 f;

    public vo8(Context context, sl8.a aVar, rl8 rl8) {
        super(context);
        ViewGroup.inflate(getContext(), C0707R.layout.taste_picker_shelf_view, this);
        setId(C0707R.id.picker_view);
        this.a = aVar;
        this.b = rl8;
    }

    public /* synthetic */ void C(int i, View view, TasteOnboardingItem tasteOnboardingItem) {
        this.a.A1(i, tasteOnboardingItem, null);
        this.b.e2();
    }

    @Override // defpackage.sl8
    public void c() {
        setVisibility(8);
    }

    @Override // defpackage.sl8
    public void g(ln8 ln8) {
        ln8.c(this.c);
    }

    @Override // defpackage.sl8
    public View getView() {
        return this;
    }

    @Override // defpackage.sl8
    public void h(ln8 ln8) {
    }

    @Override // defpackage.sl8
    public void i() {
    }

    @Override // defpackage.sl8
    public void setItemClickedFromSearch(TasteOnboardingItem tasteOnboardingItem) {
        this.a.E1(tasteOnboardingItem);
    }

    @Override // defpackage.sl8
    public void setItems(List<TasteOnboardingItem> list) {
        this.f.f0(list);
    }

    @Override // defpackage.sl8
    public void setTastePickerAdapter(cl8 cl8) {
        this.f = cl8;
        cl8.l0(new so8(this));
        this.c.setAdapter(cl8);
    }

    @Override // defpackage.sl8
    public void z() {
        setVisibility(0);
    }
}
