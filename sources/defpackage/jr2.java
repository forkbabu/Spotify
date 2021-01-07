package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.model.HomeShelf;
import com.spotify.music.carmodehome.page.DisposableItemPresenterLifecycleObserver;
import com.spotify.music.carmodehome.shelf.CarModeCardView;
import com.spotify.music.carmodehome.shelf.HomeShelfPresenter;
import com.spotify.music.carmodehome.shelf.c;
import com.spotify.music.carmodehome.shelf.d;
import com.spotify.music.carmodehome.shelf.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: jr2  reason: default package */
public final class jr2 extends RecyclerView.b0 implements DisposableItemPresenterLifecycleObserver.a {
    private final List<c> C;
    private final HomeShelfPresenter D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jr2(g gVar, d dVar, DisposableItemPresenterLifecycleObserver disposableItemPresenterLifecycleObserver, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.home_shelf_page, viewGroup, false));
        h.e(gVar, "presenterFactory");
        h.e(dVar, "viewBinderFactory");
        h.e(disposableItemPresenterLifecycleObserver, "lifecycleObserver");
        h.e(viewGroup, "parent");
        List<Number> u = kotlin.collections.d.u(Integer.valueOf((int) C0707R.id.item1), Integer.valueOf((int) C0707R.id.item2), Integer.valueOf((int) C0707R.id.item3), Integer.valueOf((int) C0707R.id.item4));
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(u, 10));
        for (Number number : u) {
            arrayList.add(dVar.b((CarModeCardView) q4.G(this.a, number.intValue())));
        }
        this.C = arrayList;
        HomeShelfPresenter b = gVar.b(arrayList);
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
