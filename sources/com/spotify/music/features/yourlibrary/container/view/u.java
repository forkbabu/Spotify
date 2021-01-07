package com.spotify.music.features.yourlibrary.container.view;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.music.C0707R;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.f;

public class u {
    private final o a;
    private final o.e b = new a(this);

    class a extends o.e {
        a(u uVar) {
        }

        @Override // androidx.fragment.app.o.e
        public void b(o oVar, Fragment fragment, View view, Bundle bundle) {
            if (fragment instanceof f) {
                Bundle D2 = fragment.D2();
                if (D2 == null) {
                    D2 = je.D(fragment);
                }
                YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) D2.get("your-library-page-id");
                if (yourLibraryPageId != null) {
                    view.setTag(C0707R.id.your_library_testing_page_id_tag, yourLibraryPageId);
                }
                Bundle D22 = fragment.D2();
                if (D22 == null) {
                    D22 = je.D(fragment);
                }
                YourLibraryPageGroup yourLibraryPageGroup = (YourLibraryPageGroup) D22.get("your-library-page-group");
                if (yourLibraryPageGroup != null) {
                    view.setTag(C0707R.id.your_library_testing_page_group_tag, yourLibraryPageGroup);
                }
            }
        }
    }

    public u(o oVar) {
        this.a = oVar;
    }

    public void a() {
        this.a.A0(this.b, false);
    }

    public void b() {
        this.a.R0(this.b);
    }
}
