package com.spotify.music.features.yourlibraryx.view.entities.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.music.pageloader.skeleton.SkeletonLayout;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class YourLibraryXSkeletonComponents extends Enum<YourLibraryXSkeletonComponents> implements SkeletonLayout.b {
    public static final YourLibraryXSkeletonComponents a;
    public static final YourLibraryXSkeletonComponents b;
    public static final YourLibraryXSkeletonComponents c;
    public static final YourLibraryXSkeletonComponents f;
    private static final /* synthetic */ YourLibraryXSkeletonComponents[] n;

    static final class YOUR_LIBRARY_CARD extends YourLibraryXSkeletonComponents {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        YOUR_LIBRARY_CARD(String str, int i) {
            super(str, i, null);
        }

        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            h.c(layoutInflater);
            ug9 b = ug9.b(layoutInflater, viewGroup, false);
            h.d(b, "CardSkeletonYourLibraryX…nflater!!, parent, false)");
            ShimmerFrameLayout a = b.a();
            h.d(a, "CardSkeletonYourLibraryX…er!!, parent, false).root");
            return a;
        }
    }

    static final class YOUR_LIBRARY_CARD_CIRCULAR extends YourLibraryXSkeletonComponents {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        YOUR_LIBRARY_CARD_CIRCULAR(String str, int i) {
            super(str, i, null);
        }

        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            h.c(layoutInflater);
            tg9 b = tg9.b(layoutInflater, viewGroup, false);
            h.d(b, "CardCircularSkeletonYour…nflater!!, parent, false)");
            ShimmerFrameLayout a = b.a();
            h.d(a, "CardCircularSkeletonYour…er!!, parent, false).root");
            return a;
        }
    }

    static final class YOUR_LIBRARY_ROW extends YourLibraryXSkeletonComponents {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        YOUR_LIBRARY_ROW(String str, int i) {
            super(str, i, null);
        }

        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            h.c(layoutInflater);
            ah9 b = ah9.b(layoutInflater, viewGroup, false);
            h.d(b, "RowSkeletonYourLibraryXB…nflater!!, parent, false)");
            ShimmerFrameLayout a = b.a();
            h.d(a, "RowSkeletonYourLibraryXB…er!!, parent, false).root");
            return a;
        }
    }

    static final class YOUR_LIBRARY_ROW_CIRCULAR extends YourLibraryXSkeletonComponents {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        YOUR_LIBRARY_ROW_CIRCULAR(String str, int i) {
            super(str, i, null);
        }

        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            h.c(layoutInflater);
            yg9 b = yg9.b(layoutInflater, viewGroup, false);
            h.d(b, "RowCircularSkeletonYourL…nflater!!, parent, false)");
            ShimmerFrameLayout a = b.a();
            h.d(a, "RowCircularSkeletonYourL…er!!, parent, false).root");
            return a;
        }
    }

    static {
        YOUR_LIBRARY_CARD your_library_card = new YOUR_LIBRARY_CARD("YOUR_LIBRARY_CARD", 0);
        a = your_library_card;
        YOUR_LIBRARY_CARD_CIRCULAR your_library_card_circular = new YOUR_LIBRARY_CARD_CIRCULAR("YOUR_LIBRARY_CARD_CIRCULAR", 1);
        b = your_library_card_circular;
        YOUR_LIBRARY_ROW your_library_row = new YOUR_LIBRARY_ROW("YOUR_LIBRARY_ROW", 2);
        c = your_library_row;
        YOUR_LIBRARY_ROW_CIRCULAR your_library_row_circular = new YOUR_LIBRARY_ROW_CIRCULAR("YOUR_LIBRARY_ROW_CIRCULAR", 3);
        f = your_library_row_circular;
        n = new YourLibraryXSkeletonComponents[]{your_library_card, your_library_card_circular, your_library_row, your_library_row_circular};
    }

    public YourLibraryXSkeletonComponents(String str, int i, f fVar) {
    }

    public static YourLibraryXSkeletonComponents valueOf(String str) {
        return (YourLibraryXSkeletonComponents) Enum.valueOf(YourLibraryXSkeletonComponents.class, str);
    }

    public static YourLibraryXSkeletonComponents[] values() {
        return (YourLibraryXSkeletonComponents[]) n.clone();
    }
}
