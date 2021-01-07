package com.spotify.music.features.yourlibraryx.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.j;
import com.spotify.music.features.yourlibraryx.event.b;
import kotlin.jvm.internal.h;

public final class YourLibraryXSortBottomSheetFragment extends BottomSheetDialogFragment {
    public b v0;
    public eh9 w0;
    public b x0;

    static final class a implements View.OnClickListener {
        final /* synthetic */ YourLibraryXSortBottomSheetFragment a;
        final /* synthetic */ sg9 b;

        a(YourLibraryXSortBottomSheetFragment yourLibraryXSortBottomSheetFragment, sg9 sg9) {
            this.a = yourLibraryXSortBottomSheetFragment;
            this.b = sg9;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.b.setOnClickListener(null);
            eh9 eh9 = this.a.w0;
            if (eh9 != null) {
                eh9.k();
                this.a.M4();
                return;
            }
            h.k("logger");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int Q4() {
        return C0707R.style.YourLibraryXBottomSheetTheme;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        sg9 b = sg9.b(LayoutInflater.from(l4()), viewGroup, false);
        h.d(b, "BottomSheetYourLibraryXB…          false\n        )");
        b bVar = this.v0;
        if (bVar != null) {
            Bundle D2 = D2();
            bVar.Y(D2 != null ? (j) D2.getParcelable("PICKER_DATA") : null);
            RecyclerView recyclerView = b.c;
            h.d(recyclerView, "binding.sortOptionRecyclerView");
            RecyclerView recyclerView2 = b.c;
            h.d(recyclerView2, "binding.sortOptionRecyclerView");
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            RecyclerView recyclerView3 = b.c;
            h.d(recyclerView3, "binding.sortOptionRecyclerView");
            b bVar2 = this.v0;
            if (bVar2 != null) {
                recyclerView3.setAdapter(bVar2);
                b.b.setOnClickListener(new a(this, b));
                b bVar3 = this.v0;
                if (bVar3 != null) {
                    bVar3.Z(new YourLibraryXSortBottomSheetFragment$onCreateView$2(this));
                    eh9 eh9 = this.w0;
                    if (eh9 != null) {
                        eh9.b();
                        return b.a();
                    }
                    h.k("logger");
                    throw null;
                }
                h.k("adapter");
                throw null;
            }
            h.k("adapter");
            throw null;
        }
        h.k("adapter");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
    }
}
