package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
    static final m1<String, Integer> f;
    private static final String[] n = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private static final String[] o = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] p = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    final Bundle a;
    private MediaMetadata b;
    private MediaDescriptionCompat c;

    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        m1<String, Integer> m1Var = new m1<>();
        f = m1Var;
        m1Var.put("android.media.metadata.TITLE", 1);
        m1Var.put("android.media.metadata.ARTIST", 1);
        m1Var.put("android.media.metadata.DURATION", 0);
        m1Var.put("android.media.metadata.ALBUM", 1);
        m1Var.put("android.media.metadata.AUTHOR", 1);
        m1Var.put("android.media.metadata.WRITER", 1);
        m1Var.put("android.media.metadata.COMPOSER", 1);
        m1Var.put("android.media.metadata.COMPILATION", 1);
        m1Var.put("android.media.metadata.DATE", 1);
        m1Var.put("android.media.metadata.YEAR", 0);
        m1Var.put("android.media.metadata.GENRE", 1);
        m1Var.put("android.media.metadata.TRACK_NUMBER", 0);
        m1Var.put("android.media.metadata.NUM_TRACKS", 0);
        m1Var.put("android.media.metadata.DISC_NUMBER", 0);
        m1Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        m1Var.put("android.media.metadata.ART", 2);
        m1Var.put("android.media.metadata.ART_URI", 1);
        m1Var.put("android.media.metadata.ALBUM_ART", 2);
        m1Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        m1Var.put("android.media.metadata.USER_RATING", 3);
        m1Var.put("android.media.metadata.RATING", 3);
        m1Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        m1Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        m1Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        m1Var.put("android.media.metadata.DISPLAY_ICON", 2);
        m1Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        m1Var.put("android.media.metadata.MEDIA_ID", 1);
        m1Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        m1Var.put("android.media.metadata.MEDIA_URI", 1);
        m1Var.put("android.media.metadata.ADVERTISEMENT", 0);
        m1Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.b = mediaMetadata;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.a.containsKey(str);
    }

    public Bundle c() {
        return new Bundle(this.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String h = h("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence = this.a.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = n;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence i4 = i(strArr[i2]);
                if (!TextUtils.isEmpty(i4)) {
                    charSequenceArr[i] = i4;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = this.a.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = this.a.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = o;
            uri = null;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) this.a.getParcelable(strArr2[i5]);
            } catch (Exception unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            String[] strArr3 = p;
            if (i6 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String h2 = h(strArr3[i6]);
            if (!TextUtils.isEmpty(h2)) {
                uri2 = Uri.parse(h2);
                break;
            }
            i6++;
        }
        String h3 = h("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(h3)) {
            uri = Uri.parse(h3);
        }
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.f(h);
        bVar.i(charSequenceArr[0]);
        bVar.h(charSequenceArr[1]);
        bVar.b(charSequenceArr[2]);
        bVar.d(bitmap);
        bVar.e(uri2);
        bVar.g(uri);
        Bundle bundle = new Bundle();
        if (this.a.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.a.getLong("android.media.metadata.BT_FOLDER_TYPE", 0));
        }
        if (this.a.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.a.getLong("android.media.metadata.DOWNLOAD_STATUS", 0));
        }
        if (!bundle.isEmpty()) {
            bVar.c(bundle);
        }
        MediaDescriptionCompat a2 = bVar.a();
        this.c = a2;
        return a2;
    }

    public long f(String str) {
        return this.a.getLong(str, 0);
    }

    public Object g() {
        if (this.b == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            obtain.writeBundle(this.a);
            obtain.setDataPosition(0);
            this.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.b;
    }

    public String h(String str) {
        CharSequence charSequence = this.a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence i(String str) {
        return this.a.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public static final class b {
        private final Bundle a;

        public b() {
            this.a = new Bundle();
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public b b(String str, Bitmap bitmap) {
            m1<String, Integer> m1Var = MediaMetadataCompat.f;
            if (!(m1Var.f(str) >= 0) || m1Var.getOrDefault(str, null).intValue() == 2) {
                this.a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException(je.y0("The ", str, " key cannot be used to put a Bitmap"));
        }

        public b c(String str, long j) {
            m1<String, Integer> m1Var = MediaMetadataCompat.f;
            if (!(m1Var.f(str) >= 0) || m1Var.getOrDefault(str, null).intValue() == 0) {
                this.a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException(je.y0("The ", str, " key cannot be used to put a long"));
        }

        public b d(String str, String str2) {
            m1<String, Integer> m1Var = MediaMetadataCompat.f;
            if (!(m1Var.f(str) >= 0) || m1Var.getOrDefault(str, null).intValue() == 1) {
                this.a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException(je.y0("The ", str, " key cannot be used to put a String"));
        }

        public b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.a);
            this.a = bundle;
            MediaSessionCompat.b(bundle);
        }

        public b(MediaMetadataCompat mediaMetadataCompat, int i) {
            Bundle bundle = new Bundle(mediaMetadataCompat.a);
            this.a = bundle;
            MediaSessionCompat.b(bundle);
            for (String str : bundle.keySet()) {
                Object obj = this.a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        float f = (float) i;
                        float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
                        b(str, Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true));
                    }
                }
            }
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
