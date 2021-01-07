package com.spotify.mobile.android.spotlets.appprotocol.util;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public final class OptionExtrasUtil {

    public enum Streamtype {
        ALARM("alarm"),
        DEFAULT("default"),
        UNKNOWN_STREAMTYPE("unknown");
        
        public final String type;

        private Streamtype(String str) {
            this.type = str;
        }
    }

    public enum UriOptionExtras {
        STREAMTYPE("streamtype"),
        TRACK_INDEX("trackIndex"),
        TRACK_URI("trackUri"),
        TRACK_UID("trackUid"),
        UNKNOWN_OPTION_EXTRA("unknown");
        
        public final String type;

        private UriOptionExtras(String str) {
            this.type = str;
        }
    }

    public static abstract class a {
        public abstract int a();
    }

    private static void a(UriOptionExtras uriOptionExtras) {
        Logger.n("Found duplicate UriOptionExtras", new Object[0]);
        throw new IllegalArgumentException(String.format("Duplicate use not allowed for value of option extra [%s]", uriOptionExtras.type));
    }

    public static HashMap<UriOptionExtras, ?> b(AppProtocol.UriWithNamedOptions uriWithNamedOptions) {
        HashMap<UriOptionExtras, ?> hashMap = new HashMap<>();
        String str = uriWithNamedOptions.skipToUid;
        if (str == null || str.isEmpty()) {
            String str2 = uriWithNamedOptions.skipToUri;
            if (str2 == null || str2.isEmpty()) {
                int i = uriWithNamedOptions.skipToIndex;
                if (i >= 0) {
                    hashMap.put(UriOptionExtras.TRACK_INDEX, new a(i));
                }
            } else {
                hashMap.put(UriOptionExtras.TRACK_URI, uriWithNamedOptions.skipToUri);
            }
        } else {
            hashMap.put(UriOptionExtras.TRACK_UID, uriWithNamedOptions.skipToUid);
        }
        if (!hashMap.isEmpty()) {
            return hashMap;
        }
        Logger.n("Unknown UriOptionExtras", new Object[0]);
        throw new IllegalArgumentException("Unknown option extras");
    }

    public static HashMap<UriOptionExtras, ?> c(String[] strArr) {
        Streamtype streamtype = Streamtype.UNKNOWN_STREAMTYPE;
        if (Arrays.asList(strArr).contains(null) || strArr.length == 0) {
            Logger.n("Attempting to get UriOptionExtras for empty option extras", new Object[0]);
            throw new IllegalArgumentException("Option extras cannot be empty.");
        }
        HashMap<UriOptionExtras, ?> hashMap = new HashMap<>();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            Streamtype streamtype2 = Streamtype.ALARM;
            if (!streamtype2.type.equals(lowerCase)) {
                streamtype2 = Streamtype.DEFAULT;
                if (!streamtype2.type.equals(lowerCase)) {
                    streamtype2 = streamtype;
                }
            }
            if (streamtype != streamtype2) {
                UriOptionExtras uriOptionExtras = UriOptionExtras.STREAMTYPE;
                if (!hashMap.containsKey(uriOptionExtras)) {
                    hashMap.put(uriOptionExtras, streamtype2);
                } else {
                    a(uriOptionExtras);
                    throw null;
                }
            } else {
                try {
                    int parseInt = Integer.parseInt(str);
                    UriOptionExtras uriOptionExtras2 = UriOptionExtras.TRACK_INDEX;
                    if (!hashMap.containsKey(uriOptionExtras2)) {
                        if (parseInt < 0) {
                            parseInt = 0;
                        }
                        hashMap.put(uriOptionExtras2, new a(parseInt));
                    } else {
                        a(uriOptionExtras2);
                        throw null;
                    }
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        if (!hashMap.isEmpty()) {
            return hashMap;
        }
        Logger.n("Unknown UriOptionExtras", new Object[0]);
        throw new IllegalArgumentException("Unknown option extras");
    }
}
