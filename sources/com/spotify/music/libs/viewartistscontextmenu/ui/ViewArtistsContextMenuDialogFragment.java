package com.spotify.music.libs.viewartistscontextmenu.ui;

import android.app.Dialog;
import android.os.Bundle;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import dagger.android.support.DaggerAppCompatDialogFragment;
import java.util.ArrayList;
import java.util.List;

public class ViewArtistsContextMenuDialogFragment extends DaggerAppCompatDialogFragment {
    private String A0;
    private final ContextMenuViewModel v0 = new ContextMenuViewModel();
    f w0;
    private b x0;
    private final List<mab> y0 = new ArrayList();
    private int z0;

    public static class a {
        private b a;
        private int b;
        private String c;
        private final List<mab> d = new ArrayList();

        public ViewArtistsContextMenuDialogFragment a() {
            ViewArtistsContextMenuDialogFragment viewArtistsContextMenuDialogFragment = new ViewArtistsContextMenuDialogFragment();
            ViewArtistsContextMenuDialogFragment.a5(viewArtistsContextMenuDialogFragment, this.a);
            ViewArtistsContextMenuDialogFragment.b5(viewArtistsContextMenuDialogFragment, this.b);
            ViewArtistsContextMenuDialogFragment.c5(viewArtistsContextMenuDialogFragment, this.c);
            ViewArtistsContextMenuDialogFragment.d5(viewArtistsContextMenuDialogFragment, this.d);
            return viewArtistsContextMenuDialogFragment;
        }

        public a b(int i) {
            this.b = i;
            return this;
        }

        public a c(b bVar) {
            this.a = bVar;
            return this;
        }

        public a d(String str) {
            this.c = str;
            return this;
        }

        public a e(List<mab> list) {
            this.d.clear();
            this.d.addAll(list);
            return this;
        }
    }

    public interface b {
        void a(String str, String str2);
    }

    static void a5(ViewArtistsContextMenuDialogFragment viewArtistsContextMenuDialogFragment, b bVar) {
        viewArtistsContextMenuDialogFragment.x0 = bVar;
    }

    static void b5(ViewArtistsContextMenuDialogFragment viewArtistsContextMenuDialogFragment, int i) {
        viewArtistsContextMenuDialogFragment.z0 = i;
    }

    static void c5(ViewArtistsContextMenuDialogFragment viewArtistsContextMenuDialogFragment, String str) {
        viewArtistsContextMenuDialogFragment.A0 = str;
    }

    static void d5(ViewArtistsContextMenuDialogFragment viewArtistsContextMenuDialogFragment, List list) {
        viewArtistsContextMenuDialogFragment.y0.clear();
        viewArtistsContextMenuDialogFragment.y0.addAll(list);
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        M4();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        this.w0.getClass();
        for (mab mab : this.y0) {
            com.spotify.android.glue.patterns.contextmenu.model.b a2 = this.v0.a(this.z0, mab.b());
            a2.o(new b(this, mab));
            if (a2 instanceof b.C0146b) {
                ((b.C0146b) a2).r(mab.a());
            }
        }
        this.v0.d();
        this.v0.G(this.A0);
        this.w0.a(this.v0);
        return this.w0.d();
    }

    public /* synthetic */ void e5(mab mab, com.spotify.android.glue.patterns.contextmenu.model.b bVar) {
        b bVar2 = this.x0;
        if (bVar2 != null) {
            bVar2.a(mab.c(), mab.b());
        }
    }
}
