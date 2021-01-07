package com.spotify.encore.consumer.components.yourlibrary.impl.sortrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.yourlibrary.api.sortrow.SortRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibrarySortRowLayoutBinding;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultSortRowLibrary implements SortRowLibrary {
    private final LibrarySortRowLayoutBinding binding;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            SortRowLibrary.SortOrder.values();
            int[] iArr = new int[5];
            $EnumSwitchMapping$0 = iArr;
            SortRowLibrary.SortOrder sortOrder = SortRowLibrary.SortOrder.MostRelevant;
            iArr[0] = 1;
            SortRowLibrary.SortOrder sortOrder2 = SortRowLibrary.SortOrder.RecentlyPlayed;
            iArr[1] = 2;
            SortRowLibrary.SortOrder sortOrder3 = SortRowLibrary.SortOrder.RecentlyAdded;
            iArr[2] = 3;
            SortRowLibrary.SortOrder sortOrder4 = SortRowLibrary.SortOrder.Alphabetical;
            iArr[3] = 4;
            SortRowLibrary.SortOrder sortOrder5 = SortRowLibrary.SortOrder.Creator;
            iArr[4] = 5;
            SortRowLibrary.ViewDensity.values();
            int[] iArr2 = new int[2];
            $EnumSwitchMapping$1 = iArr2;
            SortRowLibrary.ViewDensity viewDensity = SortRowLibrary.ViewDensity.List;
            iArr2[0] = 1;
            SortRowLibrary.ViewDensity viewDensity2 = SortRowLibrary.ViewDensity.Grid;
            iArr2[1] = 2;
        }
    }

    public DefaultSortRowLibrary(Context context) {
        h.e(context, "context");
        LibrarySortRowLayoutBinding inflate = LibrarySortRowLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        ConstraintLayout root = inflate.getRoot();
        h.d(root, "it.root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bvd a = dvd.a(inflate.sortText);
        a.g(inflate.sortText);
        a.a();
        bvd a2 = dvd.a(inflate.iconSort);
        a2.f(inflate.iconSort);
        a2.a();
        bvd a3 = dvd.a(inflate.iconGridList);
        a3.f(inflate.iconGridList);
        a3.a();
        h.d(inflate, "LibrarySortRowLayoutBind…onGridList).apply()\n    }");
        this.binding = inflate;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        ConstraintLayout root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super SortRowLibrary.Events, f> nmf) {
        h.e(nmf, "event");
        this.binding.iconSort.setOnClickListener(new DefaultSortRowLibrary$onEvent$1(nmf));
        this.binding.sortText.setOnClickListener(new DefaultSortRowLibrary$onEvent$2(nmf));
        this.binding.iconGridList.setOnClickListener(new DefaultSortRowLibrary$onEvent$3(nmf));
    }

    public void render(SortRowLibrary.Model model) {
        int i;
        SpotifyIconV2 spotifyIconV2;
        h.e(model, "model");
        TextView textView = this.binding.sortText;
        int ordinal = model.getSortOrder().ordinal();
        if (ordinal == 0) {
            i = R.string.library_sort_order_most_relevant;
        } else if (ordinal == 1) {
            i = R.string.library_sort_order_recently_played;
        } else if (ordinal == 2) {
            i = R.string.library_sort_order_recently_added;
        } else if (ordinal == 3) {
            i = R.string.library_sort_order_alphabetical;
        } else if (ordinal == 4) {
            i = R.string.library_sort_order_creator;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(i);
        SpotifyIconView spotifyIconView = this.binding.iconGridList;
        int ordinal2 = model.getDensity().ordinal();
        if (ordinal2 == 0) {
            spotifyIconV2 = SpotifyIconV2.LIST_VIEW;
        } else if (ordinal2 == 1) {
            spotifyIconV2 = SpotifyIconV2.GRID_VIEW;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        spotifyIconView.setIcon(spotifyIconV2);
    }
}
