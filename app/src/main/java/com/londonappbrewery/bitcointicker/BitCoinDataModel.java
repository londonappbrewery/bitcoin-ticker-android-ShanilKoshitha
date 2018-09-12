package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitCoinDataModel {

    private Double mPrice;

    public static BitCoinDataModel fromJson(JSONObject jsonObject){
        try{
            BitCoinDataModel coinData = new BitCoinDataModel();

            coinData.mPrice = jsonObject.getJSONObject("averages").getDouble("day");

            return coinData;

        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public Double getPrice() {
        return mPrice;
    }
}
