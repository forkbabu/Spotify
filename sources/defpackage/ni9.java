package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ni9  reason: default package */
public class ni9 extends RecyclerView.e<d> {
    private final b c;
    private List<c> f = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: ni9$a */
    public class a extends d {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.view.ViewGroup r3) {
            /*
                r1 = this;
                defpackage.ni9.this = r2
                android.content.Context r2 = r3.getContext()
                r0 = 2131624239(0x7f0e012f, float:1.8875652E38)
                android.view.View r2 = defpackage.l70.l(r2, r3, r0)
                qi9 r3 = new qi9
                r3.<init>(r2)
                android.view.View r2 = r3.getView()
                r0 = 2131428622(0x7f0b050e, float:1.8478894E38)
                r2.setTag(r0, r3)
                android.view.View r2 = r3.getView()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ni9.a.<init>(ni9, android.view.ViewGroup):void");
        }
    }

    /* renamed from: ni9$b */
    public interface b {
    }

    /* renamed from: ni9$c */
    public interface c {
        int a();

        SpotifyIconV2 getIcon();

        String getKey();
    }

    /* renamed from: ni9$d */
    public static class d extends RecyclerView.b0 {
        public d(View view) {
            super(view);
        }
    }

    public ni9(b bVar) {
        this.c = bVar;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(d dVar, int i) {
        a aVar = (a) dVar;
        c cVar = this.f.get(i);
        qi9 qi9 = (qi9) l70.o(aVar.a, qi9.class);
        qi9.setText(aVar.a.getContext().getString(cVar.a()));
        SpotifyIconV2 icon = cVar.getIcon();
        if (icon != null) {
            qi9.m2(icon);
        } else {
            qi9.b();
        }
        aVar.a.setOnClickListener(new li9(aVar, i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public d M(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }

    public void Y(List<c> list) {
        this.f = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.f.get(i).getKey().hashCode();
    }
}
