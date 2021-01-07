package com.spotify.music.pageloader.skeleton;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.spotify.android.paste.app.d;
import com.spotify.music.C0707R;
import com.spotify.music.pageloader.skeleton.SkeletonLayout;

public enum SkeletonComponents implements SkeletonLayout.b {
    TOOLBAR_SPACE {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Space space = new Space(context);
            space.setLayoutParams(new LinearLayout.LayoutParams(0, d.c(context)));
            return space;
        }
    },
    HEADER_ARTWORK {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_headerartwork, viewGroup, false);
        }
    },
    HEADER_ARTWORK_SMALL {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_headerartwork_small, viewGroup, false);
        }
    },
    HEADER_FULLBLEED_CENTER {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_headerfullbleed_center, viewGroup, false);
        }
    },
    HEADER_FULLBLEED_LEFT {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_headerfullbleed_left, viewGroup, false);
        }
    },
    HEADER_TEXT {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_headertext, viewGroup, false);
        }
    },
    PILL_BUTTON_LARGE {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_pillbutton_large, viewGroup, false);
        }
    },
    SECTION_HEADER {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_sectionheader, viewGroup, false);
        }
    },
    CARD {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            int f = nud.f(8.0f, context.getResources());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(f, 0, f, 0);
            layoutInflater.inflate(C0707R.layout.skeleton_card, (ViewGroup) linearLayout, true);
            return linearLayout;
        }
    },
    CARD_GRID_ROW {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Resources resources = context.getResources();
            int f = nud.f(8.0f, resources);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(f, 0, f, 0);
            int integer = resources.getInteger(C0707R.integer.card_row_columns);
            for (int i = 0; i < integer; i++) {
                layoutInflater.inflate(C0707R.layout.skeleton_card, (ViewGroup) linearLayout, true);
            }
            return linearLayout;
        }
    },
    ROW {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_row, viewGroup, false);
        }
    },
    ROW_IMAGE {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_rowimage, viewGroup, false);
        }
    },
    TRACK_PREVIEW {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_trackpreview, viewGroup, false);
        }
    },
    TRACK_CLOUD {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_trackcloud, viewGroup, false);
        }
    },
    PODCAST_EPISODE_ROW {
        @Override // com.spotify.music.pageloader.skeleton.SkeletonLayout.b
        public View d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return layoutInflater.inflate(C0707R.layout.skeleton_podcastepisoderow, viewGroup, false);
        }
    };

    static {
        values();
    }

    SkeletonComponents(AnonymousClass1 r3) {
    }
}
