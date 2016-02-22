"# MapPlotter" 



ANDROID APPLICATION:


functionalites:-

  --->get current location every 30 seconds( can be increased or decreased).
  
  --->sending location to azure portal every 30 seconds ( can be increased or decreased).
  
  --->getting lat , long from azure database.
  
  --->plotting it to google map.
  
  
I have used:


1. Android Studio 1.5
2. Azure Mobile Services ( Cloud As A Backend)
3. Google's gson for serialization
4. Google Map v2

Following are the java classes:
1. MapPlotter.java :-
      
        *This class is for following purpose: 
        *1.loading map
        *2.sending data to server
        *3.getting data from server
        *4.setting recieved data to shared preference

2. LocationPlotter.java

        This class is for plotting the path using latlong objects returned from azure database

3. Longi.java

        This class is for serealization purpose using google's gson
        
Future proposed changes :-

        --->Using this application as service
        --->GUI improvements 
        --->Adding markers to locations
        
Screenshots :-

      ![alt tag]([url=http://postimage.org/][img]http://s13.postimg.org/tv2fpxf3r/Screenshot_2016_02_21_23_53_21_com_example_kunda.png[/img][/url]
[url=http://postimage.org/]image hoster[/url]/to/img.png)
