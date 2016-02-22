package com.example.kundan.mapplotter;
/**
 * Created by kundan on 9/30/2015.
 */
public class Longi {

    @com.google.gson.annotations.SerializedName("id")
    private String pId;


    @com.google.gson.annotations.SerializedName("longitude")
    private String pLongitude;

    @com.google.gson.annotations.SerializedName("latitude")
    private String pLatitude;



    public Longi(){

    }



    public Longi(String longitude, String latitude,String id){

        this.setId(id);
        this.setLatitude(latitude);
        this.setLongitude(longitude);


    }
    @Override
    public String toString() {
        return getLongitude();
    }

    public final void setId(String id){ pId=id ; }

    public final void setLatitude(String tw){ pLatitude=tw ; }

    public final void setLongitude(String fb){ pLongitude=fb; }


    public String getLongitude(){return pLongitude;}
    public String getLatitude(){return pLatitude;}




    @Override
    public boolean equals(Object o) {return o instanceof Longi && ((Longi) o).pId == pId;

    }
}


