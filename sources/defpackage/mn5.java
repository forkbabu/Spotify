package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.features.localfilesimport.model.PageType;
import com.spotify.music.features.localfilesimport.util.e;
import com.spotify.music.features.localfilesimport.view.LocalFileRow;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mn5  reason: default package */
public class mn5 extends RecyclerView.e<LocalFileRow> {
    private List<? extends LocalItem> c = new ArrayList();
    private final Context f;
    private final b n;
    private final Picasso o;
    private final e p;
    private final PageType q;
    private final b.a r;

    /* renamed from: mn5$a */
    class a implements b.a {
        a() {
        }

        @Override // defpackage.mn5.b.a
        public void a() {
            mn5.this.z();
        }
    }

    /* renamed from: mn5$b */
    public interface b {

        /* renamed from: mn5$b$a */
        public interface a {
            void a();
        }

        void a(LocalItem localItem, boolean z, a aVar);

        boolean b(LocalItem localItem);

        boolean c(LocalItem localItem);

        void d(a aVar);

        void e(ImmutableList<LocalItem> immutableList, boolean z, a aVar);

        void f(a aVar);
    }

    public mn5(Context context, b bVar, Picasso picasso, e eVar, PageType pageType) {
        a aVar = new a();
        this.r = aVar;
        this.f = context;
        this.n = bVar;
        this.p = eVar;
        this.q = pageType;
        bVar.f(aVar);
        this.o = picasso;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(LocalFileRow localFileRow, int i) {
        LocalFileRow.Activated activated;
        LocalFileRow localFileRow2 = localFileRow;
        LocalItem localItem = (LocalItem) this.c.get(i);
        localFileRow2.setTitle(localItem.getTitle());
        localFileRow2.setSubtitle(localItem.getSubtitle(this.f));
        localFileRow2.j0(new nn5(this, localItem, localFileRow2, i));
        if (this.n.b(localItem)) {
            activated = LocalFileRow.Activated.FULLY;
        } else {
            activated = this.n.c(localItem) ? LocalFileRow.Activated.PARTLY : LocalFileRow.Activated.INACTIVE;
        }
        localFileRow2.h0(activated);
        TextLabelUtil.b(this.f, localFileRow2.getSubtitleView(), localItem.isExplicit());
        String imageUri = localItem.getImageUri();
        ImageView imageView = localFileRow2.getImageView();
        LocalItem.ImageType imageType = localItem.getImageType();
        if (imageType != LocalItem.ImageType.NONE) {
            Drawable imagePlaceholder = localItem.getImagePlaceholder(this.f);
            imageView.setVisibility(0);
            if (!MoreObjects.isNullOrEmpty(imageUri)) {
                z l = this.o.l(!TextUtils.isEmpty(imageUri) ? Uri.parse(imageUri) : Uri.EMPTY);
                l.t(imagePlaceholder);
                l.i();
                if (imageType == LocalItem.ImageType.ROUND) {
                    l.o(rwd.g(imageView, com.spotify.paste.graphics.drawable.b.a(), null));
                } else {
                    l.n(imageView, null);
                }
            } else {
                this.o.b(imageView);
                imageView.setImageDrawable(imagePlaceholder);
            }
        } else {
            imageView.setVisibility(8);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public LocalFileRow M(ViewGroup viewGroup, int i) {
        return new LocalFileRow(this.f, viewGroup);
    }

    public void c0() {
        this.n.d(this.r);
    }

    public ImmutableList<LocalItem> f0() {
        return ImmutableList.copyOf((Collection) this.c);
    }

    public void g0(List<? extends LocalItem> list) {
        this.c = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
