package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.navigationrow.NavigationRow;
import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading1;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading3;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.api.trackrow.TrackRowConfiguration;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowChartsConfiguration;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.TrackRowPlaylistExtender;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class EncoreConsumerExtensions {
    public static final ComponentFactory<Component<NavigationRow.Model, NavigationRow.Events>, NavigationRow.Configuration> navigationRowFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$navigationRowFactory");
        return new EncoreConsumerExtensions$navigationRowFactory$1(rows);
    }

    public static final ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration> searchIntentCardFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$searchIntentCardFactory");
        return new EncoreConsumerExtensions$searchIntentCardFactory$1(cards);
    }

    public static final ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration> sectionHeading1Factory(EncoreConsumerEntryPoint.Headings headings) {
        h.e(headings, "$this$sectionHeading1Factory");
        return new EncoreConsumerExtensions$sectionHeading1Factory$1(headings);
    }

    public static final ComponentFactory<Component<SectionHeading2.Model, f>, SectionHeading2.Configuration> sectionHeading2Factory(EncoreConsumerEntryPoint.Headings headings) {
        h.e(headings, "$this$sectionHeading2Factory");
        return new EncoreConsumerExtensions$sectionHeading2Factory$1(headings);
    }

    public static final ComponentFactory<Component<SectionHeading3.Model, f>, SectionHeading3.Configuration> sectionHeading3Factory(EncoreConsumerEntryPoint.Headings headings) {
        h.e(headings, "$this$sectionHeading3Factory");
        return new EncoreConsumerExtensions$sectionHeading3Factory$1(headings);
    }

    public static final ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration> trackRowChartsFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$trackRowChartsFactory");
        return new EncoreConsumerExtensions$trackRowChartsFactory$1(rows);
    }

    public static final ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> trackRowFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$trackRowFactory");
        return new EncoreConsumerExtensions$trackRowFactory$1(rows);
    }

    public static final ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration> trackRowPlaylistExtenderFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$trackRowPlaylistExtenderFactory");
        return new EncoreConsumerExtensions$trackRowPlaylistExtenderFactory$1(rows);
    }
}
