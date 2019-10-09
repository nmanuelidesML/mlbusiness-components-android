package com.mercadolibre.android.mlbusinesscomponentsapp;

import android.app.Application;
import com.mercadolibre.android.ui.font.Font;
import java.util.EnumMap;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        final EnumMap<Font, String> enumMap = new EnumMap<>(Font.class);
        enumMap.put(Font.BOLD,"fonts/SourceSansPro-Black.ttf");
        enumMap.put(Font.REGULAR,"fonts/SourceSansPro-Regular.ttf");
        enumMap.put(Font.SEMI_BOLD,"fonts/SourceSansPro-SemiBold.ttf");
        enumMap.put(Font.LIGHT,"fonts/SourceSansPro-Light.ttf");
        Font.FontConfig.setFonts(enumMap);
    }
}
