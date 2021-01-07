package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.features.localfilesimport.fragment.ItemsFragment;
import com.spotify.music.features.localfilesimport.model.PageType;

/* renamed from: kn5  reason: default package */
public class kn5 extends t {
    public static final int j = PageType.n.length;
    private final Context h;
    private final c i;

    public kn5(o oVar, Context context, c cVar) {
        super(oVar);
        this.h = context;
        this.i = cVar;
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return j;
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence f(int i2) {
        PageType[] pageTypeArr = PageType.n;
        if (i2 >= pageTypeArr.length) {
            return "";
        }
        PageType pageType = pageTypeArr[i2];
        int ordinal = pageType.ordinal();
        if (ordinal == 0) {
            return this.h.getString(C0707R.string.local_files_import_title_folders);
        }
        if (ordinal == 1) {
            return this.h.getString(C0707R.string.local_files_import_title_artists);
        }
        if (ordinal == 2) {
            return this.h.getString(C0707R.string.local_files_import_title_albums);
        }
        if (ordinal == 3) {
            return this.h.getString(C0707R.string.local_files_import_title_songs);
        }
        Assertion.p("Unsupported page " + pageType);
        return "";
    }

    @Override // androidx.fragment.app.t
    public Fragment r(int i2) {
        PageType[] pageTypeArr = PageType.n;
        if (i2 >= pageTypeArr.length) {
            return null;
        }
        PageType pageType = pageTypeArr[i2];
        int ordinal = pageType.ordinal();
        if (ordinal == 0) {
            return ItemsFragment.U4(this.i, PageType.FOLDERS);
        }
        if (ordinal == 1) {
            return ItemsFragment.U4(this.i, PageType.ARTISTS);
        }
        if (ordinal == 2) {
            return ItemsFragment.U4(this.i, PageType.ALBUMS);
        }
        if (ordinal == 3) {
            return ItemsFragment.U4(this.i, PageType.TRACKS);
        }
        Assertion.p("Unsupported page " + pageType);
        return null;
    }
}
