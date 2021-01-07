package com.spotify.music.artist.model;

import com.coremedia.iso.boxes.UserBox;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.player.model.ContextTrack;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class ArtistModel_Deserializer extends StdDeserializer<ArtistModel> {
    private static final long serialVersionUID = 1;

    ArtistModel_Deserializer() {
        super(ArtistModel.class);
    }

    public int _deserializeint(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    public ArtistModel.ArtistInfo a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str2 = null;
        List<Image> list = null;
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1994383672:
                        if (currentName.equals("verified")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3373707:
                        if (currentName.equals("name")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1132443704:
                        if (currentName.equals("portraits")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonParser.nextValue();
                        z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        str = deserializeString(jsonParser, deserializationContext);
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        str2 = deserializeString(jsonParser, deserializationContext);
                        continue;
                    case 3:
                        jsonParser.nextValue();
                        list = d(jsonParser, deserializationContext);
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return new ArtistModel.ArtistInfo(str, str2, list, z);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public ArtistModel b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        Releases releases;
        Release release;
        LinkedList linkedList;
        LinkedList linkedList2;
        ArtistModel.Track track;
        char c2;
        char c3;
        HashMap hashMap5;
        LinkedList linkedList3;
        ArtistModel.MerchandiseItem merchandiseItem;
        char c4;
        HashMap hashMap6;
        LinkedList linkedList4;
        ArtistModel.Concert concert;
        char c5;
        char c6;
        HashMap hashMap7;
        HashMap hashMap8;
        HashMap hashMap9;
        HashMap hashMap10;
        Releases releases2;
        LinkedList linkedList5;
        HashMap hashMap11;
        HashMap hashMap12;
        HashMap hashMap13;
        HashMap hashMap14;
        ArtistModel.Playlist playlist;
        char c7;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str = null;
        ArtistModel.ArtistInfo artistInfo = null;
        ArtistModel.HeaderImage headerImage = null;
        ArtistModel.ArtistGallery artistGallery = null;
        HashMap hashMap15 = null;
        HashMap hashMap16 = null;
        HashMap hashMap17 = null;
        HashMap hashMap18 = null;
        HashMap hashMap19 = null;
        Releases releases3 = null;
        Release release2 = null;
        HashMap hashMap20 = null;
        ArtistModel.CustomMessage customMessage = null;
        ArtistModel.MonthlyListeners monthlyListeners = null;
        ArtistModel.CreatorAbout creatorAbout = null;
        ArtistsPick artistsPick = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                switch (currentName.hashCode()) {
                    case -1956048599:
                        if (currentName.equals("header_image")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1652496561:
                        if (currentName.equals("latest_release")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -838143496:
                        if (currentName.equals("related_artists")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -615695694:
                        if (currentName.equals("top_tracks")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -551298740:
                        if (currentName.equals("releases")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -196315310:
                        if (currentName.equals("gallery")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -29658995:
                        if (currentName.equals("monthly_listeners")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3237038:
                        if (currentName.equals(AppProtocol.LogMessage.SEVERITY_INFO)) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 60358643:
                        if (currentName.equals("biography")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 103785407:
                        if (currentName.equals("merch")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 412418640:
                        if (currentName.equals("upcoming_concerts")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 428552505:
                        if (currentName.equals("custom_message")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1027393306:
                        if (currentName.equals("pinned_item")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1738683834:
                        if (currentName.equals("creator_about")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2098807760:
                        if (currentName.equals("published_playlists")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        releases = releases3;
                        release = release2;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            headerImage = null;
                        } else {
                            int i = 0;
                            String str2 = null;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName2 = jsonParser.getCurrentName();
                                    currentName2.hashCode();
                                    if (currentName2.equals("offset")) {
                                        jsonParser.nextValue();
                                        i = _deserializeint(jsonParser, deserializationContext);
                                    } else if (!currentName2.equals("image")) {
                                        jsonParser.nextValue();
                                        jsonParser.skipChildren();
                                    } else {
                                        jsonParser.nextValue();
                                        str2 = deserializeString(jsonParser, deserializationContext);
                                    }
                                }
                            }
                            headerImage = new ArtistModel.HeaderImage(str2, i);
                        }
                        hashMap20 = hashMap20;
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case 1:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        jsonParser.nextValue();
                        release2 = e(jsonParser, deserializationContext);
                        hashMap20 = hashMap20;
                        break;
                    case 2:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            hashMap18 = null;
                        } else {
                            HashMap hashMap21 = new HashMap();
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                String deserializeString = deserializeString(jsonParser, deserializationContext);
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    linkedList = null;
                                } else {
                                    linkedList = new LinkedList();
                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                        linkedList.add(a(jsonParser, deserializationContext));
                                    }
                                }
                                hashMap21.put(deserializeString, linkedList);
                            }
                            hashMap18 = hashMap21;
                        }
                        hashMap20 = hashMap20;
                        release2 = release2;
                        releases3 = releases3;
                        hashMap19 = hashMap19;
                        break;
                    case 3:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        releases = releases3;
                        release = release2;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            hashMap15 = null;
                        } else {
                            HashMap hashMap22 = new HashMap();
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                String deserializeString2 = deserializeString(jsonParser, deserializationContext);
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    linkedList2 = null;
                                } else {
                                    linkedList2 = new LinkedList();
                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                            track = null;
                                        } else {
                                            String str3 = null;
                                            int i2 = 0;
                                            boolean z = false;
                                            String str4 = null;
                                            Release release3 = null;
                                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                    String currentName3 = jsonParser.getCurrentName();
                                                    currentName3.hashCode();
                                                    switch (currentName3.hashCode()) {
                                                        case -1929091532:
                                                            if (currentName3.equals("explicit")) {
                                                                c2 = 0;
                                                                break;
                                                            }
                                                            c2 = 65535;
                                                            break;
                                                        case -1873959333:
                                                            if (currentName3.equals("playcount")) {
                                                                c2 = 1;
                                                                break;
                                                            }
                                                            c2 = 65535;
                                                            break;
                                                        case 116076:
                                                            if (currentName3.equals("uri")) {
                                                                c2 = 2;
                                                                break;
                                                            }
                                                            c2 = 65535;
                                                            break;
                                                        case 3373707:
                                                            if (currentName3.equals("name")) {
                                                                c2 = 3;
                                                                break;
                                                            }
                                                            c2 = 65535;
                                                            break;
                                                        case 1090594823:
                                                            if (currentName3.equals("release")) {
                                                                c2 = 4;
                                                                break;
                                                            }
                                                            c2 = 65535;
                                                            break;
                                                        default:
                                                            c2 = 65535;
                                                            break;
                                                    }
                                                    switch (c2) {
                                                        case 0:
                                                            jsonParser.nextValue();
                                                            z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                                                            break;
                                                        case 1:
                                                            jsonParser.nextValue();
                                                            i2 = _deserializeint(jsonParser, deserializationContext);
                                                            break;
                                                        case 2:
                                                            jsonParser.nextValue();
                                                            str3 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 3:
                                                            jsonParser.nextValue();
                                                            str4 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 4:
                                                            jsonParser.nextValue();
                                                            release3 = e(jsonParser, deserializationContext);
                                                            break;
                                                        default:
                                                            jsonParser.nextValue();
                                                            jsonParser.skipChildren();
                                                            break;
                                                    }
                                                }
                                            }
                                            track = new ArtistModel.Track(str3, i2, z, str4, release3);
                                        }
                                        linkedList2.add(track);
                                    }
                                }
                                hashMap22.put(deserializeString2, linkedList2);
                            }
                            hashMap15 = hashMap22;
                        }
                        hashMap20 = hashMap20;
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case 4:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            releases3 = null;
                        } else {
                            ReleasesWithTotalCount releasesWithTotalCount = null;
                            ReleasesWithTotalCount releasesWithTotalCount2 = null;
                            ReleasesWithTotalCount releasesWithTotalCount3 = null;
                            ReleasesWithTotalCount releasesWithTotalCount4 = null;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName4 = jsonParser.getCurrentName();
                                    currentName4.hashCode();
                                    switch (currentName4.hashCode()) {
                                        case -1415163932:
                                            if (currentName4.equals("albums")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 44612368:
                                            if (currentName4.equals("compilations")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 1797239872:
                                            if (currentName4.equals("appears_on")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2094531883:
                                            if (currentName4.equals("singles")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            jsonParser.nextValue();
                                            releasesWithTotalCount = f(jsonParser, deserializationContext);
                                            break;
                                        case 1:
                                            jsonParser.nextValue();
                                            releasesWithTotalCount4 = f(jsonParser, deserializationContext);
                                            break;
                                        case 2:
                                            jsonParser.nextValue();
                                            releasesWithTotalCount3 = f(jsonParser, deserializationContext);
                                            break;
                                        case 3:
                                            jsonParser.nextValue();
                                            releasesWithTotalCount2 = f(jsonParser, deserializationContext);
                                            break;
                                        default:
                                            jsonParser.nextValue();
                                            jsonParser.skipChildren();
                                            break;
                                    }
                                }
                            }
                            releases3 = new Releases(releasesWithTotalCount, releasesWithTotalCount2, releasesWithTotalCount3, releasesWithTotalCount4);
                        }
                        hashMap20 = hashMap20;
                        release2 = release2;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case 5:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        releases = releases3;
                        release = release2;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            artistGallery = null;
                        } else {
                            List<Image> list = null;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName5 = jsonParser.getCurrentName();
                                    currentName5.hashCode();
                                    if (!currentName5.equals("images")) {
                                        jsonParser.nextValue();
                                        jsonParser.skipChildren();
                                    } else {
                                        jsonParser.nextValue();
                                        list = d(jsonParser, deserializationContext);
                                    }
                                }
                            }
                            artistGallery = new ArtistModel.ArtistGallery(list);
                        }
                        hashMap20 = hashMap20;
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case 6:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        releases = releases3;
                        release = release2;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            monthlyListeners = null;
                        } else {
                            String str5 = null;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName6 = jsonParser.getCurrentName();
                                    currentName6.hashCode();
                                    if (!currentName6.equals("listener_count")) {
                                        jsonParser.nextValue();
                                        jsonParser.skipChildren();
                                    } else {
                                        jsonParser.nextValue();
                                        str5 = deserializeString(jsonParser, deserializationContext);
                                    }
                                }
                            }
                            monthlyListeners = new ArtistModel.MonthlyListeners(str5);
                        }
                        hashMap20 = hashMap20;
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case 7:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        jsonParser.nextValue();
                        str = deserializeString(jsonParser, deserializationContext);
                        hashMap20 = hashMap20;
                        break;
                    case '\b':
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        jsonParser.nextValue();
                        artistInfo = a(jsonParser, deserializationContext);
                        hashMap20 = hashMap20;
                        break;
                    case '\t':
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            hashMap19 = null;
                        } else {
                            HashMap hashMap23 = new HashMap();
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                String deserializeString3 = deserializeString(jsonParser, deserializationContext);
                                jsonParser.nextValue();
                                hashMap23.put(deserializeString3, deserializeString(jsonParser, deserializationContext));
                            }
                            hashMap19 = hashMap23;
                        }
                        hashMap20 = hashMap20;
                        release2 = release2;
                        releases3 = releases3;
                        hashMap18 = hashMap3;
                        break;
                    case '\n':
                        hashMap = hashMap16;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            hashMap5 = null;
                        } else {
                            HashMap hashMap24 = new HashMap();
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                String deserializeString4 = deserializeString(jsonParser, deserializationContext);
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    linkedList3 = null;
                                } else {
                                    linkedList3 = new LinkedList();
                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                            merchandiseItem = null;
                                        } else {
                                            String str6 = null;
                                            String str7 = null;
                                            String str8 = null;
                                            String str9 = null;
                                            String str10 = null;
                                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                    String currentName7 = jsonParser.getCurrentName();
                                                    currentName7.hashCode();
                                                    switch (currentName7.hashCode()) {
                                                        case -1724546052:
                                                            if (currentName7.equals("description")) {
                                                                c4 = 0;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case -877823864:
                                                            if (currentName7.equals("image_uri")) {
                                                                c4 = 1;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 3321850:
                                                            if (currentName7.equals("link")) {
                                                                c4 = 2;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 3373707:
                                                            if (currentName7.equals("name")) {
                                                                c4 = 3;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 3601339:
                                                            if (currentName7.equals(UserBox.TYPE)) {
                                                                c4 = 4;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        default:
                                                            c4 = 65535;
                                                            break;
                                                    }
                                                    switch (c4) {
                                                        case 0:
                                                            jsonParser.nextValue();
                                                            str8 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 1:
                                                            jsonParser.nextValue();
                                                            str9 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 2:
                                                            jsonParser.nextValue();
                                                            str10 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 3:
                                                            jsonParser.nextValue();
                                                            str7 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 4:
                                                            jsonParser.nextValue();
                                                            str6 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        default:
                                                            jsonParser.nextValue();
                                                            jsonParser.skipChildren();
                                                            break;
                                                    }
                                                }
                                            }
                                            merchandiseItem = new ArtistModel.MerchandiseItem(str6, str7, str8, str9, str10);
                                        }
                                        linkedList3.add(merchandiseItem);
                                    }
                                }
                                hashMap24.put(deserializeString4, linkedList3);
                            }
                            hashMap5 = hashMap24;
                        }
                        hashMap2 = hashMap5;
                        hashMap20 = hashMap20;
                        release2 = release2;
                        releases3 = releases3;
                        hashMap19 = hashMap19;
                        hashMap18 = hashMap18;
                        break;
                    case 11:
                        hashMap2 = hashMap17;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            hashMap6 = null;
                        } else {
                            HashMap hashMap25 = new HashMap();
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                String deserializeString5 = deserializeString(jsonParser, deserializationContext);
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    linkedList4 = null;
                                } else {
                                    linkedList4 = new LinkedList();
                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                            concert = null;
                                        } else {
                                            String str11 = null;
                                            String str12 = null;
                                            String str13 = null;
                                            String str14 = null;
                                            String str15 = null;
                                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                    String currentName8 = jsonParser.getCurrentName();
                                                    currentName8.hashCode();
                                                    switch (currentName8.hashCode()) {
                                                        case -1204255560:
                                                            if (currentName8.equals("localtime")) {
                                                                c5 = 0;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 3355:
                                                            if (currentName8.equals("id")) {
                                                                c5 = 1;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 3053931:
                                                            if (currentName8.equals("city")) {
                                                                c5 = 2;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 110371416:
                                                            if (currentName8.equals("title")) {
                                                                c5 = 3;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        case 112093807:
                                                            if (currentName8.equals("venue")) {
                                                                c5 = 4;
                                                                break;
                                                            }
                                                            c5 = 65535;
                                                            break;
                                                        default:
                                                            c5 = 65535;
                                                            break;
                                                    }
                                                    switch (c5) {
                                                        case 0:
                                                            jsonParser.nextValue();
                                                            str13 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 1:
                                                            jsonParser.nextValue();
                                                            str12 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 2:
                                                            jsonParser.nextValue();
                                                            str15 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 3:
                                                            jsonParser.nextValue();
                                                            str11 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        case 4:
                                                            jsonParser.nextValue();
                                                            str14 = deserializeString(jsonParser, deserializationContext);
                                                            break;
                                                        default:
                                                            jsonParser.nextValue();
                                                            jsonParser.skipChildren();
                                                            break;
                                                    }
                                                }
                                            }
                                            concert = new ArtistModel.Concert(str11, str12, str13, str14, str15);
                                        }
                                        linkedList4.add(concert);
                                    }
                                }
                                hashMap25.put(deserializeString5, linkedList4);
                            }
                            hashMap6 = hashMap25;
                        }
                        hashMap = hashMap6;
                        hashMap20 = hashMap20;
                        release2 = release2;
                        releases3 = releases3;
                        hashMap19 = hashMap19;
                        hashMap18 = hashMap18;
                        break;
                    case '\f':
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        releases = releases3;
                        release = release2;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            customMessage = null;
                        } else {
                            String str16 = null;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName9 = jsonParser.getCurrentName();
                                    currentName9.hashCode();
                                    if (!currentName9.equals("body_text")) {
                                        jsonParser.nextValue();
                                        jsonParser.skipChildren();
                                    } else {
                                        jsonParser.nextValue();
                                        str16 = deserializeString(jsonParser, deserializationContext);
                                    }
                                }
                            }
                            customMessage = new ArtistModel.CustomMessage(str16);
                        }
                        hashMap20 = hashMap20;
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case '\r':
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        releases = releases3;
                        release = release2;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            artistsPick = null;
                        } else {
                            String str17 = null;
                            String str18 = null;
                            String str19 = null;
                            String str20 = null;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName10 = jsonParser.getCurrentName();
                                    currentName10.hashCode();
                                    switch (currentName10.hashCode()) {
                                        case -2060497896:
                                            if (currentName10.equals(ContextTrack.Metadata.KEY_SUBTITLE)) {
                                                c6 = 0;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case 116076:
                                            if (currentName10.equals("uri")) {
                                                c6 = 1;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case 100313435:
                                            if (currentName10.equals("image")) {
                                                c6 = 2;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        case 110371416:
                                            if (currentName10.equals("title")) {
                                                c6 = 3;
                                                break;
                                            }
                                            c6 = 65535;
                                            break;
                                        default:
                                            c6 = 65535;
                                            break;
                                    }
                                    switch (c6) {
                                        case 0:
                                            jsonParser.nextValue();
                                            str18 = deserializeString(jsonParser, deserializationContext);
                                            break;
                                        case 1:
                                            jsonParser.nextValue();
                                            str19 = deserializeString(jsonParser, deserializationContext);
                                            break;
                                        case 2:
                                            jsonParser.nextValue();
                                            str20 = deserializeString(jsonParser, deserializationContext);
                                            break;
                                        case 3:
                                            jsonParser.nextValue();
                                            str17 = deserializeString(jsonParser, deserializationContext);
                                            break;
                                        default:
                                            jsonParser.nextValue();
                                            jsonParser.skipChildren();
                                            break;
                                    }
                                }
                            }
                            artistsPick = new ArtistsPick(str17, str18, str19, str20);
                        }
                        hashMap20 = hashMap20;
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case 14:
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap3 = hashMap18;
                        hashMap4 = hashMap19;
                        releases = releases3;
                        release = release2;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            creatorAbout = null;
                        } else {
                            int i3 = 0;
                            int i4 = 0;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName11 = jsonParser.getCurrentName();
                                    currentName11.hashCode();
                                    if (currentName11.equals("monthlyListeners")) {
                                        jsonParser.nextValue();
                                        i3 = _deserializeint(jsonParser, deserializationContext);
                                    } else if (!currentName11.equals("globalChartPosition")) {
                                        jsonParser.nextValue();
                                        jsonParser.skipChildren();
                                    } else {
                                        jsonParser.nextValue();
                                        i4 = _deserializeint(jsonParser, deserializationContext);
                                    }
                                }
                            }
                            creatorAbout = new ArtistModel.CreatorAbout(i3, i4);
                        }
                        hashMap20 = hashMap20;
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    case 15:
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            hashMap = hashMap16;
                            hashMap2 = hashMap17;
                            hashMap3 = hashMap18;
                            hashMap4 = hashMap19;
                            releases = releases3;
                            release = release2;
                            hashMap20 = null;
                        } else {
                            HashMap hashMap26 = new HashMap();
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                String deserializeString6 = deserializeString(jsonParser, deserializationContext);
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    hashMap7 = hashMap16;
                                    hashMap8 = hashMap17;
                                    hashMap9 = hashMap18;
                                    hashMap10 = hashMap19;
                                    releases2 = releases3;
                                    linkedList5 = null;
                                } else {
                                    linkedList5 = new LinkedList();
                                    while (true) {
                                        releases2 = releases3;
                                        if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                hashMap11 = hashMap16;
                                                hashMap12 = hashMap17;
                                                hashMap13 = hashMap18;
                                                hashMap14 = hashMap19;
                                                playlist = null;
                                            } else {
                                                hashMap12 = hashMap17;
                                                hashMap13 = hashMap18;
                                                hashMap14 = hashMap19;
                                                int i5 = 0;
                                                Image image = null;
                                                String str21 = null;
                                                String str22 = null;
                                                while (true) {
                                                    hashMap11 = hashMap16;
                                                    if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                        if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                            String currentName12 = jsonParser.getCurrentName();
                                                            currentName12.hashCode();
                                                            switch (currentName12.hashCode()) {
                                                                case -2107390546:
                                                                    if (currentName12.equals("follower_count")) {
                                                                        c7 = 0;
                                                                        break;
                                                                    }
                                                                    c7 = 65535;
                                                                    break;
                                                                case 116076:
                                                                    if (currentName12.equals("uri")) {
                                                                        c7 = 1;
                                                                        break;
                                                                    }
                                                                    c7 = 65535;
                                                                    break;
                                                                case 3373707:
                                                                    if (currentName12.equals("name")) {
                                                                        c7 = 2;
                                                                        break;
                                                                    }
                                                                    c7 = 65535;
                                                                    break;
                                                                case 94852023:
                                                                    if (currentName12.equals("cover")) {
                                                                        c7 = 3;
                                                                        break;
                                                                    }
                                                                    c7 = 65535;
                                                                    break;
                                                                default:
                                                                    c7 = 65535;
                                                                    break;
                                                            }
                                                            switch (c7) {
                                                                case 0:
                                                                    jsonParser.nextValue();
                                                                    i5 = _deserializeint(jsonParser, deserializationContext);
                                                                    break;
                                                                case 1:
                                                                    jsonParser.nextValue();
                                                                    str21 = deserializeString(jsonParser, deserializationContext);
                                                                    break;
                                                                case 2:
                                                                    jsonParser.nextValue();
                                                                    str22 = deserializeString(jsonParser, deserializationContext);
                                                                    break;
                                                                case 3:
                                                                    jsonParser.nextValue();
                                                                    image = c(jsonParser, deserializationContext);
                                                                    break;
                                                                default:
                                                                    jsonParser.nextValue();
                                                                    jsonParser.skipChildren();
                                                                    break;
                                                            }
                                                        }
                                                        hashMap16 = hashMap11;
                                                    } else {
                                                        playlist = new ArtistModel.Playlist(str21, str22, image, i5);
                                                    }
                                                }
                                            }
                                            linkedList5.add(playlist);
                                            releases3 = releases2;
                                            hashMap19 = hashMap14;
                                            hashMap18 = hashMap13;
                                            hashMap17 = hashMap12;
                                            hashMap16 = hashMap11;
                                        } else {
                                            hashMap7 = hashMap16;
                                            hashMap8 = hashMap17;
                                            hashMap9 = hashMap18;
                                            hashMap10 = hashMap19;
                                        }
                                    }
                                }
                                hashMap26.put(deserializeString6, linkedList5);
                                release2 = release2;
                                releases3 = releases2;
                                hashMap19 = hashMap10;
                                hashMap18 = hashMap9;
                                hashMap17 = hashMap8;
                                hashMap16 = hashMap7;
                            }
                            hashMap = hashMap16;
                            hashMap2 = hashMap17;
                            hashMap3 = hashMap18;
                            hashMap4 = hashMap19;
                            releases = releases3;
                            release = release2;
                            hashMap20 = hashMap26;
                        }
                        release2 = release;
                        releases3 = releases;
                        hashMap19 = hashMap4;
                        hashMap18 = hashMap3;
                        break;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        hashMap = hashMap16;
                        hashMap2 = hashMap17;
                        hashMap20 = hashMap20;
                        break;
                }
                hashMap17 = hashMap2;
                hashMap16 = hashMap;
            }
        }
        return new ArtistModel(str, artistInfo, headerImage, artistGallery, hashMap15, hashMap16, hashMap17, hashMap18, hashMap19, releases3, release2, hashMap20, customMessage, monthlyListeners, creatorAbout, artistsPick);
    }

    public Image c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1221029593:
                        if (currentName.equals("height")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 113126854:
                        if (currentName.equals("width")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonParser.nextValue();
                        i2 = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        str = deserializeString(jsonParser, deserializationContext);
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        i = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return new Image(str, i, i2);
    }

    public List<Image> d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(c(jsonParser, deserializationContext));
        }
        return linkedList;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return b(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    public String deserializeString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r1.equals("month") == false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.artist.model.Release e(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13) {
        /*
            r11 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r12.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r0 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0012:
            com.fasterxml.jackson.core.JsonToken r1 = r12.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x00ca
            com.fasterxml.jackson.core.JsonToken r1 = r12.getCurrentToken()
            int r1 = r1.ordinal()
            r2 = 5
            if (r1 == r2) goto L_0x0026
            goto L_0x0012
        L_0x0026:
            java.lang.String r1 = r12.getCurrentName()
            r1.hashCode()
            int r3 = r1.hashCode()
            switch(r3) {
                case 99228: goto L_0x0075;
                case 116076: goto L_0x006a;
                case 3373707: goto L_0x005f;
                case 3704893: goto L_0x0054;
                case 94852023: goto L_0x0049;
                case 104080000: goto L_0x0040;
                case 1582711067: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0080
        L_0x0035:
            java.lang.String r2 = "track_count"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003e
            goto L_0x0080
        L_0x003e:
            r2 = 6
            goto L_0x0081
        L_0x0040:
            java.lang.String r3 = "month"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0081
            goto L_0x0080
        L_0x0049:
            java.lang.String r2 = "cover"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0052
            goto L_0x0080
        L_0x0052:
            r2 = 4
            goto L_0x0081
        L_0x0054:
            java.lang.String r2 = "year"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005d
            goto L_0x0080
        L_0x005d:
            r2 = 3
            goto L_0x0081
        L_0x005f:
            java.lang.String r2 = "name"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0068
            goto L_0x0080
        L_0x0068:
            r2 = 2
            goto L_0x0081
        L_0x006a:
            java.lang.String r2 = "uri"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0073
            goto L_0x0080
        L_0x0073:
            r2 = 1
            goto L_0x0081
        L_0x0075:
            java.lang.String r2 = "day"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r2 = 0
            goto L_0x0081
        L_0x0080:
            r2 = -1
        L_0x0081:
            switch(r2) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00af;
                case 3: goto L_0x00a6;
                case 4: goto L_0x009d;
                case 5: goto L_0x0094;
                case 6: goto L_0x008b;
                default: goto L_0x0084;
            }
        L_0x0084:
            r12.nextValue()
            r12.skipChildren()
            goto L_0x0012
        L_0x008b:
            r12.nextValue()
            int r10 = r11._deserializeint(r12, r13)
            goto L_0x0012
        L_0x0094:
            r12.nextValue()
            int r8 = r11._deserializeint(r12, r13)
            goto L_0x0012
        L_0x009d:
            r12.nextValue()
            com.spotify.music.artist.model.Image r6 = r11.c(r12, r13)
            goto L_0x0012
        L_0x00a6:
            r12.nextValue()
            int r7 = r11._deserializeint(r12, r13)
            goto L_0x0012
        L_0x00af:
            r12.nextValue()
            java.lang.String r5 = r11.deserializeString(r12, r13)
            goto L_0x0012
        L_0x00b8:
            r12.nextValue()
            java.lang.String r4 = r11.deserializeString(r12, r13)
            goto L_0x0012
        L_0x00c1:
            r12.nextValue()
            int r9 = r11._deserializeint(r12, r13)
            goto L_0x0012
        L_0x00ca:
            com.spotify.music.artist.model.Release r12 = new com.spotify.music.artist.model.Release
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
            switch-data {99228->0x0075, 116076->0x006a, 3373707->0x005f, 3704893->0x0054, 94852023->0x0049, 104080000->0x0040, 1582711067->0x0035, }
            switch-data {0->0x00c1, 1->0x00b8, 2->0x00af, 3->0x00a6, 4->0x009d, 5->0x0094, 6->0x008b, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.artist.model.ArtistModel_Deserializer.e(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.artist.model.Release");
    }

    public ReleasesWithTotalCount f(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        while (true) {
            LinkedList linkedList = null;
            while (true) {
                if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                    return new ReleasesWithTotalCount(linkedList, i);
                }
                if (jsonParser.getCurrentToken().ordinal() == 5) {
                    String currentName = jsonParser.getCurrentName();
                    currentName.hashCode();
                    if (currentName.equals("releases")) {
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            linkedList = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                linkedList.add(e(jsonParser, deserializationContext));
                            }
                        }
                    } else if (!currentName.equals("total_count")) {
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                    } else {
                        jsonParser.nextValue();
                        i = _deserializeint(jsonParser, deserializationContext);
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }
}
