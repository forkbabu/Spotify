package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.model.HomeShelf;
import com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver;
import com.spotify.music.carmodehome.shortcuts.HomeShortcutsGridItemCardView;
import com.spotify.music.carmodehome.shortcuts.HomeShortcutsShelfPresenter;
import com.spotify.music.carmodehome.shortcuts.b;
import com.spotify.music.carmodehome.shortcuts.e;
import com.spotify.music.carmodehome.shortcuts.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: mr2  reason: default package */
public final class mr2 extends RecyclerView.b0 implements DisposableItemPresenterLifecycleObserver.a {
    private final List<e> C;
    private final HomeShortcutsShelfPresenter D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mr2(i iVar, b bVar, DisposableItemPresenterLifecycleObserver disposableItemPresenterLifecycleObserver, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.home_shortcuts_grid_shelf_page, viewGroup, false));
        h.e(iVar, "presenterFactory");
        h.e(bVar, "viewBinderFactory");
        h.e(disposableItemPresenterLifecycleObserver, "lifecycleObserver");
        h.e(viewGroup, "parent");
        List<Number> u = d.u(Integer.valueOf((int) C0707R.id.item1), Integer.valueOf((int) C0707R.id.item2), Integer.valueOf((int) C0707R.id.item3), Integer.valueOf((int) C0707R.id.item4), Integer.valueOf((int) C0707R.id.item5), Integer.valueOf((int) C0707R.id.item6));
        ArrayList arrayList = new ArrayList(d.e(u, 10));
        for (Number number : u) {
            arrayList.add(bVar.b((HomeShortcutsGridItemCardView) q4.G(this.a, number.intValue())));
        }
        this.C = arrayList;
        HomeShortcutsShelfPresenter b = iVar.b(arrayList);
        h.d(b, "presenterFactory.create(shelfItemViews)");
        this.D = b;
        View view = this.a;
        h.d(view, "itemView");
        disposableItemPresenterLifecycleObserver.b(view, this);
    }

    @Override // com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver.a
    public void a() {
        this.D.e();
    }

    @Override // com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver.a
    public void b() {
        this.D.d();
    }

    public final void h0(HomeShelf homeShelf) {
        h.e(homeShelf, "homeShelf");
        this.D.c(homeShelf, w());
    }
}
