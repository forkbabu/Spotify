package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaStateUpdateIdJacksonModel implements JacksonModel {
}
