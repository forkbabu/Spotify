package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

public final class MediaBrowserCompat {

    private static class CustomActionResultReceiver extends p {
        /* access modifiers changed from: protected */
        @Override // defpackage.p
        public void a(int i, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends p {
        /* access modifiers changed from: protected */
        @Override // defpackage.p
        public void a(int i, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends p {
        /* access modifiers changed from: protected */
        @Override // defpackage.p
        public void a(int i, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            throw null;
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        private final int a;
        private final MediaDescriptionCompat b;

        static class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (!TextUtils.isEmpty(mediaDescriptionCompat.f())) {
                this.a = i;
                this.b = mediaDescriptionCompat;
                return;
            }
            throw new IllegalArgumentException("description must have a non-empty media id");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
