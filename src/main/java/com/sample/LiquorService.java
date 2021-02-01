package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasun on 5/24/17.
 */
public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));
            brands.add(("Kabuki"));
            brands.add(("Bolgard"));

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");
            brands.add("Jack Daniels");
            brands.add("Chival regal");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");
            brands.add("Blanch");
            brands.add("White bear");
            brands.add("Baltika");

        }
        else if(type.equals(LiquorType.VODKA)){
            brands.add("Absolut");
            brands.add("Horticsa");
            brands.add("Smirnov");
            brands.add("Air");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}