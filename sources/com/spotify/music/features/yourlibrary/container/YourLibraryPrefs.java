package com.spotify.music.features.yourlibrary.container;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.features.yourlibrary.container.AutoValue_YourLibraryPrefs_PrefsModel;
import com.spotify.music.json.d;
import com.spotify.music.json.g;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import java.io.IOException;

public class YourLibraryPrefs implements m {
    private static final SpSharedPreferences.b<Object, String> q = SpSharedPreferences.b.e("your_library_prefs");
    private final e a;
    private final Context b;
    private final cqe c;
    private final d f;
    private final i n;
    private final w09 o;
    private PrefsModel p;

    public static class PageIdDeserializer extends JsonDeserializer<Optional<YourLibraryPageId>> {
        /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/base/Optional<Lcom/spotify/music/yourlibrary/interfaces/YourLibraryPageId;>; */
        public Optional a(JsonParser jsonParser) {
            String str = (String) jsonParser.readValueAs(String.class);
            if (str == null || str.equals("absent_page_id")) {
                return Optional.absent();
            }
            return Optional.fromNullable(YourLibraryPageId.d(str));
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Optional<YourLibraryPageId> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return a(jsonParser);
        }
    }

    public static class PageIdSerializer extends JsonSerializer<Optional<YourLibraryPageId>> {
        /* JADX WARN: Incorrect args count in method signature: (Lcom/google/common/base/Optional<Lcom/spotify/music/yourlibrary/interfaces/YourLibraryPageId;>;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V */
        public void a(Optional optional, JsonGenerator jsonGenerator) {
            jsonGenerator.writeString(optional.isPresent() ? ((YourLibraryPageId) optional.get()).g() : "absent_page_id");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider] */
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void serialize(Optional<YourLibraryPageId> optional, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            a(optional, jsonGenerator);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonSerialize(as = PrefsModel.class)
    public static abstract class PrefsModel implements JacksonModel {

        public static abstract class a {
            public abstract PrefsModel a();

            public abstract a b(Optional<YourLibraryPageId> optional);

            public abstract a c(long j);
        }

        public static a builder() {
            return new AutoValue_YourLibraryPrefs_PrefsModel.b();
        }

        @JsonCreator
        public static PrefsModel create(@JsonProperty("timestamp") Long l, @JsonProperty("focused_page_id") @JsonDeserialize(using = PageIdDeserializer.class) Optional<YourLibraryPageId> optional) {
            a builder = builder();
            builder.c(((Long) MoreObjects.firstNonNull(l, 0L)).longValue());
            builder.b((Optional) MoreObjects.firstNonNull(optional, Optional.absent()));
            return builder.a();
        }

        @JsonProperty("focused_page_id")
        @JsonSerialize(using = PageIdSerializer.class)
        public abstract Optional<YourLibraryPageId> focusedPageId();

        @JsonProperty("timestamp")
        public abstract long timestamp();

        public abstract a toBuilder();

        public PrefsModel withFocusedPageId(YourLibraryPageId yourLibraryPageId) {
            a builder = toBuilder();
            builder.b(Optional.of(yourLibraryPageId));
            return builder.a();
        }

        public PrefsModel withTimeStamp(long j) {
            a builder = toBuilder();
            builder.c(j);
            return builder.a();
        }
    }

    public YourLibraryPrefs(cqe cqe, Context context, n nVar, g gVar, i iVar, w09 w09, e eVar) {
        this.c = cqe;
        this.b = context;
        this.f = new l(gVar);
        this.n = iVar;
        this.o = w09;
        this.a = eVar;
        nVar.A().a(this);
    }

    public YourLibraryPageId a() {
        PrefsModel prefsModel;
        if (!this.a.a() || (prefsModel = this.p) == null || !prefsModel.focusedPageId().isPresent()) {
            this.a.getClass();
            return YourLibraryPageId.MUSIC_PLAYLISTS;
        }
        long b2 = this.a.b();
        if (b2 <= 0 || this.c.d() - this.p.timestamp() <= b2) {
            return this.p.focusedPageId().get();
        }
        this.a.getClass();
        return YourLibraryPageId.MUSIC_PLAYLISTS;
    }

    public void b(YourLibraryPageId yourLibraryPageId) {
        PrefsModel prefsModel = this.p;
        if (prefsModel != null) {
            this.p = prefsModel.withFocusedPageId(yourLibraryPageId);
        }
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        String w1 = this.o.w1();
        PrefsModel prefsModel = null;
        String m = !w1.isEmpty() ? this.n.b(this.b, w1).m(q, null) : null;
        if (m != null) {
            try {
                prefsModel = (PrefsModel) this.f.a().readValue(m, PrefsModel.class);
            } catch (IOException e) {
                Assertion.i("Failed reading your library prefs.", e);
            }
        }
        if (prefsModel == null) {
            Long valueOf = Long.valueOf(this.c.d());
            this.a.getClass();
            prefsModel = PrefsModel.create(valueOf, Optional.of(YourLibraryPageId.MUSIC_PLAYLISTS));
        }
        this.p = prefsModel;
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        String str;
        PrefsModel prefsModel = this.p;
        if (prefsModel != null) {
            try {
                str = this.f.a().writeValueAsString(prefsModel.withTimeStamp(this.c.d()));
            } catch (JsonProcessingException e) {
                Assertion.i("Failed writing your library prefs.", e);
                str = null;
            }
            if (str != null && !this.o.w1().isEmpty()) {
                SpSharedPreferences.a<Object> b2 = this.n.b(this.b, this.o.w1()).b();
                b2.f(q, str);
                b2.i();
            }
        }
    }
}
